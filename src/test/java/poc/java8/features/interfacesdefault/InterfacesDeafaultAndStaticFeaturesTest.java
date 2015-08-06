package poc.java8.features.interfacesdefault;

import org.junit.Assert;
import org.junit.Test;

public class InterfacesDeafaultAndStaticFeaturesTest {
    private Human student = new Student();
    private Human policeman = new Policeman();
    
    @Test
    public void testDeafaulMethod(){
	Assert.assertEquals(student.defaultMethod(), Human.DEFAULT_METHOD_MESSAGE);
    }
    
    @Test
    public void testOverridenDefualtMethod(){
	Assert.assertEquals(policeman.defaultMethod(), Human.OVERRIDEN_METHOD_MESSAGE);
    }
    
    @Test
    public void testAccesToStaticMethodDefinedInHumanInterface(){
	Assert.assertEquals(Human.staticMethod(), Human.STATIC_METHOD_MESSAGE);
    }    
}
