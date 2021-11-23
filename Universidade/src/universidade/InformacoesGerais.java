/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;

import javax.swing.JOptionPane;

public class InformacoesGerais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Professor pessoa = new Professor();
       Aluno a = new Aluno();
       Coordenador c = new Coordenador();
       
       String nome = JOptionPane.showInputDialog("Professor: Digite seu nome completo");
       pessoa.setNome(nome);
       pessoa.setMatricula(123456);
       pessoa.setSalario(5000.00);
       
       String mensagem = String.format("Nome: " +pessoa.getNome());
       String mensagem2 = String.format("Matricula:"+pessoa.getMatricula());
       String mensagem3 = String.format("Salario: "+pessoa.getSalario());
        
                
       JOptionPane.showMessageDialog(null, mensagem);
       JOptionPane.showMessageDialog(null, mensagem2);
       JOptionPane.showMessageDialog(null, mensagem3);
       
       String aluno = JOptionPane.showInputDialog("Aluno: Digite seu nome completo"); 
       a.setNome(aluno);
       a.setMatricula(0123456);
       a.setNota(10);
       
       String mensagem4 = String.format("Nome: " +a.getNome());
       String mensagem5 = String.format("Matricula:"+a.getMatricula());
       String mensagem6 = String.format("Nota: "+a.getNota());
       
       JOptionPane.showMessageDialog(null, mensagem4);
       JOptionPane.showMessageDialog(null, mensagem5);
       JOptionPane.showMessageDialog(null, mensagem6);
       
       String coord = JOptionPane.showInputDialog("Coordenador: Digite seu nome completo");
       String curso = JOptionPane.showInputDialog("Digite os cursos de sua responsabilidade");
       c.setNome(coord);
       c.setMatricula(0123456);
       c.setCursos(curso);
       
       String mensagem7 = String.format("Nome: " +c.getNome());
       String mensagem8 = String.format("Matricula:"+c.getMatricula());
       String mensagem9 = String.format("Curso: "+c.getCursos());
       
       
    }
   
    
}
