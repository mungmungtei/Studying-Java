package polymorphism;

import java.util.Arrays;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(500);  // 조상 클래스의 생성자 Product(int price) 호출
    }
    public String toString() {  // Object 클래스의 toString() 메서드 오버라이딩
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(300);
    }
    public String toString() {
        return "Computer";
    }
}

class Smartphone extends Product {
    Smartphone() {
        super(100);
    }
    public String toString() {
        return "Smartphone";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] cart = new Product[4];  // 조상 타입 배열에 자손 객체들 담을 수 있다
    int i = 0;

    void buy(Product product) {  // 매개변수로 부모 타입을 넣으면 그 자손 타입들도 모두 사용 가능
        if (money < product.price) {
            System.out.println("금액이 모자랍니다");
        }

        money -= product.price;
        bonusPoint += product.bonusPoint;
        cart[i++] = product;

        // 참조변수에 문자열 더하면 참조변수.toString() 과 같음
        System.out.print(product + "를 구입하셨습니다 ");
        System.out.println(Arrays.toString(cart));
        // Tv를 구입하셨습니다 [Tv, null, null, null]
        // Computer를 구입하셨습니다 [Tv, Computer, null, null]
        // Smartphone를 구입하셨습니다 [Tv, Computer, Smartphone, null]
    }

    void summary() {
        int sum = 0;
        String list = "";

        for(int i = 0; i < cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            list += cart[i] + " ";
        }
        System.out.println("구입하신 제품의 총 금액은 " + sum + "만원입니다");
        // 구입하신 제품의 총 금액은 900만원입니다
        System.out.println("구입하신 제품은 " + list + "입니다");
        // 구입하신 제품은 Tv Computer Smartphone 입니다
    }
}

public class Polymorphism02 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // Product product = new Tv();
        // buyer.buy(product);
        // => buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Smartphone());
        buyer.summary();

        System.out.println("현재 잔액은 " + buyer.money + "만원입니다");  // 현재 잔액은 100만원입니다
        System.out.println("현재 보너스포인트는 " + buyer.bonusPoint + "점입니다");  // 현재 보너스포인트는 90점입니다
    }
}
