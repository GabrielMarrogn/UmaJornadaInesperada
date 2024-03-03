import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        List<Integer> list = new ArrayList<>();


        while ((a = sc.nextInt()) != 0) {
            int[][] matriz = new int[a][3];
            int toque = 0;

            for (int i = 0; i < matriz.length; i++) {
                for (int k = 0; k < matriz[i].length; k++) {
                    matriz[i][k] = sc.nextInt();
                }
            }
            int posicao = 1;

            for (int i = 0; i < matriz.length; i++) {
                for (int k = 0; k < matriz[i].length; k++) {
                    int papai = matriz[i][posicao];

                    // Meio
                    if (papai == 1 && matriz[i][2] == 1 && posicao == 1) {
                        toque++;
                        papai = 0;
                        posicao = 0;

                    } else if (papai == 1 && matriz[i][0] == 1 && posicao == 1) {
                        toque++;
                        papai = 0;
                        posicao = 2;

                    }
                    // Esqueda
                    else if (papai == 1 && matriz[i][1] == 1 && posicao == 0) {
                        toque += 2;
                        papai = 0;
                        posicao = 2;
                    } else if (papai == 1 && matriz[i][2] == 1 && posicao == 0) {
                        toque++;
                        papai = 0;
                        posicao = 1;
                    }

                    else if (papai == 1 && matriz[i][1] == 1 && posicao == 2) {
                        toque += 2;
                        papai = 0;
                        posicao = 0;
                    } else if (papai == 1 && matriz[i][0] == 1 && posicao == 2) {
                        toque++;
                        papai = 0;
                        posicao = 1;
                    }
                }
            }

            list.add(toque);
        }

        for (Integer p : list) {
            System.out.println(p);
        }

        sc.close();
    }
}
