package Jn;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LJn/a;", "", "Lbk/a;", "weekdays", "times", "<init>", "(Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Jn.a, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class DailySchedule {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16034c = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a weekdays;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a times;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailySchedule)) {
            return false;
        }
        DailySchedule dailySchedule = (DailySchedule) other;
        return Intrinsics.e(this.weekdays, dailySchedule.weekdays) && Intrinsics.e(this.times, dailySchedule.times);
    }

    public DailySchedule(AbstractC6392a weekdays, AbstractC6392a times) {
        Intrinsics.j(weekdays, "weekdays");
        Intrinsics.j(times, "times");
        this.weekdays = weekdays;
        this.times = times;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getTimes() {
        return this.times;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getWeekdays() {
        return this.weekdays;
    }

    public int hashCode() {
        return (this.weekdays.hashCode() * 31) + this.times.hashCode();
    }

    public String toString() {
        return "DailySchedule(weekdays=" + this.weekdays + ", times=" + this.times + ')';
    }
}
