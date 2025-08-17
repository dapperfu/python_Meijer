package dm;

import Vl.HomeMperksClippedReward;
import com.meijer.mobile.home.service.models.mperks.ClippedRewardCouponDto;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import vk.C17590a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/ClippedRewardCouponDto;", "LVl/c;", "a", "(Lcom/meijer/mobile/home/service/models/mperks/ClippedRewardCouponDto;)LVl/c;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: dm.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13540b {
    public static final HomeMperksClippedReward a(ClippedRewardCouponDto clippedRewardCouponDto) {
        LocalDateTime localDateTime;
        ZonedDateTime zonedDateTimeN;
        Intrinsics.j(clippedRewardCouponDto, "<this>");
        long couponId = clippedRewardCouponDto.getCouponId();
        String description = clippedRewardCouponDto.getDescription();
        String imageUrl = clippedRewardCouponDto.getImageUrl();
        String termsAndConditions = clippedRewardCouponDto.getTermsAndConditions();
        String expirationDate = clippedRewardCouponDto.getExpirationDate();
        return new HomeMperksClippedReward(couponId, description, imageUrl, clippedRewardCouponDto.getName(), (expirationDate == null || (localDateTime = (LocalDateTime) vk.d.b(expirationDate, C17590a.f164803a.s(), new j())) == null || (zonedDateTimeN = localDateTime.N(vk.e.EASTERN)) == null) ? null : zonedDateTimeN.n(ZoneId.systemDefault()), termsAndConditions);
    }
}
