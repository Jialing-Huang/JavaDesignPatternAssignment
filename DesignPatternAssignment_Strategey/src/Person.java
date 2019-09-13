//Set Person class
public class Person {
    //Constructor
    public Person(){}

    //Declare a reference of interface
    SpeakLanguage speakLanguage;
    public void Speaking(){
        speakLanguage.language();
    }

    //Declare a method
    public void setSpeakLanguage(SpeakLanguage speakNewLanguage){
        speakLanguage = speakNewLanguage;
    }

}
