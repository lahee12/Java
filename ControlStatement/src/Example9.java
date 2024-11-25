import java.util.Scanner; // Scanner 클래스를 가져옵니다.

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 초기화

        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt(); // 사용자로부터 숫자를 입력받음

        System.out.println("입력한 숫자의 제곱: " + square()); // 제곱 출력

        scanner.close(); // Scanner 자원 해제
    }

    // 입력받은 숫자의 제곱을 리턴하는 메서드
    //새로운 답변1.
    //public static int square(int num) {
      //  return num * num;


    //선생님께서 원하는 답변!
    public static int square(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int number = scanner.nextInt();
        scanner.close();
        return  number * number;
    }
}