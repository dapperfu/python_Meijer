package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.da, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14030da extends gm {
    public cF a(int i10) {
        return a(new cF(), i10);
    }

    public cF a(cF cFVar, int i10) {
        int iD = d(30);
        if (iD != 0) {
            return cFVar.b(e(h(iD) + (i10 * 4)), this.f132346b);
        }
        return null;
    }

    public C14032dc a(C14032dc c14032dc, int i10) {
        int iD = d(54);
        if (iD != 0) {
            return c14032dc.b(e(h(iD) + (i10 * 4)), this.f132346b);
        }
        return null;
    }

    public C14039dj a(C14039dj c14039dj, int i10) {
        int iD = d(40);
        if (iD != 0) {
            return c14039dj.b(e(h(iD) + (i10 * 4)), this.f132346b);
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public boolean a() {
        int iD = d(4);
        return (iD == 0 || this.f132346b.get(iD + this.f132345a) == 0) ? false : true;
    }

    public int b() {
        int iD = d(6);
        if (iD != 0) {
            return this.f132346b.getInt(iD + this.f132345a);
        }
        return 0;
    }

    public C14030da b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public C14039dj b(int i10) {
        return a(new C14039dj(), i10);
    }

    public int c() {
        int iD = d(8);
        if (iD != 0) {
            return this.f132346b.getInt(iD + this.f132345a);
        }
        return 0;
    }

    public C14032dc c(int i10) {
        return a(new C14032dc(), i10);
    }

    public int d() {
        int iD = d(12);
        if (iD != 0) {
            return this.f132346b.getInt(iD + this.f132345a);
        }
        return 0;
    }

    public boolean e() {
        int iD = d(28);
        return (iD == 0 || this.f132346b.get(iD + this.f132345a) == 0) ? false : true;
    }

    public int f() {
        int iD = d(30);
        if (iD != 0) {
            return g(iD);
        }
        return 0;
    }

    public boolean g() {
        int iD = d(36);
        return (iD == 0 || this.f132346b.get(iD + this.f132345a) == 0) ? false : true;
    }

    public int h() {
        int iD = d(40);
        if (iD != 0) {
            return g(iD);
        }
        return 0;
    }

    public boolean i() {
        int iD = d(42);
        return (iD == 0 || this.f132346b.get(iD + this.f132345a) == 0) ? false : true;
    }

    public byte j() {
        int iD = d(46);
        if (iD != 0) {
            return this.f132346b.get(iD + this.f132345a);
        }
        return (byte) 0;
    }

    public int k() {
        int iD = d(54);
        if (iD != 0) {
            return g(iD);
        }
        return 0;
    }

    public boolean l() {
        int iD = d(58);
        return (iD == 0 || this.f132346b.get(iD + this.f132345a) == 0) ? false : true;
    }
}
