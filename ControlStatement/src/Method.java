public class Method {
    public static void main(String[] args) {
        //메서드없이 홀짝을 구분하는 코드
        int num = 4;
        String str = (4 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 5;
        str = (4 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 6;
        str = (4 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 7;
        str = (4 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 8;
        str = (4 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 9;
        str = (4 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
        num = 10;
        str = (4 % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
       //메서드의 사용, 호출 (= call method)

        checkOddEven(4); // 매개변수로 정수 4 사용
        checkOddEven(5);
        checkOddEven(6);
        checkOddEven(7);
        checkOddEven(8);
        checkOddEven(9);
        checkOddEven(10);
        // checkOddEven(int unmber = 5); // 에러!! 매개변수는 값만 입력

        System.out.println("메서드의 return");
        checkOddEven(100);
        System.out.println(checkOddEven2(100));
     }
    //메서드의 선언,정의
    //public static void checkOddEven(number) //에러!! 정의는 자료형필수
    public static void checkOddEven(int number) {
        String str = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);
}


        public static String checkOddEven2(int number) {
            String str = (number % 2 == 0) ? "짝수" : "홀수";
            return str;
     }
   }