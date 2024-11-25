package P1031;// 패키지 정의부분 (인텔리 제이가 자동으로 부여함)
// #1. 다른 패키지에 있는 외부 클래스를 사용하려면 import 해야만 함

//import java.util.Arrays;

//MyClass.java 파일내의 유일한 public  클래스임
//반드시 파일명과 클래스 이름이 동일해야함!!
public class MyClass {
    public static void main(String[] args) {
        String[] strings = {"Hello", "Word"};
       // System.out.println(Arrays.toString(strings));
        // # 2. import 없이 풀네임을 사용할 수도 있음
        System.out.println(java.util.Arrays.toString(strings));
        externalClass ec = new externalClass();
    }
}
 class  ExternalClass {
    //외부클래스 같은 파일내에 정의한 경우,
     //외부클래스는 public을 사용할수 없음!!
 }