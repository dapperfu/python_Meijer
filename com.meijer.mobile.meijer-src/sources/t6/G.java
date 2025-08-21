package t6;

import java.io.IOException;
import u6.AbstractC17353c;
import w6.C17848d;

/* loaded from: classes4.dex */
public class G implements N<C17848d> {

    /* renamed from: a, reason: collision with root package name */
    public static final G f162281a = new G();

    private G() {
    }

    @Override // t6.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C17848d a(AbstractC17353c abstractC17353c, float f10) throws IOException {
        boolean z10;
        if (abstractC17353c.i() == AbstractC17353c.b.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            abstractC17353c.b();
        }
        float fNextDouble = (float) abstractC17353c.nextDouble();
        float fNextDouble2 = (float) abstractC17353c.nextDouble();
        while (abstractC17353c.hasNext()) {
            abstractC17353c.skipValue();
        }
        if (z10) {
            abstractC17353c.d();
        }
        return new C17848d((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
