public class MultiArray {
    public static void main(String[] args) {
        
        int nums[] [] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++)
            {
                nums[i][j]=(int)(Math.random()*100);
                
            }
        }
   
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for(int a[]: nums){
            for(int m :a){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
