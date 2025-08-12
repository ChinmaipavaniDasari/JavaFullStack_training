package pack2;
public class A{
    private int a;
    int b;
    protected int c;
    public int d;

    public void print(){
        System.out.println(a);//Yes accessed
        System.out.println(b);//Yes
        System.out.println(c);//Y
        System.out.println(d);//Y
    }
}