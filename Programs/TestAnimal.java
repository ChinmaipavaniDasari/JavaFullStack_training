abstract class Animal{
 abstract void makeSound();
void sleep()
{
System.out.println("sleeping");
}}
class Dog extends Animal{
void makeSound(){
System.out.println("dog barks : bow bow");
}}
class Cat extends Animal{
void makeSound(){
System.out.println("cat barks : meow meow");
}
}
public class TestAnimal{
public static void main(String [] args){
// abstract class cannot initialized Animal a=new Animal();
Animal a=new Dog();
Animal b=new Cat();
a.makeSound();
a.sleep();
b.makeSound();
b.sleep();
}
}