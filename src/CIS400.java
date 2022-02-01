public class CIS400 {
    public static int[] reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        return arr;}
    public static int dedupe(int[] sorted){
        int numUniqs=0;
        for(int i=1;i<sorted.length;i++){
            if(sorted[i]>sorted[numUniqs]){
                numUniqs++;
                sorted[numUniqs]=sorted[i];
            }
        }
        return numUniqs+1;
    }




        public static int[] cumulativeSum(int[] data) {

            for(int i=1;i<data.length;i++){
                data[i]=data[i-1]+data[i];
            }

            return data;
        }

}
