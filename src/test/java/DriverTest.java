import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driverAdult;
    private Driver driverChild;

    @BeforeEach
    public void setUp() {
        driverAdult = new Driver("John", 20);
        driverChild = new Driver("Robin", 8);
    }

    @Test
    public void testIsAdult() {
        assertThat(driverAdult.isAdult()).isTrue();
    }

    @Test
    public void testIsNotAdult() {
        assertThat(driverChild.isAdult()).isFalse();
    }
}


