package J9;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LJ9/c;", "Ljava/io/Serializable;", "", "startTime", "endTime", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: J9.c, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class InAppLoadingTime implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long startTime;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long endTime;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppLoadingTime)) {
            return false;
        }
        InAppLoadingTime inAppLoadingTime = (InAppLoadingTime) other;
        return this.startTime == inAppLoadingTime.startTime && this.endTime == inAppLoadingTime.endTime;
    }

    /* renamed from: a, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* renamed from: b, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
    }

    public String toString() {
        return "InAppLoadingTime(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public InAppLoadingTime(long j10, long j11) {
        this.startTime = j10;
        this.endTime = j11;
    }
}
