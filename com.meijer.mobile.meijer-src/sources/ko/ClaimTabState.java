package ko;

import co.AutoClaimReward;
import co.ClaimReward;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0080\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b\u000b\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010,R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b-\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b*\u0010 R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b)\u0010 ¨\u0006."}, d2 = {"Lko/d;", "", "", "isAvailableRewardsLoading", "isAutoClaimLoading", "isRedeemRewardAPIFailed", "", "Lco/c;", "availableRewards", "Lco/a;", "availableAutoClaimRewards", "isAutoClaimOptionAPIFailed", "Lko/b;", "onBuyCouponIsLoading", "isBuyCouponSuccess", "shouldAnimatePoints", "refreshPointsAndRewards", "<init>", "(ZZZLjava/util/List;Ljava/util/List;ZLko/b;ZZZ)V", "a", "(ZZZLjava/util/List;Ljava/util/List;ZLko/b;ZZZ)Lko/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "i", "()Z", "b", "h", "c", "k", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "f", "g", "Lko/b;", "()Lko/b;", "j", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ko.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ClaimTabState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailableRewardsLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoClaimLoading;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRedeemRewardAPIFailed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ClaimReward> availableRewards;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AutoClaimReward> availableAutoClaimRewards;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoClaimOptionAPIFailed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BuyCouponAPILoading onBuyCouponIsLoading;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBuyCouponSuccess;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldAnimatePoints;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean refreshPointsAndRewards;

    public ClaimTabState() {
        this(false, false, false, null, null, false, null, false, false, false, 1023, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaimTabState)) {
            return false;
        }
        ClaimTabState claimTabState = (ClaimTabState) other;
        return this.isAvailableRewardsLoading == claimTabState.isAvailableRewardsLoading && this.isAutoClaimLoading == claimTabState.isAutoClaimLoading && this.isRedeemRewardAPIFailed == claimTabState.isRedeemRewardAPIFailed && Intrinsics.e(this.availableRewards, claimTabState.availableRewards) && Intrinsics.e(this.availableAutoClaimRewards, claimTabState.availableAutoClaimRewards) && this.isAutoClaimOptionAPIFailed == claimTabState.isAutoClaimOptionAPIFailed && Intrinsics.e(this.onBuyCouponIsLoading, claimTabState.onBuyCouponIsLoading) && this.isBuyCouponSuccess == claimTabState.isBuyCouponSuccess && this.shouldAnimatePoints == claimTabState.shouldAnimatePoints && this.refreshPointsAndRewards == claimTabState.refreshPointsAndRewards;
    }

    public ClaimTabState(boolean z10, boolean z11, boolean z12, List<ClaimReward> availableRewards, List<AutoClaimReward> availableAutoClaimRewards, boolean z13, BuyCouponAPILoading onBuyCouponIsLoading, boolean z14, boolean z15, boolean z16) {
        Intrinsics.j(availableRewards, "availableRewards");
        Intrinsics.j(availableAutoClaimRewards, "availableAutoClaimRewards");
        Intrinsics.j(onBuyCouponIsLoading, "onBuyCouponIsLoading");
        this.isAvailableRewardsLoading = z10;
        this.isAutoClaimLoading = z11;
        this.isRedeemRewardAPIFailed = z12;
        this.availableRewards = availableRewards;
        this.availableAutoClaimRewards = availableAutoClaimRewards;
        this.isAutoClaimOptionAPIFailed = z13;
        this.onBuyCouponIsLoading = onBuyCouponIsLoading;
        this.isBuyCouponSuccess = z14;
        this.shouldAnimatePoints = z15;
        this.refreshPointsAndRewards = z16;
    }

    public static /* synthetic */ ClaimTabState b(ClaimTabState claimTabState, boolean z10, boolean z11, boolean z12, List list, List list2, boolean z13, BuyCouponAPILoading buyCouponAPILoading, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = claimTabState.isAvailableRewardsLoading;
        }
        if ((i10 & 2) != 0) {
            z11 = claimTabState.isAutoClaimLoading;
        }
        if ((i10 & 4) != 0) {
            z12 = claimTabState.isRedeemRewardAPIFailed;
        }
        if ((i10 & 8) != 0) {
            list = claimTabState.availableRewards;
        }
        if ((i10 & 16) != 0) {
            list2 = claimTabState.availableAutoClaimRewards;
        }
        if ((i10 & 32) != 0) {
            z13 = claimTabState.isAutoClaimOptionAPIFailed;
        }
        if ((i10 & 64) != 0) {
            buyCouponAPILoading = claimTabState.onBuyCouponIsLoading;
        }
        if ((i10 & 128) != 0) {
            z14 = claimTabState.isBuyCouponSuccess;
        }
        if ((i10 & 256) != 0) {
            z15 = claimTabState.shouldAnimatePoints;
        }
        if ((i10 & 512) != 0) {
            z16 = claimTabState.refreshPointsAndRewards;
        }
        boolean z17 = z15;
        boolean z18 = z16;
        BuyCouponAPILoading buyCouponAPILoading2 = buyCouponAPILoading;
        boolean z19 = z14;
        List list3 = list2;
        boolean z20 = z13;
        return claimTabState.a(z10, z11, z12, list, list3, z20, buyCouponAPILoading2, z19, z17, z18);
    }

    public final ClaimTabState a(boolean isAvailableRewardsLoading, boolean isAutoClaimLoading, boolean isRedeemRewardAPIFailed, List<ClaimReward> availableRewards, List<AutoClaimReward> availableAutoClaimRewards, boolean isAutoClaimOptionAPIFailed, BuyCouponAPILoading onBuyCouponIsLoading, boolean isBuyCouponSuccess, boolean shouldAnimatePoints, boolean refreshPointsAndRewards) {
        Intrinsics.j(availableRewards, "availableRewards");
        Intrinsics.j(availableAutoClaimRewards, "availableAutoClaimRewards");
        Intrinsics.j(onBuyCouponIsLoading, "onBuyCouponIsLoading");
        return new ClaimTabState(isAvailableRewardsLoading, isAutoClaimLoading, isRedeemRewardAPIFailed, availableRewards, availableAutoClaimRewards, isAutoClaimOptionAPIFailed, onBuyCouponIsLoading, isBuyCouponSuccess, shouldAnimatePoints, refreshPointsAndRewards);
    }

    public final List<AutoClaimReward> c() {
        return this.availableAutoClaimRewards;
    }

    public final List<ClaimReward> d() {
        return this.availableRewards;
    }

    /* renamed from: e, reason: from getter */
    public final BuyCouponAPILoading getOnBuyCouponIsLoading() {
        return this.onBuyCouponIsLoading;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getRefreshPointsAndRewards() {
        return this.refreshPointsAndRewards;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getShouldAnimatePoints() {
        return this.shouldAnimatePoints;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsAutoClaimLoading() {
        return this.isAutoClaimLoading;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.isAvailableRewardsLoading) * 31) + Boolean.hashCode(this.isAutoClaimLoading)) * 31) + Boolean.hashCode(this.isRedeemRewardAPIFailed)) * 31) + this.availableRewards.hashCode()) * 31) + this.availableAutoClaimRewards.hashCode()) * 31) + Boolean.hashCode(this.isAutoClaimOptionAPIFailed)) * 31) + this.onBuyCouponIsLoading.hashCode()) * 31) + Boolean.hashCode(this.isBuyCouponSuccess)) * 31) + Boolean.hashCode(this.shouldAnimatePoints)) * 31) + Boolean.hashCode(this.refreshPointsAndRewards);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsAvailableRewardsLoading() {
        return this.isAvailableRewardsLoading;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsBuyCouponSuccess() {
        return this.isBuyCouponSuccess;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsRedeemRewardAPIFailed() {
        return this.isRedeemRewardAPIFailed;
    }

    public String toString() {
        return "ClaimTabState(isAvailableRewardsLoading=" + this.isAvailableRewardsLoading + ", isAutoClaimLoading=" + this.isAutoClaimLoading + ", isRedeemRewardAPIFailed=" + this.isRedeemRewardAPIFailed + ", availableRewards=" + this.availableRewards + ", availableAutoClaimRewards=" + this.availableAutoClaimRewards + ", isAutoClaimOptionAPIFailed=" + this.isAutoClaimOptionAPIFailed + ", onBuyCouponIsLoading=" + this.onBuyCouponIsLoading + ", isBuyCouponSuccess=" + this.isBuyCouponSuccess + ", shouldAnimatePoints=" + this.shouldAnimatePoints + ", refreshPointsAndRewards=" + this.refreshPointsAndRewards + ')';
    }

    public /* synthetic */ ClaimTabState(boolean z10, boolean z11, boolean z12, List list, List list2, boolean z13, BuyCouponAPILoading buyCouponAPILoading, boolean z14, boolean z15, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) != 0 ? CollectionsKt.m() : list2, (i10 & 32) != 0 ? false : z13, (i10 & 64) != 0 ? new BuyCouponAPILoading(false, null, 2, null) : buyCouponAPILoading, (i10 & 128) != 0 ? false : z14, (i10 & 256) != 0 ? false : z15, (i10 & 512) != 0 ? false : z16);
    }
}
