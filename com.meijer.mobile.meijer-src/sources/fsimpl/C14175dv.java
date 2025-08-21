package fsimpl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: fsimpl.dv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C14175dv extends gm {
    public static C14175dv a(ByteBuffer byteBuffer) {
        return a(byteBuffer, new C14175dv());
    }

    public static C14175dv a(ByteBuffer byteBuffer, C14175dv c14175dv) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c14175dv.b(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public C14174du a() {
        return a(new C14174du());
    }

    public C14174du a(C14174du c14174du) {
        int iD = d(10);
        if (iD != 0) {
            return c14174du.b(e(iD + this.f133595a), this.f133596b);
        }
        return null;
    }

    public void a(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }

    public C14175dv b(int i10, ByteBuffer byteBuffer) {
        a(i10, byteBuffer);
        return this;
    }
}
