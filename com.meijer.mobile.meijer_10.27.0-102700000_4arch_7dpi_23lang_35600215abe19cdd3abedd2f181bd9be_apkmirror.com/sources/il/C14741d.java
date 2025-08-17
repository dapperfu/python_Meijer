package il;

import com.meijer.mobile.digitalshopping.api.cart.model.Facility;
import com.meijer.mobile.digitalshopping.api.cart.model.SupplementalEligibilityOmsResponse;
import ej.SupplementalEligibility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/model/SupplementalEligibilityOmsResponse;", "Lej/E;", "a", "(Lcom/meijer/mobile/digitalshopping/api/cart/model/SupplementalEligibilityOmsResponse;)Lej/E;", "digitalshopping_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: il.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14741d {
    public static final SupplementalEligibility a(SupplementalEligibilityOmsResponse supplementalEligibilityOmsResponse) {
        Intrinsics.j(supplementalEligibilityOmsResponse, "<this>");
        Facility facility = supplementalEligibilityOmsResponse.getFacility();
        return new SupplementalEligibility(facility != null ? C14740c.a(facility) : null, supplementalEligibilityOmsResponse.getAddressAllowsAlcohol(), supplementalEligibilityOmsResponse.getPartnerEligibility());
    }
}
