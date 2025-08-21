package I2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class b extends c {
    public a j(a aVar, int i10) {
        int iB = b(6);
        if (iB != 0) {
            return aVar.f(a(d(iB) + (i10 * 4)), this.f14131b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f14131b.getInt(iB + this.f14130a);
        }
        return 0;
    }

    public static b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int i10, ByteBuffer byteBuffer) {
        g(i10, byteBuffer);
        return this;
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        c(i10, byteBuffer);
    }
}
