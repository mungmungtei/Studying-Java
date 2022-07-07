public class Continue {

    public static void main(String[] args) {

        for(int i = 1; i <=10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);  // 2 4 6 8 10
            }
        }

        for(int j = 1; j<=10; j++) {
            if(j % 2 == 0)
                continue;
            System.out.println(j);  // 1 3 5 7 9
        }
    }
}
