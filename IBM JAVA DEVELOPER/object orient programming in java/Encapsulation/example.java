class Student {
    private String Student;
    private int age;

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        this.Student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class example {
    public static void main(String[] args) {

        Student object = new Student();
        Student object2 =new Student();
        object.setAge(10);
        object.setStudent("Ashwin Jadhav");

        

        System.out.println(object.getAge());
        System.out.println(object.getStudent());
    }
}