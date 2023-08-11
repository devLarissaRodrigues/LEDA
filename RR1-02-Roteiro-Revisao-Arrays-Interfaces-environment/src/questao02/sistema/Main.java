public class Main{
    public static void main(String[] args){
        FormaGeometrica triangulo = new Triangulo(5,8);
        FormaGeometrica retangulo = new Retangulo(6,10);
        FormaGeometrica quadrado = new Quadrado(4);
        FormaGeometrica circulo = new Circulo(3);

        public static void imprimirArea(FormaGeometrica formaGeometrica){
            System.out.println("Área da forma geométrica: " + formaGeometrica.calculaArea());
        }

        imprimirArea(triangulo);
        imprimirArea(retangulo);
        imprimirArea(quadrado);
        imprimirArea(circulo);
    }    
}