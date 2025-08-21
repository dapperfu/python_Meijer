package t6;

import android.graphics.Color;
import java.io.IOException;
import u6.AbstractC17353c;

/* renamed from: t6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17194g implements N<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C17194g f162299a = new C17194g();

    private C17194g() {
    }

    @Override // t6.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(AbstractC17353c abstractC17353c, float f10) throws IOException {
        boolean z10;
        double dNextDouble;
        if (abstractC17353c.i() == AbstractC17353c.b.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            abstractC17353c.b();
        }
        double dNextDouble2 = abstractC17353c.nextDouble();
        double dNextDouble3 = abstractC17353c.nextDouble();
        double dNextDouble4 = abstractC17353c.nextDouble();
        if (abstractC17353c.i() == AbstractC17353c.b.NUMBER) {
            dNextDouble = abstractC17353c.nextDouble();
        } else {
            dNextDouble = 1.0d;
        }
        if (z10) {
            abstractC17353c.d();
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
