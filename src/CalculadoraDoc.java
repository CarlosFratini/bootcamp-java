/*Esse é um exemplo de documentação JAVA em um programa simples de calcular.
 *O campo de documentação deve começar com /**.
 *O JAVA Documentation possui a opção de TAGs para representar dados 
 *relevantes. Segue as TAGs que podem ser utilizadas:
 *@autor   : Autor/Criador
 *@version : Versão do recurso
 *@since   : Data de início do recurso
 *@param   : Descrição dos parâmetros dos métodos
 *@return  : Definição do tipo de retorno
 *@throws  : Se o método lança alguma exceção
*/

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author  Gleyson Sampaio
 * @version 1.0
 * @since   01/01/2022
 */
public class CalculadoraDoc {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
