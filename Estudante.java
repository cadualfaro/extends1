/*

 */
package extends1;

public class Estudante extends Pessoa {
    String matricula;
    String curso;
    
    Estudante(String nome, int idade, String sexo, String matricula, String curso){
    super(nome, idade, sexo);
    this.matricula = matricula;
    this.curso = curso;
    }

}
