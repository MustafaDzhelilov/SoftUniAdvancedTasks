import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> mapOfStudents = new LinkedHashMap<>();

        int countOfPairs = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < countOfPairs; i++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            if(!mapOfStudents.containsKey(name)){
                mapOfStudents.put(name, grade);
            }else {
                Double average = ((mapOfStudents.get(name) + grade) / 2);
                mapOfStudents.put(name, average);
            }
        }
        mapOfStudents.entrySet()
                .stream()
                .filter(a->a.getValue()>=4.5)
                .sorted((g1, g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(grade -> {
                    System.out.printf("%s -> %.2f%n", grade.getKey(), grade.getValue());
                });

    }
}
