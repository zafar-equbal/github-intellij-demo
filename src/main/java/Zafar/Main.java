

package Zafar;

public class Main {
    public static void main(String[] args) {
        star(5);
    }
    public static void star1(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<n;j++){
                System.out.print("*");
            }
            
            System.out.println();
       
        }
   
    }

    


    
    public static void star2(int n){

        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
    }
            System.out.println();

       }
}



