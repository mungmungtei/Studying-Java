public class Operator {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        if(i<5) {
            j = i++;
            System.out.println(j);  // 0
        }

        int a = 0;
        int b = 0;
        if(a<5) {
            b = ++a;
            System.out.println(b);  // 1
        }

    }

}
