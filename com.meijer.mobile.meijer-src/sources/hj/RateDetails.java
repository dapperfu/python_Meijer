package hj;

import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhj/k;", "", "", "rated", "", "rating", "j$/time/OffsetDateTime", "date", "<init>", "(ZILj$/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "I", "c", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.k, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class RateDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rated;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rating;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime date;

    public RateDetails() {
        this(false, 0, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateDetails)) {
            return false;
        }
        RateDetails rateDetails = (RateDetails) other;
        return this.rated == rateDetails.rated && this.rating == rateDetails.rating && Intrinsics.e(this.date, rateDetails.date);
    }

    public RateDetails(boolean z10, int i10, OffsetDateTime offsetDateTime) {
        this.rated = z10;
        this.rating = i10;
        this.date = offsetDateTime;
    }

    /* renamed from: a, reason: from getter */
    public final OffsetDateTime getDate() {
        return this.date;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getRated() {
        return this.rated;
    }

    /* renamed from: c, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.rated) * 31) + Integer.hashCode(this.rating)) * 31;
        OffsetDateTime offsetDateTime = this.date;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    public String toString() {
        return "RateDetails(rated=" + this.rated + ", rating=" + this.rating + ", date=" + this.date + ')';
    }

    public /* synthetic */ RateDetails(boolean z10, int i10, OffsetDateTime offsetDateTime, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : offsetDateTime);
    }
}
