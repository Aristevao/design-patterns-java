package behavioral.strategy;

import behavioral.strategy.shipping.Correios;
import behavioral.strategy.shipping.DHL;
import behavioral.strategy.shipping.JadLog;
import behavioral.strategy.shipping.MercadoEnvio;
import behavioral.strategy.shipping.TNT;

public class MainShipping {
    public static void main(String[] args) {
        // ---- Client ----
        // The client code picks a concrete strategy and passes it to
        // the context. The client should be aware of the differences
        // between strategies in order to make the right choice.
        SedexService sedex = new SedexService();
        DHLService dhl = new DHLService();
        MercadoEnvioService me = new MercadoEnvioService();

        Shipping shipping = new Shipping(sedex); // Pick SEDEX by constructor.

        System.out.println(shipping.calculate(10));

        shipping.setService(dhl); // Pick DHL by setter.
        System.out.println(shipping.calculate(10));

        shipping.setService(me);
        System.out.println(shipping.calculate(10));
    }
}

// ---- Strategy Interface ----
// The strategy interface declares operations common to all
// supported versions of some algorithm. The context uses this
// interface to call the algorithm defined by the concrete
// strategies.
interface ShippingService {
    float calculate(float weight);
}

// ---- Concrete Strategy ----
// Concrete strategies implement the algorithm while following
// the base strategy interface. The interface makes them
// interchangeable in the context.
class SedexService implements ShippingService {

    @Override
    public float calculate(float weight) {
        Correios correios = new Correios();
        float totalCost = correios.calculateShipping("SEDEX", weight);
        return totalCost;
    }

}

class PACService implements ShippingService {

    @Override
    public float calculate(float weight) {
        Correios correios = new Correios();
        float totalCost = correios.calculateShipping("PAC", weight);
        return totalCost;
    }
}

class JadLogService implements ShippingService {

    @Override
    public float calculate(float weight) {
        JadLog jadLog = new JadLog();
        return jadLog.calculateJadLogShipping(weight);
    }
}

class DHLService implements ShippingService {

    @Override
    public float calculate(float weight) {
        DHL dhl = new DHL();
        float totalCost = dhl.priceCalculator(weight);
        return totalCost;
    }
}

class FedexService implements ShippingService {

    @Override
    public float calculate(float weight) {
        DHL dhl = new DHL();
        float totalCost = dhl.priceCalculator(weight);
        return totalCost;
    }
}

class TNTService implements ShippingService {

    @Override
    public float calculate(float weight) {
        TNT tnt = new TNT();
        float totalCost = tnt.shippingPriceCalculator(weight);
        return totalCost;
    }
}

class MercadoEnvioService implements ShippingService {

    @Override
    public float calculate(float weight) {
        MercadoEnvio tnt = new MercadoEnvio();
        float totalCost = tnt.calculate(weight);
        return totalCost;
    }
}

// ---- Context ----
// The context defines the interface of interest to clients.
class Shipping {
    private ShippingService service;

    Shipping(ShippingService service) {
        this.service = service;
    }

    Shipping() {
    }

    public float calculate(float weight) {
        float totalCost = this.service.calculate(weight);
        return totalCost;
    }

    public void setService(ShippingService service) {
        this.service = service;
    }
}
