/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;

/**
 *
 * @author Home
 */
public class Professor {
    private int matricula;
    private String nome;
    private double salario;
    
    public void setMatricula(int m){
        matricula = m; 
    }
    
    public int getMatricula(){
        return matricula;    
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSalario(double s){
        salario = s;
    }
    
    public double getSalario(){
        return salario;
    }
}
