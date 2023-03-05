import java.util.Scanner;

public class RandomCalisma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İLK VİZE:");
        double vize1 = sc.nextDouble();
        System.out.println("İKİNCİ VİZE:");
        double vize2 = sc.nextDouble();
        System.out.println("FİNAL:");
        double final0 = sc.nextDouble();
        double gecmeNotu = (vize1 + vize2)*0.25 + (final0*0.5);
        if (gecmeNotu<60){
            System.out.println("Kaldınız:"+gecmeNotu);
        }
        else {
            System.out.println("Geçtininiz: "+gecmeNotu);
        }
    }


}