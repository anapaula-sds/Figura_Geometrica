public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    // Getters (se quiser usar)
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }
}
