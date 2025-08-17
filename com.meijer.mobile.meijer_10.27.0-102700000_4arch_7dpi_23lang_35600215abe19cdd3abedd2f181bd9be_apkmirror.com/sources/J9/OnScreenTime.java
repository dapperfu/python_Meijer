package J9;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"LJ9/i;", "", "", "duration", "startTime", "endTime", "<init>", "(JJJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "c", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: J9.i, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class OnScreenTime {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long duration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long startTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long endTime;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnScreenTime)) {
            return false;
        }
        OnScreenTime onScreenTime = (OnScreenTime) other;
        return this.duration == onScreenTime.duration && this.startTime == onScreenTime.startTime && this.endTime == onScreenTime.endTime;
    }

    /* renamed from: a, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: b, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* renamed from: c, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((Long.hashCode(this.duration) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime);
    }

    public String toString() {
        return "OnScreenTime(duration=" + this.duration + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public OnScreenTime(long j10, long j11, long j12) {
        this.duration = j10;
        this.startTime = j11;
        this.endTime = j12;
    }
}
