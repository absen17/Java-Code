public class Star_Pattern {
    public static void main(String[] args) {
        patt9(7);
    }
    static void patt9(int a){
        for (int i =1;i<=a;i++){
            for (int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for (int j = a;j>=i;j--){
                System.out.print("*");
            }
            for (int m=a-1;m>=i;m--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt8(int a){
        for (int i=1;i<=a;i++) {
            for (int j = a - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int m=1;m<=i-1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt7(int a){
        for (int i=1;i<=a;i++){
            for (int j=a-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void patt6(int a){
        for (int i=1;i<=a;i++){
            for (int j=a-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int b=1;b<=a;b++){
            for (int c=1;c<=b;c++){
                System.out.print(" ");
            }
            for (int d=a-1;d>=b;d--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt5(int a){
        for (int i=1;i<=a;i++){
            for (int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for (int j=a;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt4(int a){
        for(int i=1;i<=a;i++){
            for (int j=a-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt3(int a){
        for (int row=1;row<=a;row++){
            for (int col =1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row=1;row<=a;row++){
            for (int col =a-1;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt2(int a){
        for (int row=1;row<=a;row++){
            for (int col =a;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt1(int a){
        for (int row=1;row<=a;row++){
            for (int col =1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
