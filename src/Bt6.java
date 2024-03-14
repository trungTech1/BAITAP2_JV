

public class Bt6 {
    public static void main(String[] args) {
        int sum = 1;
        boolean isValue = false;
        while (true){
            if((sum % 5 ==0) && (sum % 7 == 0)&&(sum % 11 == 0)){
                System.out.printf("so nguyen chia het cho 5,7,11 la %d :",sum);
                isValue = true;
            }else {
                sum ++;
            }
            if(isValue){
                break;
            }
        }
    }
}