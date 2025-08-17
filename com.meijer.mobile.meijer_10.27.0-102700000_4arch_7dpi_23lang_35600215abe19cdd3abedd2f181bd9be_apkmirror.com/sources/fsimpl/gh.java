package fsimpl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes14.dex */
public class gh {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f132329o = true;

    /* renamed from: a, reason: collision with root package name */
    ByteBuffer f132330a;

    /* renamed from: b, reason: collision with root package name */
    int f132331b;

    /* renamed from: c, reason: collision with root package name */
    int f132332c;

    /* renamed from: d, reason: collision with root package name */
    int[] f132333d;

    /* renamed from: e, reason: collision with root package name */
    int f132334e;

    /* renamed from: f, reason: collision with root package name */
    boolean f132335f;

    /* renamed from: g, reason: collision with root package name */
    boolean f132336g;

    /* renamed from: h, reason: collision with root package name */
    int f132337h;

    /* renamed from: i, reason: collision with root package name */
    int[] f132338i;

    /* renamed from: j, reason: collision with root package name */
    int f132339j;

    /* renamed from: k, reason: collision with root package name */
    int f132340k;

    /* renamed from: l, reason: collision with root package name */
    boolean f132341l;

    /* renamed from: m, reason: collision with root package name */
    gi f132342m;

    /* renamed from: n, reason: collision with root package name */
    final gn f132343n;

    public gh() {
        this(1024);
    }

    public gh(int i10) {
        this(i10, gj.f132344a, null, gn.a());
    }

    public gh(int i10, gi giVar, ByteBuffer byteBuffer, gn gnVar) {
        this.f132332c = 1;
        this.f132333d = null;
        this.f132334e = 0;
        this.f132335f = false;
        this.f132336g = false;
        this.f132338i = new int[16];
        this.f132339j = 0;
        this.f132340k = 0;
        this.f132341l = false;
        i10 = i10 <= 0 ? 1024 : i10;
        this.f132342m = giVar;
        if (byteBuffer != null) {
            this.f132330a = byteBuffer;
            byteBuffer.clear();
            this.f132330a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f132330a = giVar.a(i10);
        }
        this.f132343n = gnVar;
        this.f132331b = this.f132330a.capacity();
    }

    public gh(ByteBuffer byteBuffer) {
        this(byteBuffer, new gj());
    }

    public gh(ByteBuffer byteBuffer, gi giVar) {
        this(byteBuffer.capacity(), giVar, byteBuffer, gn.a());
    }

    static ByteBuffer a(ByteBuffer byteBuffer, gi giVar) {
        int i10;
        int iCapacity = byteBuffer.capacity();
        if (iCapacity == 0) {
            i10 = 1024;
        } else {
            i10 = 2147483639;
            if (iCapacity == 2147483639) {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
            if (((-1073741824) & iCapacity) == 0) {
                i10 = iCapacity << 1;
            }
        }
        byteBuffer.position(0);
        ByteBuffer byteBufferA = giVar.a(i10);
        byteBufferA.position(byteBufferA.clear().capacity() - iCapacity);
        byteBufferA.put(byteBuffer);
        return byteBufferA;
    }

    public int a() {
        return this.f132330a.capacity() - this.f132331b;
    }

    public int a(CharSequence charSequence) {
        int iA = this.f132343n.a(charSequence);
        b((byte) 0);
        a(1, iA, 1);
        ByteBuffer byteBuffer = this.f132330a;
        int i10 = this.f132331b - iA;
        this.f132331b = i10;
        byteBuffer.position(i10);
        this.f132343n.a(charSequence, this.f132330a);
        return b();
    }

    public int a(byte[] bArr) {
        int length = bArr.length;
        a(1, length, 1);
        ByteBuffer byteBuffer = this.f132330a;
        int i10 = this.f132331b - length;
        this.f132331b = i10;
        byteBuffer.position(i10);
        this.f132330a.put(bArr);
        return b();
    }

    public void a(byte b10) {
        ByteBuffer byteBuffer = this.f132330a;
        int i10 = this.f132331b - 1;
        this.f132331b = i10;
        byteBuffer.put(i10, b10);
    }

    public void a(double d10) {
        ByteBuffer byteBuffer = this.f132330a;
        int i10 = this.f132331b - 8;
        this.f132331b = i10;
        byteBuffer.putDouble(i10, d10);
    }

    public void a(float f10) {
        ByteBuffer byteBuffer = this.f132330a;
        int i10 = this.f132331b - 4;
        this.f132331b = i10;
        byteBuffer.putFloat(i10, f10);
    }

    public void a(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBuffer = this.f132330a;
            int i12 = this.f132331b - 1;
            this.f132331b = i12;
            byteBuffer.put(i12, (byte) 0);
        }
    }

    public void a(int i10, byte b10, int i11) {
        if (this.f132341l || b10 != i11) {
            b(b10);
            g(i10);
        }
    }

    public void a(int i10, double d10, double d11) {
        if (this.f132341l || d10 != d11) {
            b(d10);
            g(i10);
        }
    }

    public void a(int i10, float f10, double d10) {
        if (this.f132341l || f10 != d10) {
            b(f10);
            g(i10);
        }
    }

    public void a(int i10, int i11) {
        if (i10 > this.f132332c) {
            this.f132332c = i10;
        }
        int iCapacity = ((((this.f132330a.capacity() - this.f132331b) + i11) ^ (-1)) + 1) & (i10 - 1);
        while (this.f132331b < iCapacity + i10 + i11) {
            int iCapacity2 = this.f132330a.capacity();
            ByteBuffer byteBuffer = this.f132330a;
            ByteBuffer byteBufferA = a(byteBuffer, this.f132342m);
            this.f132330a = byteBufferA;
            if (byteBuffer != byteBufferA) {
                this.f132342m.a(byteBuffer);
            }
            this.f132331b += this.f132330a.capacity() - iCapacity2;
        }
        a(iCapacity);
    }

    public void a(int i10, int i11, int i12) {
        c();
        this.f132340k = i11;
        int i13 = i10 * i11;
        a(4, i13);
        a(i12, i13);
        this.f132335f = true;
    }

    public void a(int i10, long j10, long j11) {
        if (this.f132341l || j10 != j11) {
            b(j10);
            g(i10);
        }
    }

    public void a(int i10, short s10, int i11) {
        if (this.f132341l || s10 != i11) {
            b(s10);
            g(i10);
        }
    }

    protected void a(int i10, boolean z10) {
        a(this.f132332c, (z10 ? 4 : 0) + 4);
        d(i10);
        if (z10) {
            c(this.f132330a.capacity() - this.f132331b);
        }
        this.f132330a.position(this.f132331b);
        this.f132336g = true;
    }

    public void a(int i10, boolean z10, boolean z11) {
        if (this.f132341l || z10 != z11) {
            b(z10);
            g(i10);
        }
    }

    public void a(long j10) {
        ByteBuffer byteBuffer = this.f132330a;
        int i10 = this.f132331b - 8;
        this.f132331b = i10;
        byteBuffer.putLong(i10, j10);
    }

    public void a(short s10) {
        ByteBuffer byteBuffer = this.f132330a;
        int i10 = this.f132331b - 2;
        this.f132331b = i10;
        byteBuffer.putShort(i10, s10);
    }

    public void a(boolean z10) {
        ByteBuffer byteBuffer = this.f132330a;
        int i10 = this.f132331b - 1;
        this.f132331b = i10;
        byteBuffer.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public int b() {
        if (!this.f132335f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f132335f = false;
        b(this.f132340k);
        return a();
    }

    public void b(byte b10) {
        a(1, 0);
        a(b10);
    }

    public void b(double d10) {
        a(8, 0);
        a(d10);
    }

    public void b(float f10) {
        a(4, 0);
        a(f10);
    }

    public void b(int i10) {
        ByteBuffer byteBuffer = this.f132330a;
        int i11 = this.f132331b - 4;
        this.f132331b = i11;
        byteBuffer.putInt(i11, i10);
    }

    public void b(int i10, int i11, int i12) {
        if (this.f132341l || i11 != i12) {
            c(i11);
            g(i10);
        }
    }

    public void b(long j10) {
        a(8, 0);
        a(j10);
    }

    public void b(short s10) {
        a(2, 0);
        a(s10);
    }

    public void b(boolean z10) {
        a(1, 0);
        a(z10);
    }

    public gh c(boolean z10) {
        this.f132341l = z10;
        return this;
    }

    public void c() {
        if (this.f132335f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public void c(int i10) {
        a(4, 0);
        b(i10);
    }

    public void c(int i10, int i11, int i12) {
        if (this.f132341l || i11 != i12) {
            d(i11);
            g(i10);
        }
    }

    public int d() {
        int i10;
        if (this.f132333d == null || !this.f132335f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        c(0);
        int iA = a();
        int i11 = this.f132334e - 1;
        while (i11 >= 0 && this.f132333d[i11] == 0) {
            i11--;
        }
        int i12 = i11 + 1;
        while (i11 >= 0) {
            int i13 = this.f132333d[i11];
            b((short) (i13 != 0 ? iA - i13 : 0));
            i11--;
        }
        b((short) (iA - this.f132337h));
        b((short) ((i12 + 2) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f132339j) {
                i10 = 0;
                break;
            }
            int iCapacity = this.f132330a.capacity() - this.f132338i[i14];
            int i15 = this.f132331b;
            short s10 = this.f132330a.getShort(iCapacity);
            if (s10 == this.f132330a.getShort(i15)) {
                for (int i16 = 2; i16 < s10; i16 += 2) {
                    if (this.f132330a.getShort(iCapacity + i16) != this.f132330a.getShort(i15 + i16)) {
                        break;
                    }
                }
                i10 = this.f132338i[i14];
                break loop2;
            }
            i14++;
        }
        if (i10 != 0) {
            int iCapacity2 = this.f132330a.capacity() - iA;
            this.f132331b = iCapacity2;
            this.f132330a.putInt(iCapacity2, i10 - iA);
        } else {
            int i17 = this.f132339j;
            int[] iArr = this.f132338i;
            if (i17 == iArr.length) {
                this.f132338i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f132338i;
            int i18 = this.f132339j;
            this.f132339j = i18 + 1;
            iArr2[i18] = a();
            ByteBuffer byteBuffer = this.f132330a;
            byteBuffer.putInt(byteBuffer.capacity() - iA, a() - iA);
        }
        this.f132335f = false;
        return iA;
    }

    public void d(int i10) {
        a(4, 0);
        if (!f132329o && i10 > a()) {
            throw new AssertionError();
        }
        b((a() - i10) + 4);
    }

    public void d(int i10, int i11, int i12) {
        if (i11 != i12) {
            e(i11);
            g(i10);
        }
    }

    public void e(int i10) {
        if (i10 != a()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void f(int i10) {
        c();
        int[] iArr = this.f132333d;
        if (iArr == null || iArr.length < i10) {
            this.f132333d = new int[i10];
        }
        this.f132334e = i10;
        Arrays.fill(this.f132333d, 0, i10, 0);
        this.f132335f = true;
        this.f132337h = a();
    }

    public void g(int i10) {
        this.f132333d[i10] = a();
    }

    public void h(int i10) {
        a(i10, false);
    }
}
