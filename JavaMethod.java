import java.util.Scanner;

public class JavaMethod {

    public static void main(String[] args) {
        System.out.println("\ninput nilai dari 0 - 100");
        Scanner scanner = new Scanner(System.in);
        int nilai = scanner.nextInt();
        String predikat = "";
        MethodOne(nilai, predikat);
      }
    static void MethodOne(int nilai, String predikat) {
        if (nilai >= 81 && nilai <= 100){
            predikat = "A";
            System.out.println("Nilai = " + nilai + "\n" + "Predikat = " + predikat);
            }     
        else if (nilai >= 61 && nilai <= 80){
            predikat = "B";
            System.out.println("Nilai = " + nilai + "\n" + "Predikat = " + predikat);
            }    
        else if (nilai >= 41 && nilai <= 60){
            predikat = "C";
            System.out.println("Nilai = " + nilai + "\n" + "Predikat = " + predikat);
            }    
        else if (nilai >= 21 && nilai <= 40){
            predikat = "D";
            System.out.println("Nilai = " + nilai + "\n" + "Predikat = " + predikat);
            }    
        else if (nilai >= 0 && nilai <= 20){
            predikat = "E";
            System.out.println("Nilai = " + nilai + "\n" + "Predikat = " + predikat);
            }     
    }
}