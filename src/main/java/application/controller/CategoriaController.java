package application.model;

import jakarta.persistence.*;

@Entity
public class CategoriaController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    // Construtor vazio
    public CategoriaController() {}

    // Construtor com parâmetros
    public CategoriaController(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
