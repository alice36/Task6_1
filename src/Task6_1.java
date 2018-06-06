import java.util.Random;

public class Task6_1{

    public static void main(String []args){
        int[] tab = new int[10];
        Random rand = new Random();
        int j = tab.length-1;
        String tempFirst = "";
        String tempLast = "";
        for (int i = 0; i < tab.length; ++i){
            tab[i] = rand.nextInt(100);
        }
        for (int i = 0; i < tab.length; ++i){
            tempFirst = tempFirst + " " + tab[i];
            tempLast = tempLast + " " + tab[j];
            j--;
        }
        System.out.println(tempFirst + tempLast);
    }
}
