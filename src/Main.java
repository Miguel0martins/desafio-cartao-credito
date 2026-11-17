
public class Main {
    public static void main(String[] args) {

        Compra compra = new Compra("Tenis", 300.00);
        compra.getDescricao();
        compra.getValor();

        System.out.println("produto " + compra.getDescricao() + " com o valor R$ " + compra.getValor());
    }
}