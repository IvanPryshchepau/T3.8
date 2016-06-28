import static org.testng.Assert.*;

/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _RunnerTest {
    @org.testng.annotations.Test
    public void testCalculate() throws Exception {
        assertEquals(_Runner.calculate(5), 720);
    }

}