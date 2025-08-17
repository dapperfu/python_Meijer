package fsimpl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: fsimpl.dv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14050dv extends gm {
    public static C14050dv a(ByteBuffer byteBuffer) {
        return a(byteBuffer, new C14050dv());
    }

    public static C14050dv a(ByteBuffer byteBuffer, C14050dv c14050dv) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c14050dv.b(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public C14049du a() {
        return a(new C14049du());
    }

    public C14049du a(C14049du c14049du) {
        int iD = d(10);
        if (iD != 0) {
            return c14049du.b(e(iD + this.f132345a), this.f132346b);
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public C14050dv b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }
}
