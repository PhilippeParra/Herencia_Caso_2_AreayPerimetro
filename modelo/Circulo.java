package modelo;

public class Circulo extends Figura 
{
    private double radio;

    public Circulo(double r)
    {
        super();
        this.radio = r;
    }

    public void calcularAreayPerimetro()
    {
        area = Math.PI * (radio * radio);
        perimetro = 2 * Math.PI * radio;
    }


}
