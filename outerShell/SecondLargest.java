package outerShell;

public class SecondLargest {
    public static void main(String[] args) {
        int arr []= {28004 ,23544 ,32504 ,29493 ,17013 ,17850 ,18952 ,12089, 5126 ,10353 , 28500};
        int n = arr.length;
        long max = arr[0],prev=0,third=0;

        for(int i=1;i<n;i++){
            if(max<arr[i] && max!=arr[i]){
                third = prev;
                prev=max;
                max=arr[i];
            }else {
                if(prev<arr[i]) {
                    third = prev;
                    prev = arr[i];
                }else if(arr[i]>third){
                    third =arr[i];
                }
            }
        }
        long output = (prev==third)? -1: third;

        System.out.println(output+" " + prev +" "+ max);

    }
}
