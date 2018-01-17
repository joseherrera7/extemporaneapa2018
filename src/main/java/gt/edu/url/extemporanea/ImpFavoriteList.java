package gt.edu.url.extemporanea;

import gt.edu.url.extemporanea.arraylist.ArrayList;
import gt.edu.url.extemporanea.arraylist.List;
import gt.edu.url.extemporanea.positional.LinkedPositionalList;
import gt.edu.url.extemporanea.positional.Position;
import gt.edu.url.extemporanea.positional.PositionalList;

/**
 *
 * @author JoseCarlos
 * @param <E> Dato abstracto
 */
public class ImpFavoriteList<E> implements FavoriteList<E> {

    protected static class Item<E> {
        private final E value;
        private int count = 0;

        public Item(E val) {
            value = val;
        }
        
        public int getCount() { 
            return count; 
        }
        public E getValue() { 
            return value; 
        }
        public void increment() { 
            count++; 
        }
        public void reset(){
            count = 0;
        }
    }
    
    PositionalList<Item<E>> list = new LinkedPositionalList<>();
    
    protected E value(Position<Item<E>> p) { 
        return p.getElement().getValue(); 
    }
    
    protected int count(Position<Item<E>> p) {
        return p.getElement( ).getCount( );
    }
    
    protected Position<Item<E>> findPosition(E e) {
        Position<Item<E>> walk = list.first();
        while (walk != null && !e.equals(value(walk)))
        walk = list.after(walk);
        return walk;
    }
    
    protected void moveUp(Position<Item<E>> p) {
        int cnt = count(p);
        Position<Item<E>> walk = p;
        while (walk != list.first() && count(list.before(walk)) < cnt)
            walk = list.before(walk);
        if (walk != p)
            list.addBefore(walk, list.remove(p));
    }
    
    public int size( ) {
        return list.size( );
    }
    
    public boolean isEmpty( ) { 
        return list.isEmpty( ); 
    }
    /***
     * Agrega a la lista de favoritos
     * @param e El elemento
     */
    @Override
    public void access(E e) {
        Position<Item<E>> p = findPosition(e); if (p == null)
        p = list.addLast(new Item<>(e));p.getElement().increment();moveUp(p);    
    }
/***
 * Elimina un elemento de la Lista favoritos
 * @param e Elemento
 */
    @Override
    public void remove(E e) {
        Position<Item<E>> p = findPosition(e);
        if (p != null)
            list.remove(p);
    }
/***
 * Obtiene la lista de elementos 
 * @param k
 * @return 
 */
    @Override
    public Iterable<E> getFavorites(int k) {
        if (k < 0 || k > size())
            throw new IllegalArgumentException("Invalid k");
        List<E> result = new ArrayList<>();
        
        Position<Item<E>> firstElement = list.first();

        result.add(0, firstElement.getElement().getValue());
        
        for (int j=1; j < k; j++){
            // = list
            Position<Item<E>> pivot = list.after(firstElement);
            result.add(0, pivot.getElement().getValue());
        }
        return result;
    }
    /**
     * Elimina la cuenta de accesos del elemento
     * @param e elemento
     */
    
    
    @Override
    public void reset(E e) {
        Position<Item<E>> p = findPosition(e);
            p.getElement().reset();
    }
}
