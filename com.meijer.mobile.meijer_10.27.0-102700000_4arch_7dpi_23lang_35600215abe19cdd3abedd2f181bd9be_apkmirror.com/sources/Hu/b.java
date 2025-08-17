package Hu;

import java.math.BigInteger;

/* loaded from: classes7.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final BigInteger f13255a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    private static final BigInteger f13256b = BigInteger.valueOf(Long.MIN_VALUE);

    static int a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }
}
