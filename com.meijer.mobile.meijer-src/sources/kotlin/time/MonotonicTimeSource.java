package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.time.TimeSource;

@SinceKotlin
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "", "c", "()J", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "b", "one", "another", "Lkotlin/time/Duration;", "a", "(JJ)J", "J", "zero", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a, reason: collision with root package name */
    public static final MonotonicTimeSource f148434a = new MonotonicTimeSource();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long zero = System.nanoTime();

    public final long a(long one, long another) {
        return LongSaturatedMathKt.c(one, another, DurationUnit.f148414b);
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    private MonotonicTimeSource() {
    }

    private final long c() {
        return System.nanoTime() - zero;
    }

    public long b() {
        return TimeSource.Monotonic.ValueTimeMark.b(c());
    }
}
