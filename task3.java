public class task3 {
    public static void main(String[] args) {

        double list1 [] = new double [5] ;
        double list2 [] = new double [5];
        double list3 [] = new double [5];

        System.out.println("Перший масив: ");
        for (int i = 0 ; i < 5 ; i++){
            list1[i] = (int) Math.round(Math.random()*5);
            System.out.print(list1[i] + "; ");
        }
        System.out.println();
        double result1 = 0;
        result1 = (list1[0] + list1[1] +list1[2] +list1[3] +list1[4])/5;
        System.out.println("Середнє арифметичне першого арифметичного: "+ result1 );
        //Перший масив

        System.out.println();
        System.out.println("Другий масив: ");
        for (int j = 0 ; j < 5 ; j++){
            list2[j] = (int) Math.round(Math.random()*5);
            System.out.print(list2[j]+ "; ");
        }
        double result2 = 0;
        result2 = (list2[0] + list2[1] + list2 [2] + list2[3] + list2[4])/5;
        System.out.println("Середнє арифметичне другого масиву: " + result2 );
        //Другий масив

        System.out.println();
        System.out.println("Третій масив: ");
        for (int k = 0 ; k < 5 ; k++){
            list3[k] = (int) Math.round(Math.random()*5);
            System.out.print(list3[k] + "; ");
        }
        double result3 = 0;
        result3 = (list3[0] + list3[1] + list3[2] + list3[3] + list1[4])/5;
        System.out.println("Середє арифметичне третього масиву: " + result3);
        //Третій масив

        System.out.println();
        if (result1 >= result2 && result1 >= result3) {
            System.out.println("Найбільше середнє арифметичне - першого масиву");
        }else if (result2 >= result3 && result2 >= result1) {
            System.out.println("Найбільше середнє арифметчне - другого масиву ");
        }else if (result3 >= result1 && result3 >= result2 ) {
            System.out.println("Найбільше середнє арифметичне - третього маисву");
        }else{
            System.out.println("Усі середні арифметичні рівні!");
            //надзвичайна рідкість!
        }

    }
}
