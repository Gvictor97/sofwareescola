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
public class Coordenador {
    private int matricula;
    private String nome; 
    private String cursos; 
    
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
    
    public void setCursos(String c){
        cursos = c;
    }
    
    public String getCursos(){
        return cursos; 
    }
}
