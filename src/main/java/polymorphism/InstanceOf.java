package polymorphism;

class Car {
    String model;
    int door;
    int wheel;

    void drive() {
        System.out.println("운전합니다");
    }

    void stop() {
        System.out.println("멈춥니다");
    }
}

class Ambulance extends Car{
    void siren() {
        System.out.println("사이렌을 울립니다");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("물을 뿌립니다");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        if (fe instanceof FireEngine) {
            System.out.println("가능");
        }
        if (fe instanceof Car) {
            System.out.println("가능");
        }
//        if (fe instanceof polymorphism.Ambulance) {  // Error 발생
//            System.out.println("불가능");
//        }
    }
}
