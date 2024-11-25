package Super1;


class A {

    void  abc(){
        System.out.println("A클래스");
    }
}
class B extends  A {
    @Override
    void abc() {
        System.out.println("B클래스 abc");
    }
    void  bcd(){
        //System.out.println("B클래스 bcd");
        abc(); // this.abc() 와 동일함
        super.abc(); // super 는 부모의 인스턴스를 의미함 <클래스 안에서 만 씀>

    }
}
public class Super1 {
    public static void main(String[] args) {
        B value1 = new B();
        value1.abc();
        value1.bcd();
        A value2 = (A)value1; // 업캐스팅
        value2.abc();
        value2.abc();
        // 에러.. A를 바인딩 (참조)하고 있으므로  B에있는 영역에 있는
        //bdc 메서드는 호출이 불가능하다

    }

}
