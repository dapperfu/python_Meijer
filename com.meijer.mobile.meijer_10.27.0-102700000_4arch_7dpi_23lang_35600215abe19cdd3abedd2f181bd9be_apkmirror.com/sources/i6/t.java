package i6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import g6.D;
import j6.AbstractC14861a;
import j6.C14862b;
import q6.AbstractC16472b;
import u6.C17230d;
import v6.C17514c;

/* loaded from: classes4.dex */
public class t extends AbstractC14690a {

    /* renamed from: q, reason: collision with root package name */
    private final AbstractC16472b f137588q;

    /* renamed from: r, reason: collision with root package name */
    private final String f137589r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f137590s;

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC14861a<Integer, Integer> f137591t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC14861a<ColorFilter, ColorFilter> f137592u;

    @Override // i6.AbstractC14690a, i6.InterfaceC14694e
    public void e(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        if (this.f137590s) {
            return;
        }
        this.f137456i.setColor(((C14862b) this.f137591t).r());
        AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f137592u;
        if (abstractC14861a != null) {
            this.f137456i.setColorFilter(abstractC14861a.h());
        }
        super.e(canvas, matrix, i10, c17230d);
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137589r;
    }

    public t(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.s sVar) {
        super(oVar, abstractC16472b, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f137588q = abstractC16472b;
        this.f137589r = sVar.h();
        this.f137590s = sVar.k();
        AbstractC14861a<Integer, Integer> abstractC14861aA = sVar.c().a();
        this.f137591t = abstractC14861aA;
        abstractC14861aA.a(this);
        abstractC16472b.j(abstractC14861aA);
    }

    @Override // i6.AbstractC14690a, n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        super.d(t10, c17514c);
        if (t10 == D.f132848b) {
            this.f137591t.o(c17514c);
            return;
        }
        if (t10 == D.f132841K) {
            AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f137592u;
            if (abstractC14861a != null) {
                this.f137588q.H(abstractC14861a);
            }
            if (c17514c == null) {
                this.f137592u = null;
                return;
            }
            j6.q qVar = new j6.q(c17514c);
            this.f137592u = qVar;
            qVar.a(this);
            this.f137588q.j(this.f137591t);
        }
    }
}
