package io.github.yhugorocha.factory_method;

public class Main {
    public static void main(String[] args) {

        String texto = "Texto teste";

        //Sem o factory method
        Mensagem mensagemSms = new MensagemSMS();
        Mensagem mensagemEmail = new MensagemEmail();

        mensagemSms.enviar(texto);
        mensagemEmail.enviar(texto);

        //factory method
        Mensagem mensagem1 = MensagemFactory.getMensagem(1);
        mensagem1.enviar(texto);

        Mensagem mensagem2 = MensagemFactory.getMensagem(2);
        mensagem2.enviar(texto);

    }
}
