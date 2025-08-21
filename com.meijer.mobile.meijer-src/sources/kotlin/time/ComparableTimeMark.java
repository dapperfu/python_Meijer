package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "other", "Lkotlin/time/Duration;", "d", "(Lkotlin/time/ComparableTimeMark;)J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
/* loaded from: classes14.dex */
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int a(ComparableTimeMark comparableTimeMark, ComparableTimeMark other) {
            Intrinsics.j(other, "other");
            return Duration.t(comparableTimeMark.d(other), Duration.INSTANCE.c());
        }
    }

    long d(ComparableTimeMark other);
}
