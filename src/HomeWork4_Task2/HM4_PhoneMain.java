package HomeWork4_Task2;

public class HM4_PhoneMain {

    public static void main (String[] args){
        Phonebook phonebook = new Phonebook();
        phonebook.add("+79998881111", "Abrikosov");
        phonebook.add("+79998882222", "Borisov");
        phonebook.add("+79998883333", "Vinogradov");
        phonebook.add("+79998884444", "Abrikosov");

        System.out.println(Phonebook.getPhone("Abrikosov"));

    }




}
