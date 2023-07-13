package be.tsapasMi33.demo;

import java.util.Arrays;

public class DemoArrays {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Pierre";
        names[1] = "Paul";
        names[2] = "Jacques";

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        for (String s : names) {
            System.out.println(s);
        }

        Arrays.stream(names).forEach(System.out::println);

        String names2D[][] = new String[5][3];

        int counter = 1;
        for (int i =0; i<names2D.length; i++){
            for (int j = 0; j<names2D[i].length;j++){
                names2D[i][j] = String.valueOf(counter);
                counter ++;
            }
        }

        for (int i =0; i<names2D.length; i++){
            for (int j = 0; j<names2D[i].length;j++){
                System.out.printf("%5s",names2D[i][j]);
            }
            System.out.println();
        }


    }
}
