public class DemoOfTryFInallly {
    public static void main(String[] args) {
        
        int i = 10;
        int j = 0;
        try{
            j = i/0;
            System.out.println(j);
        }
        catch(Exception e){
            System.out.println("Error Found, try again");
        }
        finally{
            System.out.println("Good Bye");
        }
    }
}
