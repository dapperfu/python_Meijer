package fsimpl;

import com.medallia.digital.mobilesdk.l3;
import java.nio.ByteBuffer;

/* loaded from: classes14.dex */
public class dG {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f132013a;

    /* renamed from: b, reason: collision with root package name */
    private int f132014b;

    public dG(ByteBuffer byteBuffer) {
        this.f132013a = byteBuffer;
        a();
    }

    private void a(byte b10) {
        dH.a(b10, (byte) 1);
        b(b10);
    }

    private void a(byte b10, float f10) {
        if (f10 == 0.0f) {
            return;
        }
        dH.a(b10, (byte) 6);
        b(b10);
        e(f10);
    }

    private void a(byte b10, int i10) {
        dH.a(b10, (byte) 0);
        b(b10);
        t(i10);
    }

    private void a(byte b10, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        dH.a(b10, (byte) 9);
        b(b10);
        u(i10);
        u(i11);
    }

    private void a(byte b10, int i10, int i11, int i12, int i13) {
        dH.a(b10, (byte) 8);
        b(b10);
        u(i10);
        u(i11);
        u(i12);
        u(i13);
    }

    private void a(byte b10, long j10) {
        if (j10 == 0) {
            return;
        }
        dH.a(b10, C14045dq.DARKEN);
        b(b10);
        b(j10);
    }

    private void b(byte b10) {
        if (this.f132013a.position() != 0) {
            c(dH.a(b10));
        } else if (b10 != 0) {
            throw new IllegalStateException("First token written must be OP");
        }
    }

    private void b(byte b10, int i10) {
        if (i10 == 0) {
            return;
        }
        dH.a(b10, (byte) 2);
        b(b10);
        t(i10);
    }

    private void b(long j10) {
        s((int) (4294967295L & j10));
        s((int) (j10 >> 32));
    }

    private void c(byte b10) {
        this.f132013a.put(b10);
    }

    private void c(byte b10, int i10) {
        if (i10 == 0) {
            return;
        }
        dH.a(b10, (byte) 3);
        b(b10);
        u(i10);
    }

    private void d(byte b10, int i10) {
        byte b11;
        byte b12;
        if (i10 == 0) {
            return;
        }
        dH.a(b10, (byte) 4);
        b(b10);
        boolean z10 = false;
        if (i10 == this.f132014b) {
            c((byte) 0);
            return;
        }
        if (i10 == -16777216) {
            c((byte) 1);
            return;
        }
        if (i10 == -1) {
            b12 = 2;
        } else {
            int i11 = (i10 >> 24) & l3.f92484c;
            int i12 = (i10 >> 16) & l3.f92484c;
            int i13 = (i10 >> 8) & l3.f92484c;
            int i14 = i10 & l3.f92484c;
            if (i12 == i13 && i13 == i14) {
                z10 = true;
            }
            this.f132014b = i10;
            if (i11 == 255) {
                if (z10) {
                    b11 = 3;
                    c(b11);
                    b12 = (byte) i12;
                } else {
                    c((byte) 4);
                    c((byte) i12);
                    c((byte) i13);
                    b12 = (byte) i14;
                }
            } else if (!z10) {
                if (i11 <= 7) {
                    c((byte) 7);
                }
                c((byte) i11);
                c((byte) i12);
                c((byte) i13);
                b12 = (byte) i14;
            } else if (i12 == 0) {
                c((byte) 5);
                b12 = (byte) i11;
            } else {
                c((byte) 6);
                b11 = (byte) i11;
                c(b11);
                b12 = (byte) i12;
            }
        }
        c(b12);
    }

    private void d(float f10) {
        byte b10;
        int iFloatToIntBits = Float.floatToIntBits(f10);
        if (iFloatToIntBits == 0) {
            b10 = Byte.MAX_VALUE;
        } else if (iFloatToIntBits == 1065353216) {
            b10 = -1;
        } else if (iFloatToIntBits == -1082130432) {
            b10 = -2;
        } else {
            if ((65535 & iFloatToIntBits) == 0) {
                c((byte) 126);
                c((byte) (iFloatToIntBits >> 24));
                iFloatToIntBits >>= 16;
            } else {
                c((byte) (iFloatToIntBits >> 24));
                c((byte) (iFloatToIntBits >> 16));
                c((byte) (iFloatToIntBits >> 8));
            }
            b10 = (byte) iFloatToIntBits;
        }
        c(b10);
    }

    private void e(float f10) {
        u((int) (f10 * 256.0f));
    }

    private static int r(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    private void s(int i10) {
        c((byte) (i10 & l3.f92484c));
        int i11 = i10 >> 8;
        c((byte) (i11 & l3.f92484c));
        int i12 = i11 >> 8;
        c((byte) (i12 & l3.f92484c));
        c((byte) ((i12 >> 8) & l3.f92484c));
    }

    private void t(int i10) {
        while ((i10 & (-128)) != 0) {
            c((byte) ((i10 & l3.f92485d) | 128));
            i10 >>>= 7;
        }
        c((byte) i10);
    }

    private void u(int i10) {
        t(r(i10));
    }

    public void a() {
        this.f132013a.clear();
        this.f132014b = -1728053248;
    }

    public void a(byte b10, float[] fArr) {
        dH.a(b10, C14045dq.DST_ATOP);
        b(b10);
        for (float f10 : fArr) {
            d(f10);
        }
    }

    public void a(float f10) {
        a((byte) 21, f10);
    }

    public void a(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        b(C14045dq.MULTIPLY);
        d(f10);
        d(f11);
    }

    public void a(float f10, float f11, float f12, float f13) {
        a((int) f10, (int) f11, (int) f12, (int) f13);
    }

    public void a(int i10) {
        b((byte) 20, i10);
    }

    public void a(int i10, int i11) {
        a(C14045dq.LIGHTEN, i10, i11);
    }

    public void a(int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i10 == 0 && i11 == 0) {
            a((byte) 7, i14, i15);
        } else {
            a((byte) 6, i10, i11, i14, i15);
        }
    }

    public void a(long j10) {
        a((byte) 23, j10);
    }

    public void a(short s10) {
        a((byte) 0, (int) s10);
    }

    public void a(float[] fArr) {
        a((byte) 87, fArr);
    }

    public ByteBuffer b() {
        return this.f132013a;
    }

    public void b(float f10) {
        a((byte) 88, f10);
    }

    public void b(float f10, float f11, float f12, float f13) {
        b((int) f10, (int) f11, (int) f12, (int) f13);
    }

    public void b(int i10) {
        b(C14045dq.DARKEN, i10);
    }

    public void b(int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i10 == 0 && i11 == 0) {
            a((byte) 5, i14, i15);
        } else {
            a((byte) 4, i10, i11, i14, i15);
        }
    }

    public void c() {
        ByteBuffer byteBuffer = this.f132013a;
        byteBuffer.limit(byteBuffer.position());
        this.f132013a.position(0);
    }

    public void c(float f10) {
        a((byte) 93, f10);
    }

    public void c(int i10) {
        b((byte) 27, i10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        a((byte) 91, i12 - i10, i13 - i11);
    }

    public void d() {
        a((byte) 82);
    }

    public void d(int i10) {
        c((byte) 2, i10);
    }

    public void e() {
        a((byte) 92);
    }

    public void e(int i10) {
        b((byte) 8, i10);
    }

    public void f(int i10) {
        d((byte) 81, i10);
    }

    public boolean f() {
        return this.f132013a.remaining() < 256;
    }

    public void g(int i10) {
        b((byte) 89, i10);
    }

    public void h(int i10) {
        b((byte) 80, i10);
    }

    public void i(int i10) {
        b((byte) 86, i10);
    }

    public void j(int i10) {
        d((byte) 83, i10);
    }

    public void k(int i10) {
        b((byte) 84, i10);
    }

    public void l(int i10) {
        b((byte) 94, i10);
    }

    public void m(int i10) {
        b((byte) 90, i10);
    }

    public void n(int i10) {
        b((byte) 85, i10);
    }

    public void o(int i10) {
        b((byte) 95, i10);
    }

    public void p(int i10) {
        b((byte) 96, i10);
    }

    public void q(int i10) {
        b((byte) 97, i10);
    }
}
