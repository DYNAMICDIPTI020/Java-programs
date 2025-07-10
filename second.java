//wap to find even and odd in to 1 to 100
class second {
    public static void main(String[] args) {
        int num = 100;
        for(int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
    }
}
