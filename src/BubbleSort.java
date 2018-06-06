public class BubbleSort {

    public static void main(String[] args) {
        int ilosc;
        ilosc = 3;

        int[] tab = new int[ilosc];
        tab[0] = 8;
        tab[1] = 5;
        tab[2] = 3;

        b_sort(tab);
    }
    public static void b_sort(int tab[]){
        int temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }

}
