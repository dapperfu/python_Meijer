package j6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import h6.D;
import k6.AbstractC15093a;
import k6.C15094b;
import r6.AbstractC16860b;
import v6.C17643d;
import w6.C17847c;

/* loaded from: classes4.dex */
public class t extends AbstractC14949a {

    /* renamed from: q, reason: collision with root package name */
    private final AbstractC16860b f140123q;

    /* renamed from: r, reason: collision with root package name */
    private final String f140124r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f140125s;

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC15093a<Integer, Integer> f140126t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC15093a<ColorFilter, ColorFilter> f140127u;

    @Override // j6.AbstractC14949a, j6.InterfaceC14953e
    public void e(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        if (this.f140125s) {
            return;
        }
        this.f139991i.setColor(((C15094b) this.f140126t).r());
        AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f140127u;
        if (abstractC15093a != null) {
            this.f139991i.setColorFilter(abstractC15093a.h());
        }
        super.e(canvas, matrix, i10, c17643d);
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140124r;
    }

    public t(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.s sVar) {
        super(oVar, abstractC16860b, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f140123q = abstractC16860b;
        this.f140124r = sVar.h();
        this.f140125s = sVar.k();
        AbstractC15093a<Integer, Integer> abstractC15093aA = sVar.c().a();
        this.f140126t = abstractC15093aA;
        abstractC15093aA.a(this);
        abstractC16860b.j(abstractC15093aA);
    }

    @Override // j6.AbstractC14949a, o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        super.f(t10, c17847c);
        if (t10 == D.f135024b) {
            this.f140126t.o(c17847c);
            return;
        }
        if (t10 == D.f135017K) {
            AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f140127u;
            if (abstractC15093a != null) {
                this.f140123q.H(abstractC15093a);
            }
            if (c17847c == null) {
                this.f140127u = null;
                return;
            }
            k6.q qVar = new k6.q(c17847c);
            this.f140127u = qVar;
            qVar.a(this);
            this.f140123q.j(this.f140126t);
        }
    }
}
