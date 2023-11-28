package pl.edu.pk.student.tomaszkisiel.jmb.graphical;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;


public class NumericGuard implements ChangeListener<String> {
    private final TextField field;

    public NumericGuard(TextField field) {
        this.field = field;
    }

    @Override
    public void changed(ObservableValue observable, String oldValue, String newValue) {
        if (!newValue.matches("\\d*")) {
            field.setText(newValue.replaceAll("[^\\d]", ""));
        }
    }
}
