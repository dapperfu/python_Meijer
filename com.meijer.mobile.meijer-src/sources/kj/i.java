package kj;

import com.meijer.mobile.cart.model.hybris.FulfillmentOptionEligibility;
import fj.PartnerStoreLocation;
import fj.SupplementalEligibility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfj/E;", "Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;", "a", "(Lfj/E;)Lcom/meijer/mobile/cart/model/hybris/FulfillmentOptionEligibility;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i {
    public static final FulfillmentOptionEligibility a(SupplementalEligibility supplementalEligibility) {
        Intrinsics.j(supplementalEligibility, "<this>");
        String partnerEligibility = supplementalEligibility.getPartnerEligibility();
        if (partnerEligibility == null) {
            partnerEligibility = "";
        }
        boolean isAlcoholDeliveryEnabled = supplementalEligibility.getIsAlcoholDeliveryEnabled();
        PartnerStoreLocation storeLocation = supplementalEligibility.getStoreLocation();
        return new FulfillmentOptionEligibility(isAlcoholDeliveryEnabled, partnerEligibility, storeLocation != null ? storeLocation.getStoreId() : null);
    }
}
