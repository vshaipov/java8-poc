package poc.java8.features.interfacesdefault;

public interface Human {
    String DEFAULT_METHOD_MESSAGE = "default implementation";
    String OVERRIDEN_METHOD_MESSAGE = "overriden default method";
    String STATIC_METHOD_MESSAGE = "static method";

    default String defaultMethod() {
	return DEFAULT_METHOD_MESSAGE;
    }
    
    static String staticMethod(){
	return STATIC_METHOD_MESSAGE;
    }
}
