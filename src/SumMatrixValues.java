
/*
  Given a single matrix of ints prints on standard output the sum of all int contained in the matrix
  A: {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  RESULT: 36
 */
public class SumMatrixValues {

    public static void main(String[] args) {

        int[][] matrice = {
                {2, 4, 6},
                {2, 4, 6},
                {2, 4, 6}
        };

        int sommaRiga = 0;

        for (int i = 0; i < matrice.length; i++) {



            for (int j = 0; j < matrice[0].length; j++) {

                sommaRiga += matrice[i][j];
            }

        }

        System.out.println("La somma degli elementi della matrice e': " + sommaRiga);
    }

}