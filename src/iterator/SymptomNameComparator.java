package iterator;

import domain.Symptom;

import java.util.Comparator;

public class SymptomNameComparator implements Comparator<Symptom> {

    @Override
    public int compare(Symptom s1, Symptom s2) {
        return s1.getName().compareTo(s2.getName());
    }
}