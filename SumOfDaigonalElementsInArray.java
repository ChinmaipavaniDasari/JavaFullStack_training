class SumOfDaigonalElementsInArray{
    public static void main(String[] rags){
        int[][] k = {{1,2,3},{4,5,6},{7,8,9}};
        int rowSize = k.length;
        int sum = 0;
        for(int j =0;j<rowSize;j++){
            int colSize = k[j].length;
            for(int i =0;i<colSize;i++){
                if(j == i){
                    sum += k[j][i];
                }
            }
        }
        System.out.println("Sum:"+sum);
        
        

    }
}