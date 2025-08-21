package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"", "value", "Lkotlin/time/Duration;", "a", "(J)J", "origin1", "origin2", "Lkotlin/time/DurationUnit;", "unit", "c", "(JJLkotlin/time/DurationUnit;)J", "value1", "value2", "b", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class LongSaturatedMathKt {
    private static final long a(long j10) {
        return j10 < 0 ? Duration.INSTANCE.b() : Duration.INSTANCE.a();
    }

    private static final long b(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return DurationKt.t(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.f148416d;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.b0(a(j12));
        }
        long jB = DurationUnitKt__DurationUnitJvmKt.b(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.W(DurationKt.t(j13, durationUnit2), DurationKt.t(j14, durationUnit));
    }

    public static final long c(long j10, long j11, DurationUnit unit) {
        Intrinsics.j(unit, "unit");
        return ((j11 - 1) | 1) == Long.MAX_VALUE ? j10 == j11 ? Duration.INSTANCE.c() : Duration.b0(a(j11)) : (1 | (j10 - 1)) == Long.MAX_VALUE ? a(j10) : b(j10, j11, unit);
    }
}
