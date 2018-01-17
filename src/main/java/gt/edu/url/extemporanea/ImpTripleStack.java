/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.edu.url.extemporanea;
import gt.edu.url.extemporanea.arraylist.ArrayList;
import gt.edu.url.extemporanea.arraylist.List;
/**
 *
 * @author JoseCarlos
 * @param <E> TIpo de dato abstracto
 */
public class ImpTripleStack<E> implements TripleStack<E>{
    public static final int CAPACITY = 16;
    
    List<E> BlueStack;
    List<E> RedStack;
    List<E> YellowStack;
    
    @Override
    /***
     * Retorna si se encuentra vacia la Triple Pila
     */
    public boolean isEmpty() {
        return !(RedStack.size() > 0 || BlueStack.size() > 0|| BlueStack.size() > 0);
    }
    
    public ImpTripleStack() {
        this(CAPACITY);
    }

    public ImpTripleStack(int capacity) {
        RedStack = new ArrayList<>(capacity);
        BlueStack = new ArrayList<>(capacity);
        YellowStack = new ArrayList<>(capacity);
    }

    
/***
 * Tamaño de la stack 
 * @return tamaño
 */
    @Override
    public int redSize() {
        return this.RedStack.size();
    }
/***
 * Mete a la Stack un valor
 * @param e 
 */
    @Override
    public void redPush(E e) {
        RedStack.add(0, e);
    }
/***
 * Retorna el tope de la pila
 * @return elemento al tope de pila
 */
    @Override
    public E redTop() {
        return RedStack.get(0);
    }
/***
 * Saca el primer elemento al tope de la pila
 * @return Elemento al tope de la pila
 */
    @Override
    public E redPop() {
        return RedStack.remove(0);
    }
/***
 * Tamaño de la stack 
 * @return tamaño
 */
    @Override
    public int blueSize() {
        return this.BlueStack.size();
    }
/***
 * Mete a la Stack un valor
 * @param e 
 */
    @Override
    public void bluePush(E e) {
        BlueStack.add(0, e);
    }
/***
 * Retorna el primer elemento al tope de la pila
 * @return Elemento al tope de la pila
 */
    @Override
    public E blueTop() {
        return BlueStack.get(0);
    }
/***
 * Saca el primer elemento al tope de la pila
 * @return Elemento al tope de la pila
 */
    @Override
    public E bluePop() {
        return BlueStack.remove(0);
    }
/***
 * Tamaño de la stack 
 * @return tamaño
 */
    @Override
    public int yellowSize() {
        return this.YellowStack.size();
    }
/***
 * Mete a la Stack un valor
 * @param e 
 */
    @Override
    public void yellowPush(E e) {
        YellowStack.add(0, e);
    }
/***
 * Retorna el primer elemento al tope de la pila
 * @return Elemento al tope de la pila
 */
    @Override
    public E yellowTop() {
        return YellowStack.get(0);
    }
/***
 * Saca el primer elemento al tope de la pila
 * @return Elemento al tope de la pila
 */
    @Override
    public E yellowPop() {
        return YellowStack.remove(0);
    }
    
}
