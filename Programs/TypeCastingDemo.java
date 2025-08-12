//create one folder D:\2025_SNB2

/*Datatype      Size          Range
  byte          1          -128 to 127
  short        2          -32768 to 32767
  int           4
  long          8
  float          4
  double        8
  char          2
  boolean      1
  */
//Type casting and Type conversion using wrapper classes:
--------------------------------------------------------------
//Type casting convert one primitive datatype value into another primitive type value.

//esp: double to int conversion

// TypeCastingDemo.java
public class TypeCastingDemo {
  public static void main(String rags[]) {
    int i1=10;
    byte b1=(byte)i1; // narrow casting needs type casting
    short s1=(short)i1;
    long l1=i1; // wide casting don't need typecasting, only assignment
    float f1=i1;
    double d1=i1;
    
    long l2=10L;
    byte b2=(byte)l2;
    short s2=(short)l2;
    int i2=(int)l2;
    float f2=(float)l2;
    double d2=l2;
    
    float f3=10.24F;
    byte b3=(byte)f3;
    short s3=(short)f3;
    int i3=(int)f3;
    long l3=(long)f3;
    double d3=f3;
    
    double d4=10.24;
    byte b4=(byte)d4;
    short s4=(short)d4;
    int i4=(int)d4;
    long l4=(long)d4;
    float f4=(float)d4;    
  }
}