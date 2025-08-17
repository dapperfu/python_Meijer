package s6;

import java.io.IOException;
import t6.AbstractC17067c;
import v6.C17515d;

/* renamed from: s6.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16882G implements InterfaceC16889N<C17515d> {

    /* renamed from: a, reason: collision with root package name */
    public static final C16882G f160220a = new C16882G();

    private C16882G() {
    }

    @Override // s6.InterfaceC16889N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C17515d a(AbstractC17067c abstractC17067c, float f10) throws IOException {
        boolean z10;
        if (abstractC17067c.i() == AbstractC17067c.b.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            abstractC17067c.b();
        }
        float fNextDouble = (float) abstractC17067c.nextDouble();
        float fNextDouble2 = (float) abstractC17067c.nextDouble();
        while (abstractC17067c.hasNext()) {
            abstractC17067c.skipValue();
        }
        if (z10) {
            abstractC17067c.d();
        }
        return new C17515d((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
