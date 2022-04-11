public class task6 {
    public static void main(String[] args) {
        int list [][] = new int [15][];
        for (int i = 0 ; i < list.length ; i++){
            if (i<4) {
                list[i] = new int[5];
            }else if (i < 8) {
                list[i] = new int[8];
            }else if (i<12) {
                list[i] = new int[3];
            }else{
                list[i] = new int[9];
            }
            System.out.println("Масив_" + (i + 1) + ": ");
            for (int k = 0 ; k < list[i].length; k++ ){
                list[i][k] = (int)Math.round(Math.random()*15);
                System.out.print(list[i][k] + ";");
            }
            System.out.println();
        }
    }
}
