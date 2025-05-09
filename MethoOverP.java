class CalC{
    public int add(int a, int b){
        return a+b;
    }
}

class AdvCalc extends CalC {
    public int add(int a, int b){
        return a+b+1;
    }
}

public class MethoOverP {
    public static void main(String[] args) {
        
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(2, 5));
        

    }
}
