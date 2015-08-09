package poc.java8.features.optional;

public class Man {
    private String name;
    private String lasteName;
    private int age;

    public Man(String name, String lasteName, int age) {
	super();
	this.name = name;
	this.lasteName = lasteName;
	this.age = age;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getLasteName() {
	return lasteName;
    }

    public void setLasteName(String lasteName) {
	this.lasteName = lasteName;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

}
