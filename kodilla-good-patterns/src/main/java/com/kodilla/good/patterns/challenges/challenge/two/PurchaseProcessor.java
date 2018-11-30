package com.kodilla.good.patterns.challenges.challenge.two;

public class PurchaseProcessor {
    private InformationService informationService;
    private PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public PurchaseProcessor(final InformationService informationService, final PurchaseService purchaseService, final PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }
    public PurchaseDto process(final PurchaseRequest purchaseRequest) {
        boolean isPurchased = purchaseService.purchase(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getPurchaseDate());
        if(isPurchased) {
            informationService.inform(purchaseRequest.getUser());
            purchaseRepository.createPurchase(purchaseRequest.getUser(), purchaseRequest.getProduct(), purchaseRequest.getPurchaseDate());
            return new PurchaseDto(purchaseRequest.getUser(), true);
        } else {
            return new PurchaseDto(purchaseRequest.getUser(), false);
        }
    }
}
