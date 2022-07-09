public class Method02 {

    public static void main(String[] args) {
        Method01 method01 = new Method01();
        method01.notice(125,3); // 아직은 괜찮아요
        method01.notice(85,6); // 오늘 군것질 그만-!

        float avg01 = Method01.staticAvg(90,75);
        float avg02 = Method01.staticAvg(90,80);
        System.out.println(avg01); // 82.5
        System.out.println(avg02); // 85.0
    }
}
