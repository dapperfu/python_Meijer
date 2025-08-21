package iv;

/* renamed from: iv.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C14853c {
    public static /* synthetic */ long a(long j10, long j11) {
        if (j11 < 0) {
            return (j10 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE) ? j10 : j10 - j11;
        }
        if (j10 >= 0) {
            return j10 % j11;
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if ((j12 ^ Long.MIN_VALUE) < (j11 ^ Long.MIN_VALUE)) {
            j11 = 0;
        }
        return j12 - j11;
    }
}
