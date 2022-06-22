
/*
  Given a string as standard input parse the string into a matrix

  args[0]: "{{1,2,3},{1,2,3},{1,2,3}}"

  RESULT: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }
 */
public class ReadMatrix {

    public static void main(String[] args) {


        String nuovaStringa = args[0];
        nuovaStringa = nuovaStringa.replaceAll(",", "");
        nuovaStringa = nuovaStringa.replaceAll("\\{", "");
        nuovaStringa = nuovaStringa.replaceAll("\\}", "");

        int separatore = 0;

        char[][] matriceTrasformata = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (separatore < nuovaStringa.length())
                    matriceTrasformata[i][j] = nuovaStringa.charAt(separatore);
                separatore++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriceTrasformata[i][j] + ", ");
            }
            System.out.println("");
        }
    }

}