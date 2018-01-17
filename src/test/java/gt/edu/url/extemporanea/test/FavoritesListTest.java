package gt.edu.url.extemporanea.test;

import gt.edu.url.extemporanea.FavoriteList;
import gt.edu.url.extemporanea.ImpFavoriteList;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author tuxtor
 */
public class FavoritesListTest {
    FavoriteList<Integer> leList = new ImpFavoriteList<>();
    
    
    @Test
    public void testFavoriteCreation() {
        leList.access(3);
        leList.access(3);
        leList.access(3);
        
        leList.access(2);
        leList.access(2);
        
        leList.access(5);
        leList.access(5);
        leList.access(5);
        leList.access(5);
        leList.access(5);
        
        leList.access(4);
        leList.access(4);
        leList.access(4);
        leList.access(4);
        
        //Comprueba si el 4 esta entre los primeros 2 favoritos
        Iterable<Integer> favorites = leList.getFavorites(2);
        boolean found = false;
        for(Integer num:favorites){
            if(num == 4)
                found = true;
        }

        assertTrue(found);
        found = false;
        //Comprueba si el 3 no esta entre los primeros 2 favoritos
        for(Integer num:favorites){
            if(num == 3)
                found = true;
        }

        assertFalse(found);
    }

    
    @Test
    public void testFavoriteElimination() {
        leList.access(3);
        leList.access(3);
        leList.access(3);
        
        leList.access(2);
        leList.access(2);
        
        leList.access(5);
        leList.access(5);
        leList.access(5);
        leList.access(5);
        leList.access(5);
        
        leList.access(4);
        leList.access(4);
        leList.access(4);
        leList.access(4);
        leList.remove(5);
        //Comprueba si el 3 esta entre los primeros 2 favoritos
        Iterable<Integer> favorites = leList.getFavorites(2);
        boolean found = false;
        for(Integer num:favorites){
            if(num == 3) found = true;
        }

        assertTrue(found);
    }
    
    @Test
    public void testReset() {
        leList.access(3);
        leList.access(3);
        leList.access(3);
        
        leList.access(2);
        leList.access(2);
        
        leList.access(5);
        leList.access(5);
        leList.access(5);
        leList.access(5);
        leList.access(5);
        
        leList.access(4);
        leList.access(4);
        leList.access(4);
        leList.access(4);
        //leList.remove(5);
        leList.reset(5);
        //Comprueba si el 5 esta entre los primeros 2 favoritos
        Iterable<Integer> favorites = leList.getFavorites(2);
        boolean found = false;
        for(Integer num:favorites){
            if(num == 5) found = true;
        }

        assertFalse(found);
    }

}