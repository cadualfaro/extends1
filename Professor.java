/*

 */
package extends1;

public class Professor extends Pessoa {
    String siape;
    String formacao;
    
    Professor(String nome, int idade, String sexo, String siape, String formacao){
        super(nome, idade, sexo);
        this.siape = siape;
        this.formacao = formacao;
}
}
