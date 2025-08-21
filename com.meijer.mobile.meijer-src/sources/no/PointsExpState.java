package no;

import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lno/d;", "", "", "showPointExpiryBanner", "", "pointsExpiringSoon", "j$/time/LocalDate", "pointsExpiryDate", "<init>", "(ZILj$/time/LocalDate;)V", "a", "(ZILj$/time/LocalDate;)Lno/d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "I", "c", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: no.d, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class PointsExpState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showPointExpiryBanner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pointsExpiringSoon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate pointsExpiryDate;

    public PointsExpState() {
        this(false, 0, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointsExpState)) {
            return false;
        }
        PointsExpState pointsExpState = (PointsExpState) other;
        return this.showPointExpiryBanner == pointsExpState.showPointExpiryBanner && this.pointsExpiringSoon == pointsExpState.pointsExpiringSoon && Intrinsics.e(this.pointsExpiryDate, pointsExpState.pointsExpiryDate);
    }

    public PointsExpState(boolean z10, int i10, LocalDate localDate) {
        this.showPointExpiryBanner = z10;
        this.pointsExpiringSoon = i10;
        this.pointsExpiryDate = localDate;
    }

    public final PointsExpState a(boolean showPointExpiryBanner, int pointsExpiringSoon, LocalDate pointsExpiryDate) {
        return new PointsExpState(showPointExpiryBanner, pointsExpiringSoon, pointsExpiryDate);
    }

    /* renamed from: b, reason: from getter */
    public final int getPointsExpiringSoon() {
        return this.pointsExpiringSoon;
    }

    /* renamed from: c, reason: from getter */
    public final LocalDate getPointsExpiryDate() {
        return this.pointsExpiryDate;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getShowPointExpiryBanner() {
        return this.showPointExpiryBanner;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.showPointExpiryBanner) * 31) + Integer.hashCode(this.pointsExpiringSoon)) * 31;
        LocalDate localDate = this.pointsExpiryDate;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "PointsExpState(showPointExpiryBanner=" + this.showPointExpiryBanner + ", pointsExpiringSoon=" + this.pointsExpiringSoon + ", pointsExpiryDate=" + this.pointsExpiryDate + ')';
    }

    public /* synthetic */ PointsExpState(boolean z10, int i10, LocalDate localDate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : localDate);
    }
}
