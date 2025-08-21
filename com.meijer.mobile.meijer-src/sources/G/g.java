package G;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
final class g {

    /* renamed from: e, reason: collision with root package name */
    static final Charset f11081e = StandardCharsets.US_ASCII;

    /* renamed from: f, reason: collision with root package name */
    static final String[] f11082f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f11083g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h, reason: collision with root package name */
    static final byte[] f11084h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public final int f11085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11086b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11087c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11088d;

    g(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static g f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    g(int i10, int i11, long j10, byte[] bArr) {
        this.f11085a = i10;
        this.f11086b = i11;
        this.f11087c = j10;
        this.f11088d = bArr;
    }

    public static g b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f11083g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d10 : dArr) {
            byteBufferWrap.putDouble(d10);
        }
        return new g(12, dArr.length, byteBufferWrap.array());
    }

    public static g c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f11083g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putInt(i10);
        }
        return new g(9, iArr.length, byteBufferWrap.array());
    }

    public static g d(k[] kVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f11083g[10] * kVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (k kVar : kVarArr) {
            byteBufferWrap.putInt((int) kVar.b());
            byteBufferWrap.putInt((int) kVar.a());
        }
        return new g(10, kVarArr.length, byteBufferWrap.array());
    }

    public static g e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f11081e);
        return new g(2, bytes.length, bytes);
    }

    public static g g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f11083g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new g(4, jArr.length, byteBufferWrap.array());
    }

    public static g h(k[] kVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f11083g[5] * kVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (k kVar : kVarArr) {
            byteBufferWrap.putInt((int) kVar.b());
            byteBufferWrap.putInt((int) kVar.a());
        }
        return new g(5, kVarArr.length, byteBufferWrap.array());
    }

    public static g i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f11083g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putShort((short) i10);
        }
        return new g(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return f11083g[this.f11085a] * this.f11086b;
    }

    public String toString() {
        return "(" + f11082f[this.f11085a] + ", data length:" + this.f11088d.length + ")";
    }

    public static g a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new g(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f11081e);
        return new g(1, bytes.length, bytes);
    }
}
