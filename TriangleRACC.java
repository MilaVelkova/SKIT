import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TriangleRACC {

    //tests, 1(T T T: T), 2(T T F: F), 3(T F T: F), 5(F T T: F)
    Triangle triangle;
    @Before
    public void setUp(){
        triangle = new Triangle();
    }

    @Test
    public void test1() throws Exception{
        assertTrue(triangle.isTriangle(3,4,5)); //1(T T T)
    }
    @Test
    public void test2() throws  Exception{
        assertFalse(triangle.isTriangle(10,2,3)); //2(T T F)
    }
    @Test
    public void test3() throws  Exception{
        assertFalse(triangle.isTriangle(5,7,1)); //3(T F T)
    }
    @Test
    public void test5() throws Exception{
        assertFalse(triangle.isTriangle(2,4,8)); //5(F T T)
    }
}
