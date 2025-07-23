public class Main{
    public static void main(String[] args){
        int n = 5;
        switch (n) {
            case 0 -> System.out.println("0");
            case 1 -> System.out.println("0 1");
            default -> {
                int a = 0, b = 1;
                System.out.print(a + " " + b + " ");
                for(int i = 2; i < n; i++){
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
                System.out.println();
            }
        }
    }
}