import java.util.*;

public class Program {
    public static void main(String[] args) {

        TreeSet <Integer> liczby= new TreeSet <>();
        Random rand = new Random();

        int suma=0;

        while (liczby.size()<50) {
            liczby.add(rand.nextInt(1000)); // autoboxing
        }


       for (int liczba:liczby) {
           suma+=liczba;
        }
        double srednia=suma/liczby.size();
        
        System.out.println("Liczby większe od średniej: ");
        for (int liczba:liczby) {
            if (liczba>srednia)
            System.out.print (liczba+" ");
        }


        System.out.println();
        System.out.println("Najmniejsza liczba ze zbioru: "+liczby.first());
        System.out.println("Największa liczba ze zbioru: "+liczby.last());
        System.out.println("Średnia: "+srednia);
    }
}
