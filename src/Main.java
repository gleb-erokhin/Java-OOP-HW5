public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        AddressBook addressBook = new AddressBook();
        addressBook.addRecord("123-11-32", "Иван Иванов", "ул. Ленина, 3");
        addressBook.addRecord("883-47-21", "Петр Петров", "пр. Мира");
        addressBook.addRecord("919-41-85", "Николай Николаев", "пер. Славы");
        System.out.println(addressBook.allRecords());
    }
}