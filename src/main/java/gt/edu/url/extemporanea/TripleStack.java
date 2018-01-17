package gt.edu.url.extemporanea;

/**
 *
 * @author tuxtor
 */
public interface TripleStack<E> {
        boolean isEmpty();
    
	int redSize();
	void redPush(E e);
	E redTop();
	E redPop();
        
        int blueSize();
	void bluePush(E e);
	E blueTop();
	E bluePop();
        
        int yellowSize();
	void yellowPush(E e);
	E yellowTop();
	E yellowPop();
}
