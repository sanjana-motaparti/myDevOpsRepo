import org.junit.*;

public class calculatorTest {

    @Test

    public void test1forCalc(){
        calculator c=new calculator();

        Assert.assertEquals(Math.addExact(4, 3),c.addNumbers(4, 3));
        Assert.assertEquals(Math.addExact(4, -4),c.addNumbers(4, -4));
        Assert.assertNotEquals(0,c.addNumbers(1, 2));
    }
    
}
