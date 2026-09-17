package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExecption extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExecption(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
