package s6;

import android.graphics.Color;
import java.io.IOException;
import t6.AbstractC17067c;

/* renamed from: s6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16896g implements InterfaceC16889N<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C16896g f160238a = new C16896g();

    private C16896g() {
    }

    @Override // s6.InterfaceC16889N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(AbstractC17067c abstractC17067c, float f10) throws IOException {
        boolean z10;
        double dNextDouble;
        if (abstractC17067c.i() == AbstractC17067c.b.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            abstractC17067c.b();
        }
        double dNextDouble2 = abstractC17067c.nextDouble();
        double dNextDouble3 = abstractC17067c.nextDouble();
        double dNextDouble4 = abstractC17067c.nextDouble();
        if (abstractC17067c.i() == AbstractC17067c.b.NUMBER) {
            dNextDouble = abstractC17067c.nextDouble();
        } else {
            dNextDouble = 1.0d;
        }
        if (z10) {
            abstractC17067c.d();
        }
        if (dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d && dNextDouble4 <= 1.0d) {
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            dNextDouble4 *= 255.0d;
            if (dNextDouble <= 1.0d) {
                dNextDouble *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3, (int) dNextDouble4));
    }
}
