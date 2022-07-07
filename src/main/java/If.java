import java.util.*;

public class If {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int channel = scanner.nextInt();

        if(channel == 11) {
            System.out.println("mbc");
        } else if (channel == 5) {
            System.out.println("sbs");
        } else if (channel == 7 || channel == 9) {
            System.out.println("kbs");
            if(channel ==7) {
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("없는 채널입니다");
        }
    }

}
