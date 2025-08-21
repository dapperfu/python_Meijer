package kj;

import com.meijer.mobile.cart.model.hybris.AvailablePartnerStoreLocationsResponse;
import com.meijer.mobile.cart.model.hybris.PartnerStoreLocationResponse;
import fj.AvailablePartnerStoreLocations;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/AvailablePartnerStoreLocationsResponse;", "Lfj/c;", "a", "(Lcom/meijer/mobile/cart/model/hybris/AvailablePartnerStoreLocationsResponse;)Lfj/c;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kj.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15211a {
    public static final AvailablePartnerStoreLocations a(AvailablePartnerStoreLocationsResponse availablePartnerStoreLocationsResponse) {
        Intrinsics.j(availablePartnerStoreLocationsResponse, "<this>");
        PartnerStoreLocationResponse partnerStoreLocationResponse = (PartnerStoreLocationResponse) CollectionsKt.u0(availablePartnerStoreLocationsResponse.a());
        return new AvailablePartnerStoreLocations(partnerStoreLocationResponse != null ? y.a(partnerStoreLocationResponse) : null, availablePartnerStoreLocationsResponse.getIsAlcoholDeliveryEnabled(), null, null, 12, null);
    }
}
