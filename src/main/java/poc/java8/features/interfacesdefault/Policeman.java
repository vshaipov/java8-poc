package poc.java8.features.interfacesdefault;

public class Policeman implements Human {
    @Override
    public String defaultMethod() {
	return OVERRIDEN_METHOD_MESSAGE;
    }
}
