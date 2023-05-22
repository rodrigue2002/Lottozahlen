import java.util.Random;
public class Lottozahlen{
    static int[] zahlen = new int[100];
    static int[] doppelteZahlen = new int[50];
    public static void main(String[] args) {
        initArray();
        ausgabeArray(zahlen);
        System.out.print("\n");
        System.out.println("Maximalwert: " + maxWert());
        System.out.println("Minimalwert: " + minWert());
        System.out.println("Durchschnitt: " + midWert());
        System.out.print("\n");
        sucheDoppelte();
        System.out.println("Auswertung:");
        ausgabeArray(doppelteZahlen);
        System.out.print("\n");
        System.out.println( "Erste doppellte Zahl bei Index : " + indexErsteDoppelte(zahlen));
        
    }

    public static void initArray(){
        Random rand = new Random();
        for(int i = 0; i<zahlen.length; i++){
            zahlen[i] = rand.nextInt(49) + 1;
        }
    }

    public static void ausgabeArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.println( i +" : " + arr[i]);
        }
    }

    public static int maxWert(){
        int a = zahlen[0];
        for(int i = 1; i< zahlen.length; i++){
            if (zahlen[i] > a) a = zahlen[i];
        }
        return a;
    }

    public static int minWert(){
        int a = zahlen[0];
        for(int i = 1; i< zahlen.length; i++){
            if (zahlen[i] < a) a = zahlen[i];
        }
        return a;
    }

    public static double midWert(){
        double a = zahlen[0];
        for(int i = 1; i< zahlen.length; i++){
            a += zahlen[i];
        }
        a = a / zahlen.length;
        return a;
    }

    public static void sucheDoppelte(){
        for(int i = 0; i < zahlen.length; i++){
            doppelteZahlen[zahlen[i]]++;
        }
    }

    public static int indexErsteDoppelte(int[]arr){
        for(int i =0; i < arr.length; i++){
            if(doppelteZahlen[i] == 2) return i;
        }
        return -1;
    }
    
}