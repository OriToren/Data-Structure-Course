

public class Main {
    public static void main(String[] args) {
        System.out.println(ispalindrome(141));
    }
    private static int dividerhelper(int num,int soontobedivider){
        if (num<10){
            return soontobedivider;
        }
        else{
            return dividerhelper(num/10,soontobedivider*10);
        }
    }
    public static boolean ispalindrome(int num){
        if (num<0){
            return false;
        }
        int divider=dividerhelper(num,1);
        return isrealpalindrome(num,divider);

    }

    private static boolean isrealpalindrome(int num, int divider) {
        if (divider==1 || divider==0 || num<10) {
            return true;
        }
        int leftdigit=num/divider;
        if (num%10 == leftdigit){
            return isrealpalindrome((num-(leftdigit*divider))/10,divider/100);

        }else{
            return false;
        }

    }
}