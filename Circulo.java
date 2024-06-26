public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    /*Esta clase está descontinuada, se debe usar en su lugar calcularArea()*/
     public double calculoArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularArea() {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}