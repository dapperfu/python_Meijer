package Tq;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"LTq/m;", "", "", "isClosed", "LTq/d;", "closingTime", "openingTime", "", "weekDay", "<init>", "(ZLTq/d;LTq/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "LTq/d;", "getClosingTime", "()LTq/d;", "c", "getOpeningTime", "d", "Ljava/lang/String;", "getWeekDay", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tq.m, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class WeekDayOpening {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClosed;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScheduleTime closingTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScheduleTime openingTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String weekDay;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekDayOpening)) {
            return false;
        }
        WeekDayOpening weekDayOpening = (WeekDayOpening) other;
        return this.isClosed == weekDayOpening.isClosed && Intrinsics.e(this.closingTime, weekDayOpening.closingTime) && Intrinsics.e(this.openingTime, weekDayOpening.openingTime) && Intrinsics.e(this.weekDay, weekDayOpening.weekDay);
    }

    public WeekDayOpening(boolean z10, ScheduleTime scheduleTime, ScheduleTime scheduleTime2, String weekDay) {
        Intrinsics.j(weekDay, "weekDay");
        this.isClosed = z10;
        this.closingTime = scheduleTime;
        this.openingTime = scheduleTime2;
        this.weekDay = weekDay;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isClosed) * 31;
        ScheduleTime scheduleTime = this.closingTime;
        int iHashCode2 = (iHashCode + (scheduleTime == null ? 0 : scheduleTime.hashCode())) * 31;
        ScheduleTime scheduleTime2 = this.openingTime;
        return ((iHashCode2 + (scheduleTime2 != null ? scheduleTime2.hashCode() : 0)) * 31) + this.weekDay.hashCode();
    }

    public String toString() {
        return "WeekDayOpening(isClosed=" + this.isClosed + ", closingTime=" + this.closingTime + ", openingTime=" + this.openingTime + ", weekDay=" + this.weekDay + ')';
    }
}
