import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, String> bookMap = new HashMap<>();

        boolean run = true;
        String bookName, bookAuthor;

        System.out.println("Enter your fav book and auth. Enter 'q' to stop");
        while(run){
            System.out.println("Enter a book name: ");
            bookName = input.nextLine();
            if (bookName.equals("q")){
                System.out.println("exiting....");
                run = false;
                break;
            }

            System.out.println("Enter author");
            bookAuthor = input.nextLine();
            if (bookAuthor.equals("q")){
                break;
            }

            bookMap.put(bookName, bookAuthor);

        }
        Map<String, String> sortedBookMap = bookMap.entrySet()
                .stream()
                .distinct()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        sortedBookMap.forEach((bookNameS, bookAuthorS) -> System.out.println(bookNameS + " by " + bookAuthorS));


    }
}

