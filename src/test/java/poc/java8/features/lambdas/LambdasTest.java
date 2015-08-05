package poc.java8.features.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;

public class LambdasTest {
    private Lambdas lambdas = new Lambdas();

    @Test
    public void printUntypedTest() {
	System.out
		.println("----Testing of Untyped Java generics based print----");

	System.out.println("Testing strings");
	lambdas.printUntyped("a", "b", "c");

	System.out.println("Testing integers");
	lambdas.printUntyped(1, 2, 3);

	System.out.println("Testing floats");
	lambdas.printUntyped(1.0, 2.0, 3.0);
    }

    @Test
    public void printTypedTest() {
	System.out.println("----Testing Typed print----");
	lambdas.printTyped("a", "b", "c");
    }

    @Test
    public void sortTest() {
	List<Integer> list = Arrays.asList(-10, 30, 1, -5);
	lambdas.sort(list);
	
	List<Integer> expectedList = Arrays.asList(-10, -5, 1, 30);
	Assert.assertTrue("result list isn't equal to the expected one ", Objects.deepEquals(expectedList, list));
    }
}
