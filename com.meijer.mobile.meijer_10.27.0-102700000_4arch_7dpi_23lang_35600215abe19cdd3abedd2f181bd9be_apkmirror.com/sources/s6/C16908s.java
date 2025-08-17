package s6;

import android.graphics.Color;
import android.graphics.PointF;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import t6.AbstractC17067c;

/* renamed from: s6.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16908s {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC17067c.a f160265a = AbstractC17067c.a.a("x", "y");

    /* renamed from: s6.s$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f160266a;

        static {
            int[] iArr = new int[AbstractC17067c.b.values().length];
            f160266a = iArr;
            try {
                iArr[AbstractC17067c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f160266a[AbstractC17067c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f160266a[AbstractC17067c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static PointF e(AbstractC17067c abstractC17067c, float f10) throws IOException {
        int i10 = a.f160266a[abstractC17067c.i().ordinal()];
        if (i10 == 1) {
            return b(abstractC17067c, f10);
        }
        if (i10 == 2) {
            return a(abstractC17067c, f10);
        }
        if (i10 == 3) {
            return c(abstractC17067c, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + abstractC17067c.i());
    }

    static List<PointF> f(AbstractC17067c abstractC17067c, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC17067c.b();
        while (abstractC17067c.i() == AbstractC17067c.b.BEGIN_ARRAY) {
            abstractC17067c.b();
            arrayList.add(e(abstractC17067c, f10));
            abstractC17067c.d();
        }
        abstractC17067c.d();
        return arrayList;
    }

    private static PointF a(AbstractC17067c abstractC17067c, float f10) throws IOException {
        abstractC17067c.b();
        float fNextDouble = (float) abstractC17067c.nextDouble();
        float fNextDouble2 = (float) abstractC17067c.nextDouble();
        while (abstractC17067c.i() != AbstractC17067c.b.END_ARRAY) {
            abstractC17067c.skipValue();
        }
        abstractC17067c.d();
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF b(AbstractC17067c abstractC17067c, float f10) throws IOException {
        float fNextDouble = (float) abstractC17067c.nextDouble();
        float fNextDouble2 = (float) abstractC17067c.nextDouble();
        while (abstractC17067c.hasNext()) {
            abstractC17067c.skipValue();
        }
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF c(AbstractC17067c abstractC17067c, float f10) throws IOException {
        abstractC17067c.c();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (abstractC17067c.hasNext()) {
            int iL = abstractC17067c.l(f160265a);
            if (iL != 0) {
                if (iL != 1) {
                    abstractC17067c.m();
                    abstractC17067c.skipValue();
                } else {
                    fG2 = g(abstractC17067c);
                }
            } else {
                fG = g(abstractC17067c);
            }
        }
        abstractC17067c.g();
        return new PointF(fG * f10, fG2 * f10);
    }

    static int d(AbstractC17067c abstractC17067c) throws IOException {
        abstractC17067c.b();
        int iNextDouble = (int) (abstractC17067c.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (abstractC17067c.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (abstractC17067c.nextDouble() * 255.0d);
        while (abstractC17067c.hasNext()) {
            abstractC17067c.skipValue();
        }
        abstractC17067c.d();
        return Color.argb(l3.f92484c, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static float g(AbstractC17067c abstractC17067c) throws IOException {
        AbstractC17067c.b bVarI = abstractC17067c.i();
        int i10 = a.f160266a[bVarI.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                abstractC17067c.b();
                float fNextDouble = (float) abstractC17067c.nextDouble();
                while (abstractC17067c.hasNext()) {
                    abstractC17067c.skipValue();
                }
                abstractC17067c.d();
                return fNextDouble;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + bVarI);
        }
        return (float) abstractC17067c.nextDouble();
    }
}
