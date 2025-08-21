package fsimpl;

import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class cO extends gm {
    public int a() {
        int iD = d(4);
        if (iD != 0) {
            return this.f133596b.getShort(iD + this.f133595a) & 65535;
        }
        return 0;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public int b() {
        int iD = d(6);
        if (iD != 0) {
            return this.f133596b.getShort(iD + this.f133595a) & 65535;
        }
        return 0;
    }

    public cO b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public int c() {
        int iD = d(8);
        if (iD != 0) {
            return this.f133596b.getShort(iD + this.f133595a) & 65535;
        }
        return 0;
    }
}
