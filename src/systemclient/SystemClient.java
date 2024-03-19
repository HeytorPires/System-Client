/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package systemclient;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class SystemClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("-----Menu-----");
        System.out.println("1 - Cadastrar Cliente ");
        System.out.println("2 - Listar Clientes");
        int MenuInputUser = Scan.nextInt();
        switch(MenuInputUser){
        
            case 1:
                System.out.println("---- Cadastro Cliente ----");
                System.out.println("Digite tipo do cliente: 1- Fisico __ 2- Juridico:");
                int TypeUserClient = Scan.nextInt();
                System.out.println("Nome do Cliente:");
                String NameUserClient = Scan.next();
                System.out.println("Documento:");
                String DOcumentUserClient = Scan.next();
                
                System.out.println("-----Cliente Cadastrado com sucesso!----");
                break;
            case 2: 
                System.out.println(" ----- Listagem Cliente ----"); 
        } 
        
     Cliente cliente1 = new Cliente("Juridico", "Pires", "documento Teste", 0);
         
        String TipoCLiente = cliente1.getType();
        String NomeCliente = cliente1.getName();
        String DocumentoCliente = cliente1.getDocumento();
        /*
        System.out.println("tipo do cliente :" + TipoCLiente);
        System.out.println("Nome do Cliente:" + NomeCliente);
        System.out.println("Documento do Cliente" + DocumentoCliente );
        */
    }
    
}
