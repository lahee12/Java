import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        // 매개변수로 전달된 정수 배열의 짝수만
        // 새로운 정수 배열에 담아서 리턴하는 메서드
        int[] numbers1 = {64, 55, 95, 34, 41, 15, 11, 70, 2, 62};
        int[] numbers2 = {17, 92, 78, 6, 1, 52, 60, 28, 98, 16};
        int[] numbers3 = {12, 19, 86, 44, 40, 80, 71, 99, 85, 86};
        int[] numbers4 = {1,3,5,7,9};
        System.out.println(Arrays.toString(collectEvenNumber(numbers1)));
        System.out.println(Arrays.toString(collectEvenNumber(numbers2)));
        System.out.println(Arrays.toString(collectEvenNumber(numbers3)));
        System.out.println(Arrays.toString(collectEvenNumber(numbers4)));
    }
    public static int[] collectEvenNumber(int[] numbers) {
        int[] newArray = new int[numbers.length];
        int count = 0;
        for(int i=0; i< numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                newArray[count] = numbers[i];
                count = count + 1;
            }
        }
        int[] returnArray = new int[count];
        for (int i=0; i<count; i++) {
            returnArray[i] = newArray[i];
        }
        return returnArray;
    }
}