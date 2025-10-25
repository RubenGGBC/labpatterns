package adapter;

import domain.Covid19Pacient;
import domain.Symptom;

import java.util.ArrayList;
import java.util.List;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator{

    private List<Symptom> symptoms;
    private int position;

    public Covid19PacientInvertedIteratorAdapter(Covid19Pacient pacient) {
        this.symptoms = new ArrayList<>(pacient.getSymptoms());
        this.position = symptoms.size();
    }

    @Override
    public Object previous() {
        if (!hasPrevious()) {
            return null;
        }
        position--;
        return symptoms.get(position);
    }

    @Override
    public boolean hasPrevious() {
        return position>0;
    }

    @Override
    public void goLast() {
        position = symptoms.size();
    }
}
