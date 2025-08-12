//passing secondary type as parameters are called pass by reference
class Employee{
   int eid;
   String ename;
   double sal;
   String design;
   Employee(){}
   Employee(int eid,String ename,double sal,String design){
    this.eid = eid;
    this.ename = ename;
    this.sal = sal;
    this.design = design;
   }
   public String toString(){
    return eid+" "+ename+" "+sal+" "+design;
   }
}
class PassByReference{
    public static void main(String[] args){
        Employee e1 = new Employee(1,"ABC",50000.00,"Developer");
        int i[] = {1,2,3,4,5};
        PassByReference pbr = new PassByReference();
        pbr.passByReference(e1, i);
        System.out.println(e1);
        for(int j:i) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    void passByReference(Employee e, int j[]) {
    e.ename="XYZ";
    e.sal+=20000.00;
    e.design="Designer";
    j[3]=40;
    j[4]=50;
  }
}