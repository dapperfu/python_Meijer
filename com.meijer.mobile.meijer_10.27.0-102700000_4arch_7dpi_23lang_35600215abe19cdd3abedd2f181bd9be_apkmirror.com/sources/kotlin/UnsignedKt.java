package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "v1", "v2", "a", "(II)I", "", "b", "(JJ)I", "value", "", "c", "(J)D", "base", "", "d", "(JI)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final double c(long j10) {
        return ((j10 >>> 11) * RecyclerView.m.FLAG_MOVED) + (j10 & 2047);
    }

    @PublishedApi
    public static final int a(int i10, int i11) {
        return Intrinsics.k(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    public static final int b(long j10, long j11) {
        return Intrinsics.l(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final String d(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, CharsKt.a(i10));
            Intrinsics.i(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, CharsKt.a(i10));
        Intrinsics.i(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, CharsKt.a(i10));
        Intrinsics.i(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
