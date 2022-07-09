package polymorphism;

class FlyingMachines {
    public void fly() {
        System.out.println("부모 fly");
    }
}

class Jet extends FlyingMachines {
    public void fly() {
        System.out.println("자식 fly");
    }
    public void bomb() {
        System.out.println("Throw Missile");
    }
}

public class Polymorphism01 {
    public static void main(String[] args) {
        FlyingMachines flm01 = new FlyingMachines();
        flm01.fly();  // 부모 fly

        FlyingMachines flm02 = new Jet();
        flm02.fly();  // 자식 fly -> 메서드가 중복 정의된 경우, 실제 인스턴스 타입에 정의된 메서드가 호출된다.
//        flm02.bomb();  // bomb 메서드 사용 불가

        Jet j = new Jet();
        j.fly();  // 자식 fly
        j.bomb();  // Throw Missile
    }
}