package oo;

import bo.EarnReward;
import fi.GoogleAdData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Loo/o;", "", "", "isLoading", "", "Lbo/f;", "availableRewards", "isError", "Lfi/d;", "googleAdData", "<init>", "(ZLjava/util/List;ZLfi/d;)V", "a", "(ZLjava/util/List;ZLfi/d;)Loo/o;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "e", "d", "Lfi/d;", "()Lfi/d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oo.o, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class EarnAvailableViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EarnReward> availableRewards;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isError;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final GoogleAdData googleAdData;

    public EarnAvailableViewState() {
        this(false, null, false, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarnAvailableViewState)) {
            return false;
        }
        EarnAvailableViewState earnAvailableViewState = (EarnAvailableViewState) other;
        return this.isLoading == earnAvailableViewState.isLoading && Intrinsics.e(this.availableRewards, earnAvailableViewState.availableRewards) && this.isError == earnAvailableViewState.isError && Intrinsics.e(this.googleAdData, earnAvailableViewState.googleAdData);
    }

    public EarnAvailableViewState(boolean z10, List<EarnReward> availableRewards, boolean z11, GoogleAdData googleAdData) {
        Intrinsics.j(availableRewards, "availableRewards");
        this.isLoading = z10;
        this.availableRewards = availableRewards;
        this.isError = z11;
        this.googleAdData = googleAdData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarnAvailableViewState b(EarnAvailableViewState earnAvailableViewState, boolean z10, List list, boolean z11, GoogleAdData googleAdData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = earnAvailableViewState.isLoading;
        }
        if ((i10 & 2) != 0) {
            list = earnAvailableViewState.availableRewards;
        }
        if ((i10 & 4) != 0) {
            z11 = earnAvailableViewState.isError;
        }
        if ((i10 & 8) != 0) {
            googleAdData = earnAvailableViewState.googleAdData;
        }
        return earnAvailableViewState.a(z10, list, z11, googleAdData);
    }

    public final EarnAvailableViewState a(boolean isLoading, List<EarnReward> availableRewards, boolean isError, GoogleAdData googleAdData) {
        Intrinsics.j(availableRewards, "availableRewards");
        return new EarnAvailableViewState(isLoading, availableRewards, isError, googleAdData);
    }

    public final List<EarnReward> c() {
        return this.availableRewards;
    }

    /* renamed from: d, reason: from getter */
    public final GoogleAdData getGoogleAdData() {
        return this.googleAdData;
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
        int iHashCode = ((((Boolean.hashCode(this.isLoading) * 31) + this.availableRewards.hashCode()) * 31) + Boolean.hashCode(this.isError)) * 31;
        GoogleAdData googleAdData = this.googleAdData;
        return iHashCode + (googleAdData == null ? 0 : googleAdData.hashCode());
    }

    public String toString() {
        return "EarnAvailableViewState(isLoading=" + this.isLoading + ", availableRewards=" + this.availableRewards + ", isError=" + this.isError + ", googleAdData=" + this.googleAdData + ')';
    }

    public /* synthetic */ EarnAvailableViewState(boolean z10, List list, boolean z11, GoogleAdData googleAdData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : googleAdData);
    }
}
