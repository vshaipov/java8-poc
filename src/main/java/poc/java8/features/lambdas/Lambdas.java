package poc.java8.features.lambdas;

import java.util.Arrays;

public class Lambdas {
    public <T> void printUntyped(T... args) {
	Arrays.asList(args).forEach(e -> System.out.println(e));
    }

    public void printTyped(String... args) {
	Arrays.asList(args).forEach((String e) -> System.out.println(e));
    }
    
    public void sort(Integer... args){
	Arrays.asList(args).sort((e1, e2) -> e1.compareTo(e2));
    }
}
