public class Main {
    public static void main(String[] args) {

        eqSegGrau bhask = new eqSegGrau();

        bhask.delta();

        double resultdelta = bhask.delta();
        System.out.println("Delta = " + bhask.delta());

        if(resultdelta < 0){
            System.out.println("Valor de delta é menor que zero");
        }
        else bhask.raiz(resultdelta);













    }
}