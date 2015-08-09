package poc.java8.features.optional;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

public class OptionalTest {
    @Test
    public void tetsOptionalManNotPresent() {
	Optional<Man> man = Optional.ofNullable(null);
	Assert.assertFalse(man.isPresent());

	Man newMan = new Man("John", "Doe", 34);
	Man actualMan = man.orElseGet(() -> newMan);
	Assert.assertEquals(actualMan, newMan);

	String strangerGreeting = "Hey Stranger!";
	String greeting = man.map(
		s -> "Hey " + s.getName() + " " + s.getLasteName() + "!")
		.orElse(strangerGreeting);
	Assert.assertEquals(strangerGreeting, greeting);

    }

    @Test
    public void tetsOptionalManPresent() {
	Optional<Man> man = Optional.ofNullable(new Man("John", "Doe", 34));
	Assert.assertTrue(man.isPresent());
    }
}
