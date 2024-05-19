
public class ClientePJ implements ICliente {
    private String nome;
    private String cnpj;

    public ClientePJ(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }
}
