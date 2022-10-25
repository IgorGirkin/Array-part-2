public class Main {
    public static void main(String[] args) {
        int[] weidhts = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weidhtsCopy = {902, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weidhtsCopy[0]=832;
        int januaryWeigtht = weidhts[0];
        System.out.println(weidhts[0]);
        System.out.println(januaryWeigtht);
        int january = 0;
        System.out.println(weidhts[january]);
        for (int i = 0; i < weidhts.length; i++) {
            System.out.println(weidhts[i]);
        }
        boolean arreysAreEqu = true;
        arreysAreEqu=weidhts.length==weidhtsCopy.length;
        if (arreysAreEqu) {
            for (int i = 0; i < weidhts.length; i++) {
                if (weidhts[i] != weidhtsCopy[i]) {
                    arreysAreEqu=false;
                }
            }
        }

        if (arreysAreEqu) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        int maxWright = -1;
        for (final int current : weidhts) {
            if (current > maxWright) {
                maxWright = current;
            }
        }
        System.out.println(maxWright);
            for (int i = 0; i < weidhts.length-1 && weidhts[i+1]!=0; i++) {
                    System.out.println(weidhts[i+1]-weidhts[i]);
                }
    }
}
