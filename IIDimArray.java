class IIDimArray{
    public static void main(String[] rags){
        int[][] i = new int[2][3];
        i[0][0]=1;i[0][1]=2;i[0][2] = 3;
        i[1][0]=4;i[1][1]=5;i[1][2] = 6;
        int[][] j = {{1,2,3},{4,5,6}};
        
        // accesing array using indexing
        int rowSize = i.length;
        for(int k =0;k<rowSize;k++){
            int colSize = i[k].length;
            for(int l = 0;l<colSize;l++){
                System.out.print(i[k][l]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // accesing array using foreach loop
        for(int l[]:j){
            for(int m:l){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        int[][] c = new int[2][3];
        for(int a=0;a<rowSize;a++){
            int colSize = i[a].length; 
            for(int b = 0;b<colSize;b++){
                c[a][b] = i[a][b] + j[a][b];
            }
        }
        for(int[] arr:c){
            for(int d:arr){
            System.out.print(d+" ");
           }
        System.out.println();
        }

    }
}