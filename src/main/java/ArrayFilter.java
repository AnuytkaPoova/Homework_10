import java.util.*;

public class ArrayFilter<arrayList> {
    private final List<String> arrayList;

    public ArrayFilter(List<String> asList) {
        this.arrayList = asList;
    }

    public List<String> sortElements(){
        Collections.sort(arrayList);
        return arrayList;
    }
    public void info() {
        System.out.println("Созданный массив: " + arrayList);
    }

    //возвращает отсортированный массив Map(Элемент, кол-во)
    public Map<String, Integer> numberAllElementsSort(){
        sortElements().toArray();
        ListIterator<String> iter = arrayList.listIterator();
        Map<String, Integer> numberAllElements = new LinkedHashMap<>();
        Map<String, Integer> numberRepeatedElements = new LinkedHashMap<>();
        int count;
        String str;
        while (iter.hasNext()) {
            count = 1;
            str = iter.next();
            while (str.equals(iter.next()) && iter.hasNext()) {
                count++;
                numberAllElements.put(str, count);
                numberRepeatedElements.put(str, count);
            }
            if (count == 1)
                numberAllElements.put(str, count);
            if (iter.hasPrevious() && iter.hasNext())
                iter.previous();
        }
        count = 1;
        str = arrayList.get(arrayList.size() - 1); // добавила чтобы попадал послдний элемент
        for (Map.Entry<String, Integer> s :
                numberRepeatedElements.entrySet()) {
            if (s.getKey().equals(str)) {
                count++;
                numberAllElements.put(str, count);
            }
        }
        if (count == 1)
            numberAllElements.put(str, count);
        return numberAllElements;
    }
    public void numberAllElements() { // вывод на печать массива Map(Элемент, кол-во)
        Iterator<Map.Entry<String, Integer>> iter = numberAllElementsSort().entrySet().iterator();
        System.out.println("Список элементов и их количество в массиве: ");
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            System.out.println("Элемент = " + entry.getKey() + " повторяется " + entry.getValue() + " раз(а)");
        }
    }
    //возвращает отсортированный массив List только с уникальными элементами
    public List<String> uniqueElementsFilter() {
        sortElements().toArray();
        ListIterator<String> iter = arrayList.listIterator();
        Map<String, Integer> repeatedElements = new LinkedHashMap<>();
        List<String> uniqueElements = new ArrayList<>();
        int count;
        String str;
        while (iter.hasNext()) {
            count = 1;
            str = iter.next();
            while (str.equals(iter.next()) && iter.hasNext()) {
                count++;
                repeatedElements.put(str, count);
            }
            if (count == 1)
                uniqueElements.add(str);
            if (iter.hasPrevious() && iter.hasNext())
                iter.previous();
        }
        count = 1;
        str = arrayList.get(arrayList.size() - 1);
        for (Map.Entry<String, Integer> s :
                repeatedElements.entrySet()) {
            if (s.getKey().equals(str)) {
                count++;
                repeatedElements.put(str, count);
            }
        }
        if (count == 1)
            uniqueElements.add(str);

        return uniqueElements;
    }
    public void uniqueElements() {
        System.out.println("Список уникальных элементов: " + uniqueElementsFilter());

    }

}
