package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.du, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C14174du extends gm {
    public C14155da a(C14155da c14155da) {
        int iD = d(16);
        if (iD != 0) {
            return c14155da.b(e(iD + this.f133595a), this.f133596b);
        }
        return null;
    }

    public C14171dr a() {
        return a(new C14171dr());
    }

    public C14171dr a(C14171dr c14171dr) {
        int iD = d(10);
        if (iD != 0) {
            return c14171dr.b(e(iD + this.f133595a), this.f133596b);
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public C14155da b() {
        return a(new C14155da());
    }

    public C14174du b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public boolean c() {
        int iD = d(24);
        return (iD == 0 || this.f133596b.get(iD + this.f133595a) == 0) ? false : true;
    }
}
