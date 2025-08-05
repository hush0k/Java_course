public class Person {
    String name;
    int age;

    {
        name = "John";
        age = 18;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {}

    Person(int age) {
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }



    void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
