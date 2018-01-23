import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author User
 */
public class TestClassOne extends BaseTestClass {
    @Test
    public void test_11() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_12() {
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "test_12")
    public void test_13() {
        Assert.assertTrue(true);
    }
}
