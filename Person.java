public class Person {
    private String name;
    private String address;

    Person(String n, String a) {
        name = n;
        address = a;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
