package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;

@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"", "array", "Lkotlin/collections/ByteIterator;", "b", "([B)Lkotlin/collections/ByteIterator;", "", "Lkotlin/collections/CharIterator;", "c", "([C)Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/ShortIterator;", "h", "([S)Lkotlin/collections/ShortIterator;", "", "Lkotlin/collections/IntIterator;", "f", "([I)Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "g", "([J)Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/FloatIterator;", "e", "([F)Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/DoubleIterator;", "d", "([D)Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/BooleanIterator;", "a", "([Z)Lkotlin/collections/BooleanIterator;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ArrayIteratorsKt {
    public static final BooleanIterator a(boolean[] array) {
        Intrinsics.j(array, "array");
        return new a(array);
    }

    public static final ByteIterator b(byte[] array) {
        Intrinsics.j(array, "array");
        return new b(array);
    }

    public static final CharIterator c(char[] array) {
        Intrinsics.j(array, "array");
        return new c(array);
    }

    public static final DoubleIterator d(double[] array) {
        Intrinsics.j(array, "array");
        return new d(array);
    }

    public static final FloatIterator e(float[] array) {
        Intrinsics.j(array, "array");
        return new e(array);
    }

    public static final IntIterator f(int[] array) {
        Intrinsics.j(array, "array");
        return new f(array);
    }

    public static final LongIterator g(long[] array) {
        Intrinsics.j(array, "array");
        return new h(array);
    }

    public static final ShortIterator h(short[] array) {
        Intrinsics.j(array, "array");
        return new i(array);
    }
}
