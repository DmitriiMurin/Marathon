package Day8;

public class Task1 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("1");
//        System.out.println(sb);
//        int a = 0;
//        for (int i=-1; i<=19999; i++){
//            a= i+1;
//            System.out.print(a + ",");
//        }
        long startTime = System.currentTimeMillis();
        String numbers = "";
    for (int i=0; i<=20000; i++)
        numbers= numbers + i + " ";
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: "+ (stopTime - startTime));

        System.out.println(numbers);

        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<=20000; i++)
            sb.append(i).append(" ");
        long stop = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stop - start));
        System.out.print(sb);


    }
}
