/**
 * nestedTryCatch
 */
public class newStuff {

    public static void main(String[] args) {
        try{
            int a=0,b=5;
            int arr[] = new int[2];
            try{
                int x = b/a;
                System.out.println(x);

            }catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                arr[3] = 15;

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            arr[7] = 14;
        } catch(Exception e){
            System.out.println("Outer Try Block");
        }
        System.out.println("After Try Catch Blocks");
    }
}