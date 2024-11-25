package Modfier_1._pack1;

public class B {
    public  void  print() {
      A a = new A ();
        System.out.println(a.a + " ");
        System.out.println(a.b + " ");
        System.out.println(a.c + " ");
        //System.out.println(a.d + " "); //private 다른 클래스에서 접근 불가
        System.out.println();
    }
}
