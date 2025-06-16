class ExceptionHandler {
    public static void main(String[] args) {
        testException();
    }

    public void testException() {
        try {
            throw new ArrayIndexOutOfBoundsException("Error");
        } 
        catch (NullPointerException ne) {
            ne.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
            System.out.println("Final Block");
        }
 }
}