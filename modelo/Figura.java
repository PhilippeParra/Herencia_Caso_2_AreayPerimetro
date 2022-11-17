package modelo;

public class Figura
{
    protected double perimetro;
    protected double area;

     public Figura()
     {
        this.perimetro = 0;
        this.area = 0;
     }

     public String mostrarAreayPerimetro()
    {
        return "\nTiene de Area: " + this.area + "\nY de Perimetro: " + this.perimetro + "."; 
    }
}