public interface StudentBuilder {
    void setName(String name);
    void setSurname(String surname);
    void setAge(int age);
    void setEmail(String email);
    void setGroup(String group);
    void setGpa(double gpa);
    void setMajor(Major major);

    Student build();
}
