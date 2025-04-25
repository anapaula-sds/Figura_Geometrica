public class Quadrado implements FiguraGeometrica {
    private double lado;  // Mudando para double para aceitar valores decimais

    // Getters e Setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        // Calculando a área
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        // Calculando o perímetro
        return lado * 4;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }
}
