package s6;

import android.graphics.PointF;
import java.io.IOException;
import t6.AbstractC17067c;

/* renamed from: s6.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16877B implements InterfaceC16889N<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final C16877B f160215a = new C16877B();

    private C16877B() {
    }

    @Override // s6.InterfaceC16889N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(AbstractC17067c abstractC17067c, float f10) throws IOException {
        AbstractC17067c.b bVarI = abstractC17067c.i();
        if (bVarI == AbstractC17067c.b.BEGIN_ARRAY) {
            return C16908s.e(abstractC17067c, f10);
        }
        if (bVarI == AbstractC17067c.b.BEGIN_OBJECT) {
            return C16908s.e(abstractC17067c, f10);
        }
        if (bVarI == AbstractC17067c.b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC17067c.nextDouble()) * f10, ((float) abstractC17067c.nextDouble()) * f10);
            while (abstractC17067c.hasNext()) {
                abstractC17067c.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarI);
    }
}
