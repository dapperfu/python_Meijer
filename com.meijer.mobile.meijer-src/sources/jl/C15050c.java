package jl;

import com.meijer.mobile.digitalshopping.api.cart.model.Facility;
import fj.PartnerStoreLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "Lfj/t;", "a", "(Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;)Lfj/t;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jl.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15050c {
    public static final PartnerStoreLocation a(Facility facility) {
        Intrinsics.j(facility, "<this>");
        return new PartnerStoreLocation(null, facility.getFacilityId(), facility.getEstimatedDriveTime(), facility.getServiceTier());
    }
}
