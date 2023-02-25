package com.one.digitalinnovation.gof.facade;

import externalSystem1.crm.CrmService;
import externalSystem2.cep.CepApi;

public class Facade {
    public void MigrateClient(String name, String cep){

        String city = CepApi.getInstance().recoverCity(cep);
        String state = CepApi.getInstance().recoverState(cep);

        CrmService.RegisterClient(name, cep, city, state);
    }
}
