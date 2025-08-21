package em;

import Wl.AvailableReward;
import com.meijer.mobile.home.service.models.mperks.AvailableRewardCouponDto;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uh.j;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/AvailableRewardCouponDto;", "LWl/a;", "a", "(Lcom/meijer/mobile/home/service/models/mperks/AvailableRewardCouponDto;)LWl/a;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: em.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C13815a {
    public static final AvailableReward a(AvailableRewardCouponDto availableRewardCouponDto) {
        LocalDateTime localDateTime;
        ZonedDateTime zonedDateTimeN;
        LocalDateTime localDateTime2;
        ZonedDateTime zonedDateTimeN2;
        Intrinsics.j(availableRewardCouponDto, "<this>");
        long couponId = availableRewardCouponDto.getCouponId();
        String description = availableRewardCouponDto.getDescription();
        String displayEnd = availableRewardCouponDto.getDisplayEnd();
        ZonedDateTime zonedDateTimeN3 = null;
        ZonedDateTime zonedDateTimeN4 = (displayEnd == null || (localDateTime2 = (LocalDateTime) wk.d.b(displayEnd, C17898a.f167225a.s(), new j())) == null || (zonedDateTimeN2 = localDateTime2.N(wk.e.EASTERN)) == null) ? null : zonedDateTimeN2.n(ZoneId.systemDefault());
        String displayStart = availableRewardCouponDto.getDisplayStart();
        if (displayStart != null && (localDateTime = (LocalDateTime) wk.d.b(displayStart, C17898a.f167225a.s(), new j())) != null && (zonedDateTimeN = localDateTime.N(wk.e.EASTERN)) != null) {
            zonedDateTimeN3 = zonedDateTimeN.n(ZoneId.systemDefault());
        }
        return new AvailableReward(couponId, description, zonedDateTimeN4, zonedDateTimeN3, availableRewardCouponDto.getImageUrl(), availableRewardCouponDto.getName(), availableRewardCouponDto.getPointCost(), availableRewardCouponDto.getTermsAndConditions(), false, false, 768, null);
    }
}
