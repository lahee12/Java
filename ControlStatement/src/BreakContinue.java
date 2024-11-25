public class BreakContinue {
    public static void main(String[] args) {
        // break 문
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // 이중 for 문에서 바깥 for 문 까지 한번에 탈출하려면...
        for (int i = 0; i < 3; i++) { //3번 반복
            for (int j = 0; j < 5; j++) { //5번 반복
                if (j == 2) {
                    //바깥 for 문의 조건을 거짓으로 만들도록 i 값을 크게 변경
                    i = 999999; // 100은 의미없음, 3보다 매우 큰 수로 세팅 (가독성)2
                }
            }
        }
            // continue
            for (int i= 0; i < 3; i++) { //3번 반복
                for (int j = 0; j < 5; j++) { //5번 반복
                    if (j == 2) {
                        continue;
                    }
                    System.out.println("i=" + i + ",j" + j);// i=0 , j=0
                }
            }
        }
    }
