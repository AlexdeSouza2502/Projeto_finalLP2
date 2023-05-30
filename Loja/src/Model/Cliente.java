package Model;

import DB.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public Cliente() {
    }

    public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

    public void salvar() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO Clientes (nome, email, senha) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, senha);

            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    
