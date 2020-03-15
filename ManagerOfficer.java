package bai1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author admin
 */
public class ManagerOfficer {
    private List<Officer> officers;
    private Object officer;
    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }
    public void addOfficer(Officer officer){
        this.officer.add(officer);
    }
    public List<Officer> searchOfficerByName(String name){
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(collecetors.toList());
    }
  public void showListiinforOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
}
}


    

