package em;

import Wl.HomeMperksClippedReward;
import com.meijer.mobile.home.service.models.mperks.ClippedRewardCouponDto;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uh.j;
import wk.C17898a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/home/service/models/mperks/ClippedRewardCouponDto;", "LWl/c;", "a", "(Lcom/meijer/mobile/home/service/models/mperks/ClippedRewardCouponDto;)LWl/c;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: em.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C13816b {
    public static final HomeMperksClippedReward a(ClippedRewardCouponDto clippedRewardCouponDto) {
        LocalDateTime localDateTime;
        ZonedDateTime zonedDateTimeN;
        Intrinsics.j(clippedRewardCouponDto, "<this>");
        long couponId = clippedRewardCouponDto.getCouponId();
        String description = clippedRewardCouponDto.getDescription();
        String str = description == null ? "" : description;
        String imageUrl = clippedRewardCouponDto.getImageUrl();
        String termsAndConditions = clippedRewardCouponDto.getTermsAndConditions();
        String str2 = termsAndConditions == null ? "" : termsAndConditions;
        String expirationDate = clippedRewardCouponDto.getExpirationDate();
        return new HomeMperksClippedReward(couponId, str, imageUrl, clippedRewardCouponDto.getName(), (expirationDate == null || (localDateTime = (LocalDateTime) wk.d.b(expirationDate, C17898a.f167225a.s(), new j())) == null || (zonedDateTimeN = localDateTime.N(wk.e.EASTERN)) == null) ? null : zonedDateTimeN.n(ZoneId.systemDefault()), str2);
    }
}
