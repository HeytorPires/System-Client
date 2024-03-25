/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package systemclient;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class SystemClient  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Scanner Scan = new Scanner(System.in);
        Menu();
        int MenuInputUser = Scan.nextInt();
        //Cliente cliente1 = new Cliente("Juridico", "Pires", "documento Teste", 0);
        boolean Saida = false;
         do{
        switch(MenuInputUser){
            case 1 -> {
                System.out.println("---- Cadastro Cliente ----");
                System.out.println("Digite tipo do cliente: 1- Fisico __ 2- Juridico:");
                int TypeUserClient = Scan.nextInt();
                String TypeCliente = "";
                if(TypeUserClient == 1){
                 TypeCliente = "Fisico";
                } else if( TypeUserClient == 2){
                    TypeCliente = "Juridico";
                }
                System.out.println("Nome do Cliente:");
                String NameUserClient = Scan.next();
                System.out.println("Documento:");
                String DocumentUserClient = Scan.next();
                System.out.println("-----Cliente Cadastrado com sucesso!----"); System.out.println(""); 
                System.out.println("\n\n\n\n");
                Menu();
                System.out.println("\n\n\n\n");
                MenuInputUser = Scan.nextInt();
                Cliente cliente = new Cliente(TypeCliente, NameUserClient, DocumentUserClient, 0);
                clientes.add(cliente);
                
            }
            case 2 -> {
                 System.out.println(" ----- Listagem Cliente ----");
                 for( int i = 0; i < clientes.size(); i++){
                     System.out.println(clientes.get(i));
                 };
                 System.out.println("\n\n\n\n");
                Menu();
                

                MenuInputUser = Scan.nextInt();
            
                    }
            case 4 -> {
                
            } 
        
                }
            } while(MenuInputUser != 3);
                    
        
        
     
        /* 
        String TipoCLiente = cliente1.getType();
        String NomeCliente = cliente1.getName();
        String DocumentoCliente = cliente1.getDocumento();
        
        System.out.println("tipo do cliente :" + TipoCLiente);
        System.out.println("Nome do Cliente:" + NomeCliente);
        System.out.println("Documento do Cliente" + DocumentoCliente );
        */

    }
    public static void Menu(){
        System.out.println("-----Menu-----");
        System.out.println("1 - Cadastrar Cliente ");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Sair!");
    }
    
}
