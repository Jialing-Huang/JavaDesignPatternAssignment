import java.util.Scanner;

public class Main {

    //The subject class get an integer which is entered and notify observer class
    //The observer class receive the notification from subject class and run update(inputValue) to map the entered integer
    public static void main(String[] args) {
        int input;

        //Initialize the subject class and observer class
        getInput AasSubject = new getInput();
        mappingInput BasObserver = new mappingInput(AasSubject);

        System.out.println("Please enter an integer less than 10 and bigger than 1");

        //Enter a integer between 1 and 10
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            int temp = scanner.nextInt();
            if(temp<10 && temp>1){
                input = temp;
                System.out.println("You entered: " + input + "\n");
                AasSubject.setInputValue(input);
            }else{
                System.out.println("Inout out of range, please re-enter");
            }
        }



    }
}
