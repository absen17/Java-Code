// class T extends Thread{
//     public void run(){
//         for(int i =1;i<=100;i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }
// class T1 extends Thread{
//     public void run(){
//         for(int i =1;i<=100;i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }
// public class DemoOfThread {
//     public static void main(String[] args) {
//         T obj1 = new T();
//         T1 obj2 = new T1();

//         // obj2.setPriority(Thread.MAX_PRIORITY);

//         obj1.start();
//         try {
//             Thread.sleep(5);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         obj2.start();
//     }
// }
