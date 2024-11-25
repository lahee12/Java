package Interface;

// 인터페이스의 구성요소
interface  A1 {
    //필드는 상수만 있음
    public  static  final  int a = 3;
    //생성자 x
    //추상메서드
    public  abstract  void  abc();
}
interface  A2 {
    int b = 3; // 생략해도 자동으로  public static final 이 추가됨
    void  bcd(); // 생략해도 자동으로 public abstract 가 추가됨
}
public class Interface_2 {
    public static void main(String[] args) {
        //A2.b는 정적상수이므로 인스턴스 없이 접근 가능함
        System.out.println(A2.b); // 3
 //A2.b = 5; // 에러발생 , b는 상수
    }

}
