public class task2 {
    public static void main(String[] args) {
        int [] rand_numb  = new int [20] ;
        System.out.println("Old list: ");
        for (int i = 0 ; i < 20 ; i++ ) {
            rand_numb[i] = (int) Math.round(Math.random() * 9);
            System.out.print(rand_numb[i] + " ");
            if (i % 2 == 1 ) {
                rand_numb [i] = 0 ;
            }
        }
        System.out.println() ;
        System.out.println("New list: ") ;
        for (int i = 0 ; i < 20 ; i++) {
            System.out.print(rand_numb[i] + " ");
        }
    }
}
