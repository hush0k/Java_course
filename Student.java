public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private float gpa;

    Student(String firstName, String lastName, int age, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }
}
