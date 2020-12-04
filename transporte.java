/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalwilman;

/**
 *
 * @author Wilman Rivera
 */
public class transporte implements mediosdetransporte{

    @Override
    public String carro() {
        String carro = "El carro va por las calles";
        return carro;
    }

    @Override
    public String barco() {
        String barco = "El barco va por el mar";
        return barco;
    }

    @Override
    public String avion() {
        String avion = "El avion vuela por los aires";
        return avion;
    }
    
}
