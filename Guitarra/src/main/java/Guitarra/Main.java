package Guitarra;


import Guitarra.Guitarra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String Args[]) {
      
       Guitarra guitarra = new Guitarra();
       guitarra.fabricante = "A";
       guitarra.modelo = "Xc";
       guitarra.preco = 100;
       guitarra.serial = "123457";
       guitarra.tipo = "C";
       
       
 
        System.out.println("Seguem os dados da guitarra. Fabricante:"+guitarra.getFabricante()+" Modelo:"+guitarra.getModelo()
                +" Preço: "+guitarra.getPreco()+" Serial:"+guitarra.getSerial()+" Tipo:"+guitarra.getTipo());
         
    }
}
