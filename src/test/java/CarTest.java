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
    public void testAccelerate() {
        car.accelerate();
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testSlowDown() {
        car.accelerate();
        car.slowDown();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testStartCar() {
        Driver driver = new Driver("John", 20);
        car.startCar(driver);
        // How to assert that the startCar method was called?

    }

    @Test
    public void testStopCar() {
        Driver driver = new Driver("John", 20);
        car.stopCar(driver);
        // How to assert that the stopCar method was called?
    }

    @Test
    public void testChangeSpeed() {
        Driver driver = new Driver("John", 20);
        car.changeSpeed(driver, 80);
        assertThat(car.getSpeed()).isEqualTo(80);
    }
    @Test
    public void testMaxSpeed() {
        Driver driver = new Driver("John", 20);
        car.changeSpeed(driver, 120);
        assertThat(car.getSpeed()).isEqualTo(Car.MAX_SPEED);
    }

    @Test
    public void testMinSpeed() {
        Driver driver = new Driver("John", 20);
        car.changeSpeed(driver, 0);
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}

