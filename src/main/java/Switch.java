import java.util.*;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int channel = scanner.nextInt();

        switch (channel) {
            case 11 :
                System.out.println("mbc");
                break;
            case 5 :
                System.out.println("sbs");
                break;
            case 7:
            case 9:
                System.out.println("kbs");
                switch (channel) {
                    case 7:
                        System.out.println("2");
                        break;
                    case 9:
                        System.out.println("1");
                        break;
                }
                break;
            default:
                System.out.println("없는 채널입니다");
        }
    }
}
