import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Первое задание:");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list.add(random.nextInt(31));
        }

        System.out.println("\tИзначальный список:");
        System.out.println(list);

        System.out.println("\tУдалить дубликаты:");
        List<Integer> withoutDuplicates = list.stream()
                .distinct()
                .toList();
        System.out.println(withoutDuplicates);

        System.out.println("\tВывести все четные элементы в диапазоне от 7 до 17 (включительно):");
        List<Integer> evenNumbers = list.stream()
                .filter(n -> n >= 7 && n <= 17 && n % 2 == 0)
                .toList();
        System.out.println(evenNumbers);

        System.out.println("\tКаждый элемент умножить на 2:");
        List<Integer> multip = list.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(multip);

        System.out.println("\tОтсортировать и вывести на экран первых 4 элемента:");
        List<Integer> sortedAndCut = list.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.println(sortedAndCut);

        System.out.println("\tВывести количество элементов в стриме:");
        System.out.println(list.stream().count());

        System.out.println("\tВывести среднее арифметическое всех чисел в стриме:");
        double size = list.stream().count();
        double sum = list.stream()
                .reduce(Integer::sum)
                .orElse(0)
                .doubleValue();
        System.out.println(sum / size);

        System.out.println("Второе задание:");

        List<String> group = new ArrayList<>() {{
            add("Заикин Вадим Васильевич");
            add("Радишевская Валерия Игоревна");
            add("Сомов Денис Николаевич");
            add("Гуков Глеб Олегович");
            add("Лисиченко Ольга Васильевна");
            add("Корчинский Роман Иванович");
            add("Михальцова Ольга Григорьевна");
            add("Ребковец Данила Дмитриевич");
            add("Ракитин Александр Дмитриевич");
            add("Смирнова Елизавета Васильевна");
            add("Кирпик Святослав Игоревич");
            add("Андреев Андрей Андреевич");
        }};

        System.out.println("\tВернуть количество количество людей с вашим именем (вне\n" +
                "зависимости от верхнего/нижнего регистра букв)");
        final String myName = "Кирпик Святослав Игоревич";
        List<String> sameNames = group.stream()
                .filter(myName::equalsIgnoreCase)
                .toList();
        System.out.println(sameNames.size());

        System.out.println("\tВыбрать все имена, начинающиеся на \"а\" (вне зависимости от\n" +
                "верхнего/нижнего регистра букв");

        List<String> namesStartsWithA = group.stream()
                .filter(name -> name.matches("[аА].+"))
                .toList();
        System.out.println(namesStartsWithA);

    }
}