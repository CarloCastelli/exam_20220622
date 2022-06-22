
/*
  Given two matrix of ints prints on standard output the sum of both matrix
  A: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  B: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  RESULT:
  {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  Result matrix must be printed and formatted as previously shown
 */
public class SumTwoMatrix {

    public static void main(String[] args) {


        int[][] primaMatrice = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int[][] secondaMatrice = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int[][] matriceRisultato = new int[3][3];


        for (int i = 0; i < primaMatrice.length; i++) {
            for (int j = 0; j < primaMatrice[i].length; j++) {
                matriceRisultato[i][j] = primaMatrice[i][j] + secondaMatrice[i][j];
            }

        }


        for (int i = 0; i < matriceRisultato.length; i++) {
            for (int j = 0; j < matriceRisultato.length; j++) {
                System.out.print(matriceRisultato[i][j] + " ");
            }
            System.out.println();

        }


    }
}