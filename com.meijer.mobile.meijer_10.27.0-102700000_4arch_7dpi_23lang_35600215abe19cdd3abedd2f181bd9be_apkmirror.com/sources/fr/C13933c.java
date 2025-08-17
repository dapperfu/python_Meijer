package fr;

import com.meijer.mobile.subscription.service.api.models.CustomerDeliveryAddressRequestJson;
import dr.CustomerDeliveryAddressRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldr/b;", "Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressRequestJson;", "a", "(Ldr/b;)Lcom/meijer/mobile/subscription/service/api/models/CustomerDeliveryAddressRequestJson;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fr.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13933c {
    public static final CustomerDeliveryAddressRequestJson a(CustomerDeliveryAddressRequest customerDeliveryAddressRequest) {
        Intrinsics.j(customerDeliveryAddressRequest, "<this>");
        return new CustomerDeliveryAddressRequestJson(customerDeliveryAddressRequest.getAddressLine1(), customerDeliveryAddressRequest.getAddressType(), customerDeliveryAddressRequest.getCity(), customerDeliveryAddressRequest.getDeliveryAddressId(), customerDeliveryAddressRequest.getState(), customerDeliveryAddressRequest.getZip());
    }
}
