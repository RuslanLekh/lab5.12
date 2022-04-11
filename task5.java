public class task5 {
    public static void main(String[] args) {

        int list [] = new int [15];

        System.out.println("Масив: ");
        for (int i = 0; i < 15 ; i++) {
            list[i] = (int) Math.round(Math.random() * 10);
            System.out.print(list[i] + "; ");
        }

        System.out.println();

        System.out.println("Парні числа: ");
        for (int i = 0; i < list.length ; i++){
            if (list[i] % 2 == 0){
                System.out.print( list[i] + "; ");
            }
        }
    }
}
