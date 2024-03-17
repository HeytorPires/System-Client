/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemclient;

/**
 *
 * @author Fabiano
 */ 
public class Cliente {
    private int id;
    private String type;
    private String name;
    private String documento;
    private float saldo;

    public Cliente( String type, String name, String documento, float saldo) {
        this.type = type;
        this.name = name;
        this.documento = documento;
        this.saldo = saldo;
    }
     public static Cliente criarCliente( String type, String name, String documento, float saldo) {
        return new Cliente(type, name, documento, saldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void Saque(float Valor){
        if(Valor > this.saldo && Valor > 0){
            System.out.println("Nao posssivel realizar o saque, Saldo insuficiente!");
        } else {
            saldo -= Valor;
            System.out.println("Saldo Atualizado para :" + this.saldo);
        }
    }
}
