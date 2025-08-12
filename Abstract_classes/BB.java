class BB extends AAbstract{
    /* override method with the scope or increase the scope,but dont reducde the scope of the method.if methood scope is reduced weaker access privilage error comes.*/
    void print(String msg){
        System.out.println("print() method of BB called"+msg);
    }
}