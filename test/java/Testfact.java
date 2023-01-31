import org.example.Factorial;

import org.junit.rules.ExpectedException;
import org.junit.After;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testfact {
    Factorial obj=new Factorial();
//    @After
//    public void check()
//    {
//        obj=null;
//    }
    @Test
    public void fact()
    {

        assertEquals(120,obj.fact(5));
        assertEquals(24,obj.fact(4));

    }
//    Using Assertions.assertThrows()
//    @Test
//    void testExpectedException() {
//
//        ApplicationException thrown = Assertions.assertThrows(ApplicationException.class, () -> {
//            //Code under test
//        });
//
//        Assertions.assertEquals("some message", exception.getMessage());
//    }
    @Test
    public void negative()
    {
            obj.fact(-1);
    }


}
