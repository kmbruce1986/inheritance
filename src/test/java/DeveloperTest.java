import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Mickey Mouse", "KB 12 34 56 F", 50000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Mickey Mouse", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("KB 12 34 56 F", developer.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(51000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500.00, developer.payBonus(), 0.01);
    }
}
