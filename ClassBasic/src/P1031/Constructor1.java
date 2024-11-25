package P1031;

public class Constructor1 {
    public static void main(String[] args) {
        A a = new A(); // 클래스 A의 인스턴스를 생성
        a.work();

        B b = new B();
        b.work();

        C c = new C(100);
        c.work(); // 100
    }
}

class A {
    int m;

    void work() {
        System.out.println(m); // 0
    }
}

class B {
    int m;

    void work() {
        System.out.println(m); // 0
    }

    B() { // 기본생성자
        System.out.println("B의 기본생성자");
    }
}

class C {
    int m;

    void work() {
        System.out.println(m);
    }

    C(int a) { // 매개변수가 있는 생성자
        m = a;
    }
}
// <중요> 클래스내에 생성자가 없으면 기본생성자 자동 생성
// 생성자가 있으면(어떤것이든 상관없이) 기본생성자 자동 생성 안됨!!
// == 생성자를 만들었으면 그 생성자를 사용해야 함
}