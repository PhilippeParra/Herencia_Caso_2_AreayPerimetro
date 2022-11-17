package ejecutable;

import javax.swing.JOptionPane;
import modelo.Circulo;
import modelo.Rectangulo;

public class Test 
{
    public static void main(String[] args) 
    {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));

        Rectangulo miRectangulo = new Rectangulo(base, altura);
        miRectangulo.calcularAreayPerimetro();
        JOptionPane.showMessageDialog(null ,"El rectangulo con base: " + base + " y altura: " + altura + miRectangulo.mostrarAreayPerimetro());
        
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));
        
        Circulo miCirculo = new Circulo(radio);
        miCirculo.calcularAreayPerimetro();
        JOptionPane.showMessageDialog(null ,"El circulo con radio: " + radio + miCirculo.mostrarAreayPerimetro());


        System.exit(0);
    }
}
