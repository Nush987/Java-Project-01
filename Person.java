// Java Code for Person Class (programming III module)
// Save in 'Person.java' and run
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayFullName() {
        System.out.println(this.name + " " + " is " + this.age + " years old.");
    }

    public static void main(String[] args) {
        Person person = new Person("Dulara", 23);
        person.displayFullName();
    }
}
