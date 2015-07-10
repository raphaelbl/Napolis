/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Models.Bebida;
import Models.Pizza;
import java.util.ArrayList;
import Models.PedidoEntity;

/**
 *
 * @author 631410047
 */
public class AbrirPedidoController {
    private PedidoEntity pedido;
    private ArrayList<PedidoEntity> pedidos = new ArrayList();
    
    
    public PedidoEntity getPedidos(int index){
        return pedidos.get(index);
    }
    
    
    public void abrirPedido(String nome, Pizza pizza, int nMesa){
        this.pedido = new PedidoEntity();
        this.pedido.setNome(nome);
        this.pedido.addPizza(pizza);
        this.pedido.setnMesa(nMesa);
        this.pedidos.add(this.pedido);
    }
    
      public void abrirPedido(String nome, Bebida bebida, int nMesa){
        this.pedido = new PedidoEntity();
        this.pedido.setNome(nome);
        this.pedido.addBebida(bebida);
        this.pedido.setnMesa(nMesa);
        this.pedidos.add(this.pedido);
    }
      
        public void abrirPedido(String nome, Pizza pizza, Bebida bebida, int nMesa){
        this.pedido = new PedidoEntity();
        this.pedido.setNome(nome);
        this.pedido.addPizza(pizza);
        this.pedido.addBebida(bebida);
        this.pedido.setnMesa(nMesa);
        this.pedidos.add(this.pedido);
    }
        
 
    
   
    
    
    
    
}
