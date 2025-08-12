//inner class:
// OC.java (OC means OuterClass)
class OC {
  int i; // non-static variable/instance variable
  static int j; // static variable/class variable
  
  void print1() {
    System.out.println(i); // Yes
    System.out.println(j); // Yes
  }
  
  static void print2() {
    // System.out.println(i); // No
    System.out.println(j); // Yes
  }
  
  // non-static inner class
  class NSIC {
    void print3() {
      System.out.println(i); // Yes
      System.out.println(j); // Yes  
    }
    /* 
    static void print4() {
      // System.out.println(i); // Yes
      System.out.println(j); // Yes      
    }
    */
  }
  
  // static inner class
  static class SIC {  
    void print5() {
      // System.out.println(i); // Yes
      System.out.println(j); // Yes      
    }
    static void print6() {
      // System.out.println(i); // Yes
      System.out.println(j); // Yes      
    }
  }
} // end of OC
// we can use this and super in only non static methods but not in the static methods
/*
Points about how to write inner class:
--------------------------------------
1) in outer class we can write both static and non-static inner classes 

ii) In non-static inner class we can write only non-static method, but cannot write static method. 
iii) In that we can access both static and non-static variables of outer class.

iv) In static inner class we can write both non-static and static method. 
v) In those methods we can access only static variables of outer class.
*/
// OCICClient.java
class OCICClient {
  public static void main(String rags[]) {
    // how to access non-static method of outer class?
    OC oc=new OC();
    oc.print1();
    
    // how to access static method of outer class?
    OC.print2();
    
    // how to access non-static method of non-static inner class?
    // first of all know how to instantiate non-static inner class?
    OC.NSIC ocnsic=oc.new NSIC();
    ocnsic.print3();
    
    // how to access non-static method of static inner class?
    // how to create object of static inner class
    OC.SIC ocsic=new OC.SIC();
    ocsic.print5();
    
    // how to access static method of static inner class
    OC.SIC.print6();
  }  
}
