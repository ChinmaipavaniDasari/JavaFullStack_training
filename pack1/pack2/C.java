//class C instanciates class A from same package
package pack2;
public class C{
    public void print(){
    A obj = new A();
    // System.out.println(obj.a); // not accessed
    //  a has private access in A
    System.out.println(obj.b);
    System.out.println(obj.c);
    System.out.println(obj.d);
    }
    
}