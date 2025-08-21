package fsimpl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class gh {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f133579o = true;

    /* renamed from: a, reason: collision with root package name */
    ByteBuffer f133580a;

    /* renamed from: b, reason: collision with root package name */
    int f133581b;

    /* renamed from: c, reason: collision with root package name */
    int f133582c;

    /* renamed from: d, reason: collision with root package name */
    int[] f133583d;

    /* renamed from: e, reason: collision with root package name */
    int f133584e;

    /* renamed from: f, reason: collision with root package name */
    boolean f133585f;

    /* renamed from: g, reason: collision with root package name */
    boolean f133586g;

    /* renamed from: h, reason: collision with root package name */
    int f133587h;

    /* renamed from: i, reason: collision with root package name */
    int[] f133588i;

    /* renamed from: j, reason: collision with root package name */
    int f133589j;

    /* renamed from: k, reason: collision with root package name */
    int f133590k;

    /* renamed from: l, reason: collision with root package name */
    boolean f133591l;

    /* renamed from: m, reason: collision with root package name */
    gi f133592m;

    /* renamed from: n, reason: collision with root package name */
    final gn f133593n;

    public gh() {
        this(1024);
    }

    public gh(int i10) {
        this(i10, gj.f133594a, null, gn.a());
    }

    public gh(int i10, gi giVar, ByteBuffer byteBuffer, gn gnVar) {
        this.f133582c = 1;
        this.f133583d = null;
        this.f133584e = 0;
        this.f133585f = false;
        this.f133586g = false;
        this.f133588i = new int[16];
        this.f133589j = 0;
        this.f133590k = 0;
        this.f133591l = false;
        i10 = i10 <= 0 ? 1024 : i10;
        this.f133592m = giVar;
        if (byteBuffer != null) {
            this.f133580a = byteBuffer;
            byteBuffer.clear();
            this.f133580a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f133580a = giVar.a(i10);
        }
        this.f133593n = gnVar;
        this.f133581b = this.f133580a.capacity();
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
        return this.f133580a.capacity() - this.f133581b;
    }

    public int a(CharSequence charSequence) {
        int iA = this.f133593n.a(charSequence);
        b((byte) 0);
        a(1, iA, 1);
        ByteBuffer byteBuffer = this.f133580a;
        int i10 = this.f133581b - iA;
        this.f133581b = i10;
        byteBuffer.position(i10);
        this.f133593n.a(charSequence, this.f133580a);
        return b();
    }

    public int a(byte[] bArr) {
        int length = bArr.length;
        a(1, length, 1);
        ByteBuffer byteBuffer = this.f133580a;
        int i10 = this.f133581b - length;
        this.f133581b = i10;
        byteBuffer.position(i10);
        this.f133580a.put(bArr);
        return b();
    }

    public void a(byte b10) {
        ByteBuffer byteBuffer = this.f133580a;
        int i10 = this.f133581b - 1;
        this.f133581b = i10;
        byteBuffer.put(i10, b10);
    }

    public void a(double d10) {
        ByteBuffer byteBuffer = this.f133580a;
        int i10 = this.f133581b - 8;
        this.f133581b = i10;
        byteBuffer.putDouble(i10, d10);
    }

    public void a(float f10) {
        ByteBuffer byteBuffer = this.f133580a;
        int i10 = this.f133581b - 4;
        this.f133581b = i10;
        byteBuffer.putFloat(i10, f10);
    }

    public void a(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBuffer = this.f133580a;
            int i12 = this.f133581b - 1;
            this.f133581b = i12;
            byteBuffer.put(i12, (byte) 0);
        }
    }

    public void a(int i10, byte b10, int i11) {
        if (this.f133591l || b10 != i11) {
            b(b10);
            g(i10);
        }
    }

    public void a(int i10, double d10, double d11) {
        if (this.f133591l || d10 != d11) {
            b(d10);
            g(i10);
        }
    }

    public void a(int i10, float f10, double d10) {
        if (this.f133591l || f10 != d10) {
            b(f10);
            g(i10);
        }
    }

    public void a(int i10, int i11) {
        if (i10 > this.f133582c) {
            this.f133582c = i10;
        }
        int iCapacity = ((((this.f133580a.capacity() - this.f133581b) + i11) ^ (-1)) + 1) & (i10 - 1);
        while (this.f133581b < iCapacity + i10 + i11) {
            int iCapacity2 = this.f133580a.capacity();
            ByteBuffer byteBuffer = this.f133580a;
            ByteBuffer byteBufferA = a(byteBuffer, this.f133592m);
            this.f133580a = byteBufferA;
            if (byteBuffer != byteBufferA) {
                this.f133592m.a(byteBuffer);
            }
            this.f133581b += this.f133580a.capacity() - iCapacity2;
        }
        a(iCapacity);
    }

    public void a(int i10, int i11, int i12) {
        c();
        this.f133590k = i11;
        int i13 = i10 * i11;
        a(4, i13);
        a(i12, i13);
        this.f133585f = true;
    }

    public void a(int i10, long j10, long j11) {
        if (this.f133591l || j10 != j11) {
            b(j10);
            g(i10);
        }
    }

    public void a(int i10, short s10, int i11) {
        if (this.f133591l || s10 != i11) {
            b(s10);
            g(i10);
        }
    }

    protected void a(int i10, boolean z10) {
        a(this.f133582c, (z10 ? 4 : 0) + 4);
        d(i10);
        if (z10) {
            c(this.f133580a.capacity() - this.f133581b);
        }
        this.f133580a.position(this.f133581b);
        this.f133586g = true;
    }

    public void a(int i10, boolean z10, boolean z11) {
        if (this.f133591l || z10 != z11) {
            b(z10);
            g(i10);
        }
    }

    public void a(long j10) {
        ByteBuffer byteBuffer = this.f133580a;
        int i10 = this.f133581b - 8;
        this.f133581b = i10;
        byteBuffer.putLong(i10, j10);
    }

    public void a(short s10) {
        ByteBuffer byteBuffer = this.f133580a;
        int i10 = this.f133581b - 2;
        this.f133581b = i10;
        byteBuffer.putShort(i10, s10);
    }

    public void a(boolean z10) {
        ByteBuffer byteBuffer = this.f133580a;
        int i10 = this.f133581b - 1;
        this.f133581b = i10;
        byteBuffer.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public int b() {
        if (!this.f133585f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f133585f = false;
        b(this.f133590k);
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
        ByteBuffer byteBuffer = this.f133580a;
        int i11 = this.f133581b - 4;
        this.f133581b = i11;
        byteBuffer.putInt(i11, i10);
    }

    public void b(int i10, int i11, int i12) {
        if (this.f133591l || i11 != i12) {
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
        this.f133591l = z10;
        return this;
    }

    public void c() {
        if (this.f133585f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public void c(int i10) {
        a(4, 0);
        b(i10);
    }

    public void c(int i10, int i11, int i12) {
        if (this.f133591l || i11 != i12) {
            d(i11);
            g(i10);
        }
    }

    public int d() {
        int i10;
        if (this.f133583d == null || !this.f133585f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        c(0);
        int iA = a();
        int i11 = this.f133584e - 1;
        while (i11 >= 0 && this.f133583d[i11] == 0) {
            i11--;
        }
        int i12 = i11 + 1;
        while (i11 >= 0) {
            int i13 = this.f133583d[i11];
            b((short) (i13 != 0 ? iA - i13 : 0));
            i11--;
        }
        b((short) (iA - this.f133587h));
        b((short) ((i12 + 2) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f133589j) {
                i10 = 0;
                break;
            }
            int iCapacity = this.f133580a.capacity() - this.f133588i[i14];
            int i15 = this.f133581b;
            short s10 = this.f133580a.getShort(iCapacity);
            if (s10 == this.f133580a.getShort(i15)) {
                for (int i16 = 2; i16 < s10; i16 += 2) {
                    if (this.f133580a.getShort(iCapacity + i16) != this.f133580a.getShort(i15 + i16)) {
                        break;
                    }
                }
                i10 = this.f133588i[i14];
                break loop2;
            }
            i14++;
        }
        if (i10 != 0) {
            int iCapacity2 = this.f133580a.capacity() - iA;
            this.f133581b = iCapacity2;
            this.f133580a.putInt(iCapacity2, i10 - iA);
        } else {
            int i17 = this.f133589j;
            int[] iArr = this.f133588i;
            if (i17 == iArr.length) {
                this.f133588i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f133588i;
            int i18 = this.f133589j;
            this.f133589j = i18 + 1;
            iArr2[i18] = a();
            ByteBuffer byteBuffer = this.f133580a;
            byteBuffer.putInt(byteBuffer.capacity() - iA, a() - iA);
        }
        this.f133585f = false;
        return iA;
    }

    public void d(int i10) {
        a(4, 0);
        if (!f133579o && i10 > a()) {
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
        int[] iArr = this.f133583d;
        if (iArr == null || iArr.length < i10) {
            this.f133583d = new int[i10];
        }
        this.f133584e = i10;
        Arrays.fill(this.f133583d, 0, i10, 0);
        this.f133585f = true;
        this.f133587h = a();
    }

    public void g(int i10) {
        this.f133583d[i10] = a();
    }

    public void h(int i10) {
        a(i10, false);
    }
}
