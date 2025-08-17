package jj;

import com.meijer.mobile.cart.model.hybris.MembershipResponse;
import ej.Membership;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;", "Lej/r;", "a", "(Lcom/meijer/mobile/cart/model/hybris/MembershipResponse;)Lej/r;", "hybris_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class v {
    public static final Membership a(MembershipResponse membershipResponse) {
        Intrinsics.j(membershipResponse, "<this>");
        String code = membershipResponse.getCode();
        String partnerCustomerId = membershipResponse.getPartnerCustomerId();
        String timeCreated = membershipResponse.getTimeCreated();
        OffsetDateTime offsetDateTime = timeCreated != null ? (OffsetDateTime) vk.d.b(timeCreated, C17590a.f164803a.s(), new r()) : null;
        String timeUpdated = membershipResponse.getTimeUpdated();
        return new Membership(code, partnerCustomerId, offsetDateTime, timeUpdated != null ? (OffsetDateTime) vk.d.b(timeUpdated, C17590a.f164803a.s(), new r()) : null);
    }
}
