public class PrintVsReturn {

    public static void main(String[] args) {
        System.out.println("PrintVsReturn running...");
        int data = getData();
        System.out.println(data);
        String name = getName();
        System.out.println(name);
    }

    public static int getData() {
        return 20;
    }

    public static String getName() {
        return "tushar Upadhyay";
    }
}
