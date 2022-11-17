package modelo;

public class Rectangulo extends Figura
{
    private double base;
    private double altura;

    public Rectangulo(double A, double B)
    {
        super();
        this.base = B;
        this.altura = A;
    }

    public void calcularAreayPerimetro()
    {
        area = base * altura;
        perimetro = 2 * (base + altura);
    }
}
