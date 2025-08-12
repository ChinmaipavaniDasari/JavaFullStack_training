//subclass of A from the different package
import pack2.A;
public class D extends A {
    public void print(){
        //System.out.println(a);//No not  accessed
        //System.out.println(b);//No
        System.out.println(c);//yes
        System.out.println(d);//yes

    }

}