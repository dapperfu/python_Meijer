package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\t\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\n\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"", "a", "b", "e", "(II)I", "", "f", "(JJ)J", "c", "(III)I", "(JJJ)J", "start", "end", "step", "d", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ProgressionUtilKt {
    private static final int e(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    private static final long f(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }

    @PublishedApi
    public static final int c(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                return i11 - a(i11, i10, i12);
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                return i11 + a(i10, i11, -i12);
            }
        }
        return i11;
    }

    @PublishedApi
    public static final long d(long j10, long j11, long j12) {
        if (j12 > 0) {
            return j10 >= j11 ? j11 : j11 - b(j11, j10, j12);
        }
        if (j12 < 0) {
            return j10 <= j11 ? j11 : j11 + b(j10, j11, -j12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int a(int i10, int i11, int i12) {
        return e(e(i10, i12) - e(i11, i12), i12);
    }

    private static final long b(long j10, long j11, long j12) {
        return f(f(j10, j12) - f(j11, j12), j12);
    }
}
