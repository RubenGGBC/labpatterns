package observer;

import adapter2.ShowPacientTableGUI;

import java.util.Observable;


public class Main {

	/**
	 * Launch the application.
	 */
    public static void main(String args[]){
        Covid19Pacient pacient = new Covid19Pacient("ruben", 19);
        Covid19Pacient pacient2 = new Covid19Pacient("mikel", 20);
        new PacientObserverGUI((Observable)pacient);
        new PacientObserverGUI((Observable)pacient2);
        new PacientSymptomGUI(pacient);
        new PacientSymptomGUI(pacient2);
        new PacientThermometerGUI((Observable)pacient);
        new PacientThermometerGUI((Observable)pacient2);
        ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
        gui.setPreferredSize(
                new java.awt.Dimension(300, 200));
        gui.setVisible(true);

        ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);
        gui2.setPreferredSize(
                new java.awt.Dimension(300, 200));
        gui2.setVisible(true);
    }


}
