import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CIS400Test {
    int[] testarr=new int[]{1,2,3,4,5,6};
    @org.junit.jupiter.api.Test
    void reverse() {
        int[] arr=CIS400.reverse(testarr);
        System.out.println(Arrays.toString(arr));
    }
    int[] test1=new int[]{1,2,2,3,4,4};
    @org.junit.jupiter.api.Test
    void dedupe(){

        System.out.println(CIS400.dedupe(test1));
        System.out.println(Arrays.toString(test1));
    }


    @org.junit.jupiter.api.Test
        public void t1() {
            int[] input = new int[]{1, 2, 3, 4};
            int[] answer = CIS400.cumulativeSum(input);
            // answer[0] = input[0]
            // answer[1] = input[0]+input[1]
            // answer[2] = input[0]+input[1]+input[2]
            // ...
            assertArrayEquals(new int[]{1, 3, 6, 10}, answer);
        }
    @org.junit.jupiter.api.Test
        public void t2() {
            int[] input = new int[]{10, 0, 5, 0, 5, 5};
            int[] answer = CIS400.cumulativeSum(input);
            assertArrayEquals(new int[]{10, 10, 15, 15, 20, 25}, answer);
        }

}