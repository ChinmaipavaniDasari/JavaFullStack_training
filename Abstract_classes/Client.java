class Client{
    public static void main(String[] rags){
        AAbstract a = AFactory.getInstance(rags[0]);
        a.print(rags[1]);
    }
}
//Runtime Plomorphism
/*Choosing on which class object the method want to invoke at runtime is called as Runtime Polymorphism/Dynamic Method Binding*/