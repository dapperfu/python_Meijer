package q6;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.o;
import com.medallia.digital.mobilesdk.l3;
import g6.C14205e;
import g6.C14209i;
import h6.C14380a;
import i6.InterfaceC14692c;
import i6.InterfaceC14694e;
import j6.AbstractC14861a;
import j6.C14864d;
import j6.C14868h;
import j6.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p6.C16263a;
import p6.i;
import q6.C16475e;
import s6.C16899j;
import u6.C17230d;
import u6.q;
import v6.C17514c;

/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16472b implements InterfaceC14694e, AbstractC14861a.b, n6.f {

    /* renamed from: A, reason: collision with root package name */
    private Paint f156818A;

    /* renamed from: B, reason: collision with root package name */
    float f156819B;

    /* renamed from: C, reason: collision with root package name */
    BlurMaskFilter f156820C;

    /* renamed from: D, reason: collision with root package name */
    C14380a f156821D;

    /* renamed from: a, reason: collision with root package name */
    private final Path f156822a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f156823b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f156824c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    private final Paint f156825d = new C14380a(1);

    /* renamed from: e, reason: collision with root package name */
    private final Paint f156826e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f156827f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f156828g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f156829h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f156830i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f156831j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f156832k;

    /* renamed from: l, reason: collision with root package name */
    private final RectF f156833l;

    /* renamed from: m, reason: collision with root package name */
    private final RectF f156834m;

    /* renamed from: n, reason: collision with root package name */
    private final String f156835n;

    /* renamed from: o, reason: collision with root package name */
    protected final Matrix f156836o;

    /* renamed from: p, reason: collision with root package name */
    final o f156837p;

    /* renamed from: q, reason: collision with root package name */
    final C16475e f156838q;

    /* renamed from: r, reason: collision with root package name */
    private C14868h f156839r;

    /* renamed from: s, reason: collision with root package name */
    private C14864d f156840s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC16472b f156841t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC16472b f156842u;

    /* renamed from: v, reason: collision with root package name */
    private List<AbstractC16472b> f156843v;

    /* renamed from: w, reason: collision with root package name */
    private final List<AbstractC14861a<?, ?>> f156844w;

    /* renamed from: x, reason: collision with root package name */
    public final p f156845x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f156846y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f156847z;

    void I(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
    }

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
    }

    @Override // i6.InterfaceC14694e
    public void e(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        Paint paint;
        Integer numH;
        C14205e.b(this.f156835n);
        if (!this.f156846y || this.f156838q.y()) {
            C14205e.c(this.f156835n);
            return;
        }
        s();
        if (C14205e.h()) {
            C14205e.b("Layer#parentMatrix");
        }
        this.f156823b.reset();
        this.f156823b.set(matrix);
        for (int size = this.f156843v.size() - 1; size >= 0; size--) {
            this.f156823b.preConcat(this.f156843v.get(size).f156845x.f());
        }
        if (C14205e.h()) {
            C14205e.c("Layer#parentMatrix");
        }
        AbstractC14861a<?, Integer> abstractC14861aH = this.f156845x.h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((abstractC14861aH == null || (numH = abstractC14861aH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == p6.h.NORMAL) {
            this.f156823b.preConcat(this.f156845x.f());
            if (C14205e.h()) {
                C14205e.b("Layer#drawLayer");
            }
            u(canvas, this.f156823b, iIntValue, c17230d);
            if (C14205e.h()) {
                C14205e.c("Layer#drawLayer");
            }
            G(C14205e.c(this.f156835n));
            return;
        }
        if (C14205e.h()) {
            C14205e.b("Layer#computeBounds");
        }
        g(this.f156830i, this.f156823b, false);
        E(this.f156830i, matrix);
        this.f156823b.preConcat(this.f156845x.f());
        D(this.f156830i, this.f156823b);
        this.f156831j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f156824c);
        if (!this.f156824c.isIdentity()) {
            Matrix matrix2 = this.f156824c;
            matrix2.invert(matrix2);
            this.f156824c.mapRect(this.f156831j);
        }
        if (!this.f156830i.intersect(this.f156831j)) {
            this.f156830i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (C14205e.h()) {
            C14205e.c("Layer#computeBounds");
        }
        if (this.f156830i.width() >= 1.0f && this.f156830i.height() >= 1.0f) {
            if (C14205e.h()) {
                C14205e.b("Layer#saveLayer");
            }
            this.f156825d.setAlpha(l3.f92484c);
            c2.e.b(this.f156825d, w().b());
            q.n(canvas, this.f156830i, this.f156825d);
            if (C14205e.h()) {
                C14205e.c("Layer#saveLayer");
            }
            if (w() != p6.h.MULTIPLY) {
                t(canvas);
            } else {
                if (this.f156821D == null) {
                    C14380a c14380a = new C14380a();
                    this.f156821D = c14380a;
                    c14380a.setColor(-1);
                }
                RectF rectF = this.f156830i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f156821D);
            }
            if (C14205e.h()) {
                C14205e.b("Layer#drawLayer");
            }
            u(canvas, this.f156823b, iIntValue, c17230d);
            if (C14205e.h()) {
                C14205e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.f156823b);
            }
            if (C()) {
                if (C14205e.h()) {
                    C14205e.b("Layer#drawMatte");
                    C14205e.b("Layer#saveLayer");
                }
                q.o(canvas, this.f156830i, this.f156828g, 19);
                if (C14205e.h()) {
                    C14205e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f156841t.e(canvas, matrix, i10, null);
                if (C14205e.h()) {
                    C14205e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (C14205e.h()) {
                    C14205e.c("Layer#restoreLayer");
                    C14205e.c("Layer#drawMatte");
                }
            }
            if (C14205e.h()) {
                C14205e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (C14205e.h()) {
                C14205e.c("Layer#restoreLayer");
            }
        }
        if (this.f156847z && (paint = this.f156818A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f156818A.setColor(-251901);
            this.f156818A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f156830i, this.f156818A);
            this.f156818A.setStyle(Paint.Style.FILL);
            this.f156818A.setColor(1357638635);
            canvas.drawRect(this.f156830i, this.f156818A);
        }
        G(C14205e.c(this.f156835n));
    }

    abstract void u(Canvas canvas, Matrix matrix, int i10, C17230d c17230d);

    /* renamed from: q6.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f156848a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f156849b;

        static {
            int[] iArr = new int[i.a.values().length];
            f156849b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f156849b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f156849b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f156849b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C16475e.a.values().length];
            f156848a = iArr2;
            try {
                iArr2[C16475e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f156848a[C16475e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f156848a[C16475e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f156848a[C16475e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f156848a[C16475e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f156848a[C16475e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f156848a[C16475e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f156832k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f156839r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                p6.i iVar = this.f156839r.b().get(i10);
                Path pathH = this.f156839r.a().get(i10).h();
                if (pathH != null) {
                    this.f156822a.set(pathH);
                    this.f156822a.transform(matrix);
                    int i11 = a.f156849b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f156822a.computeBounds(this.f156834m, false);
                    if (i10 == 0) {
                        this.f156832k.set(this.f156834m);
                    } else {
                        RectF rectF2 = this.f156832k;
                        rectF2.set(Math.min(rectF2.left, this.f156834m.left), Math.min(this.f156832k.top, this.f156834m.top), Math.max(this.f156832k.right, this.f156834m.right), Math.max(this.f156832k.bottom, this.f156834m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f156832k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void F() {
        this.f156837p.invalidateSelf();
    }

    private void G(float f10) {
        this.f156837p.J().n().a(this.f156838q.j(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z10) {
        if (z10 != this.f156846y) {
            this.f156846y = z10;
            F();
        }
    }

    private void O() {
        if (this.f156838q.f().isEmpty()) {
            N(true);
            return;
        }
        C14864d c14864d = new C14864d(this.f156838q.f());
        this.f156840s = c14864d;
        c14864d.m();
        this.f156840s.a(new AbstractC14861a.b() { // from class: q6.a
            @Override // j6.AbstractC14861a.b
            public final void a() {
                AbstractC16472b abstractC16472b = this.f156817a;
                abstractC16472b.N(abstractC16472b.f156840s.r() == 1.0f);
            }
        });
        N(this.f156840s.h().floatValue() == 1.0f);
        j(this.f156840s);
    }

    private void l(Canvas canvas, Matrix matrix, AbstractC14861a<p6.o, Path> abstractC14861a, AbstractC14861a<Integer, Integer> abstractC14861a2) {
        q.n(canvas, this.f156830i, this.f156826e);
        this.f156822a.set(abstractC14861a.h());
        this.f156822a.transform(matrix);
        this.f156825d.setAlpha((int) (abstractC14861a2.h().intValue() * 2.55f));
        canvas.drawPath(this.f156822a, this.f156825d);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, AbstractC14861a<p6.o, Path> abstractC14861a, AbstractC14861a<Integer, Integer> abstractC14861a2) {
        q.n(canvas, this.f156830i, this.f156825d);
        canvas.drawRect(this.f156830i, this.f156825d);
        this.f156822a.set(abstractC14861a.h());
        this.f156822a.transform(matrix);
        this.f156825d.setAlpha((int) (abstractC14861a2.h().intValue() * 2.55f));
        canvas.drawPath(this.f156822a, this.f156827f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, AbstractC14861a<p6.o, Path> abstractC14861a, AbstractC14861a<Integer, Integer> abstractC14861a2) {
        q.n(canvas, this.f156830i, this.f156826e);
        canvas.drawRect(this.f156830i, this.f156825d);
        this.f156827f.setAlpha((int) (abstractC14861a2.h().intValue() * 2.55f));
        this.f156822a.set(abstractC14861a.h());
        this.f156822a.transform(matrix);
        canvas.drawPath(this.f156822a, this.f156827f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, AbstractC14861a<p6.o, Path> abstractC14861a, AbstractC14861a<Integer, Integer> abstractC14861a2) {
        q.n(canvas, this.f156830i, this.f156827f);
        canvas.drawRect(this.f156830i, this.f156825d);
        this.f156827f.setAlpha((int) (abstractC14861a2.h().intValue() * 2.55f));
        this.f156822a.set(abstractC14861a.h());
        this.f156822a.transform(matrix);
        canvas.drawPath(this.f156822a, this.f156827f);
        canvas.restore();
    }

    private boolean r() {
        if (this.f156839r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f156839r.b().size(); i10++) {
            if (this.f156839r.b().get(i10).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f156843v != null) {
            return;
        }
        if (this.f156842u == null) {
            this.f156843v = Collections.EMPTY_LIST;
            return;
        }
        this.f156843v = new ArrayList();
        for (AbstractC16472b abstractC16472b = this.f156842u; abstractC16472b != null; abstractC16472b = abstractC16472b.f156842u) {
            this.f156843v.add(abstractC16472b);
        }
    }

    static AbstractC16472b v(C16473c c16473c, C16475e c16475e, o oVar, C14209i c14209i) {
        switch (a.f156848a[c16475e.g().ordinal()]) {
            case 1:
                return new C16477g(oVar, c16475e, c16473c, c14209i);
            case 2:
                return new C16473c(oVar, c16475e, c14209i.o(c16475e.n()), c14209i);
            case 3:
                return new C16478h(oVar, c16475e);
            case 4:
                return new C16474d(oVar, c16475e);
            case 5:
                return new C16476f(oVar, c16475e);
            case 6:
                return new C16479i(oVar, c16475e);
            default:
                u6.g.c("Unknown layer type " + c16475e.g());
                return null;
        }
    }

    C16475e A() {
        return this.f156838q;
    }

    boolean B() {
        C14868h c14868h = this.f156839r;
        return (c14868h == null || c14868h.a().isEmpty()) ? false : true;
    }

    boolean C() {
        return this.f156841t != null;
    }

    public void H(AbstractC14861a<?, ?> abstractC14861a) {
        this.f156844w.remove(abstractC14861a);
    }

    void J(AbstractC16472b abstractC16472b) {
        this.f156841t = abstractC16472b;
    }

    void K(boolean z10) {
        if (z10 && this.f156818A == null) {
            this.f156818A = new C14380a();
        }
        this.f156847z = z10;
    }

    void L(AbstractC16472b abstractC16472b) {
        this.f156842u = abstractC16472b;
    }

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        this.f156845x.c(t10, c17514c);
    }

    @Override // i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f156830i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f156836o.set(matrix);
        if (z10) {
            List<AbstractC16472b> list = this.f156843v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f156836o.preConcat(this.f156843v.get(size).f156845x.f());
                }
            } else {
                AbstractC16472b abstractC16472b = this.f156842u;
                if (abstractC16472b != null) {
                    this.f156836o.preConcat(abstractC16472b.f156845x.f());
                }
            }
        }
        this.f156836o.preConcat(this.f156845x.f());
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f156838q.j();
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        AbstractC16472b abstractC16472b = this.f156841t;
        if (abstractC16472b != null) {
            n6.e eVarA = eVar2.a(abstractC16472b.getName());
            if (eVar.c(this.f156841t.getName(), i10)) {
                list.add(eVarA.i(this.f156841t));
            }
            if (eVar.g(this.f156841t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f156841t.I(eVar, eVar.e(this.f156841t.getName(), i10) + i10, list, eVarA);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                I(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    public void j(AbstractC14861a<?, ?> abstractC14861a) {
        if (abstractC14861a == null) {
            return;
        }
        this.f156844w.add(abstractC14861a);
    }

    public p6.h w() {
        return this.f156838q.a();
    }

    public C16263a x() {
        return this.f156838q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.f156819B == f10) {
            return this.f156820C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f156820C = blurMaskFilter;
        this.f156819B = f10;
        return blurMaskFilter;
    }

    public C16899j z() {
        return this.f156838q.d();
    }

    AbstractC16472b(o oVar, C16475e c16475e) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f156826e = new C14380a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f156827f = new C14380a(1, mode2);
        C14380a c14380a = new C14380a(1);
        this.f156828g = c14380a;
        this.f156829h = new C14380a(PorterDuff.Mode.CLEAR);
        this.f156830i = new RectF();
        this.f156831j = new RectF();
        this.f156832k = new RectF();
        this.f156833l = new RectF();
        this.f156834m = new RectF();
        this.f156836o = new Matrix();
        this.f156844w = new ArrayList();
        this.f156846y = true;
        this.f156819B = 0.0f;
        this.f156837p = oVar;
        this.f156838q = c16475e;
        this.f156835n = c16475e.j() + "#draw";
        if (c16475e.i() == C16475e.b.INVERT) {
            c14380a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c14380a.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = c16475e.x().b();
        this.f156845x = pVarB;
        pVarB.b(this);
        if (c16475e.h() != null && !c16475e.h().isEmpty()) {
            C14868h c14868h = new C14868h(c16475e.h());
            this.f156839r = c14868h;
            Iterator<AbstractC14861a<p6.o, Path>> it = c14868h.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (AbstractC14861a<Integer, Integer> abstractC14861a : this.f156839r.c()) {
                j(abstractC14861a);
                abstractC14861a.a(this);
            }
        }
        O();
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f156838q.i() != C16475e.b.INVERT) {
            this.f156833l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f156841t.g(this.f156833l, matrix, true);
            if (!rectF.intersect(this.f156833l)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void k(Canvas canvas, Matrix matrix, AbstractC14861a<p6.o, Path> abstractC14861a, AbstractC14861a<Integer, Integer> abstractC14861a2) {
        this.f156822a.set(abstractC14861a.h());
        this.f156822a.transform(matrix);
        this.f156825d.setAlpha((int) (abstractC14861a2.h().intValue() * 2.55f));
        canvas.drawPath(this.f156822a, this.f156825d);
    }

    private void p(Canvas canvas, Matrix matrix) {
        if (C14205e.h()) {
            C14205e.b("Layer#saveLayer");
        }
        q.o(canvas, this.f156830i, this.f156826e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (C14205e.h()) {
            C14205e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f156839r.b().size(); i10++) {
            p6.i iVar = this.f156839r.b().get(i10);
            AbstractC14861a<p6.o, Path> abstractC14861a = this.f156839r.a().get(i10);
            AbstractC14861a<Integer, Integer> abstractC14861a2 = this.f156839r.c().get(i10);
            int i11 = a.f156849b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            if (iVar.d()) {
                                m(canvas, matrix, abstractC14861a, abstractC14861a2);
                            } else {
                                k(canvas, matrix, abstractC14861a, abstractC14861a2);
                            }
                        }
                    } else if (iVar.d()) {
                        n(canvas, matrix, abstractC14861a, abstractC14861a2);
                    } else {
                        l(canvas, matrix, abstractC14861a, abstractC14861a2);
                    }
                } else {
                    if (i10 == 0) {
                        this.f156825d.setColor(-16777216);
                        this.f156825d.setAlpha(l3.f92484c);
                        canvas.drawRect(this.f156830i, this.f156825d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, abstractC14861a, abstractC14861a2);
                    } else {
                        q(canvas, matrix, abstractC14861a);
                    }
                }
            } else if (r()) {
                this.f156825d.setAlpha(l3.f92484c);
                canvas.drawRect(this.f156830i, this.f156825d);
            }
        }
        if (C14205e.h()) {
            C14205e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (C14205e.h()) {
            C14205e.c("Layer#restoreLayer");
        }
    }

    private void q(Canvas canvas, Matrix matrix, AbstractC14861a<p6.o, Path> abstractC14861a) {
        this.f156822a.set(abstractC14861a.h());
        this.f156822a.transform(matrix);
        canvas.drawPath(this.f156822a, this.f156827f);
    }

    private void t(Canvas canvas) {
        if (C14205e.h()) {
            C14205e.b("Layer#clearLayer");
        }
        RectF rectF = this.f156830i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f156829h);
        if (C14205e.h()) {
            C14205e.c("Layer#clearLayer");
        }
    }

    void M(float f10) {
        if (C14205e.h()) {
            C14205e.b("BaseLayer#setProgress");
            C14205e.b("BaseLayer#setProgress.transform");
        }
        this.f156845x.j(f10);
        if (C14205e.h()) {
            C14205e.c("BaseLayer#setProgress.transform");
        }
        if (this.f156839r != null) {
            if (C14205e.h()) {
                C14205e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f156839r.a().size(); i10++) {
                this.f156839r.a().get(i10).n(f10);
            }
            if (C14205e.h()) {
                C14205e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f156840s != null) {
            if (C14205e.h()) {
                C14205e.b("BaseLayer#setProgress.inout");
            }
            this.f156840s.n(f10);
            if (C14205e.h()) {
                C14205e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f156841t != null) {
            if (C14205e.h()) {
                C14205e.b("BaseLayer#setProgress.matte");
            }
            this.f156841t.M(f10);
            if (C14205e.h()) {
                C14205e.c("BaseLayer#setProgress.matte");
            }
        }
        if (C14205e.h()) {
            C14205e.b("BaseLayer#setProgress.animations." + this.f156844w.size());
        }
        for (int i11 = 0; i11 < this.f156844w.size(); i11++) {
            this.f156844w.get(i11).n(f10);
        }
        if (C14205e.h()) {
            C14205e.c("BaseLayer#setProgress.animations." + this.f156844w.size());
            C14205e.c("BaseLayer#setProgress");
        }
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        F();
    }
}
