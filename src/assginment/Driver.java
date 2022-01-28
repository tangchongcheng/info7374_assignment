package assginment;

public class Driver {
    public static void main(String[] args){
        Google goo = new Google("001","Google","This is Google.");
        IBM ibm = new IBM("002","IBM","This is IBM.");

        for(int i=0;i<6;i++){
            goo.setBid(8+5*i);
            goo.getMetric();
            System.out.println("Google: " + goo.toString());
            ibm.setBid(8+6*i);
            ibm.getMetric();
            System.out.println("IBM: " + ibm.toString());
        }

    }
}
