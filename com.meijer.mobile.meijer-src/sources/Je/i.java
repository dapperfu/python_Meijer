package Je;

import De.p;

/* loaded from: classes6.dex */
public final class i {
    public static byte a(long j10) {
        p.k((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int b(byte b10) {
        return b10 & 255;
    }
}
