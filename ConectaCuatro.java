package ConectaCuatro;

import java.util.Scanner;

public class ConectaCuatro {

    private int tabla[][] = new int[6][7];
    Scanner sc = new Scanner(System.in);

    public void ponerCeros() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                tabla[i][j] = 0;

            }
        }

    }

    public int getTabla(int i, int j) {

        return tabla[i][j];

    }
    int ficha = 1;

    void actuar(int x, int i, int y) {
        
        if (tabla[x + 5][i] == 0) {
            tabla[x + 5][i] = y;
        } else if (tabla[x + 4][i] == 0) {
            tabla[x + 4][i] = y;
        } else if (tabla[x + 3][i] == 0) {
            tabla[x + 3][i] = y;
        } else if (tabla[x + 2][i] == 0) {
            tabla[x + 2][i] = y;
        } else if (tabla[x + 1][i] == 0) {
            tabla[x + 1][i] = y;
        } else if (tabla[x][i] == 0) {
            tabla[x][i] = y;
        }
        

    }

    public void tablah() {
        int i;
        int j;
        for (i = 0; i < 6; i++) {

            for (j = 0; j < 7; j++) {
                System.out.print(tabla[i][j] + " ");

            }
            System.out.println("");

        }
    }

    private boolean horizontal(int y, int x, int num) {

        for (int i = 0; i < 4; i++) {
            if (tabla[y][x + i] != num) {
                return false;
            }
        }

        return true;
    }

    private boolean vertical(int y, int x, int num) {

        for (int i = 0; i < 4; i++) {
            if (tabla[y + i][x] != num) {
                return false;
            }
        }

        return true;
    }

    public boolean victoria(int num) {

        return diagolan(num) || horizontal(num) || vertical(num);

    }

    private boolean horizontal(int num) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (cHoritz(i, j, num)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean vertical(int num) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (cVert(i, j, num)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean cHoritz(int y, int x, int num) {

        for (int i = 0; i < 4; i++) {
            if (tabla[y][x + i] != num) {
                return false;
            }
        }

        return true;
    }

    private boolean cVert(int y, int x, int num) {

        for (int i = 0; i < 4; i++) {
            if (tabla[y + i][x] != num) {
                return false;
            }
        }

        return true;
    }

    private boolean diagolan(int num) {

        return cDiagEsquerra(num) || cDiagDreta(num);

    }

    private boolean cDiagEsquerra(int num) {

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 4; x++) {

                if (diagonalEsquerra(y, x, num)) {
                    return true;
                }

            }

        }

        return false;

    }

    private boolean cDiagDreta(int num) {

        for (int y = 0; y < 3; y++) {
            for (int x = 3; x < 7; x++) {

                if (diagonalDreta(y, x, num)) {
                    return true;
                }

            }

        }

        return false;

    }

    private boolean diagonalDreta(int y, int x, int num) {

        for (int i = 0; i < 4; i++) {

            if (tabla[y++][x--] != num) {
                return false;
            }

        }

        return true;
    }

    private boolean diagonalEsquerra(int y, int x, int num) {

        for (int i = 0; i < 4; i++) {

            if (tabla[y++][x++] != num) {
                return false;
            }

        }

        return true;

    }
}
