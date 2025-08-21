package fsimpl;

import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class cF extends gm {
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

    public cF b(int i10, ByteBuffer byteBuffer) {
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
}
