//class E instanciates class A from outside package
import pack2.A;
class E{
    public void print(){
        A obj = new A();
        //System.out.println(obj.a);//not accessed
        //System.out.println(obj.b);//not
        //System.out.println(obj.c);//not
        System.out.println(obj.d);

    }
}