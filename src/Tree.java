import java.util.Scanner;

public class Tree {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int max =0;
        System.out.println("Podaj liczbe całkowitą z zakresu 1-20");
        int x = input.nextInt();;
        max = x*2-1;
        String firstPart= "";
        String lastPart= "";

        for (int i = 1; i <= x; i++){
            for (int j=x-i; j >=1; j--){
                firstPart = firstPart + " ";
            }
            for (int k = 1; k <=i*2-1; k++){
                lastPart = lastPart + "0";
            }
            System.out.println(firstPart + lastPart);
            firstPart="";
            lastPart="";
        }
    }
}
