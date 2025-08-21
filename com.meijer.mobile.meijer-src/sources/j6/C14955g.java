package j6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.medallia.digital.mobilesdk.l3;
import h6.C14474e;
import h6.D;
import i6.C14689a;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15094b;
import k6.C15096d;
import r6.AbstractC16860b;
import v6.C17643d;
import w6.C17847c;

/* renamed from: j6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14955g implements InterfaceC14953e, AbstractC15093a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f140022a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f140023b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16860b f140024c;

    /* renamed from: d, reason: collision with root package name */
    private final String f140025d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f140026e;

    /* renamed from: f, reason: collision with root package name */
    private final List<m> f140027f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC15093a<Integer, Integer> f140028g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC15093a<Integer, Integer> f140029h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC15093a<ColorFilter, ColorFilter> f140030i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.o f140031j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f140032k;

    /* renamed from: l, reason: collision with root package name */
    float f140033l;

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC14951c interfaceC14951c = list2.get(i10);
            if (interfaceC14951c instanceof m) {
                this.f140027f.add((m) interfaceC14951c);
            }
        }
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        this.f140031j.invalidateSelf();
    }

    @Override // j6.InterfaceC14953e
    public void e(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        if (this.f140026e) {
            return;
        }
        if (C14474e.h()) {
            C14474e.b("FillContent#draw");
        }
        float fIntValue = this.f140029h.h().intValue() / 100.0f;
        this.f140023b.setColor((v6.l.c((int) (i10 * fIntValue), 0, l3.f93323c) << 24) | (((C15094b) this.f140028g).r() & 16777215));
        AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f140030i;
        if (abstractC15093a != null) {
            this.f140023b.setColorFilter(abstractC15093a.h());
        }
        AbstractC15093a<Float, Float> abstractC15093a2 = this.f140032k;
        if (abstractC15093a2 != null) {
            float fFloatValue = abstractC15093a2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f140023b.setMaskFilter(null);
            } else if (fFloatValue != this.f140033l) {
                this.f140023b.setMaskFilter(this.f140024c.y(fFloatValue));
            }
            this.f140033l = fFloatValue;
        }
        if (c17643d != null) {
            c17643d.c((int) (fIntValue * 255.0f), this.f140023b);
        } else {
            this.f140023b.clearShadowLayer();
        }
        this.f140022a.reset();
        for (int i11 = 0; i11 < this.f140027f.size(); i11++) {
            this.f140022a.addPath(this.f140027f.get(i11).getPath(), matrix);
        }
        canvas.drawPath(this.f140022a, this.f140023b);
        if (C14474e.h()) {
            C14474e.c("FillContent#draw");
        }
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        if (t10 == D.f135023a) {
            this.f140028g.o(c17847c);
            return;
        }
        if (t10 == D.f135026d) {
            this.f140029h.o(c17847c);
            return;
        }
        if (t10 == D.f135017K) {
            AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f140030i;
            if (abstractC15093a != null) {
                this.f140024c.H(abstractC15093a);
            }
            if (c17847c == null) {
                this.f140030i = null;
                return;
            }
            k6.q qVar = new k6.q(c17847c);
            this.f140030i = qVar;
            qVar.a(this);
            this.f140024c.j(this.f140030i);
            return;
        }
        if (t10 == D.f135032j) {
            AbstractC15093a<Float, Float> abstractC15093a2 = this.f140032k;
            if (abstractC15093a2 != null) {
                abstractC15093a2.o(c17847c);
                return;
            }
            k6.q qVar2 = new k6.q(c17847c);
            this.f140032k = qVar2;
            qVar2.a(this);
            this.f140024c.j(this.f140032k);
        }
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140025d;
    }

    @Override // j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        this.f140022a.reset();
        for (int i10 = 0; i10 < this.f140027f.size(); i10++) {
            this.f140022a.addPath(this.f140027f.get(i10).getPath(), matrix);
        }
        this.f140022a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public C14955g(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.p pVar) {
        Path path = new Path();
        this.f140022a = path;
        this.f140023b = new C14689a(1);
        this.f140027f = new ArrayList();
        this.f140024c = abstractC16860b;
        this.f140025d = pVar.d();
        this.f140026e = pVar.f();
        this.f140031j = oVar;
        if (abstractC16860b.x() != null) {
            C15096d c15096dA = abstractC16860b.x().a().a();
            this.f140032k = c15096dA;
            c15096dA.a(this);
            abstractC16860b.j(this.f140032k);
        }
        if (pVar.b() != null && pVar.e() != null) {
            path.setFillType(pVar.c());
            AbstractC15093a<Integer, Integer> abstractC15093aA = pVar.b().a();
            this.f140028g = abstractC15093aA;
            abstractC15093aA.a(this);
            abstractC16860b.j(abstractC15093aA);
            AbstractC15093a<Integer, Integer> abstractC15093aA2 = pVar.e().a();
            this.f140029h = abstractC15093aA2;
            abstractC15093aA2.a(this);
            abstractC16860b.j(abstractC15093aA2);
            return;
        }
        this.f140028g = null;
        this.f140029h = null;
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        v6.l.k(eVar, i10, list, eVar2, this);
    }
}
