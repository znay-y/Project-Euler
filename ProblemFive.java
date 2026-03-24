public class ProblemFive {
public static void main(String[] args) {
    boolean valid=false;
    int num=0;
    for(int i=1;i<1000000000;i++){
        if(i%2==1||i%3!=0||i%5!=0||i%7!=0||i%11!=0){
            continue;
        }
        for (int j=1;j<21;j++){
            int div = i%j;
            num=i;
            if (div==0) {
                valid=true;
            }
            else{
                valid=false;
                System.out.println(i+" failed at "+j);
                break;
            }
        }
        if (valid==true){
            System.out.println(num);
            break;
        }
        else{
            continue;
        }
    }
}
}
