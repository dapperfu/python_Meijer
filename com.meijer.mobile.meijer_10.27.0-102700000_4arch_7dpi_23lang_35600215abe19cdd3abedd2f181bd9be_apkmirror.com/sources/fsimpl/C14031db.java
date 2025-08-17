package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.db, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14031db extends gm {
    public cJ a() {
        return a(new cJ());
    }

    public cJ a(cJ cJVar) {
        int iD = d(4);
        if (iD != 0) {
            return cJVar.b(e(iD + this.f132345a), this.f132346b);
        }
        return null;
    }

    public cO a(cO cOVar) {
        int iD = d(6);
        if (iD != 0) {
            return cOVar.b(e(iD + this.f132345a), this.f132346b);
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
            return cOVar.b(e(iD + this.f132345a), this.f132346b);
        }
        return null;
    }

    public C14031db b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public cO c() {
        return b(new cO());
    }
}
