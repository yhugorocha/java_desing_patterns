package io.github.yhugorocha.factory_method;

public class MensagemSMS implements Mensagem{

    @Override
    public void enviar(String mensagem) {
        System.out.println(String.format("Sua mensagem: %s. %n Foi enviada por SMS", mensagem));
    }
}
