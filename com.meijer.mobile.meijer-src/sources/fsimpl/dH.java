package fsimpl;

import java.util.Arrays;

/* loaded from: classes15.dex */
public class dH {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f133265a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f133266b = new byte[256];

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f133267c = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f133268d = new byte[512];

    /* renamed from: e, reason: collision with root package name */
    private static byte f133269e;

    static {
        b((byte) 0, (byte) 0);
        b((byte) 1, (byte) 1);
        a((byte) 20, (byte) 2, (byte) 1);
        a(C14170dq.DARKEN, (byte) 2, (byte) 3);
        a((byte) 2, (byte) 3, (byte) 2);
        b((byte) 8, (byte) 2);
        b((byte) 21, (byte) 6);
        b((byte) 10, C14170dq.DST_ATOP);
        b(C14170dq.LIGHTEN, (byte) 9);
        b(C14170dq.MULTIPLY, (byte) 10);
        b((byte) 6, (byte) 8);
        b((byte) 7, (byte) 9);
        b((byte) 4, (byte) 8);
        b((byte) 5, (byte) 9);
        b((byte) 23, C14170dq.DARKEN);
        b((byte) 82, (byte) 1);
        b((byte) 81, (byte) 4);
        b((byte) 89, (byte) 2);
        a((byte) 80, (byte) 2, (byte) 2);
        a((byte) 86, (byte) 2, (byte) 4);
        b((byte) 88, (byte) 6);
        b((byte) 83, (byte) 4);
        b((byte) 84, (byte) 2);
        b((byte) 93, (byte) 6);
        b((byte) 94, (byte) 2);
        b((byte) 90, (byte) 2);
        b((byte) 91, (byte) 9);
        b((byte) 85, (byte) 2);
        b((byte) 95, (byte) 2);
        b((byte) 96, (byte) 2);
        a((byte) 97, (byte) 2, (byte) 5);
        b((byte) 87, C14170dq.DST_ATOP);
        b((byte) 92, (byte) 1);
        b((byte) 27, (byte) 2);
    }

    public static byte a(byte b10) {
        return f133266b[b10];
    }

    public static void a(byte b10, byte b11) {
        byte[] bArr = f133265a;
        if (bArr[b10] != b11) {
            throw new IllegalArgumentException("Expected a " + ((int) bArr[b10]) + " (was " + ((int) b11) + ")");
        }
    }

    private static void a(byte b10, byte b11, byte b12) {
        byte[] bArr = f133266b;
        byte b13 = f133269e;
        bArr[b10] = b13;
        f133265a[b10] = b11;
        f133267c[b13] = b10;
        if (b13 > 0) {
            byte[] bArr2 = f133268d;
            bArr2[(b13 - 1) * 2] = b10;
            bArr2[((b13 - 1) * 2) + 1] = (byte) (b11 | (b12 << 4));
        }
        f133269e = (byte) (b13 + 1);
    }

    public static byte[] a() {
        return Arrays.copyOf(f133268d, f133269e * 2);
    }

    private static void b(byte b10, byte b11) {
        a(b10, b11, (byte) 0);
    }
}
