public class IIIDimArray {
    public static void main(String[] args) {
        int[][][] i = new int[2][3][4];
        i[0][0][0] = 1;
        i[0][0][1] = 2;
        i[0][0][2] = 3;
        i[0][0][3] = 4;

        i[0][1][0] = 5;
        i[0][1][1] = 6;
        i[0][1][2] = 7;
        i[0][1][3] = 8;

        i[0][2][0] = 9;
        i[0][2][1] = 10;
        i[0][2][2] = 11;
        i[0][2][3] = 12;


        i[1][0][0] = 13;
        i[1][0][1] = 14;
        i[1][0][2] = 15;
        i[1][0][3] = 16;

        i[1][1][0] = 17;
        i[1][1][1] = 18;
        i[1][1][2] = 19;
        i[1][1][3] = 20;

        i[1][2][0] = 21;
        i[1][2][1] = 22;
        i[1][2][2] = 23;
        i[1][2][3] = 24;

        int[][][] j ={{{1,2,3,4},{5,6,7,8},{9,10,11,12}},{{13,14,15,16},{17,18,19,20},{21,22,23,24}}};
        int rowlen = i.length;
        for(int k = 0;k<rowlen;k++){
            int colSize = i[k].length;
            for(int l =0;l<colSize;l++){
                int colrowSize = i[k][l].length;
                for(int m=0;m<colrowSize;m++){
                    System.out.print(i[k][l][m]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();


        }
    
}