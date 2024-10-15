public class Exemple1 {
    public static void main(String[] args) {
         System.out.println("예제1");
         byte a = 1;
         // byte타일의 크기(1바이트)만큼 메모리를 할당하고 주소를 a라고 부른다.
         //a 위치에 숫자 1을 저장한다.
         byte b = 2;
         b = 3; // 기존에 할당받은 메모리 위치인 b자리에 3을 덮어씌우는 코드(데이터타입 사용불가!)
         int c = a + b;
         System.out.println(c);

         char  ch1 ='A'; // char 형은 문자 하나만 저장하고 단따옴표(' ')를 사용
         char  ch2 ='B';
         System.out.println(ch1);
         System.out.println(ch2);
         System.out.println(ch1 + ch2); // 산술연산자 + 때문에 숫자로 변환하여 덧세을 수행함
         System.out.println("" + ch1 + ch2); // 빈 문자열이 포함되면서 숫자가 아닌 문자로 더함
         System.out.println(+ch1); // 유니코드 65 출력, +기호는 숫자로 변환하라는 뜻
         System.out.println(+ch1 + +ch2); // 131

        //문자가 여러개 모인 것은 문자열이라고 함
        //문자열은 데이터타일을 chear 대신 String을 사용 (첫글자가 S가 대문자 주의!!)
         String str = "서형원";
         System.out.println(str);

         // Boolean 타입 예제
         boolean bool = true; // tures는 참의 뜻, false는 거짓의 뜻
         System.out.println(bool);
    }
}
