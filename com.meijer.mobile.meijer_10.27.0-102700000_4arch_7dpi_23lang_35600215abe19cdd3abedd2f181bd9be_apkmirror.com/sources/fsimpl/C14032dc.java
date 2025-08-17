package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.dc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14032dc extends gm {
    public C14031db a(int i10) {
        return a(new C14031db(), i10);
    }

    public C14031db a(C14031db c14031db, int i10) {
        int iD = d(14);
        if (iD != 0) {
            return c14031db.b(e(h(iD) + (i10 * 4)), this.f132346b);
        }
        return null;
    }

    public String a() {
        int iD = d(4);
        if (iD != 0) {
            return f(iD + this.f132345a);
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public byte b() {
        int iD = d(6);
        if (iD != 0) {
            return this.f132346b.get(iD + this.f132345a);
        }
        return (byte) 0;
    }

    public C14032dc b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public byte c() {
        int iD = d(8);
        if (iD != 0) {
            return this.f132346b.get(iD + this.f132345a);
        }
        return (byte) 0;
    }

    public byte d() {
        int iD = d(10);
        if (iD != 0) {
            return this.f132346b.get(iD + this.f132345a);
        }
        return (byte) 0;
    }

    public byte e() {
        int iD = d(12);
        if (iD != 0) {
            return this.f132346b.get(iD + this.f132345a);
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
