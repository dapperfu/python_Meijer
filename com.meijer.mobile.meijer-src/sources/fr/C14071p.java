package fr;

import com.meijer.mobile.subscription.service.api.models.CustomerDeliveryAddressRequestJson;
import com.meijer.mobile.subscription.service.api.models.CustomerNameRequestJson;
import com.meijer.mobile.subscription.service.api.models.PaymentInfoRequestJson;
import com.meijer.mobile.subscription.service.api.models.ProductInfoRequestJson;
import com.meijer.mobile.subscription.service.api.models.StoreInfoRequestJson;
import com.meijer.mobile.subscription.service.api.models.SubscriptionProductRequestJson;
import dr.ContactInfoRequest;
import dr.CustomerNameRequest;
import dr.SubscriptionProductRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr/g;", "Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;", "a", "(Ldr/g;)Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14071p {
    public static final SubscriptionProductRequestJson a(SubscriptionProductRequest subscriptionProductRequest) {
        Intrinsics.j(subscriptionProductRequest, "<this>");
        String name = subscriptionProductRequest.getName();
        String baseSite = subscriptionProductRequest.getBaseSite();
        int deliveryFrequency = subscriptionProductRequest.getDeliveryFrequency();
        String deliveryFrequencyUnit = subscriptionProductRequest.getDeliveryFrequencyUnit();
        String fulfillmentPartner = subscriptionProductRequest.getFulfillmentPartner();
        String fulfillmentType = subscriptionProductRequest.getFulfillmentType();
        StoreInfoRequestJson storeInfoRequestJsonA = C14068m.a(subscriptionProductRequest.getStoreInfo());
        ProductInfoRequestJson productInfoRequestJsonA = C14066k.a(subscriptionProductRequest.getProductInfo());
        PaymentInfoRequestJson paymentInfoRequestJsonA = C14062g.a(subscriptionProductRequest.getPaymentInfo());
        CustomerDeliveryAddressRequestJson customerDeliveryAddressRequestJsonA = C14058c.a(subscriptionProductRequest.getCustomerDeliveryAddress());
        CustomerNameRequest customerName = subscriptionProductRequest.getCustomerName();
        CustomerNameRequestJson customerNameRequestJsonA = customerName != null ? C14060e.a(customerName) : null;
        ContactInfoRequest contactInfo = subscriptionProductRequest.getContactInfo();
        return new SubscriptionProductRequestJson(name, baseSite, deliveryFrequency, deliveryFrequencyUnit, fulfillmentPartner, fulfillmentType, storeInfoRequestJsonA, productInfoRequestJsonA, paymentInfoRequestJsonA, customerDeliveryAddressRequestJsonA, customerNameRequestJsonA, contactInfo != null ? C14056a.a(contactInfo) : null, C14064i.a(subscriptionProductRequest.getPreferredTimeslot()));
    }
}
