public class String1 {
    public static void main(String[] args) {
        //숫자 -> 문자열
        int a = 10;
        String str = Integer.toString(a);
        System.out.println(str);

        //문자열 -> 숫자
        String str2 = "10";
        int b = Integer.parseInt(str2);
        System.out.println(b + 1); //11
        Integer c = Integer.valueOf(str2);
        System.out.println(c  + 1); //11
        //parseInt는 int 를 리턴, 수학계산에 사용!!
        //valuseOf는 Integer(int 의 wrapper클래스)를 리턴, 컬렉션에 사용

    }
}
