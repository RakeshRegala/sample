class Vehicle
{
 int speed=50;
}
class Bike3 extends Vehicle
{
 int speed = 100;
 void display()
 {
 System.out.println(super.speed);
 }
}
class hello{
 public static void main(String args[])
 {
 Bike3 b=new Bike3();
 b.display();
 }
}
