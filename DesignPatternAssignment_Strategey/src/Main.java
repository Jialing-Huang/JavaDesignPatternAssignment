public class Main {

    public static void main(String[] args) {

        //Create concrete classes by override an interface
        class SpeakChinese implements SpeakLanguage{
            @Override
            public void language() {
                System.out.println("I am speaking Chinese!");
            }
        }

        class SpeakPersian implements SpeakLanguage{
            @Override
            public void language() {
                System.out.println("I am speaking Persian!");
            }
        }

        class personOne extends Person{
            personOne(){
                speakLanguage = new SpeakChinese();
            }
        }

        Person A = new personOne();
        A.Speaking();
        A.setSpeakLanguage(new SpeakPersian());
        A.Speaking();
    }
}
