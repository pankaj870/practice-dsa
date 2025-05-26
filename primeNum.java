public class primeNum {
    public static void main(String[] args) {
        int  num = 96225;
        boolean check = false;
        if(num>1){
        for(int i =2;i<=num/2+1;i++){
            if(num%i==0){
                System.out.print(num +" not prime");
                check=true;
                break;
            }
        }
        if(!check)
            System.out.println("prime");
    }else{
            System.out.println("not prime");
        }
    }
}
