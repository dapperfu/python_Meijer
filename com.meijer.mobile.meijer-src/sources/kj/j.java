package kj;

import com.meijer.mobile.cart.model.hybris.FulfillmentOptionEligibility;
import com.meijer.mobile.cart.model.hybris.FulfillmentOptionsRequest;
import fj.AvailablePartnerStoreLocations;
import fj.PartnerStoreLocation;
import fj.SupplementalEligibility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfj/c;", "Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionsRequest;", "a", "(Lfj/c;)Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionsRequest;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class j {
    public static final FulfillmentOptionsRequest a(AvailablePartnerStoreLocations availablePartnerStoreLocations) {
        Intrinsics.j(availablePartnerStoreLocations, "<this>");
        String strB = availablePartnerStoreLocations.b();
        if (strB == null) {
            strB = "";
        }
        boolean isAlcoholDeliveryEnabled = availablePartnerStoreLocations.getIsAlcoholDeliveryEnabled();
        PartnerStoreLocation storeLocation = availablePartnerStoreLocations.getStoreLocation();
        FulfillmentOptionEligibility fulfillmentOptionEligibility = new FulfillmentOptionEligibility(isAlcoholDeliveryEnabled, strB, storeLocation != null ? storeLocation.getStoreId() : null);
        List<SupplementalEligibility> listD = availablePartnerStoreLocations.d();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(i.a((SupplementalEligibility) it.next()));
        }
        return new FulfillmentOptionsRequest(fulfillmentOptionEligibility, arrayList);
    }
}
