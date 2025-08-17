package Vp;

import Xp.ShopAndScanTrip;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LVp/e;", "", "LXp/f;", "activeTrip", "<init>", "(LXp/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LXp/f;", "getActiveTrip", "()LXp/f;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vp.e, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ResumeTripRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanTrip activeTrip;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResumeTripRequest) && Intrinsics.e(this.activeTrip, ((ResumeTripRequest) other).activeTrip);
    }

    public ResumeTripRequest(ShopAndScanTrip activeTrip) {
        Intrinsics.j(activeTrip, "activeTrip");
        this.activeTrip = activeTrip;
    }

    public int hashCode() {
        return this.activeTrip.hashCode();
    }

    public String toString() {
        return "ResumeTripRequest(activeTrip=" + this.activeTrip + ')';
    }
}
