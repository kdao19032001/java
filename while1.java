public class while1 {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (sum < 100) {
            System.out.println("Nhập vào số nguyên bất kỳ: ");
            number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Tổng các số nguyên vừa nhập = " + sum);
    }
}
