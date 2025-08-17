package Tq;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"LTq/d;", "", "", "hour", "minute", "", "formattedHour", "<init>", "(IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getHour", "b", "getMinute", "c", "Ljava/lang/String;", "getFormattedHour", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tq.d, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ScheduleTime {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hour;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minute;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formattedHour;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleTime)) {
            return false;
        }
        ScheduleTime scheduleTime = (ScheduleTime) other;
        return this.hour == scheduleTime.hour && this.minute == scheduleTime.minute && Intrinsics.e(this.formattedHour, scheduleTime.formattedHour);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.hour) * 31) + Integer.hashCode(this.minute)) * 31;
        String str = this.formattedHour;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ScheduleTime(hour=" + this.hour + ", minute=" + this.minute + ", formattedHour=" + this.formattedHour + ')';
    }

    public ScheduleTime(int i10, int i11, String str) {
        this.hour = i10;
        this.minute = i11;
        this.formattedHour = str;
    }
}
