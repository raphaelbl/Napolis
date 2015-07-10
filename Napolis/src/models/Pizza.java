/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

/**
 *
 * @author 631410047
 */
public class Pizza {
    private String sabor;
    private double preco;
    
    
    public Pizza(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }
    
    
    
    
}
