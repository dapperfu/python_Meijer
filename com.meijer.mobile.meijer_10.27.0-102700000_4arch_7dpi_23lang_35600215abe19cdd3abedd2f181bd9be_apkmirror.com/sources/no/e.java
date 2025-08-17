package no;

import Vl.HomeMperksClippedReward;
import bo.ClippedReward;
import com.meijer.mobile.mperks.networking.domain.models.EarnedReward;
import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import vk.C17590a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LVl/c;", "Lbo/d;", "b", "(LVl/c;)Lbo/d;", "Lcom/meijer/mobile/mperks/networking/domain/models/EarnedReward;", "a", "(Lcom/meijer/mobile/mperks/networking/domain/models/EarnedReward;)Lbo/d;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e {
    public static final ClippedReward a(EarnedReward earnedReward) {
        Intrinsics.j(earnedReward, "<this>");
        long logixOfferId = earnedReward.getLogixOfferId();
        String title = earnedReward.getTitle();
        String description = earnedReward.getDescription();
        String imageUrl = earnedReward.getImageUrl();
        String redeemByDate = earnedReward.getRedeemByDate();
        return new ClippedReward(Long.valueOf(logixOfferId), description, imageUrl, title, redeemByDate != null ? (LocalDateTime) vk.d.b(redeemByDate, C17590a.f164803a.s(), new j()) : null, earnedReward.getTermsAndConditions());
    }

    public static final ClippedReward b(HomeMperksClippedReward homeMperksClippedReward) {
        Intrinsics.j(homeMperksClippedReward, "<this>");
        Long lValueOf = Long.valueOf(homeMperksClippedReward.getCouponId());
        String description = homeMperksClippedReward.getDescription();
        String imageUrl = homeMperksClippedReward.getImageUrl();
        String name = homeMperksClippedReward.getName();
        ZonedDateTime expirationDate = homeMperksClippedReward.getExpirationDate();
        return new ClippedReward(lValueOf, description, imageUrl, name, expirationDate != null ? expirationDate.D() : null, homeMperksClippedReward.getTermsAndConditions());
    }
}
