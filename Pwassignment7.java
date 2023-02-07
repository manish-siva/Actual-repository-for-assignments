class Pwassignment7
{
    public static void main(String []args)
    {
        int n = 9;
        for(int i = 0;i< n;i++){
            for(int j = 0; j<n;j++){
                if(i == 0 && j>0&&j < n-1 || j == 0 && i> 0 || i == (n-1)/2 && j<=n-1||j == n-1&& i>0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }//Letter A
            }System.out.print("     ");
            for(int j = 0; j<n;j++){
                if(i == 0 &&j < n-1|| j == 0  || i == (n-1)/2 && j<=n-1||j == n-1|| i == n-1&& j<=n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }//letter B
            }System.out.print("     ");
            for(int j = 0; j<n;j++){
                if(i == 0 &&j <= n-1 || j == 0|| i == n-1&& j<=n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }//Letter C
            }System.out.print("     ");
            for(int j = 0; j<n;j++){
                if(i == 0  &&   j < n-1 || j == 0  || i == n-1 && j<n-1||j == n-1 && i < n-1 && i >0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }//letter D
            }System.out.print("     ");
            for(int j = 0; j<n;j++){
                if(i == 0  && j <= n-1 || j == 0 || i == n-1 && j<=n-1||i == (n-1)/2 && j<= n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }//Letter E
            }System.out.print("     ");
            for(int j = 0; j<n;j++){
                if(i == 0  && j <= n-1 || j == 0 ||i == (n-1)/2 && j<= n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }//Letter F
            }System.out.print("        ");
            for(int j = 0; j<n;j++){
                if(i == 0  && j <= n-1 || j == 0 ||i == n-1 ||  j ==5 && i >=5||j==6 && i==5 || j == 7 && i== 5|| j == 8 && i== 5||j== 8&&i >=5) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }//Letter G
            }System.out.print("     ");
            for(int j = 0; j<n;j++){
                if(j == 0|| i == (n-1)/2 && j < n-1||j == n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }//Letter H
            }
            System.out.println();
        }
    }
}