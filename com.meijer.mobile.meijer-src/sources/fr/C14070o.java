package fr;

import com.meijer.mobile.subscription.service.api.models.SubscriptionDetailsResponseJson;
import cr.ContactInfo;
import cr.CustomerDeliveryAddress;
import cr.CustomerName;
import cr.SubscriptionDetails;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/SubscriptionDetailsResponseJson;", "Lcr/j;", "a", "(Lcom/meijer/mobile/subscription/service/api/models/SubscriptionDetailsResponseJson;)Lcr/j;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14070o {
    public static final SubscriptionDetails a(SubscriptionDetailsResponseJson subscriptionDetailsResponseJson) {
        Intrinsics.j(subscriptionDetailsResponseJson, "<this>");
        String id2 = subscriptionDetailsResponseJson.getId();
        String externalShopperId = subscriptionDetailsResponseJson.getExternalShopperId();
        String baseSite = subscriptionDetailsResponseJson.getBaseSite();
        ContactInfo contactInfoA = C14057b.a(subscriptionDetailsResponseJson.getContactInfo());
        CustomerDeliveryAddress customerDeliveryAddressA = C14059d.a(subscriptionDetailsResponseJson.getCustomerDeliveryAddress());
        CustomerName customerNameA = C14061f.a(subscriptionDetailsResponseJson.getCustomerName());
        int deliveryFrequency = subscriptionDetailsResponseJson.getDeliveryFrequency();
        String deliveryFrequencyUnit = subscriptionDetailsResponseJson.getDeliveryFrequencyUnit();
        String fulfillmentPartner = subscriptionDetailsResponseJson.getFulfillmentPartner();
        String fulfillmentType = subscriptionDetailsResponseJson.getFulfillmentType();
        boolean isActive = subscriptionDetailsResponseJson.getIsActive();
        String name = subscriptionDetailsResponseJson.getName();
        String nextOrderDate = subscriptionDetailsResponseJson.getNextOrderDate();
        DateTimeFormatter dateTimeFormatter = C17898a.ISO_LOCAL_DATE;
        Object objA = wk.d.a(nextOrderDate, dateTimeFormatter, new Dh.a());
        Intrinsics.i(objA, "toDateTime(...)");
        return new SubscriptionDetails(externalShopperId, baseSite, contactInfoA, customerDeliveryAddressA, customerNameA, deliveryFrequency, deliveryFrequencyUnit, fulfillmentPartner, fulfillmentType, id2, isActive, name, (LocalDate) objA, C14063h.a(subscriptionDetailsResponseJson.getPaymentInfo()), C14065j.a(subscriptionDetailsResponseJson.getPreferredTimeslot()), C14067l.a(subscriptionDetailsResponseJson.getProductInfo()), (LocalDate) wk.d.a(subscriptionDetailsResponseJson.getSkipOrderDate(), dateTimeFormatter, new Dh.a()), subscriptionDetailsResponseJson.getIsSkippable(), subscriptionDetailsResponseJson.getIsSkipped(), C14069n.a(subscriptionDetailsResponseJson.getStoreInfo()));
    }
}
