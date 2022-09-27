public class Main {
    public static void main(String[] args) {
        //for
        for (int i=2;i<10;i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");


        //while
        int i=1;
        while(i<10) {
            System.out.println(i);
            i++;
        }
     //infinite loop: sonsuz döngü  1 10'dan küçük mü evet > i++ konur sonsuz döngü olmaması için
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=100;
        do {
            System.out.println("Loglandı");
            System.out.println(j);
            j++;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");
//şart uymazsa while döngüsü çalışmaz ama do-wwhile döngüsü bir kez çalışır.
    }
}