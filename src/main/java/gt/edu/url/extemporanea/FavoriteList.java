package gt.edu.url.extemporanea;

/**
 *
 * @author tuxtor
 */
public interface FavoriteList<E> {
    public void access(E e);
    public void remove(E e);
    public void reset(E e);
    public Iterable<E> getFavorites(int k);
}
