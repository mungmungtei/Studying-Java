public class Method01 {

    void notice(int kcal, int some) {
        int total = kcal * some;
        if(total < 500) {
            System.out.println("아직은 괜찮아요");
        } else {
            System.out.println("오늘 군것질 그만-!");
        }
    }

    static float staticAvg(int score1, int score2) {
        float avg = (float) (score1 + score2) / 2;
        return avg;
    }

}
