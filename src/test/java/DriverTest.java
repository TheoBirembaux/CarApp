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
    public void shouldBeAdult() {
        // Given
        // driverAdult is initialized

        // When
        boolean actual = driverAdult.isAdult();

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    public void shouldNotBeAdult() {
        // Given
        // driverChild is initialized

        // When
        boolean actual = driverChild.isAdult();

        // Then
        assertThat(actual).isFalse();
    }
}
