package fr;

import com.meijer.mobile.subscription.service.api.models.CustomerDeliveryAddressResponseJson;
import cr.CustomerDeliveryAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressResponseJson;", "Lcr/b;", "a", "(Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressResponseJson;)Lcr/b;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13934d {
    public static final CustomerDeliveryAddress a(CustomerDeliveryAddressResponseJson customerDeliveryAddressResponseJson) {
        Intrinsics.j(customerDeliveryAddressResponseJson, "<this>");
        return new CustomerDeliveryAddress(customerDeliveryAddressResponseJson.getAddressLine1(), customerDeliveryAddressResponseJson.getAddressType(), customerDeliveryAddressResponseJson.getCity(), customerDeliveryAddressResponseJson.getDeliveryAddressId(), customerDeliveryAddressResponseJson.getState(), customerDeliveryAddressResponseJson.getZip());
    }
}
