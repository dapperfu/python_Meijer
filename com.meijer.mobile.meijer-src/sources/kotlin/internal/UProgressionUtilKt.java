package kotlin.internal;

import iv.C14852b;
import iv.C14853c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0004\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\u0004\u001a'\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0003\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlin/UInt;", "a", "b", "c", "(III)I", "Lkotlin/ULong;", "(JJJ)J", "start", "end", "", "step", "d", "", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UProgressionUtilKt {
    @SinceKotlin
    @PublishedApi
    public static final long c(long j10, long j11, long j12) {
        if (j12 > 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j11 : ULong.b(j11 - b(j11, j10, ULong.b(j12)));
        }
        if (j12 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j11 : ULong.b(j11 + b(j10, j11, ULong.b(-j12)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin
    @PublishedApi
    public static final int d(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return UInt.b(i11 - a(i11, i10, UInt.b(i12)));
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0) {
                return UInt.b(i11 + a(i10, i11, UInt.b(-i12)));
            }
        }
        return i11;
    }

    private static final int a(int i10, int i11, int i12) {
        int iA = C14852b.a(i10, i12);
        int iA2 = C14852b.a(i11, i12);
        int iCompare = Integer.compare(iA ^ Integer.MIN_VALUE, iA2 ^ Integer.MIN_VALUE);
        int iB = UInt.b(iA - iA2);
        if (iCompare >= 0) {
            return iB;
        }
        return UInt.b(iB + i12);
    }

    private static final long b(long j10, long j11, long j12) {
        long jA = C14853c.a(j10, j12);
        long jA2 = C14853c.a(j11, j12);
        int iCompare = Long.compare(jA ^ Long.MIN_VALUE, jA2 ^ Long.MIN_VALUE);
        long jB = ULong.b(jA - jA2);
        if (iCompare >= 0) {
            return jB;
        }
        return ULong.b(jB + j12);
    }
}
