import java.util.Scanner;
 class eqSegGrau {
    double a, b, c;
        public eqSegGrau(){

            Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = input.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = input.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = input.nextDouble();

    }

    public double delta() {

        return (b * b) - (4 * a * c);

    }

    public void raiz(double resultdelta) {

        double x1 = (-b + Math.sqrt(resultdelta)) / (2 * a);
        double x2 = (-b - Math.sqrt(resultdelta)) / (2 * a);
        System.out.println("X1 = " + x1 + "\nX2 = " + x2);

    }

 }
