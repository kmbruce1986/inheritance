import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Walt Disney", "JH 12 34 56 D", 1000000.00, "Animation");
    }

    @Test
    public void canGetName() {
        assertEquals("Walt Disney", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JH 12 34 56 D", manager.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1000000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Animation", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10.00);
        assertEquals(1000010.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        manager.raiseSalary(-1000.00);
        assertEquals(1000000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(10000.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        manager.setName("Walter Disney");
        assertEquals("Walter Disney", manager.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        manager.setName(null);
        assertEquals("Walt Disney", manager.getName());
    }
}
