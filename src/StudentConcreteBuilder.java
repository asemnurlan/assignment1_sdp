public class StudentConcreteBuilder implements StudentBuilder{
    private Student student;

    public StudentConcreteBuilder(){
        this.student=new Student();
    }

    @Override
    public void setName(String name){
        student.setName(name);
    }
    @Override
    public void setSurname(String surname){
        student.setSurname(surname);
    }
    @Override
    public void setAge(int age){
        student.setAge(age);
    }
    @Override
    public void setEmail(String email){
        student.setEmail(email);
    }
    @Override
    public void setGroup(String group){
        student.setGroup(group);
    }
    @Override
    public void setGpa(double gpa){
        student.setGpa(gpa);
    }
    @Override
    public void setMajor(Major major){
        student.setMajor(major);
    }

    @Override
    public Student build(){
        return student;
    }

}
