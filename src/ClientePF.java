
public class ClientePF implements ICliente {
    private String nome;
    private String cpf;

    public ClientePF(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getIdentificador() {
        return cpf;
    }
}
