package CollectionFrameWork;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
    DateTimeFormatter  formateData = DateTimeFormatter.ofPattern("dd-mm-yyyy");
      
    }
}
