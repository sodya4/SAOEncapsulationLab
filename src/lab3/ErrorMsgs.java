/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;

/**
 *
 * @author vmware_xp
 */
public class ErrorMsgs extends MainGUI {

    private String errorMsg1 = "Sorry, the price entry must be a whole or floating point number only.\n";
    private String errorMsg2 = "Sorry, you have reach the maximum of 10 items.\n"
                    + "No more items can be saved.";
    private String errorMsg3 = "Sorry, you must complete all fields. Please try again.";

    public String getErrorMsg1() {
        return errorMsg1;
    }

    public String getErrorMsg2() {
        return errorMsg2;
    }

    public String getErrorMsg3() {
        return errorMsg3;
    }
}
