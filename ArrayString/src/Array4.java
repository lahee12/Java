public class Array4 {
    public static void main(String[] args) {
        // 배열의 길이
        int[] numbers = {3, 4, 5, 6, 7,};
        System.out.println("배열의 길이 : " + numbers.length);
        // 배열의 출력 (반복문 사용)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // 배열의 출력 (반복문사용 1) - For문의 간단 버전
         for (int i : numbers){
             System.out.println(numbers[i]);
         }
         //배열의 출력 (반복문사용 2) - For문의 간단 버전
        // <주의> 오직 배열과 컬렉션에만  사용이 가능하다!!!
        // data 변수는  iterator (반복자)가 아니고
        // 배열에서 순서대로 꺼낸 데이터임.
        for (int data : numbers){
            System.out.println(data);
            // bata는 반복문안에서 순서대로 3, 4, 5, 6, 7을 가짐

            // 예제
            String[] colors = {"black","white","blue","rad","green"};
            for (int i=0; i< colors.length; i++){
                System.out.println(i);
            }
            System.out.println();
            for (String date : colors){
                System.out.println(data);
            }
            int count = 0;
            for (String bata : colors){
                System.out.println(count + " : " + data);
                count = count + 1;
            }
            // 간단버전의 For 문 (=for-each 문)은 인덱스 값을 제공하지 않기 때문에
            // 필요하면 직접 추가해야함.
        }
    }
}