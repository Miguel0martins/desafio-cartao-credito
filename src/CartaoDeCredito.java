import java.util.ArrayList;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private ArrayList<Compra> Compras;



    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Compra> getListaCompras() {
        return Compras;
    }

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.Compras = new ArrayList<>();
        this.saldo = limite;
    }

    public boolean lancarCompra (Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.Compras.add(compra);


            return true;
        }
        return false;
    }
}