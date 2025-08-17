package j$.desugar.sun.nio.fs;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final long f138589a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f138590b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f138591c;

    public static long d(String str) {
        int length = str.length();
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '@') {
                j10 |= 1 << cCharAt;
            }
        }
        return j10;
    }

    public static long c(String str) {
        int length = str.length();
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '@' && cCharAt < 128) {
                j10 |= 1 << (cCharAt - '@');
            }
        }
        return j10;
    }

    static {
        long j10 = 0;
        for (int iMax = Math.max(Math.min(48, 63), 0); iMax <= Math.max(Math.min(57, 63), 0); iMax++) {
            j10 |= 1 << iMax;
        }
        long jB = b('A', 'Z') | b('a', 'z');
        long jD = d("-_.!~*'()");
        long jC = jB | c("-_.!~*'()");
        long jD2 = j10 | jD | d(":@&=+$,");
        long jC2 = jC | c(":@&=+$,");
        f138589a = jD2 | d(";/");
        f138590b = jC2 | c(";/");
        f138591c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static long b(char c10, char c11) {
        long j10 = 0;
        for (int iMax = Math.max(Math.min((int) c10, l3.f92485d), 64) - 64; iMax <= Math.max(Math.min((int) c11, l3.f92485d), 64) - 64; iMax++) {
            j10 |= 1 << iMax;
        }
        return j10;
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            throw new AssertionError();
        }
        return c10 - '7';
    }
}
