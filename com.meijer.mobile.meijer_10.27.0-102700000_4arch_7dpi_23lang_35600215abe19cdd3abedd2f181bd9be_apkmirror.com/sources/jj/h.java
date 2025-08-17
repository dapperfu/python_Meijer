package jj;

import com.meijer.mobile.cart.model.hybris.FulfillmentEligibility;
import ej.AvailableFulfillmentEligibility;
import ej.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/FulfillmentEligibility;", "Lej/b;", "a", "(Lcom/meijer/mobile/cart/model/hybris/FulfillmentEligibility;)Lej/b;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h {
    public static final AvailableFulfillmentEligibility a(FulfillmentEligibility fulfillmentEligibility) {
        Intrinsics.j(fulfillmentEligibility, "<this>");
        String fulfillmentEligibility2 = fulfillmentEligibility.getFulfillmentEligibility();
        String str = fulfillmentEligibility2 == null ? "" : fulfillmentEligibility2;
        String partnerEligibility = fulfillmentEligibility.getPartnerEligibility();
        String str2 = partnerEligibility == null ? "" : partnerEligibility;
        boolean alcoholEligible = fulfillmentEligibility.getAlcoholEligible();
        String storeId = fulfillmentEligibility.getStoreId();
        o.Companion companion = ej.o.INSTANCE;
        String partnerEligibility2 = fulfillmentEligibility.getPartnerEligibility();
        return new AvailableFulfillmentEligibility(str, str2, companion.a(partnerEligibility2 != null ? partnerEligibility2 : ""), alcoholEligible, storeId, false);
    }
}
