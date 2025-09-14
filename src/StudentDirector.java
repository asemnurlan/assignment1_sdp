public class StudentDirector {
    private StudentBuilder builder;

    public StudentDirector(StudentBuilder builder){
        this.builder=builder;
    }

    public Student buildStudent_one(){
        builder.setName("asem");
        builder.setSurname("nurlanova");
        builder.setAge(18);
        builder.setEmail("asemnurlanov@gmail.com");
        builder.setGroup("SE-2411");
        builder.setGpa(3.7);
        builder.setMajor(Major.SOFTWARE_ENGINEERING);
        return builder.build();
    }
}
