class C {
   public void myMusic(){
       System.out.println("Playing music..");
    }
    public String myGame(int ip){
       return "Playing Game..";
    }
}

public class Testing {
    public static void main(String[] args) {

            C c = new C();
            c.myMusic();
            String cc = c.myGame(2);
            System.out.println(cc);

    }
}
