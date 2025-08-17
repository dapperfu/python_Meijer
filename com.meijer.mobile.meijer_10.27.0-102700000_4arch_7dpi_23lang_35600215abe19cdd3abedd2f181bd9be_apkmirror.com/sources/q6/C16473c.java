package q6;

import Z.C;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import com.medallia.digital.mobilesdk.l3;
import g6.C14205e;
import g6.C14209i;
import g6.D;
import j6.AbstractC14861a;
import j6.C14863c;
import j6.C14864d;
import j6.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o6.C15998b;
import q6.C16475e;
import u6.C17230d;
import u6.p;
import v6.C17514c;

/* renamed from: q6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16473c extends AbstractC16472b {

    /* renamed from: E, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f156850E;

    /* renamed from: F, reason: collision with root package name */
    private final List<AbstractC16472b> f156851F;

    /* renamed from: G, reason: collision with root package name */
    private final RectF f156852G;

    /* renamed from: H, reason: collision with root package name */
    private final RectF f156853H;

    /* renamed from: I, reason: collision with root package name */
    private final RectF f156854I;

    /* renamed from: J, reason: collision with root package name */
    private final p f156855J;

    /* renamed from: K, reason: collision with root package name */
    private final p.a f156856K;

    /* renamed from: L, reason: collision with root package name */
    private float f156857L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f156858M;

    /* renamed from: N, reason: collision with root package name */
    private C14863c f156859N;

    @Override // q6.AbstractC16472b
    protected void I(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        for (int i11 = 0; i11 < this.f156851F.size(); i11++) {
            this.f156851F.get(i11).i(eVar, i10, list, eVar2);
        }
    }

    /* renamed from: q6.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f156860a;

        static {
            int[] iArr = new int[C16475e.b.values().length];
            f156860a = iArr;
            try {
                iArr[C16475e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f156860a[C16475e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public float P() {
        return this.f156857L;
    }

    public void Q(boolean z10) {
        this.f156858M = z10;
    }

    public C16473c(o oVar, C16475e c16475e, List<C16475e> list, C14209i c14209i) {
        int i10;
        AbstractC16472b abstractC16472b;
        super(oVar, c16475e);
        this.f156851F = new ArrayList();
        this.f156852G = new RectF();
        this.f156853H = new RectF();
        this.f156854I = new RectF();
        this.f156855J = new p();
        this.f156856K = new p.a();
        this.f156858M = true;
        C15998b c15998bV = c16475e.v();
        if (c15998bV != null) {
            C14864d c14864dA = c15998bV.a();
            this.f156850E = c14864dA;
            j(c14864dA);
            this.f156850E.a(this);
        } else {
            this.f156850E = null;
        }
        C c10 = new C(c14209i.k().size());
        int size = list.size() - 1;
        AbstractC16472b abstractC16472b2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C16475e c16475e2 = list.get(size);
            AbstractC16472b abstractC16472bV = AbstractC16472b.v(this, c16475e2, oVar, c14209i);
            if (abstractC16472bV != null) {
                c10.i(abstractC16472bV.A().e(), abstractC16472bV);
                if (abstractC16472b2 != null) {
                    abstractC16472b2.J(abstractC16472bV);
                    abstractC16472b2 = null;
                } else {
                    this.f156851F.add(0, abstractC16472bV);
                    int i11 = a.f156860a[c16475e2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        abstractC16472b2 = abstractC16472bV;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < c10.m(); i10++) {
            AbstractC16472b abstractC16472b3 = (AbstractC16472b) c10.d(c10.g(i10));
            if (abstractC16472b3 != null && (abstractC16472b = (AbstractC16472b) c10.d(abstractC16472b3.A().k())) != null) {
                abstractC16472b3.L(abstractC16472b);
            }
        }
        if (z() != null) {
            this.f156859N = new C14863c(this, this, z());
        }
    }

    @Override // q6.AbstractC16472b
    public void K(boolean z10) {
        super.K(z10);
        Iterator<AbstractC16472b> it = this.f156851F.iterator();
        while (it.hasNext()) {
            it.next().K(z10);
        }
    }

    @Override // q6.AbstractC16472b
    public void M(float f10) {
        if (C14205e.h()) {
            C14205e.b("CompositionLayer#setProgress");
        }
        this.f156857L = f10;
        super.M(f10);
        if (this.f156850E != null) {
            f10 = ((this.f156850E.h().floatValue() * this.f156838q.c().i()) - this.f156838q.c().p()) / (this.f156837p.J().e() + 0.01f);
        }
        if (this.f156850E == null) {
            f10 -= this.f156838q.s();
        }
        if (this.f156838q.w() != 0.0f && !"__container".equals(this.f156838q.j())) {
            f10 /= this.f156838q.w();
        }
        for (int size = this.f156851F.size() - 1; size >= 0; size--) {
            this.f156851F.get(size).M(f10);
        }
        if (C14205e.h()) {
            C14205e.c("CompositionLayer#setProgress");
        }
    }

    @Override // q6.AbstractC16472b, n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        C14863c c14863c;
        C14863c c14863c2;
        C14863c c14863c3;
        C14863c c14863c4;
        C14863c c14863c5;
        super.d(t10, c17514c);
        if (t10 == D.f132835E) {
            if (c17514c == null) {
                AbstractC14861a<Float, Float> abstractC14861a = this.f156850E;
                if (abstractC14861a != null) {
                    abstractC14861a.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(c17514c);
            this.f156850E = qVar;
            qVar.a(this);
            j(this.f156850E);
            return;
        }
        if (t10 == D.f132851e && (c14863c5 = this.f156859N) != null) {
            c14863c5.c(c17514c);
            return;
        }
        if (t10 == D.f132837G && (c14863c4 = this.f156859N) != null) {
            c14863c4.f(c17514c);
            return;
        }
        if (t10 == D.f132838H && (c14863c3 = this.f156859N) != null) {
            c14863c3.d(c17514c);
            return;
        }
        if (t10 == D.f132839I && (c14863c2 = this.f156859N) != null) {
            c14863c2.e(c17514c);
        } else if (t10 == D.f132840J && (c14863c = this.f156859N) != null) {
            c14863c.g(c17514c);
        }
    }

    @Override // q6.AbstractC16472b, i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        super.g(rectF, matrix, z10);
        for (int size = this.f156851F.size() - 1; size >= 0; size--) {
            this.f156852G.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f156851F.get(size).g(this.f156852G, this.f156836o, true);
            rectF.union(this.f156852G);
        }
    }

    @Override // q6.AbstractC16472b
    void u(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        boolean z10;
        Canvas canvasJ;
        if (C14205e.h()) {
            C14205e.b("CompositionLayer#draw");
        }
        boolean z11 = false;
        if (c17230d == null && this.f156859N == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean zF0 = this.f156837p.f0();
        int i11 = l3.f92484c;
        if ((zF0 && this.f156851F.size() > 1 && i10 != 255) || (z10 && this.f156837p.g0())) {
            z11 = true;
        }
        if (!z11) {
            i11 = i10;
        }
        C14863c c14863c = this.f156859N;
        if (c14863c != null) {
            c17230d = c14863c.b(matrix, i11);
        }
        if (!this.f156858M && "__container".equals(this.f156838q.j())) {
            this.f156853H.setEmpty();
            Iterator<AbstractC16472b> it = this.f156851F.iterator();
            while (it.hasNext()) {
                it.next().g(this.f156854I, matrix, true);
                this.f156853H.union(this.f156854I);
            }
        } else {
            this.f156853H.set(0.0f, 0.0f, this.f156838q.m(), this.f156838q.l());
            matrix.mapRect(this.f156853H);
        }
        if (z11) {
            this.f156856K.f();
            p.a aVar = this.f156856K;
            aVar.f162748a = i10;
            if (c17230d != null) {
                c17230d.b(aVar);
                c17230d = null;
            }
            canvasJ = this.f156855J.j(canvas, this.f156853H, this.f156856K);
        } else {
            canvasJ = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.f156853H)) {
            for (int size = this.f156851F.size() - 1; size >= 0; size--) {
                this.f156851F.get(size).e(canvasJ, matrix, i11, c17230d);
            }
        }
        if (z11) {
            this.f156855J.e();
        }
        canvas.restore();
        if (C14205e.h()) {
            C14205e.c("CompositionLayer#draw");
        }
    }
}
