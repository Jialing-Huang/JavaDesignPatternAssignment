import java.util.ArrayList;

//Declare the class implementing Subject interface
public class getInput implements Subject{
    private ArrayList observers;
    private int inputValue;

    public getInput(){
        observers = new ArrayList<>();
    }

    public void setInputValue(int inputValue) {
        this.inputValue = inputValue;
        notifyObservers();
    }

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(inputValue);
        }
    }
}