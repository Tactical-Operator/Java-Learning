class Student{
    
    static String name;
}

class Main{
    public static void main(String []args){
        Student s1=new Student();
        Student s2=new Student();

        s1.name="Ashwin";
        s2.name="Jadhav"; // this does not create another name it changes samshared variable because of static only one name exits

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}