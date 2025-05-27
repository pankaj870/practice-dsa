package sorting;

public class NormalSort {
    public static void main(String[] args) {
        int[] array ={2,3,4,5,9,5,4,5,2};

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int element :array){
            System.out.print(element + " ");
        }
    }
}

