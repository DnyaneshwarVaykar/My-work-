public class TowerOfHonai {
    public static void hanoi(int n, String scr, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer dick " + n +" from " + scr + " to " + dest );
            return;
            
        }
        hanoi(n-1, scr, dest, helper);
        System.out.println("Transfer dick " + n +" from " + scr + " to " + dest );
        hanoi(n-1, helper, scr, dest);
    }
    public static void main(String[] args) {
        int n = 4;
        hanoi(n, "S", "H", "D");
    }
}
