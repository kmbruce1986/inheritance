import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Minnie Mouse", "MM 12 34 56 M", 10000000.00, "Finance", 50000000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Minnie Mouse", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("MM 12 34 56 M", director.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(10000000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(50000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10.00);
        assertEquals(10000010.00, director.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryByNegativeAmount() {
        director.raiseSalary(-1000.00);
        assertEquals(10000000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(100000.00, director.payBonus(), 0.01);
    }

    @Test
    public void canChangeName() {
        director.setName("Minerva Mouse");
        assertEquals("Minerva Mouse", director.getName());
    }

    @Test
    public void cannotChangeNameToNull() {
        director.setName(null);
        assertEquals("Minnie Mouse", director.getName());
    }

}
