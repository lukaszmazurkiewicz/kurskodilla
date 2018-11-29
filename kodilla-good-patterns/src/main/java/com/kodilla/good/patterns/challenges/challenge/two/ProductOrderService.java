package com.kodilla.good.patterns.challenges.challenge.two;

public class ProductOrderService {

    public static void main(String[] args) {

        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(new MailService(), new GamesPurchaseService(), new GamesPurchaseRepository());
        purchaseProcessor.process(purchaseRequest);

    }
}
