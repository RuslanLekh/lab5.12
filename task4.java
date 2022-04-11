public class task4 {
    public static void main(String[] args) {

        int list [] [] = new int [3] [10];

        for (int i = 0; i < 10; i++) {

            list [0] [i] = (int) Math.round(Math.random() * 10);
            list [1] [i] = (int) Math.round(Math.random() * 10);
            list [2] [i] = list [0] [i] + list [1] [i];
        }

        for (int j = 0; j < list.length; j++) {
            System.out.println("Масив №:" + (j+1));
            for (int k = 0; k < list[j].length; k++) {
                System.out.print(list[j][k] + "; ");
            }

            System.out.println();
        }
    }
}
