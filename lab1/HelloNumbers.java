public class HelloNumbers {
    public static void main(String[] args){
        int x = 0, count = 1;
        while(x <= 45) {
            System.out.print(x + " ");
            x += count++;
        }
    }
}