package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.da, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C14155da extends gm {
    public cF a(int i10) {
        return a(new cF(), i10);
    }

    public cF a(cF cFVar, int i10) {
        int iD = d(30);
        if (iD != 0) {
            return cFVar.b(e(h(iD) + (i10 * 4)), this.f133596b);
        }
        return null;
    }

    public C14157dc a(C14157dc c14157dc, int i10) {
        int iD = d(54);
        if (iD != 0) {
            return c14157dc.b(e(h(iD) + (i10 * 4)), this.f133596b);
        }
        return null;
    }

    public C14164dj a(C14164dj c14164dj, int i10) {
        int iD = d(40);
        if (iD != 0) {
            return c14164dj.b(e(h(iD) + (i10 * 4)), this.f133596b);
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public boolean a() {
        int iD = d(4);
        return (iD == 0 || this.f133596b.get(iD + this.f133595a) == 0) ? false : true;
    }

    public int b() {
        int iD = d(6);
        if (iD != 0) {
            return this.f133596b.getInt(iD + this.f133595a);
        }
        return 0;
    }

    public C14155da b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public C14164dj b(int i10) {
        return a(new C14164dj(), i10);
    }

    public int c() {
        int iD = d(8);
        if (iD != 0) {
            return this.f133596b.getInt(iD + this.f133595a);
        }
        return 0;
    }

    public C14157dc c(int i10) {
        return a(new C14157dc(), i10);
    }

    public int d() {
        int iD = d(12);
        if (iD != 0) {
            return this.f133596b.getInt(iD + this.f133595a);
        }
        return 0;
    }

    public boolean e() {
        int iD = d(28);
        return (iD == 0 || this.f133596b.get(iD + this.f133595a) == 0) ? false : true;
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
        return (iD == 0 || this.f133596b.get(iD + this.f133595a) == 0) ? false : true;
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
        return (iD == 0 || this.f133596b.get(iD + this.f133595a) == 0) ? false : true;
    }

    public byte j() {
        int iD = d(46);
        if (iD != 0) {
            return this.f133596b.get(iD + this.f133595a);
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
        return (iD == 0 || this.f133596b.get(iD + this.f133595a) == 0) ? false : true;
    }
}
