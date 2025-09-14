
public class Main {
    public static void main(String[] args) {
        StudentDirector director =new StudentDirector(new StudentConcreteBuilder());

        Student studentOne = director.buildStudent_one();

        System.out.println(studentOne);

    }
}
