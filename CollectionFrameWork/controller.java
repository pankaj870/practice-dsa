package CollectionFrameWork;
import java.util.*;
public class controller {
    private MyDetails MY_DETAILS;

    public List<PersonDetails> showDetails(){
        List<PersonDetails> Cdetails = MY_DETAILS.findAll();
        System.out.println(Cdetails);
        return Cdetails;
    }
}
