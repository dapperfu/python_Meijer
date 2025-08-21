package ul;

import com.meijer.mobile.digitalshopping.api.timeslots.model.DTMDeliveryPartner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lul/a;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DTMDeliveryPartner;", "a", "(Lul/a;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DTMDeliveryPartner;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ul.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17442b {
    public static final DTMDeliveryPartner a(FulfillmentDTMDeliveryPartner fulfillmentDTMDeliveryPartner) {
        Intrinsics.j(fulfillmentDTMDeliveryPartner, "<this>");
        return new DTMDeliveryPartner(String.valueOf(fulfillmentDTMDeliveryPartner.getStoreId()), fulfillmentDTMDeliveryPartner.getPartnerEligibility(), fulfillmentDTMDeliveryPartner.getFulfillmentEligibility());
    }
}
