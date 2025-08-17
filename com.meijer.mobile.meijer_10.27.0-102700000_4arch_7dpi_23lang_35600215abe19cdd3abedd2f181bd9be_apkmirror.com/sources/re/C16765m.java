package re;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: re.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16765m {

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC16755c f158065m = new C16763k(0.5f);

    /* renamed from: a, reason: collision with root package name */
    C16756d f158066a;

    /* renamed from: b, reason: collision with root package name */
    C16756d f158067b;

    /* renamed from: c, reason: collision with root package name */
    C16756d f158068c;

    /* renamed from: d, reason: collision with root package name */
    C16756d f158069d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC16755c f158070e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC16755c f158071f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC16755c f158072g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC16755c f158073h;

    /* renamed from: i, reason: collision with root package name */
    C16758f f158074i;

    /* renamed from: j, reason: collision with root package name */
    C16758f f158075j;

    /* renamed from: k, reason: collision with root package name */
    C16758f f158076k;

    /* renamed from: l, reason: collision with root package name */
    C16758f f158077l;

    /* renamed from: re.m$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C16756d f158078a;

        /* renamed from: b, reason: collision with root package name */
        private C16756d f158079b;

        /* renamed from: c, reason: collision with root package name */
        private C16756d f158080c;

        /* renamed from: d, reason: collision with root package name */
        private C16756d f158081d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC16755c f158082e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC16755c f158083f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC16755c f158084g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC16755c f158085h;

        /* renamed from: i, reason: collision with root package name */
        private C16758f f158086i;

        /* renamed from: j, reason: collision with root package name */
        private C16758f f158087j;

        /* renamed from: k, reason: collision with root package name */
        private C16758f f158088k;

        /* renamed from: l, reason: collision with root package name */
        private C16758f f158089l;

        public b() {
            this.f158078a = C16761i.b();
            this.f158079b = C16761i.b();
            this.f158080c = C16761i.b();
            this.f158081d = C16761i.b();
            this.f158082e = new C16753a(0.0f);
            this.f158083f = new C16753a(0.0f);
            this.f158084g = new C16753a(0.0f);
            this.f158085h = new C16753a(0.0f);
            this.f158086i = C16761i.c();
            this.f158087j = C16761i.c();
            this.f158088k = C16761i.c();
            this.f158089l = C16761i.c();
        }

        private static float n(C16756d c16756d) {
            if (c16756d instanceof C16764l) {
                return ((C16764l) c16756d).f158064a;
            }
            if (c16756d instanceof C16757e) {
                return ((C16757e) c16756d).f158009a;
            }
            return -1.0f;
        }

        public b A(InterfaceC16755c interfaceC16755c) {
            this.f158084g = interfaceC16755c;
            return this;
        }

        public b C(C16756d c16756d) {
            this.f158078a = c16756d;
            float fN = n(c16756d);
            if (fN != -1.0f) {
                D(fN);
            }
            return this;
        }

        public b D(float f10) {
            this.f158082e = new C16753a(f10);
            return this;
        }

        public b E(InterfaceC16755c interfaceC16755c) {
            this.f158082e = interfaceC16755c;
            return this;
        }

        public b G(C16756d c16756d) {
            this.f158079b = c16756d;
            float fN = n(c16756d);
            if (fN != -1.0f) {
                H(fN);
            }
            return this;
        }

        public b H(float f10) {
            this.f158083f = new C16753a(f10);
            return this;
        }

        public b I(InterfaceC16755c interfaceC16755c) {
            this.f158083f = interfaceC16755c;
            return this;
        }

        public C16765m m() {
            return new C16765m(this);
        }

        public b s(C16758f c16758f) {
            this.f158088k = c16758f;
            return this;
        }

        public b u(C16756d c16756d) {
            this.f158081d = c16756d;
            float fN = n(c16756d);
            if (fN != -1.0f) {
                v(fN);
            }
            return this;
        }

        public b v(float f10) {
            this.f158085h = new C16753a(f10);
            return this;
        }

        public b w(InterfaceC16755c interfaceC16755c) {
            this.f158085h = interfaceC16755c;
            return this;
        }

        public b y(C16756d c16756d) {
            this.f158080c = c16756d;
            float fN = n(c16756d);
            if (fN != -1.0f) {
                z(fN);
            }
            return this;
        }

        public b z(float f10) {
            this.f158084g = new C16753a(f10);
            return this;
        }

        public b B(int i10, InterfaceC16755c interfaceC16755c) {
            return C(C16761i.a(i10)).E(interfaceC16755c);
        }

        public b F(int i10, InterfaceC16755c interfaceC16755c) {
            return G(C16761i.a(i10)).I(interfaceC16755c);
        }

        public b o(float f10) {
            return D(f10).H(f10).z(f10).v(f10);
        }

        public b p(InterfaceC16755c interfaceC16755c) {
            return E(interfaceC16755c).I(interfaceC16755c).A(interfaceC16755c).w(interfaceC16755c);
        }

        public b q(int i10, float f10) {
            return r(C16761i.a(i10)).o(f10);
        }

        public b r(C16756d c16756d) {
            return C(c16756d).G(c16756d).y(c16756d).u(c16756d);
        }

        public b t(int i10, InterfaceC16755c interfaceC16755c) {
            return u(C16761i.a(i10)).w(interfaceC16755c);
        }

        public b x(int i10, InterfaceC16755c interfaceC16755c) {
            return y(C16761i.a(i10)).A(interfaceC16755c);
        }

        public b(C16765m c16765m) {
            this.f158078a = C16761i.b();
            this.f158079b = C16761i.b();
            this.f158080c = C16761i.b();
            this.f158081d = C16761i.b();
            this.f158082e = new C16753a(0.0f);
            this.f158083f = new C16753a(0.0f);
            this.f158084g = new C16753a(0.0f);
            this.f158085h = new C16753a(0.0f);
            this.f158086i = C16761i.c();
            this.f158087j = C16761i.c();
            this.f158088k = C16761i.c();
            this.f158089l = C16761i.c();
            this.f158078a = c16765m.f158066a;
            this.f158079b = c16765m.f158067b;
            this.f158080c = c16765m.f158068c;
            this.f158081d = c16765m.f158069d;
            this.f158082e = c16765m.f158070e;
            this.f158083f = c16765m.f158071f;
            this.f158084g = c16765m.f158072g;
            this.f158085h = c16765m.f158073h;
            this.f158086i = c16765m.f158074i;
            this.f158087j = c16765m.f158075j;
            this.f158088k = c16765m.f158076k;
            this.f158089l = c16765m.f158077l;
        }
    }

    /* renamed from: re.m$c */
    public interface c {
        InterfaceC16755c a(InterfaceC16755c interfaceC16755c);
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    private C16765m(b bVar) {
        this.f158066a = bVar.f158078a;
        this.f158067b = bVar.f158079b;
        this.f158068c = bVar.f158080c;
        this.f158069d = bVar.f158081d;
        this.f158070e = bVar.f158082e;
        this.f158071f = bVar.f158083f;
        this.f158072g = bVar.f158084g;
        this.f158073h = bVar.f158085h;
        this.f158074i = bVar.f158086i;
        this.f158075j = bVar.f158087j;
        this.f158076k = bVar.f158088k;
        this.f158077l = bVar.f158089l;
    }

    public static b a() {
        return new b();
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new C16753a(i12));
    }

    private static b d(Context context, int i10, int i11, InterfaceC16755c interfaceC16755c) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ae.l.f44842C6);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(ae.l.f44854D6, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(ae.l.f44890G6, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(ae.l.f44902H6, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(ae.l.f44878F6, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(ae.l.f44866E6, i12);
            InterfaceC16755c interfaceC16755cM = m(typedArrayObtainStyledAttributes, ae.l.f44914I6, interfaceC16755c);
            InterfaceC16755c interfaceC16755cM2 = m(typedArrayObtainStyledAttributes, ae.l.f44950L6, interfaceC16755cM);
            InterfaceC16755c interfaceC16755cM3 = m(typedArrayObtainStyledAttributes, ae.l.f44962M6, interfaceC16755cM);
            InterfaceC16755c interfaceC16755cM4 = m(typedArrayObtainStyledAttributes, ae.l.f44938K6, interfaceC16755cM);
            return new b().B(i13, interfaceC16755cM2).F(i14, interfaceC16755cM3).x(i15, interfaceC16755cM4).t(i16, m(typedArrayObtainStyledAttributes, ae.l.f44926J6, interfaceC16755cM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new C16753a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, InterfaceC16755c interfaceC16755c) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ae.l.f45094Y4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ae.l.f45105Z4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ae.l.f45117a5, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, interfaceC16755c);
    }

    public C16758f h() {
        return this.f158076k;
    }

    public C16756d i() {
        return this.f158069d;
    }

    public InterfaceC16755c j() {
        return this.f158073h;
    }

    public C16756d k() {
        return this.f158068c;
    }

    public InterfaceC16755c l() {
        return this.f158072g;
    }

    public C16758f n() {
        return this.f158077l;
    }

    public C16758f o() {
        return this.f158075j;
    }

    public C16758f p() {
        return this.f158074i;
    }

    public C16756d q() {
        return this.f158066a;
    }

    public InterfaceC16755c r() {
        return this.f158070e;
    }

    public C16756d s() {
        return this.f158067b;
    }

    public InterfaceC16755c t() {
        return this.f158071f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f158077l.getClass().equals(C16758f.class) && this.f158075j.getClass().equals(C16758f.class) && this.f158074i.getClass().equals(C16758f.class) && this.f158076k.getClass().equals(C16758f.class);
        float fA = this.f158070e.a(rectF);
        return z10 && ((this.f158071f.a(rectF) > fA ? 1 : (this.f158071f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f158073h.a(rectF) > fA ? 1 : (this.f158073h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f158072g.a(rectF) > fA ? 1 : (this.f158072g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f158067b instanceof C16764l) && (this.f158066a instanceof C16764l) && (this.f158068c instanceof C16764l) && (this.f158069d instanceof C16764l));
    }

    public b v() {
        return new b(this);
    }

    private static InterfaceC16755c m(TypedArray typedArray, int i10, InterfaceC16755c interfaceC16755c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new C16753a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new C16763k(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC16755c;
    }

    public C16765m w(float f10) {
        return v().o(f10).m();
    }

    public C16765m x(InterfaceC16755c interfaceC16755c) {
        return v().p(interfaceC16755c).m();
    }

    public C16765m y(c cVar) {
        return v().E(cVar.a(r())).I(cVar.a(t())).w(cVar.a(j())).A(cVar.a(l())).m();
    }

    public C16765m() {
        this.f158066a = C16761i.b();
        this.f158067b = C16761i.b();
        this.f158068c = C16761i.b();
        this.f158069d = C16761i.b();
        this.f158070e = new C16753a(0.0f);
        this.f158071f = new C16753a(0.0f);
        this.f158072g = new C16753a(0.0f);
        this.f158073h = new C16753a(0.0f);
        this.f158074i = C16761i.c();
        this.f158075j = C16761i.c();
        this.f158076k = C16761i.c();
        this.f158077l = C16761i.c();
    }
}
