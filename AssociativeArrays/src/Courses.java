import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String> > courses = new LinkedHashMap<>() ;

        String input = sc.nextLine();

        while (!input.equals("end")){
            String course = input.split(" : ")[0];
            String stName = input.split(" : ")[1];

            if(!courses.containsKey(course)){
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(stName);

            input = sc.nextLine();
        }
        courses.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e ->{
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.println("-- " + student));
                });

    }
}
