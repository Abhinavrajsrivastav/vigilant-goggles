public class LinearP {
    public static void main(String[] args) {
        //Linear Probing Method in HashMap-
        int[] arr = new int[10];
        for(int i = 0;i<10;i++){
            arr[i] = -1;
        }

        //input data
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i<data.length;i++){
            int value = data[i];
            int hash = value % 10;
            if(arr[hash] == -1){
                arr[hash] = value;
            }else{
                int k = 1;
                while(arr[(hash+k)%10] != -1){
                    k++;
                }
                arr[(hash+k)%10] = value;
            }
        }

        //display data
        for(int i = 0;i<10;i++){
            System.out.println("Index "+i+" : "+arr[i]);
        }
    }
    
}
