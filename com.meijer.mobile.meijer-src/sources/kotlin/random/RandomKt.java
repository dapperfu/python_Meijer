package kotlin.random;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "Lkotlin/ranges/IntRange;", "range", "", "e", "(Lkotlin/random/Random;Lkotlin/ranges/IntRange;)I", "value", "d", "(I)I", "bitCount", "f", "(II)I", "from", "until", "", "c", "(II)V", "", "b", "(DD)V", "", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RandomKt {
    public static final int f(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }

    public static final String a(Object from, Object until) {
        Intrinsics.j(from, "from");
        Intrinsics.j(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(double d10, double d11) {
        if (d11 <= d10) {
            throw new IllegalArgumentException(a(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    public static final void c(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    @SinceKotlin
    public static final int e(Random random, IntRange range) {
        Intrinsics.j(random, "<this>");
        Intrinsics.j(range, "range");
        if (!range.isEmpty()) {
            return range.getLast() < Integer.MAX_VALUE ? random.h(range.getFirst(), range.getLast() + 1) : range.getFirst() > Integer.MIN_VALUE ? random.h(range.getFirst() - 1, range.getLast()) + 1 : random.f();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int d(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }
}
