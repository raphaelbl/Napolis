
package Models;

import Models.Bebida;
import Models.Pizza;
import java.awt.List;
import java.util.ArrayList;

public class PedidoEntity {
    private String nome;
    private ArrayList<Bebida> bebidas = new ArrayList();
    private ArrayList<Pizza> pizzas = new ArrayList();
    private boolean aberto;
    private int nMesa;
    
    public PedidoEntity(){
       aberto = true;
        
    }
    
    public ArrayList getBebidas(){
        return bebidas;
    }
    
    public ArrayList getPizzas(){
        return pizzas;
    }
    
    
    public void addBebida(Bebida bebida){
        bebidas.add(bebida);
    }
    
    public Bebida getBebida(int id){
        return bebidas.get(id);
    }
    
     public Pizza getPizza(int id){
        return pizzas.get(id);
    }
    
    
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getnMesa() {
        return nMesa;
    }

    public void setnMesa(int nMesa) {
        this.nMesa = nMesa;
    }

    @Override
    public String toString() {
        return "PedidoEntity{" + "nome=" + nome + ", bebidas=" + bebidas + ", pizzas=" + pizzas + ", aberto=" + aberto + ", nMesa=" + nMesa + '}';
    }
    
    
    
    
    
    
    
}
