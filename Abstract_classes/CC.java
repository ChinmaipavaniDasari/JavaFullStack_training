import java.io.*;
class CC extends AAbstract{
    void print(String msg){
        try{
            /*FileOutputStream fos = new FileOutputStream("output.txt");
            PrintStream ps = new PrintStream(fos);
            ps.println("print() method of C called"+msg);*/
            new PrintStream(new FileOutputStream("output.txt")).println("print() method of CC called"+msg);
        }
        catch(Exception e){}
    }
}