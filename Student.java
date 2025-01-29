class Student
{
 int rollno;
 String name;
 static String college=“VITB";
 static void change()
 {
 college = “VIT";
 }
 Student1(int r, String n)
 {
 rollno = r;
 name = n;
 }
void display()
 {
 System.out.println(rollno+" "+name+" "+college);
 }
 public static void main(String args[])
 {
 Student1.change();
 Student1 s1 = new Student1(111,"Abinav");
 Student1 s2 = new Student1(222,"Harshitha");
 Student1 s3 = new Student1(333,"Aadharsh");
 
 s1.display();
 s2.display();
 s3.display();
 }
}
