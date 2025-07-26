class MatrixAddition{
    public static void main(String[] args){
        int[][] i ={{1,2},{3,4}};
        int[][] j ={{1,2},{3,4}};
        int[][] c  = new int[2][2];

        int rowSize = i.length;
        for(int k = 0;k<rowSize;k++){
            int colSize = i[k].length;
            for(int d = 0;d<colSize;d++){
                c[k][d] = i[k][d] + j[k][d];
            }
        }
        for(int e = 0;e<rowSize;e++){
            int colSize = i[e].length;
            for(int f = 0;f<colSize;f++){
                System.out.print(c[e][f]+" ");
            }
            System.out.println();
        }
        
    }
}