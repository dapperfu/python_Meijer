package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "value", "Lkotlin/time/DurationUnit;", "sourceUnit", "targetUnit", "a", "(DLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)D", "", "c", "(JLkotlin/time/DurationUnit;Lkotlin/time/DurationUnit;)J", "b", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes14.dex */
class DurationUnitKt__DurationUnitJvmKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin
    public static final double a(double d10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.j(sourceUnit, "sourceUnit");
        Intrinsics.j(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit().convert(1L, sourceUnit.getTimeUnit());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.getTimeUnit().convert(1L, targetUnit.getTimeUnit());
    }

    @SinceKotlin
    public static final long b(long j10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.j(sourceUnit, "sourceUnit");
        Intrinsics.j(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j10, sourceUnit.getTimeUnit());
    }

    @SinceKotlin
    public static final long c(long j10, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.j(sourceUnit, "sourceUnit");
        Intrinsics.j(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j10, sourceUnit.getTimeUnit());
    }
}
