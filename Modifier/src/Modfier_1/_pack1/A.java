package Modfier_1._pack1;

public class A {
    public int a = 1;
    protected  int b = 2;
    int c = 3;
    private  int d = 4;
    //외부패키지에서 읽을 수 없는 b,c,d,는 public 메서드를 통해서만 엑세스 가능
    public  void print() {
        System.out.println(a + " ");
        System.out.println(b + " ");
        System.out.println(c + " ");
        System.out.println(d + " ");
        System.out.println();
    }
}
