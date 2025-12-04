/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixit;

import ui.BookingForm;

public class FixIt {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            BookingForm form = new BookingForm();
            form.setVisible(true);
        });
    }
}

