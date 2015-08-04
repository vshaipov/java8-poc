package poc.java8.features.lambdas;

import org.junit.Test;

public class LambdasTest {
    private Lambdas lambdas = new Lambdas();

    @Test
    public void printUntypedTest() {
	System.out.println("----Testing of Untyped Java generics based print----");
	
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
    
    public void sortTest(){
	System.out.println("lambda sort test");
	lambdas.sort(-10, 30, 1, -5);
    }
}
