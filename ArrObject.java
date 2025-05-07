class Student {
    int marks;
    String name;
    int rollNo;
}

public class ArrObject {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name="Ram";
        s1.marks=90;
        s1.rollNo=2;

        Student s2 = new Student();
        s2.marks=87;
        s2.name="Rahim";
        s2.rollNo=3;

        Student s3 =  new Student();
        s3.marks= 30;
        s3.name="Jail";
        s3.rollNo=9;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student stud :students){
            System.out.println(stud.name + " : "+ stud.marks);
        }        
    }
}
