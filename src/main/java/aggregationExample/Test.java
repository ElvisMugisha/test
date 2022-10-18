package aggregationExample;

class Address {
    String city, state, country;

    Address (String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee {
    int id;
    String name;
    Address address;

    Employee (int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display () {
        System.out.println("Employee ID : " + id + " Name : " + name);
        System.out.println("Address is : " + address.city + ", " + address.state + ", " + address.country);
    }
}

public class Test {
    public static void main(String[] args) {

        Address address1 = new Address("Kigali", "Kicukiro", "Rwanda");
        Address address2 = new Address("Kigali", "Nyamirambo", "Rwanda");

        Employee employee1 = new Employee(001, "Elvis Mugisha", address1);
        Employee employee2 = new Employee(002, "Ernest Kwizera", address2);

        employee1.display();
        employee2.display();
    }
}
