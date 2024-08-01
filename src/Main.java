public class Main {
    public static void main(String[] args) {
        // Criando instâncias de PessoaFisica e PessoaJuridica
        Pessoa pessoaFisica = new PessoaFisica("João Silva", "Rua A, 123", "1111-2222", "123.456.789-00");
        Pessoa pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Av. B, 456", "3333-4444", "12.345.678/0001-00");

        // Mostrando os detalhes
        pessoaFisica.mostrarDetalhes();
        pessoaJuridica.mostrarDetalhes();
    }
}

// Classe abstrata Pessoa
abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método abstrato (opcional, para ser implementado nas subclasses)
    public abstract void mostrarDetalhes();
}

// Classe concreta PessoaFisica
class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    // Métodos getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Implementação do método abstrato
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + cpf);
    }
}

// Classe concreta PessoaJuridica
class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    // Métodos getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Implementação do método abstrato
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CNPJ: " + cnpj);
    }
}
