package fsimpl;

import java.nio.ByteBuffer;

/* renamed from: fsimpl.du, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14049du extends gm {
    public C14030da a(C14030da c14030da) {
        int iD = d(16);
        if (iD != 0) {
            return c14030da.b(e(iD + this.f132345a), this.f132346b);
        }
        return null;
    }

    public C14046dr a() {
        return a(new C14046dr());
    }

    public C14046dr a(C14046dr c14046dr) {
        int iD = d(10);
        if (iD != 0) {
            return c14046dr.b(e(iD + this.f132345a), this.f132346b);
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public C14030da b() {
        return a(new C14030da());
    }

    public C14049du b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }

    public boolean c() {
        int iD = d(24);
        return (iD == 0 || this.f132346b.get(iD + this.f132345a) == 0) ? false : true;
    }
}
