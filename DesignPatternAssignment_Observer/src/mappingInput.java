//Declare concrete observer classes implementing interface Observer
public class mappingInput implements Observer{
    private int mappingValue;

    private Subject observerList;

    public mappingInput(){}

    public mappingInput(Subject observerList){
        this.observerList = observerList;
        observerList.registerObservers(this);
    }

    @Override
    public void update(int inputValue) {
        for(int i = 1; i <= inputValue; i++){
            mappingValue = i*i;
            System.out.println("MappedValue:" + mappingValue + "\n");
        }
    }
}