import java.util.ArrayList;
import java.util.List;

public class PhoneBook extends ArrayList<Phone> {
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Телефонный справочник\n");
        for (Phone phone : this) {
            stringBuilder.append("---------------------\n");
            stringBuilder.append("Фамилия: " + phone.getName() + "\n");
            stringBuilder.append("Телефон: " + phone.getNumber() + "\n");
        }

        return stringBuilder.toString();
    }

    public void info(){
        System.out.println(toString());
    }

    public String get(String name) {
        List<Phone> thisPhone = new ArrayList<>();
        System.out.println("--------------------------");
        System.out.println("Поиск по фамилии: " + name);
        System.out.println("Телефон: ");
        for (Phone phone : this) {
            if (phone.getName().equals(name)) {
                thisPhone.add(phone);
                System.out.println(phone.getNumber());
            }
        }
        return thisPhone.toString();
    }

}
