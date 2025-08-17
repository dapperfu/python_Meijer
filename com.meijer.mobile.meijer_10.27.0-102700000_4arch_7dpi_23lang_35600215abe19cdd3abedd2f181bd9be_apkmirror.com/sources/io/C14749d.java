package io;

import Vl.AvailableReward;
import bo.ClaimReward;
import com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "Lbo/b;", "b", "(Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;)Lbo/b;", "LVl/a;", "a", "(LVl/a;)Lbo/b;", "networking_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: io.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14749d {
    public static final ClaimReward a(AvailableReward availableReward) {
        Intrinsics.j(availableReward, "<this>");
        return new ClaimReward(availableReward.getCouponId(), availableReward.getImageUrl(), availableReward.getName(), availableReward.getDescription(), availableReward.getDisplayStart(), availableReward.getDisplayEnd(), availableReward.getTermsAndConditions(), availableReward.getPointCost(), null, availableReward.getIsClaimed(), availableReward.getIsLoading());
    }

    public static final ClaimReward b(AvailableRewardCoupon availableRewardCoupon) {
        Intrinsics.j(availableRewardCoupon, "<this>");
        return new ClaimReward(availableRewardCoupon.getCouponId(), availableRewardCoupon.getImageUrl(), availableRewardCoupon.getName(), availableRewardCoupon.getDescription(), availableRewardCoupon.getDisplayStart(), availableRewardCoupon.getDisplayEnd(), availableRewardCoupon.getTermsAndConditions(), availableRewardCoupon.getPointCost(), availableRewardCoupon.getRewardCouponType(), false, false, 1536, null);
    }
}
