package dm;

import Vl.AvailableReward;
import com.meijer.mobile.home.service.models.mperks.AvailableRewardCouponDto;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/AvailableRewardCouponDto;", "LVl/a;", "a", "(Lcom/meijer/mobile/home/service/models/mperks/AvailableRewardCouponDto;)LVl/a;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: dm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13539a {
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
        ZonedDateTime zonedDateTimeN4 = (displayEnd == null || (localDateTime2 = (LocalDateTime) vk.d.b(displayEnd, C17590a.f164803a.s(), new j())) == null || (zonedDateTimeN2 = localDateTime2.N(vk.e.EASTERN)) == null) ? null : zonedDateTimeN2.n(ZoneId.systemDefault());
        String displayStart = availableRewardCouponDto.getDisplayStart();
        if (displayStart != null && (localDateTime = (LocalDateTime) vk.d.b(displayStart, C17590a.f164803a.s(), new j())) != null && (zonedDateTimeN = localDateTime.N(vk.e.EASTERN)) != null) {
            zonedDateTimeN3 = zonedDateTimeN.n(ZoneId.systemDefault());
        }
        return new AvailableReward(couponId, description, zonedDateTimeN4, zonedDateTimeN3, availableRewardCouponDto.getImageUrl(), availableRewardCouponDto.getName(), availableRewardCouponDto.getPointCost(), availableRewardCouponDto.getTermsAndConditions(), false, false, 768, null);
    }
}
