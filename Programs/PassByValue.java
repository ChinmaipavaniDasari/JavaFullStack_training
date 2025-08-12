//Message passing
//pass by value
//Passing primitive type as parameters in the method is called PBV
//PBV.java
class PassByValue{
    public static void main(String[] args){
        int i = 20;
        double d = 120.00;
        boolean b = true;
        char c = 'M';
        passByValue(i,d,b,c);
        System.out.println("in main method:"+i +" "+d+" "+b+" "+c);
    }
    static void passByValue(int age,double price,boolean pass,char gender){
        age++;
        price += 100;
        pass = false;
        gender = 'F';
        System.out.println("in pBV():"+age+" "+price+" "+pass+" "+gender);
    }
}
//static methods can only access static variable and static methods
//but non static methods can access both static and non static variables and methods
