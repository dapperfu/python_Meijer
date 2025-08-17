package j6;

import android.graphics.Color;
import android.graphics.Matrix;
import j6.AbstractC14861a;
import q6.AbstractC16472b;
import s6.C16899j;
import u6.C17230d;
import v6.C17513b;
import v6.C17514c;

/* renamed from: j6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14863c implements AbstractC14861a.b {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16472b f139437a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC14861a.b f139438b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC14861a<Integer, Integer> f139439c;

    /* renamed from: d, reason: collision with root package name */
    private final C14864d f139440d;

    /* renamed from: e, reason: collision with root package name */
    private final C14864d f139441e;

    /* renamed from: f, reason: collision with root package name */
    private final C14864d f139442f;

    /* renamed from: g, reason: collision with root package name */
    private final C14864d f139443g;

    /* renamed from: h, reason: collision with root package name */
    private Matrix f139444h;

    /* renamed from: j6.c$a */
    class a extends C17514c<Float> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17514c f139445d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C14863c f139446e;

        a(C14863c c14863c, C17514c c17514c) {
            this.f139445d = c17514c;
            this.f139446e = c14863c;
        }

        @Override // v6.C17514c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(C17513b<Float> c17513b) {
            Float f10 = (Float) this.f139445d.a(c17513b);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        this.f139438b.a();
    }

    public C17230d b(Matrix matrix, int i10) {
        float fR = this.f139441e.r() * 0.017453292f;
        float fFloatValue = this.f139442f.h().floatValue();
        double d10 = fR;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = this.f139443g.h().floatValue();
        int iIntValue = this.f139439c.h().intValue();
        C17230d c17230d = new C17230d(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((this.f139440d.h().floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        c17230d.k(matrix);
        if (this.f139444h == null) {
            this.f139444h = new Matrix();
        }
        this.f139437a.f156845x.f().invert(this.f139444h);
        c17230d.k(this.f139444h);
        return c17230d;
    }

    public void c(C17514c<Integer> c17514c) {
        this.f139439c.o(c17514c);
    }

    public void d(C17514c<Float> c17514c) {
        this.f139441e.o(c17514c);
    }

    public void e(C17514c<Float> c17514c) {
        this.f139442f.o(c17514c);
    }

    public void f(C17514c<Float> c17514c) {
        if (c17514c == null) {
            this.f139440d.o(null);
        } else {
            this.f139440d.o(new a(this, c17514c));
        }
    }

    public void g(C17514c<Float> c17514c) {
        this.f139443g.o(c17514c);
    }

    public C14863c(AbstractC14861a.b bVar, AbstractC16472b abstractC16472b, C16899j c16899j) {
        this.f139438b = bVar;
        this.f139437a = abstractC16472b;
        AbstractC14861a<Integer, Integer> abstractC14861aA = c16899j.a().a();
        this.f139439c = abstractC14861aA;
        abstractC14861aA.a(this);
        abstractC16472b.j(abstractC14861aA);
        C14864d c14864dA = c16899j.d().a();
        this.f139440d = c14864dA;
        c14864dA.a(this);
        abstractC16472b.j(c14864dA);
        C14864d c14864dA2 = c16899j.b().a();
        this.f139441e = c14864dA2;
        c14864dA2.a(this);
        abstractC16472b.j(c14864dA2);
        C14864d c14864dA3 = c16899j.c().a();
        this.f139442f = c14864dA3;
        c14864dA3.a(this);
        abstractC16472b.j(c14864dA3);
        C14864d c14864dA4 = c16899j.e().a();
        this.f139443g = c14864dA4;
        c14864dA4.a(this);
        abstractC16472b.j(c14864dA4);
    }
}
