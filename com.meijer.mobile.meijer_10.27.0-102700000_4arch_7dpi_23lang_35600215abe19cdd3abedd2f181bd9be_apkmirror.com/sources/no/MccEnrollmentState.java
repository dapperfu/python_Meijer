package no;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lno/c;", "", "", "enrollmentStatus", "", "dollarProgress", "<init>", "(ID)V", "a", "(ID)Lno/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "D", "()D", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: no.c, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class MccEnrollmentState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int enrollmentStatus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double dollarProgress;

    public MccEnrollmentState() {
        this(0, 0.0d, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MccEnrollmentState)) {
            return false;
        }
        MccEnrollmentState mccEnrollmentState = (MccEnrollmentState) other;
        return this.enrollmentStatus == mccEnrollmentState.enrollmentStatus && Double.compare(this.dollarProgress, mccEnrollmentState.dollarProgress) == 0;
    }

    public MccEnrollmentState(int i10, double d10) {
        this.enrollmentStatus = i10;
        this.dollarProgress = d10;
    }

    public final MccEnrollmentState a(int enrollmentStatus, double dollarProgress) {
        return new MccEnrollmentState(enrollmentStatus, dollarProgress);
    }

    /* renamed from: b, reason: from getter */
    public final double getDollarProgress() {
        return this.dollarProgress;
    }

    /* renamed from: c, reason: from getter */
    public final int getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public int hashCode() {
        return (Integer.hashCode(this.enrollmentStatus) * 31) + Double.hashCode(this.dollarProgress);
    }

    public String toString() {
        return "MccEnrollmentState(enrollmentStatus=" + this.enrollmentStatus + ", dollarProgress=" + this.dollarProgress + ')';
    }

    public /* synthetic */ MccEnrollmentState(int i10, double d10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0d : d10);
    }
}
