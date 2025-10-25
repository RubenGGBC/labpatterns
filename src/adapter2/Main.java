package adapter2;

import observer.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);

        Covid19Pacient pacient2=new Covid19Pacient("ruben", 19);

        pacient2.addSymptomByName("tos seca", 1);
        pacient2.addSymptomByName("fiebre", 3);
        pacient2.addSymptomByName("cefalea", 3);

		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient2);
		gui.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui.setVisible(true);

        ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient);
        gui2.setPreferredSize(
                new java.awt.Dimension(300, 200));
        gui2.setVisible(true);


	}

}
