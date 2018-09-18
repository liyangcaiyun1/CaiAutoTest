import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ignoreTest {
    @Test
    public void ignore1(){
        System.out.println("执行1");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("执行2");
    }
    @Test(enabled=true)
    public void ignore3(){
        System.out.println("执行3");
    }
    @BeforeTest(enabled=true)
    public void ignore4(){
        System.out.println("执行4");
    }
}
