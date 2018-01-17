package gt.edu.url.extemporanea.test;

import gt.edu.url.extemporanea.impl.ImplTripleStack;
import org.junit.Assert;
import org.junit.Test;
import gt.edu.url.extemporanea.TripleStack;

/**
 *
 * @author tuxtor
 */
public class TripleStackTest {
    TripleStack<Integer> laLista = new ImplTripleStack<>();
    public TripleStackTest() {
        laLista.redPush(1);
        laLista.redPush(2);
        laLista.redPush(3);
        laLista.redPush(4);
        laLista.redPush(5);
        
        laLista.bluePush(6);
        laLista.bluePush(7);
        laLista.bluePush(8);
        laLista.bluePush(9);
        laLista.bluePush(10);
        
        laLista.yellowPush(11);
        laLista.yellowPush(12);
        laLista.yellowPush(13);
        laLista.yellowPush(14);
        laLista.yellowPush(15);
        
    }

    
    @Test
    public void testRedStack() {
        Assert.assertEquals(Integer.valueOf(laLista.redTop()), Integer.valueOf(5));
        laLista.redPop();
        Assert.assertEquals(Integer.valueOf(laLista.redTop()), Integer.valueOf(4));
    }
    
    @Test
    public void testBlueStack() {
        Assert.assertEquals(Integer.valueOf(laLista.blueTop()), Integer.valueOf(10));
        laLista.bluePop();
        Assert.assertEquals(Integer.valueOf(laLista.bluePop()), Integer.valueOf(9));
    
    }
    
     @Test
    public void testYellowStack() {
        Assert.assertEquals(Integer.valueOf(laLista.yellowTop()), Integer.valueOf(15));
        laLista.yellowPop();
        Assert.assertEquals(Integer.valueOf(laLista.yellowPop()), Integer.valueOf(14));
    
    }
    
    @Test
    public void testSize() {
        Assert.assertFalse(laLista.isEmpty());
    }
    
    
    
    
}
