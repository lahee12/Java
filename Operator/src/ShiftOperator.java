public class ShiftOperator {
    public static void main(String[] args) {


/*산술시프트와 논리시프트*/


        //#1.산술쉬프트(부호변화가 없음 *2, /2 효과)
        //시프트= 왼쪽오른쪽 이진수를 옮기는
        //@ << Left shift
        System.out.println(3<<1); //6
        System.out.println(-3<<1);//-6
        System.out.println(3<<2); //12
        System.out.println(-3<<2);//-12
        System.out.println(3<<3); //24
        System.out.println(-3<<3);//-24
        System.out.println();

        //@ >> Right shift
        System.out.println(5>>1); //2
        System.out.println(-5>>1);//-3
        System.out.println(5>>2); //1
        System.out.println(-5>>2);//-2
        System.out.println(5>>3); //0
        System.out.println(-5>>3);//-1
        System.out.println();

        //#2. 논리쉬프트 (>>>)
        System.out.println(3>>>1); //0000...0011 = 1
        System.out.println(-3>>>31); //1111...1101 = 1
    }
}
