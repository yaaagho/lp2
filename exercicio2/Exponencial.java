public class Exponencial {
    public static void main(String[] args) {
        int i, j, 
        m[][] = new int[11][3];
        System.out.printf ("#" + "   " + "Q" + "   " + "C");
        for (i=0; i<11; i++) {
                for (j=0; j<3; j++) {
                    m[i][0] = i;
                    m[i][1] = i*i;
                    m[i][2] = i*i*i;
                }
        }
        System.out.printf ("\n");
        for (i=0; i<11; i++) {
                for (j=0; j<3; j++) {
                    System.out.printf ("%d   ", m[i][j]);
                }
      System.out.printf ("\n");
    }
  }
}

//Não é possível a exponenciação no modelo i^2 e i^3 sem a classe math.
//Conteúdo procurado na internet: %d, que significa a representação dos números inteiros para exibição.
