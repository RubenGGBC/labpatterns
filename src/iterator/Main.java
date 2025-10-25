package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.Covid19PacientInvertedIteratorAdapter;
import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("s1", 10, 10), 1);
			p.addSymptom(new Symptom("s2", 11, 9), 2);
			p.addSymptom(new Symptom("s3", 12, 8), 3);
			p.addSymptom(new Symptom("s4", 13, 7), 4);
			p.addSymptom(new Symptom("s5", 14, 6), 5);
			
			Iterator i=p.iterator();
			while(i.hasNext())
				System.out.println(i.next());
            System.out.println();


            System.out.println("Pruebas de SymptomNameComparator:");
            ArrayList<Symptom> symptomsList = new ArrayList<>(p.getSymptoms());

            Collections.sort(symptomsList, new SymptomNameComparator());
            for (Symptom s : symptomsList) {
                System.out.println(s.getName() + ", " + s.getCovidImpact() + ", " +s.getSeverityIndex());
            }
            System.out.println();


            System.out.println("Pruebas de SeverityIndexComparator:");
            ArrayList<Symptom> symptomsList2 = new ArrayList<>(p.getSymptoms());

            Collections.sort(symptomsList2, new SeverityIndexComparator());
            for (Symptom s : symptomsList2) {
                System.out.println(s.getName() + ", " + s.getCovidImpact() + ", " +s.getSeverityIndex());
            }
            System.out.println();


            System.out.println("Pruebas de Inverted Iterator:");
            InvertedIterator iterator = new Covid19PacientInvertedIteratorAdapter(p);

            while (iterator.hasPrevious()) {
                Symptom s = (Symptom) iterator.previous();
                System.out.println(s.getName() + ", " + s.getCovidImpact() + ", " +s.getSeverityIndex());
            }
            System.out.println();

		}

	}

