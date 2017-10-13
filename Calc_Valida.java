package calculadora;
import javax.swing.*;

/**
 * BASEADO NA CLASSE ENTRADA:
 * Class Entrada - input class for input of simple input types
 * via simple dialog box.
 * eg. int, char, String, double or boolean.
 *
 * @author Bruce Quig
 * @author Michael Kolling
 * @author Eugene Ageenko
 * @author Marcelo de G. Malheiros
 * 
 * @version 1.3
 * Modified (Aug 12, 2003): Portuguese version, added methods without parameters.
 * 
 * Modificado por 
 * @author Camilo
 * Adição do método mensagem, além de ter simplificado *muito*
 * o código removendo as entrdas de tipos não usadas e simplificando o código
 * para funcionar com 16 variaveis a menos
 * em Set 30, 2017
 */

/**
 *
 * @author camilo
 */
public class Calc_Valida {
    // instancia as variaveis
    static final String STRING_TITLE = "CALCULADORA DE MATRIZES V0.1";
    static final String TRUE = "true";
    static final String FALSE = "false";
    static final String EMPTY_STRING = "";

    /**
     *  Sem construtor.
     */
    private Calc_Valida() {
    }

    /**
     ** Entrada das Strings por um dialogo.
     ** @return String para o usuário.
     **/
    public static String leiaString() {
        return leiaString("","");
    }

    /**
     ** String escrita pelo usuário 
     ** @param prompt mensagem a dar entrada
     ** @return String digitada pelo usuário
     **/
    public static String leiaString(String prompt) {
        return leiaString(prompt,"");
    }

    /**
     ** String escrita pelo usuário 
     ** @param prompt mensagem a dar entrada
     ** @param initialValue String a ser exibida como selecionado pelo usuário
     ** @return String digitada pelo usuário
     **/
    public static String leiaString(String prompt, String initialValue) {
        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = {"OK"};

        boolean validResponse = false;

        String result = null;

        while (!validResponse) {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           JOptionPane.OK_CANCEL_OPTION,
                                                           null,
                                                           options,
                                                           options[0]);

            optionPane.setWantsInput(true);
            optionPane.setInitialSelectionValue(initialValue);  // EA: added
            JDialog dialog = optionPane.createDialog(null, STRING_TITLE);

            dialog.pack();
            dialog.setVisible(true);
            //dialog.show();

            Object response = optionPane.getInputValue();

            if (response != JOptionPane.UNINITIALIZED_VALUE) {
                result = (String) response;
                if (result != null) // EA: added for completnes
                    validResponse = true;
                else {
                    commentArray[1] = "Entrada invalida: ";
                    commentArray[2] = "Entre com uma string valida";
                }
            } else {
                commentArray[1] = "Precisa entrar com uma string";
                commentArray[2] = EMPTY_STRING;
            }
        }
        return result;
    }

    /**
     ** Entrada das char por um dialogo.
     ** @return char para o usuário.
     **/
    public static char leiaChar() {
        return leiaChar("","");
    }

    /**
     ** char escrita pelo usuário 
     ** @param prompt mensagem a dar entrada
     ** @return char digitada pelo usuário
     **/
    public static char leiaChar(String prompt) {
        return leiaChar(prompt,"");
    }

    /**
     ** char escrita pelo usuário 
     ** @param prompt char a dar entrada
     ** @param initialValue char a ser exibida como selecionado pelo usuário
     ** @return char digitada pelo usuário
     **/
    public static char leiaChar(String prompt, char initialValue) {
        return leiaChar(prompt,Character.toString(initialValue));
    }

    /**
     ** String escrita pelo usuário 
     ** @param prompt mensagem a dar entrada
     ** @param initialValue String a ser exibida como selecionado pelo usuário
     ** @return String digitada pelo usuário
     **/
    public static char leiaChar(String prompt, String initialValue) {
        char response = (initialValue != null && initialValue.length() > 0) ? initialValue.charAt(0) : '-'; // EA: modified

        String result = null;

        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = {"OK"};

        boolean validResponse = false;

        while (!validResponse) {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           JOptionPane.OK_CANCEL_OPTION,
                                                           null,
                                                           options,
                                                           options[0]);

            optionPane.setWantsInput(true);
            optionPane.setInitialSelectionValue(initialValue);  // EA: added
            JDialog dialog = optionPane.createDialog(null, STRING_TITLE);

            dialog.pack();
            dialog.setVisible(true);
            //dialog.show();

            result = null; // EA: added for convinience;
            // EA: why character processed in another way that integer?
            // EA: meaning that with check for uinitialized case then assignment?

            Object input = optionPane.getInputValue();
            if (input != JOptionPane.UNINITIALIZED_VALUE) {
                result = (String) input;
                if (result != null) {
                    if (result.length() == 1) {
                        response = result.charAt(0);
                        validResponse = true;
                    } else {
                        commentArray[1] = "Entrada invalida: " + result;
                        commentArray[2] = "Entre com apenas um caracter";
                    }
                } else {
                    commentArray[1] = "Entrada invalida"; // EA: corrected, no point to print null-object. Question: when it is possible to have null objects?
                    commentArray[2] = "Entre com apenas um caracter";
                }
            } else {
                commentArray[1] = "Precisa entrar com apenas um caracter";  //EA: error corrected, result removed
                commentArray[2] = EMPTY_STRING; //EA: cannot use result since it is not initialized
            }
        }
        return response;
    }
    
    /**
     ** Entrada do inteiro por um dialogo.
     ** @return int para o usuário.
     **/
    public static int leiaInt() {
        return leiaInt("","");
    }

    /**
     ** inteiro escrito pelo usuário 
     ** @param prompt int a dar entrada
     ** @return int digitada pelo usuário
     **/
    public static int leiaInt(String prompt) {
        return leiaInt(prompt,"");
    }

     /**
     ** inteiro escrito pelo usuário 
     ** @param prompt int a dar entrada
     ** @param initialValue String a ser exibida como selecionado pelo usuário
     ** @return int digitada pelo usuário
     **/
    public static int leiaInt(String prompt, int initialValue) {
        return leiaInt(prompt,Integer.toString(initialValue));
    }

     /**
     ** inteiro escrito pelo usuário 
     ** @param prompt int a dar entrada
     ** @param initialValue String a ser exibida como selecionado pelo usuário
     ** @return int digitada pelo usuário
     **/
    public static int leiaInt(String prompt, String initialValue) {
        Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
        Object[] options = {"OK"};

        boolean validResponse = false;

        int response = 0;
        while (!validResponse) {
            final JOptionPane optionPane = new JOptionPane(commentArray,
                                                           JOptionPane.QUESTION_MESSAGE,
                                                           JOptionPane.OK_CANCEL_OPTION,
                                                           null,
                                                           options,
                                                           options[0]);

            optionPane.setWantsInput(true);
            optionPane.setInitialSelectionValue(initialValue);  // EA: added
            JDialog dialog = optionPane.createDialog(null, STRING_TITLE);

            dialog.pack();
            dialog.setVisible(true);
            //dialog.show();

            // EA: rewritten as in leiaChar function
            // EA: added or corrected non-portable check for uninitialized value situation
            Object input = optionPane.getInputValue();
            if (input == JOptionPane.UNINITIALIZED_VALUE) {
                commentArray[1] = "Precisa entrar com um valor inteiro"; // EA: explanatory text added
                commentArray[2] = EMPTY_STRING;
            } else {
                String result = (String) input;
                if (result == null) { // EA: added for completnes, but is this situation possible?
                    commentArray[1] = "Valor inteiro invalido:";
                    commentArray[2] = "Entre com um valor inteiro valido";
                } else {
                    try {
                        //workaround for BlueJ bug - misses first exception after compilation
                        //response = Integer.parseInt(result); // EA: ?
                        response = Integer.parseInt(result);
                        validResponse = true;
                    } catch (NumberFormatException exception) {
                        commentArray[1] = "Valor inteiro invalido: " + result;
                        commentArray[2] = "Entre com um valor inteiro valido";
                        initialValue = result; // EA: added
                    }
                }
            }
        }
        return response;
    }
    /**
     * Recebe os parametros e retorna uma mensagem
     * @param m mensagem
     * @param m2 título da janela
     * @param erro true = mensagem false = erro
     * Adição à idéia original da classe entrada
     */
    public static void Mensagem (String m, String m2, boolean erro){
        if (!erro){
           JOptionPane.showMessageDialog(null, m, m2,JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, m, m2,JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

