public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String group;
    private double gpa;
    private Major major;



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }


    public void setGroup(String group) {
        this.group = group;
    }
    public String getGroup() {
        return group;
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }


    public void setMajor(Major major) {
        this.major = major;
    }
    public Major getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                '}';
    }
}

