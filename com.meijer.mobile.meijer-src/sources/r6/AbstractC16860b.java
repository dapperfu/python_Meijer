package r6;

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
import h6.C14474e;
import h6.C14478i;
import i6.C14689a;
import j6.InterfaceC14951c;
import j6.InterfaceC14953e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15096d;
import k6.C15100h;
import k6.p;
import q6.C16608a;
import q6.i;
import r6.C16863e;
import t6.C17197j;
import v6.C17643d;
import v6.q;
import w6.C17847c;

/* renamed from: r6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16860b implements InterfaceC14953e, AbstractC15093a.b, o6.f {

    /* renamed from: A, reason: collision with root package name */
    private Paint f159266A;

    /* renamed from: B, reason: collision with root package name */
    float f159267B;

    /* renamed from: C, reason: collision with root package name */
    BlurMaskFilter f159268C;

    /* renamed from: D, reason: collision with root package name */
    C14689a f159269D;

    /* renamed from: a, reason: collision with root package name */
    private final Path f159270a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f159271b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f159272c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    private final Paint f159273d = new C14689a(1);

    /* renamed from: e, reason: collision with root package name */
    private final Paint f159274e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f159275f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f159276g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f159277h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f159278i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f159279j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f159280k;

    /* renamed from: l, reason: collision with root package name */
    private final RectF f159281l;

    /* renamed from: m, reason: collision with root package name */
    private final RectF f159282m;

    /* renamed from: n, reason: collision with root package name */
    private final String f159283n;

    /* renamed from: o, reason: collision with root package name */
    protected final Matrix f159284o;

    /* renamed from: p, reason: collision with root package name */
    final o f159285p;

    /* renamed from: q, reason: collision with root package name */
    final C16863e f159286q;

    /* renamed from: r, reason: collision with root package name */
    private C15100h f159287r;

    /* renamed from: s, reason: collision with root package name */
    private C15096d f159288s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC16860b f159289t;

    /* renamed from: u, reason: collision with root package name */
    private AbstractC16860b f159290u;

    /* renamed from: v, reason: collision with root package name */
    private List<AbstractC16860b> f159291v;

    /* renamed from: w, reason: collision with root package name */
    private final List<AbstractC15093a<?, ?>> f159292w;

    /* renamed from: x, reason: collision with root package name */
    public final p f159293x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f159294y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f159295z;

    void I(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
    }

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
    }

    @Override // j6.InterfaceC14953e
    public void e(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        Paint paint;
        Integer numH;
        C14474e.b(this.f159283n);
        if (!this.f159294y || this.f159286q.y()) {
            C14474e.c(this.f159283n);
            return;
        }
        s();
        if (C14474e.h()) {
            C14474e.b("Layer#parentMatrix");
        }
        this.f159271b.reset();
        this.f159271b.set(matrix);
        for (int size = this.f159291v.size() - 1; size >= 0; size--) {
            this.f159271b.preConcat(this.f159291v.get(size).f159293x.f());
        }
        if (C14474e.h()) {
            C14474e.c("Layer#parentMatrix");
        }
        AbstractC15093a<?, Integer> abstractC15093aH = this.f159293x.h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((abstractC15093aH == null || (numH = abstractC15093aH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == q6.h.NORMAL) {
            this.f159271b.preConcat(this.f159293x.f());
            if (C14474e.h()) {
                C14474e.b("Layer#drawLayer");
            }
            u(canvas, this.f159271b, iIntValue, c17643d);
            if (C14474e.h()) {
                C14474e.c("Layer#drawLayer");
            }
            G(C14474e.c(this.f159283n));
            return;
        }
        if (C14474e.h()) {
            C14474e.b("Layer#computeBounds");
        }
        h(this.f159278i, this.f159271b, false);
        E(this.f159278i, matrix);
        this.f159271b.preConcat(this.f159293x.f());
        D(this.f159278i, this.f159271b);
        this.f159279j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f159272c);
        if (!this.f159272c.isIdentity()) {
            Matrix matrix2 = this.f159272c;
            matrix2.invert(matrix2);
            this.f159272c.mapRect(this.f159279j);
        }
        if (!this.f159278i.intersect(this.f159279j)) {
            this.f159278i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (C14474e.h()) {
            C14474e.c("Layer#computeBounds");
        }
        if (this.f159278i.width() >= 1.0f && this.f159278i.height() >= 1.0f) {
            if (C14474e.h()) {
                C14474e.b("Layer#saveLayer");
            }
            this.f159273d.setAlpha(l3.f93323c);
            c2.e.b(this.f159273d, w().b());
            q.n(canvas, this.f159278i, this.f159273d);
            if (C14474e.h()) {
                C14474e.c("Layer#saveLayer");
            }
            if (w() != q6.h.MULTIPLY) {
                t(canvas);
            } else {
                if (this.f159269D == null) {
                    C14689a c14689a = new C14689a();
                    this.f159269D = c14689a;
                    c14689a.setColor(-1);
                }
                RectF rectF = this.f159278i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f159269D);
            }
            if (C14474e.h()) {
                C14474e.b("Layer#drawLayer");
            }
            u(canvas, this.f159271b, iIntValue, c17643d);
            if (C14474e.h()) {
                C14474e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.f159271b);
            }
            if (C()) {
                if (C14474e.h()) {
                    C14474e.b("Layer#drawMatte");
                    C14474e.b("Layer#saveLayer");
                }
                q.o(canvas, this.f159278i, this.f159276g, 19);
                if (C14474e.h()) {
                    C14474e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f159289t.e(canvas, matrix, i10, null);
                if (C14474e.h()) {
                    C14474e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (C14474e.h()) {
                    C14474e.c("Layer#restoreLayer");
                    C14474e.c("Layer#drawMatte");
                }
            }
            if (C14474e.h()) {
                C14474e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (C14474e.h()) {
                C14474e.c("Layer#restoreLayer");
            }
        }
        if (this.f159295z && (paint = this.f159266A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f159266A.setColor(-251901);
            this.f159266A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f159278i, this.f159266A);
            this.f159266A.setStyle(Paint.Style.FILL);
            this.f159266A.setColor(1357638635);
            canvas.drawRect(this.f159278i, this.f159266A);
        }
        G(C14474e.c(this.f159283n));
    }

    abstract void u(Canvas canvas, Matrix matrix, int i10, C17643d c17643d);

    /* renamed from: r6.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f159296a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f159297b;

        static {
            int[] iArr = new int[i.a.values().length];
            f159297b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f159297b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f159297b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f159297b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C16863e.a.values().length];
            f159296a = iArr2;
            try {
                iArr2[C16863e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f159296a[C16863e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f159296a[C16863e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f159296a[C16863e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f159296a[C16863e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f159296a[C16863e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f159296a[C16863e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f159280k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f159287r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                q6.i iVar = this.f159287r.b().get(i10);
                Path pathH = this.f159287r.a().get(i10).h();
                if (pathH != null) {
                    this.f159270a.set(pathH);
                    this.f159270a.transform(matrix);
                    int i11 = a.f159297b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f159270a.computeBounds(this.f159282m, false);
                    if (i10 == 0) {
                        this.f159280k.set(this.f159282m);
                    } else {
                        RectF rectF2 = this.f159280k;
                        rectF2.set(Math.min(rectF2.left, this.f159282m.left), Math.min(this.f159280k.top, this.f159282m.top), Math.max(this.f159280k.right, this.f159282m.right), Math.max(this.f159280k.bottom, this.f159282m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f159280k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void F() {
        this.f159285p.invalidateSelf();
    }

    private void G(float f10) {
        this.f159285p.J().n().a(this.f159286q.j(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z10) {
        if (z10 != this.f159294y) {
            this.f159294y = z10;
            F();
        }
    }

    private void O() {
        if (this.f159286q.f().isEmpty()) {
            N(true);
            return;
        }
        C15096d c15096d = new C15096d(this.f159286q.f());
        this.f159288s = c15096d;
        c15096d.m();
        this.f159288s.a(new AbstractC15093a.b() { // from class: r6.a
            @Override // k6.AbstractC15093a.b
            public final void a() {
                AbstractC16860b abstractC16860b = this.f159265a;
                abstractC16860b.N(abstractC16860b.f159288s.r() == 1.0f);
            }
        });
        N(this.f159288s.h().floatValue() == 1.0f);
        j(this.f159288s);
    }

    private void l(Canvas canvas, Matrix matrix, AbstractC15093a<q6.o, Path> abstractC15093a, AbstractC15093a<Integer, Integer> abstractC15093a2) {
        q.n(canvas, this.f159278i, this.f159274e);
        this.f159270a.set(abstractC15093a.h());
        this.f159270a.transform(matrix);
        this.f159273d.setAlpha((int) (abstractC15093a2.h().intValue() * 2.55f));
        canvas.drawPath(this.f159270a, this.f159273d);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, AbstractC15093a<q6.o, Path> abstractC15093a, AbstractC15093a<Integer, Integer> abstractC15093a2) {
        q.n(canvas, this.f159278i, this.f159273d);
        canvas.drawRect(this.f159278i, this.f159273d);
        this.f159270a.set(abstractC15093a.h());
        this.f159270a.transform(matrix);
        this.f159273d.setAlpha((int) (abstractC15093a2.h().intValue() * 2.55f));
        canvas.drawPath(this.f159270a, this.f159275f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, AbstractC15093a<q6.o, Path> abstractC15093a, AbstractC15093a<Integer, Integer> abstractC15093a2) {
        q.n(canvas, this.f159278i, this.f159274e);
        canvas.drawRect(this.f159278i, this.f159273d);
        this.f159275f.setAlpha((int) (abstractC15093a2.h().intValue() * 2.55f));
        this.f159270a.set(abstractC15093a.h());
        this.f159270a.transform(matrix);
        canvas.drawPath(this.f159270a, this.f159275f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, AbstractC15093a<q6.o, Path> abstractC15093a, AbstractC15093a<Integer, Integer> abstractC15093a2) {
        q.n(canvas, this.f159278i, this.f159275f);
        canvas.drawRect(this.f159278i, this.f159273d);
        this.f159275f.setAlpha((int) (abstractC15093a2.h().intValue() * 2.55f));
        this.f159270a.set(abstractC15093a.h());
        this.f159270a.transform(matrix);
        canvas.drawPath(this.f159270a, this.f159275f);
        canvas.restore();
    }

    private boolean r() {
        if (this.f159287r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f159287r.b().size(); i10++) {
            if (this.f159287r.b().get(i10).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f159291v != null) {
            return;
        }
        if (this.f159290u == null) {
            this.f159291v = Collections.EMPTY_LIST;
            return;
        }
        this.f159291v = new ArrayList();
        for (AbstractC16860b abstractC16860b = this.f159290u; abstractC16860b != null; abstractC16860b = abstractC16860b.f159290u) {
            this.f159291v.add(abstractC16860b);
        }
    }

    static AbstractC16860b v(C16861c c16861c, C16863e c16863e, o oVar, C14478i c14478i) {
        switch (a.f159296a[c16863e.g().ordinal()]) {
            case 1:
                return new C16865g(oVar, c16863e, c16861c, c14478i);
            case 2:
                return new C16861c(oVar, c16863e, c14478i.o(c16863e.n()), c14478i);
            case 3:
                return new C16866h(oVar, c16863e);
            case 4:
                return new C16862d(oVar, c16863e);
            case 5:
                return new C16864f(oVar, c16863e);
            case 6:
                return new C16867i(oVar, c16863e);
            default:
                v6.g.c("Unknown layer type " + c16863e.g());
                return null;
        }
    }

    C16863e A() {
        return this.f159286q;
    }

    boolean B() {
        C15100h c15100h = this.f159287r;
        return (c15100h == null || c15100h.a().isEmpty()) ? false : true;
    }

    boolean C() {
        return this.f159289t != null;
    }

    public void H(AbstractC15093a<?, ?> abstractC15093a) {
        this.f159292w.remove(abstractC15093a);
    }

    void J(AbstractC16860b abstractC16860b) {
        this.f159289t = abstractC16860b;
    }

    void K(boolean z10) {
        if (z10 && this.f159266A == null) {
            this.f159266A = new C14689a();
        }
        this.f159295z = z10;
    }

    void L(AbstractC16860b abstractC16860b) {
        this.f159290u = abstractC16860b;
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        this.f159293x.c(t10, c17847c);
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        AbstractC16860b abstractC16860b = this.f159289t;
        if (abstractC16860b != null) {
            o6.e eVarA = eVar2.a(abstractC16860b.getName());
            if (eVar.c(this.f159289t.getName(), i10)) {
                list.add(eVarA.i(this.f159289t));
            }
            if (eVar.g(this.f159289t.getName(), i10) && eVar.h(getName(), i10)) {
                this.f159289t.I(eVar, eVar.e(this.f159289t.getName(), i10) + i10, list, eVarA);
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

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f159286q.j();
    }

    @Override // j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        this.f159278i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f159284o.set(matrix);
        if (z10) {
            List<AbstractC16860b> list = this.f159291v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f159284o.preConcat(this.f159291v.get(size).f159293x.f());
                }
            } else {
                AbstractC16860b abstractC16860b = this.f159290u;
                if (abstractC16860b != null) {
                    this.f159284o.preConcat(abstractC16860b.f159293x.f());
                }
            }
        }
        this.f159284o.preConcat(this.f159293x.f());
    }

    public void j(AbstractC15093a<?, ?> abstractC15093a) {
        if (abstractC15093a == null) {
            return;
        }
        this.f159292w.add(abstractC15093a);
    }

    public q6.h w() {
        return this.f159286q.a();
    }

    public C16608a x() {
        return this.f159286q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.f159267B == f10) {
            return this.f159268C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f159268C = blurMaskFilter;
        this.f159267B = f10;
        return blurMaskFilter;
    }

    public C17197j z() {
        return this.f159286q.d();
    }

    AbstractC16860b(o oVar, C16863e c16863e) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f159274e = new C14689a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f159275f = new C14689a(1, mode2);
        C14689a c14689a = new C14689a(1);
        this.f159276g = c14689a;
        this.f159277h = new C14689a(PorterDuff.Mode.CLEAR);
        this.f159278i = new RectF();
        this.f159279j = new RectF();
        this.f159280k = new RectF();
        this.f159281l = new RectF();
        this.f159282m = new RectF();
        this.f159284o = new Matrix();
        this.f159292w = new ArrayList();
        this.f159294y = true;
        this.f159267B = 0.0f;
        this.f159285p = oVar;
        this.f159286q = c16863e;
        this.f159283n = c16863e.j() + "#draw";
        if (c16863e.i() == C16863e.b.INVERT) {
            c14689a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c14689a.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = c16863e.x().b();
        this.f159293x = pVarB;
        pVarB.b(this);
        if (c16863e.h() != null && !c16863e.h().isEmpty()) {
            C15100h c15100h = new C15100h(c16863e.h());
            this.f159287r = c15100h;
            Iterator<AbstractC15093a<q6.o, Path>> it = c15100h.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (AbstractC15093a<Integer, Integer> abstractC15093a : this.f159287r.c()) {
                j(abstractC15093a);
                abstractC15093a.a(this);
            }
        }
        O();
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f159286q.i() != C16863e.b.INVERT) {
            this.f159281l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f159289t.h(this.f159281l, matrix, true);
            if (!rectF.intersect(this.f159281l)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
    }

    private void k(Canvas canvas, Matrix matrix, AbstractC15093a<q6.o, Path> abstractC15093a, AbstractC15093a<Integer, Integer> abstractC15093a2) {
        this.f159270a.set(abstractC15093a.h());
        this.f159270a.transform(matrix);
        this.f159273d.setAlpha((int) (abstractC15093a2.h().intValue() * 2.55f));
        canvas.drawPath(this.f159270a, this.f159273d);
    }

    private void p(Canvas canvas, Matrix matrix) {
        if (C14474e.h()) {
            C14474e.b("Layer#saveLayer");
        }
        q.o(canvas, this.f159278i, this.f159274e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (C14474e.h()) {
            C14474e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f159287r.b().size(); i10++) {
            q6.i iVar = this.f159287r.b().get(i10);
            AbstractC15093a<q6.o, Path> abstractC15093a = this.f159287r.a().get(i10);
            AbstractC15093a<Integer, Integer> abstractC15093a2 = this.f159287r.c().get(i10);
            int i11 = a.f159297b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            if (iVar.d()) {
                                m(canvas, matrix, abstractC15093a, abstractC15093a2);
                            } else {
                                k(canvas, matrix, abstractC15093a, abstractC15093a2);
                            }
                        }
                    } else if (iVar.d()) {
                        n(canvas, matrix, abstractC15093a, abstractC15093a2);
                    } else {
                        l(canvas, matrix, abstractC15093a, abstractC15093a2);
                    }
                } else {
                    if (i10 == 0) {
                        this.f159273d.setColor(-16777216);
                        this.f159273d.setAlpha(l3.f93323c);
                        canvas.drawRect(this.f159278i, this.f159273d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, abstractC15093a, abstractC15093a2);
                    } else {
                        q(canvas, matrix, abstractC15093a);
                    }
                }
            } else if (r()) {
                this.f159273d.setAlpha(l3.f93323c);
                canvas.drawRect(this.f159278i, this.f159273d);
            }
        }
        if (C14474e.h()) {
            C14474e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (C14474e.h()) {
            C14474e.c("Layer#restoreLayer");
        }
    }

    private void q(Canvas canvas, Matrix matrix, AbstractC15093a<q6.o, Path> abstractC15093a) {
        this.f159270a.set(abstractC15093a.h());
        this.f159270a.transform(matrix);
        canvas.drawPath(this.f159270a, this.f159275f);
    }

    private void t(Canvas canvas) {
        if (C14474e.h()) {
            C14474e.b("Layer#clearLayer");
        }
        RectF rectF = this.f159278i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f159277h);
        if (C14474e.h()) {
            C14474e.c("Layer#clearLayer");
        }
    }

    void M(float f10) {
        if (C14474e.h()) {
            C14474e.b("BaseLayer#setProgress");
            C14474e.b("BaseLayer#setProgress.transform");
        }
        this.f159293x.j(f10);
        if (C14474e.h()) {
            C14474e.c("BaseLayer#setProgress.transform");
        }
        if (this.f159287r != null) {
            if (C14474e.h()) {
                C14474e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f159287r.a().size(); i10++) {
                this.f159287r.a().get(i10).n(f10);
            }
            if (C14474e.h()) {
                C14474e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f159288s != null) {
            if (C14474e.h()) {
                C14474e.b("BaseLayer#setProgress.inout");
            }
            this.f159288s.n(f10);
            if (C14474e.h()) {
                C14474e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f159289t != null) {
            if (C14474e.h()) {
                C14474e.b("BaseLayer#setProgress.matte");
            }
            this.f159289t.M(f10);
            if (C14474e.h()) {
                C14474e.c("BaseLayer#setProgress.matte");
            }
        }
        if (C14474e.h()) {
            C14474e.b("BaseLayer#setProgress.animations." + this.f159292w.size());
        }
        for (int i11 = 0; i11 < this.f159292w.size(); i11++) {
            this.f159292w.get(i11).n(f10);
        }
        if (C14474e.h()) {
            C14474e.c("BaseLayer#setProgress.animations." + this.f159292w.size());
            C14474e.c("BaseLayer#setProgress");
        }
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        F();
    }
}
