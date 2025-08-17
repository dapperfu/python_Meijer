package i6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.medallia.digital.mobilesdk.l3;
import g6.C14205e;
import g6.D;
import h6.C14380a;
import j6.AbstractC14861a;
import j6.C14862b;
import j6.C14864d;
import java.util.ArrayList;
import java.util.List;
import q6.AbstractC16472b;
import u6.C17230d;
import v6.C17514c;

/* renamed from: i6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14696g implements InterfaceC14694e, AbstractC14861a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f137487a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f137488b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16472b f137489c;

    /* renamed from: d, reason: collision with root package name */
    private final String f137490d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f137491e;

    /* renamed from: f, reason: collision with root package name */
    private final List<m> f137492f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC14861a<Integer, Integer> f137493g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC14861a<Integer, Integer> f137494h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC14861a<ColorFilter, ColorFilter> f137495i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.o f137496j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f137497k;

    /* renamed from: l, reason: collision with root package name */
    float f137498l;

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC14692c interfaceC14692c = list2.get(i10);
            if (interfaceC14692c instanceof m) {
                this.f137492f.add((m) interfaceC14692c);
            }
        }
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        this.f137496j.invalidateSelf();
    }

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        if (t10 == D.f132847a) {
            this.f137493g.o(c17514c);
            return;
        }
        if (t10 == D.f132850d) {
            this.f137494h.o(c17514c);
            return;
        }
        if (t10 == D.f132841K) {
            AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f137495i;
            if (abstractC14861a != null) {
                this.f137489c.H(abstractC14861a);
            }
            if (c17514c == null) {
                this.f137495i = null;
                return;
            }
            j6.q qVar = new j6.q(c17514c);
            this.f137495i = qVar;
            qVar.a(this);
            this.f137489c.j(this.f137495i);
            return;
        }
        if (t10 == D.f132856j) {
            AbstractC14861a<Float, Float> abstractC14861a2 = this.f137497k;
            if (abstractC14861a2 != null) {
                abstractC14861a2.o(c17514c);
                return;
            }
            j6.q qVar2 = new j6.q(c17514c);
            this.f137497k = qVar2;
            qVar2.a(this);
            this.f137489c.j(this.f137497k);
        }
    }

    @Override // i6.InterfaceC14694e
    public void e(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        if (this.f137491e) {
            return;
        }
        if (C14205e.h()) {
            C14205e.b("FillContent#draw");
        }
        float fIntValue = this.f137494h.h().intValue() / 100.0f;
        this.f137488b.setColor((u6.l.c((int) (i10 * fIntValue), 0, l3.f92484c) << 24) | (((C14862b) this.f137493g).r() & 16777215));
        AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f137495i;
        if (abstractC14861a != null) {
            this.f137488b.setColorFilter(abstractC14861a.h());
        }
        AbstractC14861a<Float, Float> abstractC14861a2 = this.f137497k;
        if (abstractC14861a2 != null) {
            float fFloatValue = abstractC14861a2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f137488b.setMaskFilter(null);
            } else if (fFloatValue != this.f137498l) {
                this.f137488b.setMaskFilter(this.f137489c.y(fFloatValue));
            }
            this.f137498l = fFloatValue;
        }
        if (c17230d != null) {
            c17230d.c((int) (fIntValue * 255.0f), this.f137488b);
        } else {
            this.f137488b.clearShadowLayer();
        }
        this.f137487a.reset();
        for (int i11 = 0; i11 < this.f137492f.size(); i11++) {
            this.f137487a.addPath(this.f137492f.get(i11).getPath(), matrix);
        }
        canvas.drawPath(this.f137487a, this.f137488b);
        if (C14205e.h()) {
            C14205e.c("FillContent#draw");
        }
    }

    @Override // i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f137487a.reset();
        for (int i10 = 0; i10 < this.f137492f.size(); i10++) {
            this.f137487a.addPath(this.f137492f.get(i10).getPath(), matrix);
        }
        this.f137487a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137490d;
    }

    public C14696g(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.p pVar) {
        Path path = new Path();
        this.f137487a = path;
        this.f137488b = new C14380a(1);
        this.f137492f = new ArrayList();
        this.f137489c = abstractC16472b;
        this.f137490d = pVar.d();
        this.f137491e = pVar.f();
        this.f137496j = oVar;
        if (abstractC16472b.x() != null) {
            C14864d c14864dA = abstractC16472b.x().a().a();
            this.f137497k = c14864dA;
            c14864dA.a(this);
            abstractC16472b.j(this.f137497k);
        }
        if (pVar.b() != null && pVar.e() != null) {
            path.setFillType(pVar.c());
            AbstractC14861a<Integer, Integer> abstractC14861aA = pVar.b().a();
            this.f137493g = abstractC14861aA;
            abstractC14861aA.a(this);
            abstractC16472b.j(abstractC14861aA);
            AbstractC14861a<Integer, Integer> abstractC14861aA2 = pVar.e().a();
            this.f137494h = abstractC14861aA2;
            abstractC14861aA2.a(this);
            abstractC16472b.j(abstractC14861aA2);
            return;
        }
        this.f137493g = null;
        this.f137494h = null;
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        u6.l.k(eVar, i10, list, eVar2, this);
    }
}
