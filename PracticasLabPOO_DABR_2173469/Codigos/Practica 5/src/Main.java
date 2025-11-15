public class Main {
    public static void main(String[] args) {
        // Array polimórfico
        Figura05[] figuras = new Figura05[3];
        figuras[0] = new CirculoBarbosa(4.6);
        figuras[1] = new RectanguloBarbosa(2, 7);
        figuras[2] = new TrianguloBarbosa(3, 12.3);

        CalculadoraGeometrica3469 calc = new CalculadoraGeometrica3469();

        //recorrer el arreglo
        for (Figura05 f : figuras) {
            f.mostrarInfo();
            calc.mostrarCalculos(f);

            //demostracion de instanceof y casting
            if (f instanceof CirculoBarbosa) {
                CirculoBarbosa c = (CirculoBarbosa) f;
                System.out.println("→ Es un circulo, se puede cambiar el radio");
                c.cambiarRadio(7.4);
                calc.mostrarCalculos(c);
            } else if (f instanceof RectanguloBarbosa) {
                RectanguloBarbosa r = (RectanguloBarbosa) f;
                System.out.println("→ Es un rectangulo, se puede redimensionar");
                r.redimensionar(2.5, 4.5);
                calc.mostrarCalculos(r);
            } else if (f instanceof TrianguloBarbosa) {
                TrianguloBarbosa t = (TrianguloBarbosa) f;
                System.out.println("→ Es un triangulo, se puede girar.");
                t.girar("la derecha");
            }

            System.out.println("----------------------------");
        }
    }
}