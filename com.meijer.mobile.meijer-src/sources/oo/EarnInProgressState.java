package oo;

import co.EarnReward;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Loo/v;", "", "", "isLoading", "", "Lco/g;", "earnRewards", "boosterRewards", "isError", "<init>", "(ZLjava/util/List;Ljava/util/List;Z)V", "a", "(ZLjava/util/List;Ljava/util/List;Z)Loo/v;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oo.v, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class EarnInProgressState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EarnReward> earnRewards;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EarnReward> boosterRewards;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isError;

    public EarnInProgressState() {
        this(false, null, null, false, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarnInProgressState)) {
            return false;
        }
        EarnInProgressState earnInProgressState = (EarnInProgressState) other;
        return this.isLoading == earnInProgressState.isLoading && Intrinsics.e(this.earnRewards, earnInProgressState.earnRewards) && Intrinsics.e(this.boosterRewards, earnInProgressState.boosterRewards) && this.isError == earnInProgressState.isError;
    }

    public EarnInProgressState(boolean z10, List<EarnReward> earnRewards, List<EarnReward> boosterRewards, boolean z11) {
        Intrinsics.j(earnRewards, "earnRewards");
        Intrinsics.j(boosterRewards, "boosterRewards");
        this.isLoading = z10;
        this.earnRewards = earnRewards;
        this.boosterRewards = boosterRewards;
        this.isError = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarnInProgressState b(EarnInProgressState earnInProgressState, boolean z10, List list, List list2, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = earnInProgressState.isLoading;
        }
        if ((i10 & 2) != 0) {
            list = earnInProgressState.earnRewards;
        }
        if ((i10 & 4) != 0) {
            list2 = earnInProgressState.boosterRewards;
        }
        if ((i10 & 8) != 0) {
            z11 = earnInProgressState.isError;
        }
        return earnInProgressState.a(z10, list, list2, z11);
    }

    public final EarnInProgressState a(boolean isLoading, List<EarnReward> earnRewards, List<EarnReward> boosterRewards, boolean isError) {
        Intrinsics.j(earnRewards, "earnRewards");
        Intrinsics.j(boosterRewards, "boosterRewards");
        return new EarnInProgressState(isLoading, earnRewards, boosterRewards, isError);
    }

    public final List<EarnReward> c() {
        return this.boosterRewards;
    }

    public final List<EarnReward> d() {
        return this.earnRewards;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + this.earnRewards.hashCode()) * 31) + this.boosterRewards.hashCode()) * 31) + Boolean.hashCode(this.isError);
    }

    public String toString() {
        return "EarnInProgressState(isLoading=" + this.isLoading + ", earnRewards=" + this.earnRewards + ", boosterRewards=" + this.boosterRewards + ", isError=" + this.isError + ')';
    }

    public /* synthetic */ EarnInProgressState(boolean z10, List list, List list2, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2, (i10 & 8) != 0 ? false : z11);
    }
}
