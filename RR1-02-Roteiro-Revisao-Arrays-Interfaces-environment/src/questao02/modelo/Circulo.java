public class Circulo implements FormaGeometrica{
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    //POR QUE NÃO PASSA PARÂMETRO NO MÉTODO CALCULA ÁREA???
    @Override
    public calculaArea(){
        return Math.PI * raio * raio;
    }
}
