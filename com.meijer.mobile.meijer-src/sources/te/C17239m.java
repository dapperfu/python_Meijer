package te;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: te.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17239m {

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC17229c f162555m = new C17237k(0.5f);

    /* renamed from: a, reason: collision with root package name */
    C17230d f162556a;

    /* renamed from: b, reason: collision with root package name */
    C17230d f162557b;

    /* renamed from: c, reason: collision with root package name */
    C17230d f162558c;

    /* renamed from: d, reason: collision with root package name */
    C17230d f162559d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC17229c f162560e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC17229c f162561f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC17229c f162562g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC17229c f162563h;

    /* renamed from: i, reason: collision with root package name */
    C17232f f162564i;

    /* renamed from: j, reason: collision with root package name */
    C17232f f162565j;

    /* renamed from: k, reason: collision with root package name */
    C17232f f162566k;

    /* renamed from: l, reason: collision with root package name */
    C17232f f162567l;

    /* renamed from: te.m$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C17230d f162568a;

        /* renamed from: b, reason: collision with root package name */
        private C17230d f162569b;

        /* renamed from: c, reason: collision with root package name */
        private C17230d f162570c;

        /* renamed from: d, reason: collision with root package name */
        private C17230d f162571d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC17229c f162572e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC17229c f162573f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC17229c f162574g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC17229c f162575h;

        /* renamed from: i, reason: collision with root package name */
        private C17232f f162576i;

        /* renamed from: j, reason: collision with root package name */
        private C17232f f162577j;

        /* renamed from: k, reason: collision with root package name */
        private C17232f f162578k;

        /* renamed from: l, reason: collision with root package name */
        private C17232f f162579l;

        public b() {
            this.f162568a = C17235i.b();
            this.f162569b = C17235i.b();
            this.f162570c = C17235i.b();
            this.f162571d = C17235i.b();
            this.f162572e = new C17227a(0.0f);
            this.f162573f = new C17227a(0.0f);
            this.f162574g = new C17227a(0.0f);
            this.f162575h = new C17227a(0.0f);
            this.f162576i = C17235i.c();
            this.f162577j = C17235i.c();
            this.f162578k = C17235i.c();
            this.f162579l = C17235i.c();
        }

        private static float n(C17230d c17230d) {
            if (c17230d instanceof C17238l) {
                return ((C17238l) c17230d).f162554a;
            }
            if (c17230d instanceof C17231e) {
                return ((C17231e) c17230d).f162499a;
            }
            return -1.0f;
        }

        public b A(InterfaceC17229c interfaceC17229c) {
            this.f162574g = interfaceC17229c;
            return this;
        }

        public b C(C17230d c17230d) {
            this.f162568a = c17230d;
            float fN = n(c17230d);
            if (fN != -1.0f) {
                D(fN);
            }
            return this;
        }

        public b D(float f10) {
            this.f162572e = new C17227a(f10);
            return this;
        }

        public b E(InterfaceC17229c interfaceC17229c) {
            this.f162572e = interfaceC17229c;
            return this;
        }

        public b G(C17230d c17230d) {
            this.f162569b = c17230d;
            float fN = n(c17230d);
            if (fN != -1.0f) {
                H(fN);
            }
            return this;
        }

        public b H(float f10) {
            this.f162573f = new C17227a(f10);
            return this;
        }

        public b I(InterfaceC17229c interfaceC17229c) {
            this.f162573f = interfaceC17229c;
            return this;
        }

        public C17239m m() {
            return new C17239m(this);
        }

        public b s(C17232f c17232f) {
            this.f162578k = c17232f;
            return this;
        }

        public b u(C17230d c17230d) {
            this.f162571d = c17230d;
            float fN = n(c17230d);
            if (fN != -1.0f) {
                v(fN);
            }
            return this;
        }

        public b v(float f10) {
            this.f162575h = new C17227a(f10);
            return this;
        }

        public b w(InterfaceC17229c interfaceC17229c) {
            this.f162575h = interfaceC17229c;
            return this;
        }

        public b y(C17230d c17230d) {
            this.f162570c = c17230d;
            float fN = n(c17230d);
            if (fN != -1.0f) {
                z(fN);
            }
            return this;
        }

        public b z(float f10) {
            this.f162574g = new C17227a(f10);
            return this;
        }

        public b B(int i10, InterfaceC17229c interfaceC17229c) {
            return C(C17235i.a(i10)).E(interfaceC17229c);
        }

        public b F(int i10, InterfaceC17229c interfaceC17229c) {
            return G(C17235i.a(i10)).I(interfaceC17229c);
        }

        public b o(float f10) {
            return D(f10).H(f10).z(f10).v(f10);
        }

        public b p(InterfaceC17229c interfaceC17229c) {
            return E(interfaceC17229c).I(interfaceC17229c).A(interfaceC17229c).w(interfaceC17229c);
        }

        public b q(int i10, float f10) {
            return r(C17235i.a(i10)).o(f10);
        }

        public b r(C17230d c17230d) {
            return C(c17230d).G(c17230d).y(c17230d).u(c17230d);
        }

        public b t(int i10, InterfaceC17229c interfaceC17229c) {
            return u(C17235i.a(i10)).w(interfaceC17229c);
        }

        public b x(int i10, InterfaceC17229c interfaceC17229c) {
            return y(C17235i.a(i10)).A(interfaceC17229c);
        }

        public b(C17239m c17239m) {
            this.f162568a = C17235i.b();
            this.f162569b = C17235i.b();
            this.f162570c = C17235i.b();
            this.f162571d = C17235i.b();
            this.f162572e = new C17227a(0.0f);
            this.f162573f = new C17227a(0.0f);
            this.f162574g = new C17227a(0.0f);
            this.f162575h = new C17227a(0.0f);
            this.f162576i = C17235i.c();
            this.f162577j = C17235i.c();
            this.f162578k = C17235i.c();
            this.f162579l = C17235i.c();
            this.f162568a = c17239m.f162556a;
            this.f162569b = c17239m.f162557b;
            this.f162570c = c17239m.f162558c;
            this.f162571d = c17239m.f162559d;
            this.f162572e = c17239m.f162560e;
            this.f162573f = c17239m.f162561f;
            this.f162574g = c17239m.f162562g;
            this.f162575h = c17239m.f162563h;
            this.f162576i = c17239m.f162564i;
            this.f162577j = c17239m.f162565j;
            this.f162578k = c17239m.f162566k;
            this.f162579l = c17239m.f162567l;
        }
    }

    /* renamed from: te.m$c */
    public interface c {
        InterfaceC17229c a(InterfaceC17229c interfaceC17229c);
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    private C17239m(b bVar) {
        this.f162556a = bVar.f162568a;
        this.f162557b = bVar.f162569b;
        this.f162558c = bVar.f162570c;
        this.f162559d = bVar.f162571d;
        this.f162560e = bVar.f162572e;
        this.f162561f = bVar.f162573f;
        this.f162562g = bVar.f162574g;
        this.f162563h = bVar.f162575h;
        this.f162564i = bVar.f162576i;
        this.f162565j = bVar.f162577j;
        this.f162566k = bVar.f162578k;
        this.f162567l = bVar.f162579l;
    }

    public static b a() {
        return new b();
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new C17227a(i12));
    }

    private static b d(Context context, int i10, int i11, InterfaceC17229c interfaceC17229c) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ce.l.f61857C6);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(ce.l.f61869D6, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(ce.l.f61905G6, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(ce.l.f61917H6, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(ce.l.f61893F6, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(ce.l.f61881E6, i12);
            InterfaceC17229c interfaceC17229cM = m(typedArrayObtainStyledAttributes, ce.l.f61929I6, interfaceC17229c);
            InterfaceC17229c interfaceC17229cM2 = m(typedArrayObtainStyledAttributes, ce.l.f61965L6, interfaceC17229cM);
            InterfaceC17229c interfaceC17229cM3 = m(typedArrayObtainStyledAttributes, ce.l.f61977M6, interfaceC17229cM);
            InterfaceC17229c interfaceC17229cM4 = m(typedArrayObtainStyledAttributes, ce.l.f61953K6, interfaceC17229cM);
            return new b().B(i13, interfaceC17229cM2).F(i14, interfaceC17229cM3).x(i15, interfaceC17229cM4).t(i16, m(typedArrayObtainStyledAttributes, ce.l.f61941J6, interfaceC17229cM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new C17227a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, InterfaceC17229c interfaceC17229c) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ce.l.f62109Y4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ce.l.f62120Z4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ce.l.f62132a5, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, interfaceC17229c);
    }

    public C17232f h() {
        return this.f162566k;
    }

    public C17230d i() {
        return this.f162559d;
    }

    public InterfaceC17229c j() {
        return this.f162563h;
    }

    public C17230d k() {
        return this.f162558c;
    }

    public InterfaceC17229c l() {
        return this.f162562g;
    }

    public C17232f n() {
        return this.f162567l;
    }

    public C17232f o() {
        return this.f162565j;
    }

    public C17232f p() {
        return this.f162564i;
    }

    public C17230d q() {
        return this.f162556a;
    }

    public InterfaceC17229c r() {
        return this.f162560e;
    }

    public C17230d s() {
        return this.f162557b;
    }

    public InterfaceC17229c t() {
        return this.f162561f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f162567l.getClass().equals(C17232f.class) && this.f162565j.getClass().equals(C17232f.class) && this.f162564i.getClass().equals(C17232f.class) && this.f162566k.getClass().equals(C17232f.class);
        float fA = this.f162560e.a(rectF);
        return z10 && ((this.f162561f.a(rectF) > fA ? 1 : (this.f162561f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f162563h.a(rectF) > fA ? 1 : (this.f162563h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f162562g.a(rectF) > fA ? 1 : (this.f162562g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f162557b instanceof C17238l) && (this.f162556a instanceof C17238l) && (this.f162558c instanceof C17238l) && (this.f162559d instanceof C17238l));
    }

    public b v() {
        return new b(this);
    }

    private static InterfaceC17229c m(TypedArray typedArray, int i10, InterfaceC17229c interfaceC17229c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new C17227a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new C17237k(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC17229c;
    }

    public C17239m w(float f10) {
        return v().o(f10).m();
    }

    public C17239m x(InterfaceC17229c interfaceC17229c) {
        return v().p(interfaceC17229c).m();
    }

    public C17239m y(c cVar) {
        return v().E(cVar.a(r())).I(cVar.a(t())).w(cVar.a(j())).A(cVar.a(l())).m();
    }

    public C17239m() {
        this.f162556a = C17235i.b();
        this.f162557b = C17235i.b();
        this.f162558c = C17235i.b();
        this.f162559d = C17235i.b();
        this.f162560e = new C17227a(0.0f);
        this.f162561f = new C17227a(0.0f);
        this.f162562g = new C17227a(0.0f);
        this.f162563h = new C17227a(0.0f);
        this.f162564i = C17235i.c();
        this.f162565j = C17235i.c();
        this.f162566k = C17235i.c();
        this.f162567l = C17235i.c();
    }
}
