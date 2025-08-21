package t6;

import android.graphics.PointF;
import java.io.IOException;
import u6.AbstractC17353c;

/* renamed from: t6.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17187B implements N<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final C17187B f162276a = new C17187B();

    private C17187B() {
    }

    @Override // t6.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(AbstractC17353c abstractC17353c, float f10) throws IOException {
        AbstractC17353c.b bVarI = abstractC17353c.i();
        if (bVarI == AbstractC17353c.b.BEGIN_ARRAY) {
            return s.e(abstractC17353c, f10);
        }
        if (bVarI == AbstractC17353c.b.BEGIN_OBJECT) {
            return s.e(abstractC17353c, f10);
        }
        if (bVarI == AbstractC17353c.b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC17353c.nextDouble()) * f10, ((float) abstractC17353c.nextDouble()) * f10);
            while (abstractC17353c.hasNext()) {
                abstractC17353c.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarI);
    }
}
