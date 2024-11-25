public class Example5 {
    public static void main(String[] args) {
        // 대소문자와 숫자가 혼합된 문자열에서 소문자와 대문자의 갯수를 리턴하는 메서드
        // 숫자는 제외
        // 리턴 형태는 "소문자 갯수 : 대문자 갯수"
        String str1 = "aBcDeFgHiJk";
        String str2 = "LmNoPqRsTu";
        String str3 = "VwXyZ1234";

        System.out.println(getCharRatio(str1)); // 6 : 5
        System.out.println(getCharRatio(str2)); // 5 : 5
        System.out.println(getCharRatio(str3)); // 2 : 3
    }

    public static String getCharRatio(String str) {
        int lowerCount = 0; // 소문자 갯수
        int upperCount = 0; // 대문자 갯수
        char[] chArray = str.toCharArray(); // String을 char배열로 변환

        for (int i = 0; i < chArray.length; i++) {
            if (Character.isLowerCase(chArray[i])) {
                lowerCount++; // 소문자 갯수 증가
            } else if (Character.isUpperCase(chArray[i])) {
                upperCount++; // 대문자 갯수 증가
            }
        }

        return lowerCount + " : " + upperCount; // 결과 반환
    }
}
