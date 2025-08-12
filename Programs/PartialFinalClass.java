// PartialFinalClass.java
class PartialFinalClass {
  void print1() { System.out.println("print1() method of PFC "); }
  void print2() { System.out.println("print2() method of PFC "); }
  final void print3() { System.out.println("print3() method of PFC "); }
  final void print4() { System.out.println("print4() method of PFC "); 
}
}

class PFCSubClass extends PartialFinalClass {
  void print1() { System.out.println("print1() method of Subclass"); }
  void print2() { System.out.println("print2() method of Subclass "); }
  //void print3() { System.out.println("print3() method of Subclass "); }
  //void print4() { System.out.println("print4() method of Subclass "); }
}

class Client {
  public static void main(String rags[]) {
    PFCSubClass pfcsc=new PFCSubClass();
    pfcsc.print1();
    pfcsc.print2();
    pfcsc.print3();
    pfcsc.print4();
  }
}