public class Main {
    public static void main(String[] args) {
        LandLine l1=new LandLine("12345");
        LandLine l2=new LandLine("67890");

        l1.callNumber("67890");
        l2.receiveCall("6789");
        System.out.println(l2.answerCall());
    }
}