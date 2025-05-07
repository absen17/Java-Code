class Calculator {
    public void playMusic(){
        System.out.println("Playing...");
    }
    public String giveMePen(int a){
        if (a>10) 
            return "Take your Pen";
        else
            return "More money needed";
    }
    public double giveMePen(double a, int b){
        return a+b;
    }
}

public class Practice5 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.playMusic();
        double op = obj.giveMePen(1,1);
        System.out.println(op);
    }
}