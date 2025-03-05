package deep_copy.copy;

public class Person {
    public String name;
    public Address address;

    public Person(){

    }


    public Person(String name,Address address){
        this.name=name;
        this.address=address;
    }

    public Person(Person other){
        this.name = other.name;
        this.address = new Address(other.address);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            "}";
    }
   


 }
