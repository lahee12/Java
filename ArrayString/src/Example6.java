public class Example6 {
    public static void main(String[] args) {
        // 배열내의 최대값을 리턴하는 메서드
        int[] numbers1 = {42, 17, 88, 5, 63, 29, 76, 34, 51, 10};
        int[] numbers2 = {12, 45, 67, 3, 99, 21, 58, 74, 86, 31};

        System.out.println(getMax(numbers1)); // 88
        System.out.println(getMax(numbers2)); // 99
    }

    // 배열의 최대값을 반환하는 메서드
    public static int getMax(int[] numbers) {
        int max = numbers[0]; // 첫 번째 요소로 초기화
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // 새로운 최대값으로 업데이트
            }
        }
        return max; // 최대값 반환
    }
}