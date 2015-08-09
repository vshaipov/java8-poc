package poc.java8.features.methodreferences;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MethodReferencesTest {

    @Test
    public void tetsCreateCar() {
	Car car = Car.create(Car :: new);
	
	Assert.assertTrue(car != null);
    }

    @Test
    public void tetsCollide() {
	Arrays.asList(Car.create(Car :: new)).forEach(Car :: collide);
    }

    @Test
    public void tetsFollow() {
	Car testCar = Car.create(Car :: new);
	Arrays.asList(Car.create(Car :: new)).forEach(testCar :: follow);
    }
}
