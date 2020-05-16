/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerinterpreter;

/**
 *
 * @author Tonny
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    static final TextInterpreterContext CONTEXT = new TextInterpreterContext();

    public static void main(String[] args) {
        //Texto que se va a interpretar
        String text = 
                "escucho la radio,\n "+ 
                "para apartarme de la tristeza con el rock & roll.\n" +
                "Escucho algunos buenos sonidos de rock,\n" +
                "que hacen que quieras cantar bien alto. \n";

        System.out.println("TEXTO A INTERPRETAR; \n " + text.toUpperCase());
        TextInterpreter interpreter = null;

        // Las distintas formas de cifrar
        interpreter = new TextToASCII();
        interpreter.text = text;
        System.out.print("Ascii\n\t");
        System.out.println(interpreter.interpreter(CONTEXT));

        interpreter = new TextToBase64();
        interpreter.text = text;
        System.out.print("Base64\n\t");
        System.out.println(interpreter.interpreter(CONTEXT));

        interpreter = new TextToBinary();
        interpreter.text = text;
        System.out.print("Binario\n\t");
        System.out.println(interpreter.interpreter(CONTEXT));

        interpreter = new TextToHexa();
        interpreter.text = text;
        System.out.print("Hexadecimal\n\t");
        System.out.println(interpreter.interpreter(CONTEXT));
    }

}
