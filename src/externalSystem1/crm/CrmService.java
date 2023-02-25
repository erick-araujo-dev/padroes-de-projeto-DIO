package externalSystem1.crm;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void RegisterClient(String name, String cep, String city, String state){
        System.out.println("Client saved in the CRM system successfully");

        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);

    }
}
