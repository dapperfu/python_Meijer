package Du;

import java.math.BigInteger;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final BigInteger f6677a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    private static final BigInteger f6678b = BigInteger.valueOf(Long.MIN_VALUE);

    static int a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }
}
