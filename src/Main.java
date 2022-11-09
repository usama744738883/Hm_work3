public class Main {
    public static void main(String[] args) {
        double number[] = {2.3, 4.6, -3.4, 4.3, 2.8, -8.9, 6.8, 5.9, 2.8, -3.6, 6.2, 8.6, 4.9, -9.2, 6.3};
        double count = 0;
        double amount = 0;
        boolean amogus = false;
        for (double gustavo : number) {
            if (gustavo < 0) {
                amogus = true;
            } else if (gustavo > 0 && amogus) {
                count = gustavo;
                amount++;
                System.out.println(gustavo);

            }

        }
        System.out.println("среднее орифметическое число: " + count / amount);
    }
}