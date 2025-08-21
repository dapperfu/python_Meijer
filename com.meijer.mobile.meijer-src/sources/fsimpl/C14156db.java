package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.db, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C14156db extends gm {
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

    public cO a(cO cOVar) {
        int iD = d(6);
        if (iD != 0) {
            return cOVar.b(e(iD + this.f133595a), this.f133596b);
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public cO b() {
        return a(new cO());
    }

    public cO b(cO cOVar) {
        int iD = d(8);
        if (iD != 0) {
            return cOVar.b(e(iD + this.f133595a), this.f133596b);
        }
        return null;
    }

    public C14156db b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public cO c() {
        return b(new cO());
    }
}
