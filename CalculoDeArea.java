public class CalculoDeArea {
    private final float pi = 3.14f;

    public float circulo(float raio) {
        return this.pi * (raio * raio);
    }

        public float retangulo(float base, float altura) {
        return base * altura;
    }
}