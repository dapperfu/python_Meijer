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
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/SubscriptionDetailsResponseJson;", "Lcr/j;", "a", "(Lcom/meijer/mobile/subscription/service/api/models/SubscriptionDetailsResponseJson;)Lcr/j;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13945o {
    public static final SubscriptionDetails a(SubscriptionDetailsResponseJson subscriptionDetailsResponseJson) {
        Intrinsics.j(subscriptionDetailsResponseJson, "<this>");
        String id2 = subscriptionDetailsResponseJson.getId();
        String externalShopperId = subscriptionDetailsResponseJson.getExternalShopperId();
        String baseSite = subscriptionDetailsResponseJson.getBaseSite();
        ContactInfo contactInfoA = C13932b.a(subscriptionDetailsResponseJson.getContactInfo());
        CustomerDeliveryAddress customerDeliveryAddressA = C13934d.a(subscriptionDetailsResponseJson.getCustomerDeliveryAddress());
        CustomerName customerNameA = C13936f.a(subscriptionDetailsResponseJson.getCustomerName());
        int deliveryFrequency = subscriptionDetailsResponseJson.getDeliveryFrequency();
        String deliveryFrequencyUnit = subscriptionDetailsResponseJson.getDeliveryFrequencyUnit();
        String fulfillmentPartner = subscriptionDetailsResponseJson.getFulfillmentPartner();
        String fulfillmentType = subscriptionDetailsResponseJson.getFulfillmentType();
        boolean isActive = subscriptionDetailsResponseJson.getIsActive();
        String name = subscriptionDetailsResponseJson.getName();
        String nextOrderDate = subscriptionDetailsResponseJson.getNextOrderDate();
        DateTimeFormatter dateTimeFormatter = C17590a.ISO_LOCAL_DATE;
        Object objA = vk.d.a(nextOrderDate, dateTimeFormatter, new Ch.a());
        Intrinsics.i(objA, "toDateTime(...)");
        return new SubscriptionDetails(externalShopperId, baseSite, contactInfoA, customerDeliveryAddressA, customerNameA, deliveryFrequency, deliveryFrequencyUnit, fulfillmentPartner, fulfillmentType, id2, isActive, name, (LocalDate) objA, C13938h.a(subscriptionDetailsResponseJson.getPaymentInfo()), C13940j.a(subscriptionDetailsResponseJson.getPreferredTimeslot()), C13942l.a(subscriptionDetailsResponseJson.getProductInfo()), (LocalDate) vk.d.a(subscriptionDetailsResponseJson.getSkipOrderDate(), dateTimeFormatter, new Ch.a()), subscriptionDetailsResponseJson.getIsSkippable(), subscriptionDetailsResponseJson.getIsSkipped(), C13944n.a(subscriptionDetailsResponseJson.getStoreInfo()));
    }
}
