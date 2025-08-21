package dr;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Ldr/e;", "", "j$/time/DayOfWeek", "dayOfWeek", "j$/time/LocalTime", "startTime", "endTime", "<init>", "(Lj$/time/DayOfWeek;Lj$/time/LocalTime;Lj$/time/LocalTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/DayOfWeek;", "()Lj$/time/DayOfWeek;", "b", "Lj$/time/LocalTime;", "c", "()Lj$/time/LocalTime;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dr.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class PreferredTimeslotRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DayOfWeek dayOfWeek;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime startTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime endTime;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferredTimeslotRequest)) {
            return false;
        }
        PreferredTimeslotRequest preferredTimeslotRequest = (PreferredTimeslotRequest) other;
        return this.dayOfWeek == preferredTimeslotRequest.dayOfWeek && Intrinsics.e(this.startTime, preferredTimeslotRequest.startTime) && Intrinsics.e(this.endTime, preferredTimeslotRequest.endTime);
    }

    public PreferredTimeslotRequest(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        Intrinsics.j(dayOfWeek, "dayOfWeek");
        Intrinsics.j(startTime, "startTime");
        Intrinsics.j(endTime, "endTime");
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /* renamed from: a, reason: from getter */
    public final DayOfWeek getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* renamed from: b, reason: from getter */
    public final LocalTime getEndTime() {
        return this.endTime;
    }

    /* renamed from: c, reason: from getter */
    public final LocalTime getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((this.dayOfWeek.hashCode() * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
    }

    public String toString() {
        return "PreferredTimeslotRequest(dayOfWeek=" + this.dayOfWeek + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ')';
    }
}
