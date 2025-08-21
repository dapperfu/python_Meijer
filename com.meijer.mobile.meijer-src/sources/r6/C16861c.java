package r6;

import Z.C;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import com.medallia.digital.mobilesdk.l3;
import h6.C14474e;
import h6.C14478i;
import h6.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15095c;
import k6.C15096d;
import k6.q;
import p6.C16407b;
import r6.C16863e;
import v6.C17643d;
import v6.p;
import w6.C17847c;

/* renamed from: r6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16861c extends AbstractC16860b {

    /* renamed from: E, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f159298E;

    /* renamed from: F, reason: collision with root package name */
    private final List<AbstractC16860b> f159299F;

    /* renamed from: G, reason: collision with root package name */
    private final RectF f159300G;

    /* renamed from: H, reason: collision with root package name */
    private final RectF f159301H;

    /* renamed from: I, reason: collision with root package name */
    private final RectF f159302I;

    /* renamed from: J, reason: collision with root package name */
    private final p f159303J;

    /* renamed from: K, reason: collision with root package name */
    private final p.a f159304K;

    /* renamed from: L, reason: collision with root package name */
    private float f159305L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f159306M;

    /* renamed from: N, reason: collision with root package name */
    private C15095c f159307N;

    @Override // r6.AbstractC16860b
    protected void I(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        for (int i11 = 0; i11 < this.f159299F.size(); i11++) {
            this.f159299F.get(i11).g(eVar, i10, list, eVar2);
        }
    }

    /* renamed from: r6.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f159308a;

        static {
            int[] iArr = new int[C16863e.b.values().length];
            f159308a = iArr;
            try {
                iArr[C16863e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f159308a[C16863e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public float P() {
        return this.f159305L;
    }

    public void Q(boolean z10) {
        this.f159306M = z10;
    }

    public C16861c(o oVar, C16863e c16863e, List<C16863e> list, C14478i c14478i) {
        int i10;
        AbstractC16860b abstractC16860b;
        super(oVar, c16863e);
        this.f159299F = new ArrayList();
        this.f159300G = new RectF();
        this.f159301H = new RectF();
        this.f159302I = new RectF();
        this.f159303J = new p();
        this.f159304K = new p.a();
        this.f159306M = true;
        C16407b c16407bV = c16863e.v();
        if (c16407bV != null) {
            C15096d c15096dA = c16407bV.a();
            this.f159298E = c15096dA;
            j(c15096dA);
            this.f159298E.a(this);
        } else {
            this.f159298E = null;
        }
        C c10 = new C(c14478i.k().size());
        int size = list.size() - 1;
        AbstractC16860b abstractC16860b2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C16863e c16863e2 = list.get(size);
            AbstractC16860b abstractC16860bV = AbstractC16860b.v(this, c16863e2, oVar, c14478i);
            if (abstractC16860bV != null) {
                c10.i(abstractC16860bV.A().e(), abstractC16860bV);
                if (abstractC16860b2 != null) {
                    abstractC16860b2.J(abstractC16860bV);
                    abstractC16860b2 = null;
                } else {
                    this.f159299F.add(0, abstractC16860bV);
                    int i11 = a.f159308a[c16863e2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        abstractC16860b2 = abstractC16860bV;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < c10.m(); i10++) {
            AbstractC16860b abstractC16860b3 = (AbstractC16860b) c10.d(c10.g(i10));
            if (abstractC16860b3 != null && (abstractC16860b = (AbstractC16860b) c10.d(abstractC16860b3.A().k())) != null) {
                abstractC16860b3.L(abstractC16860b);
            }
        }
        if (z() != null) {
            this.f159307N = new C15095c(this, this, z());
        }
    }

    @Override // r6.AbstractC16860b
    public void K(boolean z10) {
        super.K(z10);
        Iterator<AbstractC16860b> it = this.f159299F.iterator();
        while (it.hasNext()) {
            it.next().K(z10);
        }
    }

    @Override // r6.AbstractC16860b
    public void M(float f10) {
        if (C14474e.h()) {
            C14474e.b("CompositionLayer#setProgress");
        }
        this.f159305L = f10;
        super.M(f10);
        if (this.f159298E != null) {
            f10 = ((this.f159298E.h().floatValue() * this.f159286q.c().i()) - this.f159286q.c().p()) / (this.f159285p.J().e() + 0.01f);
        }
        if (this.f159298E == null) {
            f10 -= this.f159286q.s();
        }
        if (this.f159286q.w() != 0.0f && !"__container".equals(this.f159286q.j())) {
            f10 /= this.f159286q.w();
        }
        for (int size = this.f159299F.size() - 1; size >= 0; size--) {
            this.f159299F.get(size).M(f10);
        }
        if (C14474e.h()) {
            C14474e.c("CompositionLayer#setProgress");
        }
    }

    @Override // r6.AbstractC16860b, o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        C15095c c15095c;
        C15095c c15095c2;
        C15095c c15095c3;
        C15095c c15095c4;
        C15095c c15095c5;
        super.f(t10, c17847c);
        if (t10 == D.f135011E) {
            if (c17847c == null) {
                AbstractC15093a<Float, Float> abstractC15093a = this.f159298E;
                if (abstractC15093a != null) {
                    abstractC15093a.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(c17847c);
            this.f159298E = qVar;
            qVar.a(this);
            j(this.f159298E);
            return;
        }
        if (t10 == D.f135027e && (c15095c5 = this.f159307N) != null) {
            c15095c5.c(c17847c);
            return;
        }
        if (t10 == D.f135013G && (c15095c4 = this.f159307N) != null) {
            c15095c4.f(c17847c);
            return;
        }
        if (t10 == D.f135014H && (c15095c3 = this.f159307N) != null) {
            c15095c3.d(c17847c);
            return;
        }
        if (t10 == D.f135015I && (c15095c2 = this.f159307N) != null) {
            c15095c2.e(c17847c);
        } else if (t10 == D.f135016J && (c15095c = this.f159307N) != null) {
            c15095c.g(c17847c);
        }
    }

    @Override // r6.AbstractC16860b, j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        super.h(rectF, matrix, z10);
        for (int size = this.f159299F.size() - 1; size >= 0; size--) {
            this.f159300G.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f159299F.get(size).h(this.f159300G, this.f159284o, true);
            rectF.union(this.f159300G);
        }
    }

    @Override // r6.AbstractC16860b
    void u(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        boolean z10;
        Canvas canvasJ;
        if (C14474e.h()) {
            C14474e.b("CompositionLayer#draw");
        }
        boolean z11 = false;
        if (c17643d == null && this.f159307N == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean zF0 = this.f159285p.f0();
        int i11 = l3.f93323c;
        if ((zF0 && this.f159299F.size() > 1 && i10 != 255) || (z10 && this.f159285p.g0())) {
            z11 = true;
        }
        if (!z11) {
            i11 = i10;
        }
        C15095c c15095c = this.f159307N;
        if (c15095c != null) {
            c17643d = c15095c.b(matrix, i11);
        }
        if (!this.f159306M && "__container".equals(this.f159286q.j())) {
            this.f159301H.setEmpty();
            Iterator<AbstractC16860b> it = this.f159299F.iterator();
            while (it.hasNext()) {
                it.next().h(this.f159302I, matrix, true);
                this.f159301H.union(this.f159302I);
            }
        } else {
            this.f159301H.set(0.0f, 0.0f, this.f159286q.m(), this.f159286q.l());
            matrix.mapRect(this.f159301H);
        }
        if (z11) {
            this.f159304K.f();
            p.a aVar = this.f159304K;
            aVar.f165677a = i10;
            if (c17643d != null) {
                c17643d.b(aVar);
                c17643d = null;
            }
            canvasJ = this.f159303J.j(canvas, this.f159301H, this.f159304K);
        } else {
            canvasJ = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.f159301H)) {
            for (int size = this.f159299F.size() - 1; size >= 0; size--) {
                this.f159299F.get(size).e(canvasJ, matrix, i11, c17643d);
            }
        }
        if (z11) {
            this.f159303J.e();
        }
        canvas.restore();
        if (C14474e.h()) {
            C14474e.c("CompositionLayer#draw");
        }
    }
}
