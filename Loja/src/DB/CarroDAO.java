/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

/**
 *
 * @author Cliente
 */
import Model.ListCarros;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    private String url = "jdbc:mysql://localhost:3306/cars";
    private String username = "seu_usuario";
    private String password = "sua_senha";

    public List<ListCarros> carregaCarrosDoBanco() {
        List<ListCarros> carros = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM carros");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                int ano = rs.getInt("ano");
                double preco = rs.getDouble("preco");
                int vendedorId = rs.getInt("vendedor_id");

                ListCarros carro = new ListCarros(marca, modelo, ano, preco, vendedorId);
                carro.setId(id);

                carros.add(carro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return carros;
    }
}

