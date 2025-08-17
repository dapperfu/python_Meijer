package I3;

import a3.y;
import d3.C13466a;
import d3.D;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b extends G3.c {
    @Override // G3.c
    protected y b(G3.b bVar, ByteBuffer byteBuffer) {
        return new y(c(new D(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(D d10) {
        return new a((String) C13466a.e(d10.B()), (String) C13466a.e(d10.B()), d10.A(), d10.A(), Arrays.copyOfRange(d10.e(), d10.f(), d10.g()));
    }
}
