import java.util.Scanner;

public class taksimeter {
    public static void main(String[] args) {
        double km;
        double kmtutar=2.20,total;
        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi KM türünden giriniz:");
        km=input.nextDouble();

        total=(km*kmtutar)+10;

        double ucret = (total<20) ? 20 : total;
        System.out.println("Toplam Ücret:"+ucret);
    }




}
