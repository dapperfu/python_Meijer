package k6;

import android.graphics.Color;
import android.graphics.Matrix;
import k6.AbstractC15093a;
import r6.AbstractC16860b;
import t6.C17197j;
import v6.C17643d;
import w6.C17846b;
import w6.C17847c;

/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15095c implements AbstractC15093a.b {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16860b f141635a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC15093a.b f141636b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC15093a<Integer, Integer> f141637c;

    /* renamed from: d, reason: collision with root package name */
    private final C15096d f141638d;

    /* renamed from: e, reason: collision with root package name */
    private final C15096d f141639e;

    /* renamed from: f, reason: collision with root package name */
    private final C15096d f141640f;

    /* renamed from: g, reason: collision with root package name */
    private final C15096d f141641g;

    /* renamed from: h, reason: collision with root package name */
    private Matrix f141642h;

    /* renamed from: k6.c$a */
    class a extends C17847c<Float> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17847c f141643d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C15095c f141644e;

        a(C15095c c15095c, C17847c c17847c) {
            this.f141643d = c17847c;
            this.f141644e = c15095c;
        }

        @Override // w6.C17847c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(C17846b<Float> c17846b) {
            Float f10 = (Float) this.f141643d.a(c17846b);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        this.f141636b.a();
    }

    public C17643d b(Matrix matrix, int i10) {
        float fR = this.f141639e.r() * 0.017453292f;
        float fFloatValue = this.f141640f.h().floatValue();
        double d10 = fR;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f141641g.h().floatValue();
        int iIntValue = this.f141637c.h().intValue();
        C17643d c17643d = new C17643d(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((this.f141638d.h().floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        c17643d.k(matrix);
        if (this.f141642h == null) {
            this.f141642h = new Matrix();
        }
        this.f141635a.f159293x.f().invert(this.f141642h);
        c17643d.k(this.f141642h);
        return c17643d;
    }

    public void c(C17847c<Integer> c17847c) {
        this.f141637c.o(c17847c);
    }

    public void d(C17847c<Float> c17847c) {
        this.f141639e.o(c17847c);
    }

    public void e(C17847c<Float> c17847c) {
        this.f141640f.o(c17847c);
    }

    public void f(C17847c<Float> c17847c) {
        if (c17847c == null) {
            this.f141638d.o(null);
        } else {
            this.f141638d.o(new a(this, c17847c));
        }
    }

    public void g(C17847c<Float> c17847c) {
        this.f141641g.o(c17847c);
    }

    public C15095c(AbstractC15093a.b bVar, AbstractC16860b abstractC16860b, C17197j c17197j) {
        this.f141636b = bVar;
        this.f141635a = abstractC16860b;
        AbstractC15093a<Integer, Integer> abstractC15093aA = c17197j.a().a();
        this.f141637c = abstractC15093aA;
        abstractC15093aA.a(this);
        abstractC16860b.j(abstractC15093aA);
        C15096d c15096dA = c17197j.d().a();
        this.f141638d = c15096dA;
        c15096dA.a(this);
        abstractC16860b.j(c15096dA);
        C15096d c15096dA2 = c17197j.b().a();
        this.f141639e = c15096dA2;
        c15096dA2.a(this);
        abstractC16860b.j(c15096dA2);
        C15096d c15096dA3 = c17197j.c().a();
        this.f141640f = c15096dA3;
        c15096dA3.a(this);
        abstractC16860b.j(c15096dA3);
        C15096d c15096dA4 = c17197j.e().a();
        this.f141641g = c15096dA4;
        c15096dA4.a(this);
        abstractC16860b.j(c15096dA4);
    }
}
