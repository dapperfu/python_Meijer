package qo;

import bo.ClippedReward;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJH\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lqo/M;", "", "", "isLoading", "", "Lbo/d;", "rewards", "isRewardsUpdated", "isEmpty", "isError", "<init>", "(ZLjava/util/List;ZZZ)V", "a", "(ZLjava/util/List;ZZZ)Lqo/M;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "g", "d", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qo.M, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class RewardsViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ClippedReward> rewards;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRewardsUpdated;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmpty;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isError;

    public RewardsViewState() {
        this(false, null, false, false, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsViewState)) {
            return false;
        }
        RewardsViewState rewardsViewState = (RewardsViewState) other;
        return this.isLoading == rewardsViewState.isLoading && Intrinsics.e(this.rewards, rewardsViewState.rewards) && this.isRewardsUpdated == rewardsViewState.isRewardsUpdated && this.isEmpty == rewardsViewState.isEmpty && this.isError == rewardsViewState.isError;
    }

    public RewardsViewState(boolean z10, List<ClippedReward> rewards, boolean z11, boolean z12, boolean z13) {
        Intrinsics.j(rewards, "rewards");
        this.isLoading = z10;
        this.rewards = rewards;
        this.isRewardsUpdated = z11;
        this.isEmpty = z12;
        this.isError = z13;
    }

    public static /* synthetic */ RewardsViewState b(RewardsViewState rewardsViewState, boolean z10, List list, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = rewardsViewState.isLoading;
        }
        if ((i10 & 2) != 0) {
            list = rewardsViewState.rewards;
        }
        if ((i10 & 4) != 0) {
            z11 = rewardsViewState.isRewardsUpdated;
        }
        if ((i10 & 8) != 0) {
            z12 = rewardsViewState.isEmpty;
        }
        if ((i10 & 16) != 0) {
            z13 = rewardsViewState.isError;
        }
        boolean z14 = z13;
        boolean z15 = z11;
        return rewardsViewState.a(z10, list, z15, z12, z14);
    }

    public final RewardsViewState a(boolean isLoading, List<ClippedReward> rewards, boolean isRewardsUpdated, boolean isEmpty, boolean isError) {
        Intrinsics.j(rewards, "rewards");
        return new RewardsViewState(isLoading, rewards, isRewardsUpdated, isEmpty, isError);
    }

    public final List<ClippedReward> c() {
        return this.rewards;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsRewardsUpdated() {
        return this.isRewardsUpdated;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + this.rewards.hashCode()) * 31) + Boolean.hashCode(this.isRewardsUpdated)) * 31) + Boolean.hashCode(this.isEmpty)) * 31) + Boolean.hashCode(this.isError);
    }

    public String toString() {
        return "RewardsViewState(isLoading=" + this.isLoading + ", rewards=" + this.rewards + ", isRewardsUpdated=" + this.isRewardsUpdated + ", isEmpty=" + this.isEmpty + ", isError=" + this.isError + ')';
    }

    public /* synthetic */ RewardsViewState(boolean z10, List list, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
    }
}
