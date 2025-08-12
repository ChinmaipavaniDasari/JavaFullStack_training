// IDimArray.java
import java.util.*;
import java.util.stream.*;
public class IDimArray{
    public static void main(String rangs[]){
        // declare int array size of 5
        int i[] = new int[5];
        // initialize array variable
        i[0] = 1;i[1] = 2;i[2] = 3;i[3] = 4;i[4] = 5;
        // dynamic array declaration and initialization
        int[] j = {1,4,2,3,5};
        // accessing values from array
        // length and index
        int n = i.length;
        for(int k = 0;k<n;k++){
            System.out.print(i[k]+" ");
        }
        System.out.println();
        // foreach loop
        for(int l:j){
            System.out.print(l+" ");
        }
        System.out.println();
        for(int k = 0;k<n;k++){
            if(k != 2){
            System.out.print(i[k]+" ");
            }
        }
        System.out.println();
        //using streams
        Arrays.stream(j).sorted().forEach(System.out::println);


    }
}
