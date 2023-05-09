import java.util.Scanner;

public class AvarageExamResults {
    public static void main(String[] args) {
        // değişkenler
        int maths;
        int phys;
        int turkish;
        int history;
        int music;

        Scanner giris = new Scanner(System.in);
        System.out.println("Please enter mathematics result :");
        maths = giris.nextInt();

        System.out.println("Please enter physics result :");
        phys = giris.nextInt();

        System.out.println("Please enter turkish result :");
        turkish = giris.nextInt();

        System.out.println("Please enter history result :");
        history = giris.nextInt();

        System.out.println("Please enter music result :");
        music = giris.nextInt();

        double result = (maths + phys + turkish + history + music);
        double finalresult = result / 5;
        System.out.println(" Avarage Result : " + finalresult);
        // buradaki + işareti sonrasında gelen result Int yada double bile olsa string
        // gibi metne bağlar öyle cıktı verir
        boolean passFailed = (finalresult >= 60);
        String strPassFailed = (passFailed) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(strPassFailed);
    }

}
