import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Sedan", "Blue");
    }

    @Test
    public void shouldAccelerate() {
        // Given
        // car is initialized

        // When
        car.accelerate();

        // Then
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void shouldSlowDown() {
        // Given
        car.accelerate();

        // When
        car.slowDown();

        // Then
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void shouldStartCar() {
        // Given
        Driver driver = new Driver("John", 20);

        // When
        car.startCar(driver);

        // Then
        // How to assert that the startCar method was called?
    }

    @Test
    public void shouldStopCar() {
        // Given
        Driver driver = new Driver("John", 20);

        // When
        car.stopCar(driver);

        // Then
        // How to assert that the stopCar method was called?
    }

    @Test
    public void shouldChangeSpeed() {
        // Given
        Driver driver = new Driver("John", 20);

        // When
        car.changeSpeed(driver, 80);

        // Then
        assertThat(car.getSpeed()).isEqualTo(80);
    }

    @Test
    public void shouldReachMaxSpeed() {
        // Given
        Driver driver = new Driver("John", 20);

        // When
        car.changeSpeed(driver, 120);

        // Then
        assertThat(car.getSpeed()).isEqualTo(Car.MAX_SPEED);
    }

    @Test
    public void shouldReachMinSpeed() {
        // Given
        Driver driver = new Driver("John", 20);

        // When
        car.changeSpeed(driver, 0);

        // Then
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
