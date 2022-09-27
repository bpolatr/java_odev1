public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Burak";
        String ogrenci2 = "Haşmet";
        String ogrenci3 = "Cabbar";
        String ogrenci4 = "Ceyhun";


        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Burak";
        ogrenciler[1]="Haşmet";
        ogrenciler[2]="Cabbar";
        ogrenciler[3]="Ceyhun";

        for (int i = 0;i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------");

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}