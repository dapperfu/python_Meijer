package I2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends c {
    public boolean j() {
        int iB = b(6);
        return (iB == 0 || this.f13458b.get(iB + this.f13457a) == 0) ? false : true;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f13458b.getInt(iB + this.f13457a);
        }
        return 0;
    }

    public int h(int i10) {
        int iB = b(16);
        if (iB != 0) {
            return this.f13458b.getInt(d(iB) + (i10 * 4));
        }
        return 0;
    }

    public int i() {
        int iB = b(16);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public short k() {
        int iB = b(14);
        if (iB != 0) {
            return this.f13458b.getShort(iB + this.f13457a);
        }
        return (short) 0;
    }

    public short m() {
        int iB = b(8);
        if (iB != 0) {
            return this.f13458b.getShort(iB + this.f13457a);
        }
        return (short) 0;
    }

    public short n() {
        int iB = b(12);
        if (iB != 0) {
            return this.f13458b.getShort(iB + this.f13457a);
        }
        return (short) 0;
    }

    public a f(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
        return this;
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }
}
