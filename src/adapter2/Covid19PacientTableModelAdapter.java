package adapter2;

import javax.swing.table.AbstractTableModel;

import observer.Covid19Pacient;
import domain.Symptom;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class Covid19PacientTableModelAdapter extends AbstractTableModel implements Observer {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
          this.pacient=p;
          ((Observable)p).addObserver(this);
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
          Set<Symptom> symptoms = pacient.getSymptoms();
          Symptom[] symptom_array = symptoms.toArray(new Symptom[symptoms.size()]);
          Symptom s = symptom_array[row];
          if (col == 0) {
              return s.getName();
          } else if (col == 1) {
              return pacient.getWeight(s);
          }
          else return null;
	  }

      public void update(Observable o, Object arg) {
          fireTableDataChanged();
      }

	}
