package iterator;

import domain.Symptom;

import java.util.Comparator;

public class SeverityIndexComparator implements Comparator<Symptom> {

    @Override
    public int compare(Symptom s1, Symptom s2) {
        return s1.getSeverityIndex() - s2.getSeverityIndex();
    }
}
