package code.example.tsi.animalexampletest;

import code.example.tsi.animalexample.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void testEat(){
        Cat testCat = new Cat();
        testCat.eat("Fish");
        assertEquals(11,testCat.getSize(),"The cat did not gain the correct weight");
    }
}
