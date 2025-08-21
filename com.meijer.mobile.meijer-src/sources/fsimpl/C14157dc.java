package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.dc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C14157dc extends gm {
    public C14156db a(int i10) {
        return a(new C14156db(), i10);
    }

    public C14156db a(C14156db c14156db, int i10) {
        int iD = d(14);
        if (iD != 0) {
            return c14156db.b(e(h(iD) + (i10 * 4)), this.f133596b);
        }
        return null;
    }

    public String a() {
        int iD = d(4);
        if (iD != 0) {
            return f(iD + this.f133595a);
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

    public C14157dc b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public byte c() {
        int iD = d(8);
        if (iD != 0) {
            return this.f133596b.get(iD + this.f133595a);
        }
        return (byte) 0;
    }

    public byte d() {
        int iD = d(10);
        if (iD != 0) {
            return this.f133596b.get(iD + this.f133595a);
        }
        return (byte) 0;
    }

    public byte e() {
        int iD = d(12);
        if (iD != 0) {
            return this.f133596b.get(iD + this.f133595a);
        }
        return (byte) 0;
    }

    public int f() {
        int iD = d(14);
        if (iD != 0) {
            return g(iD);
        }
        return 0;
    }
}
