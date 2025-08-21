package no;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ok.MccProgram;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lno/c;", "", "Lok/b$c;", "enrollmentStatus", "", "dollarProgress", "<init>", "(Lok/b$c;D)V", "a", "(Lok/b$c;D)Lno/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lok/b$c;", "c", "()Lok/b$c;", "b", "D", "()D", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: no.c, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class MccEnrollmentState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MccProgram.c enrollmentStatus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double dollarProgress;

    public MccEnrollmentState() {
        this(null, 0.0d, 3, null);
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

    public MccEnrollmentState(MccProgram.c enrollmentStatus, double d10) {
        Intrinsics.j(enrollmentStatus, "enrollmentStatus");
        this.enrollmentStatus = enrollmentStatus;
        this.dollarProgress = d10;
    }

    public final MccEnrollmentState a(MccProgram.c enrollmentStatus, double dollarProgress) {
        Intrinsics.j(enrollmentStatus, "enrollmentStatus");
        return new MccEnrollmentState(enrollmentStatus, dollarProgress);
    }

    /* renamed from: b, reason: from getter */
    public final double getDollarProgress() {
        return this.dollarProgress;
    }

    /* renamed from: c, reason: from getter */
    public final MccProgram.c getEnrollmentStatus() {
        return this.enrollmentStatus;
    }

    public int hashCode() {
        return (this.enrollmentStatus.hashCode() * 31) + Double.hashCode(this.dollarProgress);
    }

    public String toString() {
        return "MccEnrollmentState(enrollmentStatus=" + this.enrollmentStatus + ", dollarProgress=" + this.dollarProgress + ')';
    }

    public /* synthetic */ MccEnrollmentState(MccProgram.c cVar, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MccProgram.c.f154293a : cVar, (i10 & 2) != 0 ? 0.0d : d10);
    }
}
