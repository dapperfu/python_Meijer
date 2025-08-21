package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.dj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C14164dj extends gm {
    public cJ a(cJ cJVar) {
        int iD = d(8);
        if (iD != 0) {
            return cJVar.b(e(iD + this.f133595a), this.f133596b);
        }
        return null;
    }

    public short a() {
        int iD = d(4);
        if (iD != 0) {
            return this.f133596b.getShort(iD + this.f133595a);
        }
        return (short) 0;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public cJ b() {
        return a(new cJ());
    }

    public C14164dj b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public byte c() {
        int iD = d(12);
        if (iD != 0) {
            return this.f133596b.get(iD + this.f133595a);
        }
        return (byte) 0;
    }
}
