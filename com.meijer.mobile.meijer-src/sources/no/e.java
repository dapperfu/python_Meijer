package no;

import Wl.HomeMperksClippedReward;
import co.ClippedReward;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWl/c;", "Lco/e;", "a", "(LWl/c;)Lco/e;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {
    public static final ClippedReward a(HomeMperksClippedReward homeMperksClippedReward) {
        Intrinsics.j(homeMperksClippedReward, "<this>");
        long couponId = homeMperksClippedReward.getCouponId();
        String description = homeMperksClippedReward.getDescription();
        String imageUrl = homeMperksClippedReward.getImageUrl();
        String name = homeMperksClippedReward.getName();
        ZonedDateTime expirationDate = homeMperksClippedReward.getExpirationDate();
        return new ClippedReward(couponId, description, imageUrl, name, expirationDate != null ? expirationDate.D() : null, homeMperksClippedReward.getTermsAndConditions());
    }
}
