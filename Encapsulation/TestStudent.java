package Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(10);
        s1.setCollegeName("Towson");
        s1.setStudentName("Fidel");
        s1.setAddress("Maryland");
        System.out.println("Student Name: "+ s1.getStudentName()); 
        System.out.println("Student ID:  " + s1.getStudentId()); 
        System.out.println("College Name: " + s1.getCollegeName());  
        System.out.println("Student's Address: " + s1.getAddress());

        s1.setCollegeName("UMD");
        System.out.println("Student's New College: " + s1.getCollegeName());
    }
}
