public class Main {

    public static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and methods overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Curious", "George");
        Student student = new Student("Harry", "Potter", 3.2);
        Employee employee = new Employee("Violet", "Evergarden", 2000);


        person.showName();
        student.showName();
        student.showGpa();
        employee.showName();
        employee.showSalary();

    }

}
