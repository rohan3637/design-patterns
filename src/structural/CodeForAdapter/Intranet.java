package structural.CodeForAdapter;

import java.util.List;

//Data consumer
public class Intranet {

    private IPhoneListSource source;

    public Intranet(IPhoneListSource source){
        this.source = source;
    }
    
    public void printPhoneNumbers(){
        List<String> phones = this.source.getPhoneNumbers();
        System.out.println(phones);
    }
}
