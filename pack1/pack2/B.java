//subclass of A within the same package
package pack2;
public class B extends A {
    public void print(){
        // System.out.println(a);//No not  accessed
        System.out.println(b);//yes
        System.out.println(c);//yes
        System.out.println(d);//yes

    }

}