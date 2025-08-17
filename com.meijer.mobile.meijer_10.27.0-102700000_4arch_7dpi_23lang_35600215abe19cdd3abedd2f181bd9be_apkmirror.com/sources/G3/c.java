package G3;

import a3.y;
import d3.C13466a;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class c implements a {
    protected abstract y b(b bVar, ByteBuffer byteBuffer);

    @Override // G3.a
    public final y a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C13466a.e(bVar.f55465d);
        C13466a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }
}
