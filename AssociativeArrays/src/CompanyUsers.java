import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> infoCompanyEmployess; infoCompanyEmployess = new TreeMap<>();

        String input = sc.nextLine();

        while (!input.equals("End")){
            String companyName = input.split(" -> ")[0];
            String idEmployes = input.split(" -> ")[1];

            if(!infoCompanyEmployess.containsKey(companyName)){
                infoCompanyEmployess.put(companyName, new ArrayList<>());
                infoCompanyEmployess.get(companyName).add(idEmployes);
            }
            if(infoCompanyEmployess.containsKey(companyName) && !infoCompanyEmployess.get(companyName).contains(idEmployes)){
                infoCompanyEmployess.get(companyName).add(idEmployes);
            }
            input = sc.nextLine();
        }
        for (var entry : infoCompanyEmployess.entrySet()) {
            System.out.println(entry.getKey());
            for ( String value : entry.getValue()) {
                System.out.println("-- " + value);
            }
        }
    }
}
