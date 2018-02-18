import java.util.*;

public class Program {
    public static void main(String[] args) {

        ArrayList<Integer> liczby = new ArrayList<>();
        Random rand = new Random();

        int suma=0;

        for (int i = 0; i < 50; i++) {
            liczby.add(rand.nextInt(1000)); // autoboxing
        }

       for (int liczba:liczby) {
           suma+=liczba;
        }
        double srednia=suma/50;

        Collections.sort(liczby);
        System.out.println("Liczby większe od średniej: ");
        for (int liczba:liczby) {
            if (liczba>srednia)
            System.out.print (liczba+" ");
        }


        System.out.println();
        System.out.println("Najmniejsza liczba ze zbioru: "+liczby.get(0));
        System.out.println("Największa liczba ze zbioru: "+liczby.get(49));
        System.out.println("Średnia: "+srednia);
    }
}
