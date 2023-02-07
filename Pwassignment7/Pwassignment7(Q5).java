class Pwassignment7
{
    public static void main(String[] args) {
        int n = 20;
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<n;j++){
                if(j == 0 && i <= (n-1)/2||i==j && i<= 8|| i + j == n-1 && i <=8 || j == n-1 && i<= (n-1)/2  ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.print("     ");
            for(int j = 0; j<n;j++){
                if(i == 0 && j>0&&j < (n-1)/2 || j == 0 && i> 0 && i <= (n-1)/2 ||i == 5 && j <= (n-1)/2||j == (n-1)/2&& i>0 && i <= (n-1)/2  ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<n;j++){
                if(j == 0 && i <= (n-1)/2 || i == j && i <= 9 || j == 9 && i <= (n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<n;j++){
                if(i == 0 && j <=10  || j == 5 && i <= (n-1)/2 ||i == (n-1)/2 && j <=10 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<n;j++){
                if(i == 0  && j <= (n-1)/2|| j== 0 && i <= (n-1)/4|| i == (n-1)/4 && j<= (n-1)/2 || j == (n-1)/2 && i >= (n-1)/4&& i <= (n-1)/2 || i == (n-1)/2 && j<=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 0; j<n;j++){
                if(j == 0 && i<= (n-1)/2|| i == (n-1)/4 && j < (n-1)/2||j == (n-1)/2 && i <= (n-1)/2 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
    }
}