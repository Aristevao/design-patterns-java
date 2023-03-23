package strategy.shipping;

public class Correios {

    public float calculateShipping(String service, float weight) {
        float valor = 0;
        if (service == "PAC")
            valor = 10;
        else if (service == "SEDEX")
            valor = 30;
        return valor;
    }
}
