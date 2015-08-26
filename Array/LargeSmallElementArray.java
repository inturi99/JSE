public class LargeSmallElementArray{
    public static  int  large(int[] a){
        int size=a.length;
        int max=0;
        for(int i=0;i< size;i++){
            if(a[i] > max ){
                max=a[i];
            }
        }
        return max;
    }
    public static  int  small(int[] a){
        int size=a.length;
        int min=a[0];
        for(int i=0;i< size;i++){
            if(a[i] < min){
                min =a[i];
            }
        }
        return min;
    }
    public static void main(String []args){
        int[] a ={20,40,50,60};
        LargeSmallElementArray lsma=new  LargeSmallElementArray();
        int l = lsma.large(a);
        System.out.println(l);
        int s = lsma.small(a);
        System.out.println(s);
    }
}
