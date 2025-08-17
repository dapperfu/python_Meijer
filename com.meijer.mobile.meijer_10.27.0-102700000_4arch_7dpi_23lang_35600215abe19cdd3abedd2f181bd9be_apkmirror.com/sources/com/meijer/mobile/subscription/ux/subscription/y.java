package com.meijer.mobile.subscription.ux.subscription;

import Tq.SimpleStoreSummary;
import dr.ContactInfoRequest;
import dr.CustomerDeliveryAddressRequest;
import dr.CustomerNameRequest;
import dr.PaymentInfoRequest;
import dr.PreferredTimeslotRequest;
import dr.ProductInfoRequest;
import dr.SubscriptionProductRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/x;", "Ldr/g;", "a", "(Lcom/meijer/mobile/subscription/ux/subscription/x;)Ldr/g;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class y {
    public static final SubscriptionProductRequest a(SubscriptionDecorator subscriptionDecorator) {
        Intrinsics.j(subscriptionDecorator, "<this>");
        String subscriptionId = subscriptionDecorator.getSubscriptionId();
        String name = subscriptionDecorator.getName();
        String baseSite = subscriptionDecorator.getBaseSite();
        int deliveryFrequency = subscriptionDecorator.getDeliveryFrequency();
        String deliveryFrequencyUnit = subscriptionDecorator.getDeliveryFrequencyUnit();
        String fulfillmentPartner = subscriptionDecorator.getFulfillmentPartner();
        String fulfillmentType = subscriptionDecorator.getFulfillmentType();
        SimpleStoreSummary storeInfo = subscriptionDecorator.getStoreInfo();
        if (storeInfo == null) {
            throw new IllegalStateException("Store info is required");
        }
        ProductInfoRequest productInfo = subscriptionDecorator.getProductInfo();
        if (productInfo == null) {
            throw new IllegalStateException("Product info is required");
        }
        PaymentInfoRequest paymentInfo = subscriptionDecorator.getPaymentInfo();
        if (paymentInfo == null) {
            throw new IllegalStateException("Payment info is required");
        }
        CustomerDeliveryAddressRequest customerDeliveryAddress = subscriptionDecorator.getCustomerDeliveryAddress();
        if (customerDeliveryAddress == null) {
            throw new IllegalStateException("Delivery address is required");
        }
        CustomerNameRequest customerName = subscriptionDecorator.getCustomerName();
        ContactInfoRequest contactInfo = subscriptionDecorator.getContactInfo();
        PreferredTimeslotRequest preferredTimeslot = subscriptionDecorator.getPreferredTimeslot();
        if (preferredTimeslot != null) {
            return new SubscriptionProductRequest(subscriptionId, name, baseSite, deliveryFrequency, deliveryFrequencyUnit, fulfillmentPartner, fulfillmentType, storeInfo, productInfo, paymentInfo, customerDeliveryAddress, customerName, contactInfo, preferredTimeslot);
        }
        throw new IllegalStateException("Preferred timeslot is required");
    }
}
