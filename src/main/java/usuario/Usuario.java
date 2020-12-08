package usuario;

public class Usuario {
    private String nomeCliente;
    private char genero;
    private int idade;

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", genero=" + genero +
                ", idade=" + idade +
                '}';
    }
}
