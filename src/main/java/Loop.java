public class Loop {

    public static void main(String[] args) {

        System.out.println("== for문 ==");
        for(int a = 1; a <=5; a++) {
            System.out.println(a);  // 1 2 3 4 5
        }

        System.out.println("== while문 ==");
        int b = 1;
        while(b<=5) {
            System.out.println(b);  // 1 2 3 4 5
            b++;
        }

        System.out.println("== do-while문 ==");
        int c = 1;
        do {
            System.out.println(c);  // 1 2 3 4 5
            c++;
        } while (c<=5);

    }
}
