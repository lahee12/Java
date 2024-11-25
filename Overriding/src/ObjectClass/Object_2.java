package ObjectClass;

class A {
    int a = 3;
    int b = 4;
}
class B {
    int a = 3;
    int b = 4;
    @Override
    public String toString() {
        return "필드값(a,b) = " + a + " " + b;
    }
}

public class Object_2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a); // ObjectClass.A@4e50df2e //해쉬코드 핵사값 메모리위치를 알려주진않음
        //// 클래스의 해당 인스턴스 16진수 공유값 코딩에서 쓸일은 거의 없음
        System.out.println(b); // 필드값(a,b) = 3 4
    }
}