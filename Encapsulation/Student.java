package Encapsulation;

public class Student {
    private int studentId;
    private String studentName;
    private String collegeName;
    private String address;

    public void setStudentId(int id){
        studentId = id;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public void setCollegeName(String Cname){
        collegeName = Cname;
    }
    
    public void setAddress(String address){
        this.address = address;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getCollegeName(){
        return collegeName;
    }

    public String getAddress(){
        return address;
    }
}
