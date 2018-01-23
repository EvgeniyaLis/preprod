import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author User
 */
public abstract class BaseTestClass {
    @BeforeClass
    public void setUp() {
        System.out.println("Run [@BeforeClass] > " + this.getClass().getSimpleName());
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Run [@AfterClass] > " + this.getClass().getSimpleName());
    }
}
