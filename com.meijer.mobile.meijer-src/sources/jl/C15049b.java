package jl;

import com.meijer.mobile.digitalshopping.api.cart.model.AvailablePartnerStoreLocationOmsResponse;
import com.meijer.mobile.digitalshopping.api.cart.model.Facility;
import com.meijer.mobile.digitalshopping.api.cart.model.SupplementalEligibilityOmsResponse;
import fj.AvailablePartnerStoreLocations;
import fj.PartnerStoreLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponse;", "Lfj/c;", "a", "(Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponse;)Lfj/c;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jl.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15049b {
    public static final AvailablePartnerStoreLocations a(AvailablePartnerStoreLocationOmsResponse availablePartnerStoreLocationOmsResponse) {
        Intrinsics.j(availablePartnerStoreLocationOmsResponse, "<this>");
        Facility facility = availablePartnerStoreLocationOmsResponse.getFacility();
        List listM = null;
        PartnerStoreLocation partnerStoreLocationA = facility != null ? C15050c.a(facility) : null;
        boolean addressAllowsAlcohol = availablePartnerStoreLocationOmsResponse.getAddressAllowsAlcohol();
        String partnerEligibility = availablePartnerStoreLocationOmsResponse.getPartnerEligibility();
        List<SupplementalEligibilityOmsResponse> listD = availablePartnerStoreLocationOmsResponse.d();
        if (listD != null) {
            List<SupplementalEligibilityOmsResponse> list = listD;
            listM = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(C15051d.a((SupplementalEligibilityOmsResponse) it.next()));
            }
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return new AvailablePartnerStoreLocations(partnerStoreLocationA, addressAllowsAlcohol, partnerEligibility, listM);
    }
}
