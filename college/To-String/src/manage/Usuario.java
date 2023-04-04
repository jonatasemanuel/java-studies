package manage;

import java.util.Objects;

public class Usuario {
    int id;
    String nome;
    String cpf;

    public Usuario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (id != usuario.id) return false;
        if (!Objects.equals(nome, usuario.nome)) return false;
        return Objects.equals(cpf, usuario.cpf);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        return result;
    }
}
