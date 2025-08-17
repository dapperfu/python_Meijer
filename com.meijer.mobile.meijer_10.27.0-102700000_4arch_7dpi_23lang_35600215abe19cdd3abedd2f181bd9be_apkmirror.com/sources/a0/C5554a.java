package a0;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0010\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\b\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016\"\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"", "need", "e", "(I)I", "f", "d", "", "a", "b", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "array", "size", "value", "([III)I", "", "", "([JIJ)I", "[I", "EMPTY_INTS", "[J", "EMPTY_LONGS", "", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5554a {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final int[] f43341a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final long[] f43342b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Object[] f43343c = new Object[0];

    public static final int d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    public static final int a(int[] array, int i10, int i11) {
        Intrinsics.j(array, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = array[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(long[] array, int i10, long j10) {
        Intrinsics.j(array, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = array[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int e(int i10) {
        return d(i10 * 4) / 4;
    }

    public static final int f(int i10) {
        return d(i10 * 8) / 8;
    }

    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.e(obj, obj2);
    }
}
