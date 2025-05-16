public class TipoMoneda {
    private String monedaBase;
    private String monedaDestino;
    private double valorConversion;
    private double valorFinal;
    public TipoMoneda() {
    }

    public TipoMoneda(String monedaBase, String monedaDestino, double valorConversion, double valorFinal) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.valorConversion = valorConversion;
        this.valorFinal = valorFinal;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getValorConversion() {
        return valorConversion;
    }

    public void setValorConversion(double valorConversion) {
        this.valorConversion = valorConversion;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    @Override
    public String toString() {
        return "El valor"+" "+valorConversion+" "+"["+monedaBase+"]"+" "+"corresponde al valor final de =>>>>"+" "+valorFinal+" "+"["+monedaDestino+"]";
    }
}
