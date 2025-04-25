public class Losango implements FiguraGeometrica {
    private double diagonalMaior;
    private double diagonalMenor;
    private double lado;

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getNomeFigura() {
        return "losango";
    }
}
