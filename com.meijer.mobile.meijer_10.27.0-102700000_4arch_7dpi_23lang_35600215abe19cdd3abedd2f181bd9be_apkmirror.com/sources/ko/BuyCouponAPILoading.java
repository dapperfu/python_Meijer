package ko;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lko/b;", "", "", "isLoading", "", "couponID", "<init>", "(ZLjava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/Long;", "()Ljava/lang/Long;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ko.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class BuyCouponAPILoading {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long couponID;

    /* JADX WARN: Multi-variable type inference failed */
    public BuyCouponAPILoading() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyCouponAPILoading)) {
            return false;
        }
        BuyCouponAPILoading buyCouponAPILoading = (BuyCouponAPILoading) other;
        return this.isLoading == buyCouponAPILoading.isLoading && Intrinsics.e(this.couponID, buyCouponAPILoading.couponID);
    }

    public BuyCouponAPILoading(boolean z10, Long l10) {
        this.isLoading = z10;
        this.couponID = l10;
    }

    /* renamed from: a, reason: from getter */
    public final Long getCouponID() {
        return this.couponID;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        Long l10 = this.couponID;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "BuyCouponAPILoading(isLoading=" + this.isLoading + ", couponID=" + this.couponID + ')';
    }

    public /* synthetic */ BuyCouponAPILoading(boolean z10, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? 0L : l10);
    }
}
