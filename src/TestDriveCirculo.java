import javax.swing.JOptionPane;


public class TestDriveCirculo {

   Circulo c = new Circulo();
   static TestDriveCirculo ct = new TestDriveCirculo();

   public static void main (String[] args) {
       ct.obtenDatos();
       ct.muestraDato();
    }

    private void muestraDato() {
        JOptionPane.showMessageDialog(null, "El radio de la circunferencia es de: " + c.getRadio()
                + " cm.\n" + "El perimetro de la circunferencia es de: " + c.getPerimetro()
                + " cm.\n" + "El area de la circunferencia es de: " + c.getArea() + " cm.");

    }

    public void obtenDatos() {
       int i = 0;

       try {
           while (i < 1) {
               float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio de la circunferencia"));
               if (radio > 0) {
                   c.setRadio(radio);
                   i++;
               } else {
                   JOptionPane.showMessageDialog(null, "El numero es menor a 0");
               }
           }
       }
           catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "El valor introducido debe ser numérico");
           }
       }
       }
