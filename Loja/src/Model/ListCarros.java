/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Cliente
 */

//import java.lang.Comparable;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class ListCarros implements Comparable<ListCarros> {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private int vendedorId;

    public ListCarros() {
    }

    public ListCarros(String marca, String modelo, int ano, double preco, int vendedorId) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.vendedorId = vendedorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(int vendedorId) {
        this.vendedorId = vendedorId;
    }

    
        
    @Override
    public String toString() {
        return getMarca() + " - " + getModelo() + " (" + getAno() + ")";
    }

    @Override
    public int compareTo(ListCarros outroCarro) {
      int resultado = this.getMarca().compareTo(outroCarro.getMarca());

        if (resultado == 0) {
            resultado = this.getModelo().compareTo(outroCarro.getModelo());
        }

        return resultado;
    }
  
    }


