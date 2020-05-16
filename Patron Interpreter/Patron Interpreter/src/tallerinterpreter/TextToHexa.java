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
public class TextToHexa extends TextInterpreter {

    @Override
    public String interpreter(TextInterpreterContext tic) {
        return tic.textToHexa(text);
    }

}
