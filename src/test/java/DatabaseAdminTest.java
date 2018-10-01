import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Goofy", "JF 12 34 56 G", 40000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Goofy", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JF 12 34 56 G", databaseAdmin.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(41000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, databaseAdmin.payBonus(), 0.01);
    }
}
