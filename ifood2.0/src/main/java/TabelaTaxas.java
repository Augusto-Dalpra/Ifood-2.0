import java.util.Map;
import java.util.HashMap;

class TabelaTaxas {
    private static TabelaTaxas instancia;
    private Map<String, Double> taxas;

    private TabelaTaxas() {
        taxas = new HashMap<>();
        taxas.put("EntregaPadrao", 5.0);
        taxas.put("RestaurantePremium", 10.0);
    }

    public static synchronized TabelaTaxas getInstancia() {
        if (instancia == null) {
            instancia = new TabelaTaxas();
        }
        return instancia;
    }

    public double getTaxa(String tipo) {
        return taxas.get(tipo);
    }
}