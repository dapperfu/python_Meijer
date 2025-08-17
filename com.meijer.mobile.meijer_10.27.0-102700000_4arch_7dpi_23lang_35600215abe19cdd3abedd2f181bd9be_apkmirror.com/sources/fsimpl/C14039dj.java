package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.dj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14039dj extends gm {
    public cJ a(cJ cJVar) {
        int iD = d(8);
        if (iD != 0) {
            return cJVar.b(e(iD + this.f132345a), this.f132346b);
        }
        return null;
    }

    public short a() {
        int iD = d(4);
        if (iD != 0) {
            return this.f132346b.getShort(iD + this.f132345a);
        }
        return (short) 0;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public cJ b() {
        return a(new cJ());
    }

    public C14039dj b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public byte c() {
        int iD = d(12);
        if (iD != 0) {
            return this.f132346b.get(iD + this.f132345a);
        }
        return (byte) 0;
    }
}
