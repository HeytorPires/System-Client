/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package systemclient;

/**
 *
 * @author Fabiano
 */
public class SystemClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Cliente cliente1 = new Cliente("Juridico", "Pires", "documento Teste", 0);
         
         String TipoCLiente = cliente1.getType();
        String NomeCliente = cliente1.getName();
        String DocumentoCliente = cliente1.getDocumento();
        
        System.out.println("tipo do cliente :" + TipoCLiente);
        System.out.println("Nome do Cliente:" + NomeCliente);
        System.out.println("Documento do Cliente" + DocumentoCliente );
    }
    
}
