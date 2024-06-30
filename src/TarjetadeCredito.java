import java.util.ArrayList;
import java.util.List;

public class TarjetadeCredito {
    //Datos Tarjeta

    private double limite;
    private double saldo;
    private List<Compra> listaDeCompra;
    //Constructor

    public TarjetadeCredito(double limite) {
        this.saldo = limite;
        this.limite = limite;
        this.listaDeCompra = new ArrayList<>();
    }
    // Datos

    public boolean lanzarCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaDeCompra.add(compra);
            return true;
        }
        return false;
    }
    //Getters

    public double getLimite() { return limite;}
    public double getSaldo() {return saldo;}
    public List<Compra> getListaDeCompra() {return listaDeCompra;}
}
