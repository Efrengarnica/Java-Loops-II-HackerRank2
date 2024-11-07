import java.util.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        int aux = a;
            for (int ii = 0; ii < n; ii++) {
                aux = a + (b * (int)((Math.pow(2, ii+1) - 1))); //Elevar el número a su potencia, regresa un double
                System.out.print(aux + " ");
                }//for de ii
                System.out.println();
        }//for inicial
        in.close();
        
    }//main
    
}//class solution