public class ReverseInteger {
    public static void main(String[] args){
        int num = 12345;
        int rev = 0;
        while (num !=0){
            rev = rev*10+num %10;
            num = num/10;
        }
        System.out.println("Reverse num is :::::"+rev);
        int num1= 54321;
        StringBuffer sb= new StringBuffer(String.valueOf(num1));
        System.out.println(sb.reverse());

        int num2= 123456;
        int revs=0;
        while (num2 !=0){
            revs= revs*10+num2%10;
            num2=num2/10;

        }

        System.out.println("This is Reverse num:::"+revs);
    }
}
