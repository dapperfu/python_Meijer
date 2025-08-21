package t6;

import Z.o0;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import h6.C14474e;
import h6.C14478i;
import java.io.IOException;
import java.lang.ref.WeakReference;
import r2.C16823a;
import u6.AbstractC17353c;
import w6.C17845a;

/* loaded from: classes4.dex */
class t {

    /* renamed from: b, reason: collision with root package name */
    private static o0<WeakReference<Interpolator>> f162329b;

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f162328a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    static AbstractC17353c.a f162330c = AbstractC17353c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    static AbstractC17353c.a f162331d = AbstractC17353c.a.a("x", "y");

    private static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> weakReferenceE;
        synchronized (t.class) {
            weakReferenceE = g().e(i10);
        }
        return weakReferenceE;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = v6.l.b(pointF.x, -1.0f, 1.0f);
        pointF.y = v6.l.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = v6.l.b(pointF2.x, -1.0f, 1.0f);
        float fB = v6.l.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i10 = v6.q.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference<Interpolator> weakReferenceA = C14474e.e() ? null : a(i10);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = C16823a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? C16823a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!C14474e.e()) {
            try {
                h(i10, new WeakReference(interpolatorA));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorA;
    }

    static <T> C17845a<T> c(AbstractC17353c abstractC17353c, C14478i c14478i, float f10, N<T> n10, boolean z10, boolean z11) throws IOException {
        return (z10 && z11) ? e(c14478i, abstractC17353c, f10, n10) : z10 ? d(c14478i, abstractC17353c, f10, n10) : f(abstractC17353c, f10, n10);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> w6.C17845a<T> e(h6.C14478i r21, u6.AbstractC17353c r22, float r23, t6.N<T> r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.t.e(h6.i, u6.c, float, t6.N):w6.a");
    }

    private static o0<WeakReference<Interpolator>> g() {
        if (f162329b == null) {
            f162329b = new o0<>();
        }
        return f162329b;
    }

    private static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f162329b.j(i10, weakReference);
        }
    }

    t() {
    }

    private static <T> C17845a<T> d(C14478i c14478i, AbstractC17353c abstractC17353c, float f10, N<T> n10) throws IOException {
        Interpolator interpolatorB;
        Interpolator interpolator;
        T t10;
        abstractC17353c.c();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFE4 = null;
        while (abstractC17353c.hasNext()) {
            switch (abstractC17353c.l(f162330c)) {
                case 0:
                    fNextDouble = (float) abstractC17353c.nextDouble();
                    break;
                case 1:
                    tA2 = n10.a(abstractC17353c, f10);
                    break;
                case 2:
                    tA = n10.a(abstractC17353c, f10);
                    break;
                case 3:
                    pointFE = s.e(abstractC17353c, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(abstractC17353c, 1.0f);
                    break;
                case 5:
                    if (abstractC17353c.nextInt() == 1) {
                        z10 = true;
                        break;
                    } else {
                        z10 = false;
                        break;
                    }
                case 6:
                    pointFE2 = s.e(abstractC17353c, f10);
                    break;
                case 7:
                    pointFE3 = s.e(abstractC17353c, f10);
                    break;
                default:
                    abstractC17353c.skipValue();
                    break;
            }
        }
        abstractC17353c.g();
        if (z10) {
            interpolator = f162328a;
            t10 = tA2;
        } else {
            if (pointFE != null && pointFE4 != null) {
                interpolatorB = b(pointFE, pointFE4);
            } else {
                interpolatorB = f162328a;
            }
            interpolator = interpolatorB;
            t10 = tA;
        }
        C17845a<T> c17845a = new C17845a<>(c14478i, tA2, t10, interpolator, fNextDouble, null);
        c17845a.f166958o = pointFE2;
        c17845a.f166959p = pointFE3;
        return c17845a;
    }

    private static <T> C17845a<T> f(AbstractC17353c abstractC17353c, float f10, N<T> n10) throws IOException {
        return new C17845a<>(n10.a(abstractC17353c, f10));
    }
}
