public class PowerMethod{
    public int power(int number ,int exponent){
        int result =1;
        for(int i= 0 ; i <  exponent ; i++ ){
            result = result * number;
        }
        return result;
    }

    public static void main(String []args){
        PowerMethod pm=new PowerMethod();
        int result=pm.power(5,3);
        System.out.println(result);
    }
}
