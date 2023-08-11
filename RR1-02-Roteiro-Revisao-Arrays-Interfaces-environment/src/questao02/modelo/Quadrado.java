import solucao.forma.Retangulo;

public class Quadrado extends Retangulo{

    public Quadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calculaArea(double base){
        return super.base * super.base; 
    }
}
