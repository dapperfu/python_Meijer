package com.meijer.mobile.subscription.ux.subscription;

import di.CustomerAddress;
import dr.CustomerDeliveryAddressRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vh.EnumC17675c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldi/c;", "Ldr/b;", "a", "(Ldi/c;)Ldr/b;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscription.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13118j {
    public static final CustomerDeliveryAddressRequest a(CustomerAddress customerAddress) {
        Intrinsics.j(customerAddress, "<this>");
        String line1 = customerAddress.getLine1();
        String typeName = (customerAddress.getIsShippingAddress() ? EnumC17675c.f165866d : EnumC17675c.f165865c).getTypeName();
        String town = customerAddress.getTown();
        String id2 = customerAddress.getId();
        if (id2 == null) {
            id2 = "";
        }
        return new CustomerDeliveryAddressRequest(line1, typeName, town, id2, customerAddress.getState(), customerAddress.getPostalCode());
    }
}
