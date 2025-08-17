package s6;

import Z.o0;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import g6.C14205e;
import g6.C14209i;
import java.io.IOException;
import java.lang.ref.WeakReference;
import r2.C16709a;
import t6.AbstractC17067c;
import v6.C17512a;

/* loaded from: classes4.dex */
class t {

    /* renamed from: b, reason: collision with root package name */
    private static o0<WeakReference<Interpolator>> f160268b;

    /* renamed from: a, reason: collision with root package name */
    private static final Interpolator f160267a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    static AbstractC17067c.a f160269c = AbstractC17067c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    static AbstractC17067c.a f160270d = AbstractC17067c.a.a("x", "y");

    private static WeakReference<Interpolator> a(int i10) {
        WeakReference<Interpolator> weakReferenceE;
        synchronized (t.class) {
            weakReferenceE = g().e(i10);
        }
        return weakReferenceE;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = u6.l.b(pointF.x, -1.0f, 1.0f);
        pointF.y = u6.l.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = u6.l.b(pointF2.x, -1.0f, 1.0f);
        float fB = u6.l.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i10 = u6.q.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference<Interpolator> weakReferenceA = C14205e.e() ? null : a(i10);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = C16709a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? C16709a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!C14205e.e()) {
            try {
                h(i10, new WeakReference(interpolatorA));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorA;
    }

    static <T> C17512a<T> c(AbstractC17067c abstractC17067c, C14209i c14209i, float f10, InterfaceC16889N<T> interfaceC16889N, boolean z10, boolean z11) throws IOException {
        return (z10 && z11) ? e(c14209i, abstractC17067c, f10, interfaceC16889N) : z10 ? d(c14209i, abstractC17067c, f10, interfaceC16889N) : f(abstractC17067c, f10, interfaceC16889N);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> v6.C17512a<T> e(g6.C14209i r21, t6.AbstractC17067c r22, float r23, s6.InterfaceC16889N<T> r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.t.e(g6.i, t6.c, float, s6.N):v6.a");
    }

    private static o0<WeakReference<Interpolator>> g() {
        if (f160268b == null) {
            f160268b = new o0<>();
        }
        return f160268b;
    }

    private static void h(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f160268b.j(i10, weakReference);
        }
    }

    t() {
    }

    private static <T> C17512a<T> d(C14209i c14209i, AbstractC17067c abstractC17067c, float f10, InterfaceC16889N<T> interfaceC16889N) throws IOException {
        Interpolator interpolatorB;
        Interpolator interpolator;
        T t10;
        abstractC17067c.c();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFE4 = null;
        while (abstractC17067c.hasNext()) {
            switch (abstractC17067c.l(f160269c)) {
                case 0:
                    fNextDouble = (float) abstractC17067c.nextDouble();
                    break;
                case 1:
                    tA2 = interfaceC16889N.a(abstractC17067c, f10);
                    break;
                case 2:
                    tA = interfaceC16889N.a(abstractC17067c, f10);
                    break;
                case 3:
                    pointFE = C16908s.e(abstractC17067c, 1.0f);
                    break;
                case 4:
                    pointFE4 = C16908s.e(abstractC17067c, 1.0f);
                    break;
                case 5:
                    if (abstractC17067c.nextInt() == 1) {
                        z10 = true;
                        break;
                    } else {
                        z10 = false;
                        break;
                    }
                case 6:
                    pointFE2 = C16908s.e(abstractC17067c, f10);
                    break;
                case 7:
                    pointFE3 = C16908s.e(abstractC17067c, f10);
                    break;
                default:
                    abstractC17067c.skipValue();
                    break;
            }
        }
        abstractC17067c.g();
        if (z10) {
            interpolator = f160267a;
            t10 = tA2;
        } else {
            if (pointFE != null && pointFE4 != null) {
                interpolatorB = b(pointFE, pointFE4);
            } else {
                interpolatorB = f160267a;
            }
            interpolator = interpolatorB;
            t10 = tA;
        }
        C17512a<T> c17512a = new C17512a<>(c14209i, tA2, t10, interpolator, fNextDouble, null);
        c17512a.f164574o = pointFE2;
        c17512a.f164575p = pointFE3;
        return c17512a;
    }

    private static <T> C17512a<T> f(AbstractC17067c abstractC17067c, float f10, InterfaceC16889N<T> interfaceC16889N) throws IOException {
        return new C17512a<>(interfaceC16889N.a(abstractC17067c, f10));
    }
}
