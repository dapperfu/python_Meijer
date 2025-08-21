package fsimpl;

import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class cJ extends gm {
    public cG a(cG cGVar, int i10) {
        int iD = d(14);
        if (iD != 0) {
            return cGVar.b(e(h(iD) + (i10 * 4)), this.f133596b);
        }
        return null;
    }

    public cJ a() {
        return a(new cJ());
    }

    public cJ a(cJ cJVar) {
        int iD = d(4);
        if (iD != 0) {
            return cJVar.b(e(iD + this.f133595a), this.f133596b);
        }
        return null;
    }

    public String a(int i10) {
        int iD = d(12);
        if (iD != 0) {
            return f(h(iD) + (i10 * 4));
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public byte b() {
        int iD = d(6);
        if (iD != 0) {
            return this.f133596b.get(iD + this.f133595a);
        }
        return (byte) 0;
    }

    public cG b(int i10) {
        return a(new cG(), i10);
    }

    public cJ b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public String c() {
        int iD = d(8);
        if (iD != 0) {
            return f(iD + this.f133595a);
        }
        return null;
    }

    public String d() {
        int iD = d(10);
        if (iD != 0) {
            return f(iD + this.f133595a);
        }
        return null;
    }

    public int e() {
        int iD = d(12);
        if (iD != 0) {
            return g(iD);
        }
        return 0;
    }

    public int f() {
        int iD = d(14);
        if (iD != 0) {
            return g(iD);
        }
        return 0;
    }
}
