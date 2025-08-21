package com.meijer.mobile.mperks.networking.domain.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ok.MccProgram;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfo;", "", "Lok/b$c;", "enrollmentStatus", "", "dollarProgress", "", "Lcom/meijer/mobile/mperks/networking/domain/models/RewardOffer;", "rewardOffers", "<init>", "(Lok/b$c;DLjava/util/List;)V", "component1", "()Lok/b$c;", "component2", "()D", "component3", "()Ljava/util/List;", "copy", "(Lok/b$c;DLjava/util/List;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lok/b$c;", "getEnrollmentStatus", "D", "getDollarProgress", "Ljava/util/List;", "getRewardOffers", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksCreditCardInfo {
    private final double dollarProgress;
    private final MccProgram.c enrollmentStatus;
    private final List<RewardOffer> rewardOffers;

    public MperksCreditCardInfo() {
        this(null, 0.0d, null, 7, null);
    }

    /* renamed from: component2, reason: from getter */
    public final double getDollarProgress() {
        return this.dollarProgress;
    }

    public final List<RewardOffer> component3() {
        return this.rewardOffers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksCreditCardInfo)) {
            return false;
        }
        MperksCreditCardInfo mperksCreditCardInfo = (MperksCreditCardInfo) other;
        return this.enrollmentStatus == mperksCreditCardInfo.enrollmentStatus && Double.compare(this.dollarProgress, mperksCreditCardInfo.dollarProgress) == 0 && Intrinsics.e(this.rewardOffers, mperksCreditCardInfo.rewardOffers);
    }

    public int hashCode() {
        return (((this.enrollmentStatus.hashCode() * 31) + Double.hashCode(this.dollarProgress)) * 31) + this.rewardOffers.hashCode();
    }

    public String toString() {
        return "MperksCreditCardInfo(enrollmentStatus=" + this.enrollmentStatus + ", dollarProgress=" + this.dollarProgress + ", rewardOffers=" + this.rewardOffers + ')';
    }

    public MperksCreditCardInfo(MccProgram.c enrollmentStatus, double d10, List<RewardOffer> rewardOffers) {
        Intrinsics.j(enrollmentStatus, "enrollmentStatus");
        Intrinsics.j(rewardOffers, "rewardOffers");
        this.enrollmentStatus = enrollmentStatus;
        this.dollarProgress = d10;
        this.rewardOffers = rewardOffers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MperksCreditCardInfo copy$default(MperksCreditCardInfo mperksCreditCardInfo, MccProgram.c cVar, double d10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = mperksCreditCardInfo.enrollmentStatus;
        }
        if ((i10 & 2) != 0) {
            d10 = mperksCreditCardInfo.dollarProgress;
        }
        if ((i10 & 4) != 0) {
            list = mperksCreditCardInfo.rewardOffers;
        }
        return mperksCreditCardInfo.copy(cVar, d10, list);
    }

    /* renamed from: component1, reason: from getter */
    public final MccProgram.c getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public final MperksCreditCardInfo copy(MccProgram.c enrollmentStatus, double dollarProgress, List<RewardOffer> rewardOffers) {
        Intrinsics.j(enrollmentStatus, "enrollmentStatus");
        Intrinsics.j(rewardOffers, "rewardOffers");
        return new MperksCreditCardInfo(enrollmentStatus, dollarProgress, rewardOffers);
    }

    public final double getDollarProgress() {
        return this.dollarProgress;
    }

    public final MccProgram.c getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public final List<RewardOffer> getRewardOffers() {
        return this.rewardOffers;
    }

    public /* synthetic */ MperksCreditCardInfo(MccProgram.c cVar, double d10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MccProgram.c.f154293a : cVar, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? CollectionsKt.m() : list);
    }
}
