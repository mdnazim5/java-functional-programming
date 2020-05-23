package streams.commons;

public class Customer {
  private final String name;
  private final Integer age;
  
  public Customer(final String theName, final Integer theAge) {
    name = theName;
    age = theAge;
  }
  
  public String getName() { 
    return name; 
  }

  public int getAge() { 
    return age; 
  }

  public String toString() {
    return String.format("%s -- %d", name, age);
  }  
}

