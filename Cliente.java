public class Cliente {

    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente(String cpf, String nome, String email, String telefone, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente setCPF(String cpf)
    {
        this.cpf = cpf;
        return this;
    }
 
    public Cliente setNome(String nome)
    {
        this.nome = nome;
        return this;
    }
 
    public Cliente setEmail(String email)
    {
        this.email = email;
        return this;
    }

    public Cliente setTelefone(String telefone)
    {
        this.telefone = telefone;
        return this;
    }

    public Cliente setEndereco(String endereco)
    {
        this.endereco = endereco;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

}
