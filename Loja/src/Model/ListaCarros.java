/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.DatabaseConnection;



public class ListaCarros {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private int vendedorId;

    public ListaCarros() {
    }

    public ListaCarros(String marca, String modelo, int ano, double preco, int vendedorId) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.vendedorId = vendedorId;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public int getVendedorId() {
        return vendedorId;
    }

    public void salvar() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO Carros (marca, modelo, ano, preco, vendedor_id) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, marca);
            statement.setString(2, modelo);
            statement.setInt(3, ano);
            statement.setDouble(4, preco);
            statement.setInt(5, vendedorId);

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

    public static List<ListaCarros> obterTodos() {
        List<ListaCarros> listaCarros = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Carros";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

                        while (resultSet.next()) {
                ListaCarros carro = new ListaCarros();
                carro.id = resultSet.getInt("id");
                carro.marca = resultSet.getString("marca");
                carro.modelo = resultSet.getString("modelo");
                carro.ano = resultSet.getInt("ano");
                carro.preco = resultSet.getDouble("preco");
                carro.vendedorId = resultSet.getInt("vendedor_id");

                listaCarros.add(carro);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaCarros;
    }
}

