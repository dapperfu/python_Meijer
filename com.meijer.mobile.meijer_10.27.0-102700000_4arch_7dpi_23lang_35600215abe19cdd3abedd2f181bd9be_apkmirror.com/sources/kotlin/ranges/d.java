package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.IntProgression;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0014\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0011*\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001f\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020\u0003*\u00020\u00032\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010\u0017\u001a\u0019\u0010#\u001a\u00020\u0018*\u00020\u00182\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b#\u0010\u001a\u001a\u0019\u0010$\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010\u001d\u001a\u0019\u0010%\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b%\u0010 \u001a5\u0010&\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0011*\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\u0010!\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b&\u0010'\u001a!\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)\u001a!\u0010*\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b*\u0010+\u001a!\u0010,\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a!\u0010.\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b.\u0010/\u001a1\u00102\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0011*\u00028\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0007¢\u0006\u0004\b2\u00103\u001a/\u00105\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0011*\u00028\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000004¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/random/Random;", "random", "", "u", "(Lkotlin/ranges/IntRange;Lkotlin/random/Random;)I", "to", "Lkotlin/ranges/IntProgression;", "t", "(II)Lkotlin/ranges/IntProgression;", "v", "(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;", "step", "w", "(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;", "x", "(II)Lkotlin/ranges/IntRange;", "", "T", "minimumValue", "h", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "f", "(II)I", "", "g", "(JJ)J", "", "e", "(FF)F", "", "d", "(DD)D", "maximumValue", "k", "l", "j", "i", "q", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "o", "(III)I", "p", "(JJJ)J", "n", "(FFF)F", "m", "(DDD)D", "Lkotlin/ranges/ClosedFloatingPointRange;", "range", "r", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "s", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class d extends c {
    public static double d(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static float e(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long g(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static double i(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float j(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int k(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long l(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static <T extends Comparable<? super T>> T h(T t10, T minimumValue) {
        Intrinsics.j(t10, "<this>");
        Intrinsics.j(minimumValue, "minimumValue");
        return t10.compareTo(minimumValue) < 0 ? minimumValue : t10;
    }

    public static double m(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float n(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int o(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long p(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static <T extends Comparable<? super T>> T q(T t10, T t11, T t12) {
        Intrinsics.j(t10, "<this>");
        if (t11 == null || t12 == null) {
            if (t11 != null && t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t12 != null && t10.compareTo(t12) > 0) {
                return t12;
            }
        } else {
            if (t11.compareTo(t12) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + '.');
            }
            if (t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
        return t10;
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T r(T t10, ClosedFloatingPointRange<T> range) {
        Intrinsics.j(t10, "<this>");
        Intrinsics.j(range, "range");
        if (!range.isEmpty()) {
            return (!range.a(t10, range.getStart()) || range.a(range.getStart(), t10)) ? (!range.a(range.getEndInclusive(), t10) || range.a(t10, range.getEndInclusive())) ? t10 : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static <T extends Comparable<? super T>> T s(T t10, ClosedRange<T> range) {
        Intrinsics.j(t10, "<this>");
        Intrinsics.j(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) r(t10, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            return t10.compareTo(range.getStart()) < 0 ? (T) range.getStart() : t10.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static IntProgression t(int i10, int i11) {
        return IntProgression.INSTANCE.a(i10, i11, -1);
    }

    @SinceKotlin
    public static int u(IntRange intRange, Random random) {
        Intrinsics.j(intRange, "<this>");
        Intrinsics.j(random, "random");
        try {
            return RandomKt.e(random, intRange);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static IntProgression v(IntProgression intProgression) {
        Intrinsics.j(intProgression, "<this>");
        return IntProgression.INSTANCE.a(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    public static IntProgression w(IntProgression intProgression, int i10) {
        Intrinsics.j(intProgression, "<this>");
        c.a(i10 > 0, Integer.valueOf(i10));
        IntProgression.Companion companion = IntProgression.INSTANCE;
        int iF = intProgression.getFirst();
        int iH = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.a(iF, iH, i10);
    }

    public static IntRange x(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? IntRange.INSTANCE.a() : new IntRange(i10, i11 - 1);
    }
}
