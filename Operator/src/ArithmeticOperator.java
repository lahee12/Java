public class ArithmeticOperator {
    public static void main(String[] args) {
            //#1. 산술연산자(+,-,*,/,%)

            System.out.println(2+3);   //5
            System.out.println(8-5);   //3
            System.out.println(7*2);   //14
            System.out.println(7/2);   //3
            System.out.println(8%5);   //3 모듈로(modulo),나머지를 마침
            System.out.println();

            //#2. 증감연산자 (++,__)
            int value1 = 3;
            value1++;
            System.out.println(value1);	//4

            int value2 = 3;
            ++value2;
            System.out.println(value2);	//4
            System.out.println();

            int value3 = 3;
            int value4 = value3++;
            //value3 = value3 + 1;
            System.out.println(value3);	//4
            System.out.println(value4);	//3
            System.out.println();


            int value5 = 3;
            int value6 = ++value5;
            System.out.println(value5);	//4
            System.out.println(value6);	//4
            System.out.println();


            // 절대 이런짓은 하지 말자!!
            int value7 = 3;
            int value8 = 4;
            int value9 = 2 + value7-- + ++value8;
           // 풀어서 작성하면
            //vslue8 = value8 + 1; //5
            //int value9 = 2 +value7 + vaule8;
            //value7 = value7 - 1;
           System.out.println(value7);	//2
            System.out.println(value8);	//5
            System.out.println(value9);	//10
}
    }

