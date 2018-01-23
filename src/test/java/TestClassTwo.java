import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author User
 */
public class TestClassTwo extends BaseTestClass {
    @Test
    public void test_21() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_22() {
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "test_22")
    public void test_23() {
        Assert.assertTrue(true);
    }
}
