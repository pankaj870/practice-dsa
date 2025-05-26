package CollectionFrameWork;
import java.util.*;
import java.util.ArrayList;

public class detailsServices implements  MyDetails{
    public List<PersonDetails> findAll() {
        ArrayList<PersonDetails> details  = new ArrayList<>();
        details.add(new PersonDetails("john","mark",56));
        return  details;
    }

    public List<PersonDetails> findByName(String name) {
        ArrayList<PersonDetails> details  = new ArrayList<>();
        details.add(new PersonDetails("john","mark",56));
        return details;
    }
}
