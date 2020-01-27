package com.insure.client;

import com.insure.client.gen.ClaimDataStore;
import com.insure.client.gen.ClaimDataStoreService;

import javax.xml.ws.BindingProvider;

public class Main {

    private static ClaimDataStore docStorage;

    public static void main(String args[]){

        System.out.println("Project template - server");

        String url = "http://localhost:8090/docstorage";

        ClaimDataStoreService dss = new ClaimDataStoreService();

        final ClaimDataStore claim = (ClaimDataStore) dss.getClaimDataStorePort();

        ((BindingProvider) claim).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);

        System.out.println("Done!");

        int claim_id = docStorage.addClaim("ola");

        System.out.println("Claim id created:"+ claim_id);
    }
}