package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fullstory.instrumentation.FSDraw;
import com.medallia.digital.mobilesdk.l3;
import h6.C14471b;
import h6.C14474e;
import h6.C14478i;
import h6.D;
import h6.EnumC14470a;
import h6.H;
import h6.InterfaceC14472c;
import h6.K;
import h6.M;
import h6.y;
import h6.z;
import i6.C14689a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m6.EnumC15680a;
import n6.C15917a;
import n6.C15918b;
import r6.C16861c;
import t6.v;
import w6.C17847c;

/* loaded from: classes4.dex */
public class o extends Drawable implements Drawable.Callback, Animatable, FSDraw {

    /* renamed from: T, reason: collision with root package name */
    private static final boolean f63656T;

    /* renamed from: U, reason: collision with root package name */
    private static final List<String> f63657U;

    /* renamed from: V, reason: collision with root package name */
    private static final Executor f63658V;

    /* renamed from: A, reason: collision with root package name */
    private Canvas f63659A;

    /* renamed from: B, reason: collision with root package name */
    private Rect f63660B;

    /* renamed from: C, reason: collision with root package name */
    private RectF f63661C;

    /* renamed from: D, reason: collision with root package name */
    private Paint f63662D;

    /* renamed from: E, reason: collision with root package name */
    private Rect f63663E;

    /* renamed from: F, reason: collision with root package name */
    private Rect f63664F;

    /* renamed from: G, reason: collision with root package name */
    private RectF f63665G;

    /* renamed from: H, reason: collision with root package name */
    private RectF f63666H;

    /* renamed from: I, reason: collision with root package name */
    private Matrix f63667I;

    /* renamed from: J, reason: collision with root package name */
    private float[] f63668J;

    /* renamed from: K, reason: collision with root package name */
    private Matrix f63669K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f63670L;

    /* renamed from: M, reason: collision with root package name */
    private EnumC14470a f63671M;

    /* renamed from: N, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f63672N;

    /* renamed from: O, reason: collision with root package name */
    private final Semaphore f63673O;

    /* renamed from: P, reason: collision with root package name */
    private Handler f63674P;

    /* renamed from: Q, reason: collision with root package name */
    private Runnable f63675Q;

    /* renamed from: R, reason: collision with root package name */
    private final Runnable f63676R;

    /* renamed from: S, reason: collision with root package name */
    private float f63677S;

    /* renamed from: a, reason: collision with root package name */
    private C14478i f63678a;

    /* renamed from: b, reason: collision with root package name */
    private final v6.j f63679b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f63680c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f63681d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f63682e;

    /* renamed from: f, reason: collision with root package name */
    private b f63683f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f63684g;

    /* renamed from: h, reason: collision with root package name */
    private C15918b f63685h;

    /* renamed from: i, reason: collision with root package name */
    private String f63686i;

    /* renamed from: j, reason: collision with root package name */
    private C15917a f63687j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, Typeface> f63688k;

    /* renamed from: l, reason: collision with root package name */
    String f63689l;

    /* renamed from: m, reason: collision with root package name */
    private final p f63690m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f63691n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f63692o;

    /* renamed from: p, reason: collision with root package name */
    private C16861c f63693p;

    /* renamed from: q, reason: collision with root package name */
    private int f63694q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f63695r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f63696s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f63697t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f63698u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f63699v;

    /* renamed from: w, reason: collision with root package name */
    private K f63700w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f63701x;

    /* renamed from: y, reason: collision with root package name */
    private final Matrix f63702y;

    /* renamed from: z, reason: collision with root package name */
    private Bitmap f63703z;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(C14478i c14478i);
    }

    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    public void S0(M m10) {
    }

    public M a0() {
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    static {
        f63656T = Build.VERSION.SDK_INT <= 25;
        f63657U = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f63658V = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new v6.h());
    }

    private void C(int i10, int i11) {
        Bitmap bitmap = this.f63703z;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f63703z.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f63703z = bitmapCreateBitmap;
            this.f63659A.setBitmap(bitmapCreateBitmap);
            this.f63670L = true;
            return;
        }
        if (this.f63703z.getWidth() > i10 || this.f63703z.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f63703z, 0, 0, i10, i11);
            this.f63703z = bitmapCreateBitmap2;
            this.f63659A.setBitmap(bitmapCreateBitmap2);
            this.f63670L = true;
        }
    }

    private void D() {
        if (this.f63659A != null) {
            return;
        }
        this.f63659A = new Canvas();
        this.f63666H = new RectF();
        this.f63667I = new Matrix();
        this.f63669K = new Matrix();
        this.f63660B = new Rect();
        this.f63661C = new RectF();
        this.f63662D = new C14689a();
        this.f63663E = new Rect();
        this.f63664F = new Rect();
        this.f63665G = new RectF();
    }

    private C15918b N() {
        C15918b c15918b = this.f63685h;
        if (c15918b != null && !c15918b.b(K())) {
            this.f63685h = null;
        }
        if (this.f63685h == null) {
            this.f63685h = new C15918b(getCallback(), this.f63686i, null, this.f63678a.j());
        }
        return this.f63685h;
    }

    private boolean U0() {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            return false;
        }
        float f10 = this.f63677S;
        float fL = this.f63679b.l();
        this.f63677S = fL;
        return Math.abs(fL - f10) * c14478i.d() >= 50.0f;
    }

    public static /* synthetic */ void k(final o oVar) {
        C16861c c16861c = oVar.f63693p;
        if (c16861c == null) {
            return;
        }
        try {
            oVar.f63673O.acquire();
            c16861c.M(oVar.f63679b.l());
            if (f63656T && oVar.f63670L) {
                if (oVar.f63674P == null) {
                    oVar.f63674P = new Handler(Looper.getMainLooper());
                    oVar.f63675Q = new Runnable() { // from class: h6.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.airbnb.lottie.o.n(this.f135154a);
                        }
                    };
                }
                oVar.f63674P.post(oVar.f63675Q);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th2) {
            oVar.f63673O.release();
            throw th2;
        }
        oVar.f63673O.release();
    }

    private void k0(Canvas canvas, C16861c c16861c) {
        if (this.f63678a == null || c16861c == null) {
            return;
        }
        D();
        canvas.getMatrix(this.f63667I);
        canvas.getClipBounds(this.f63660B);
        v(this.f63660B, this.f63661C);
        this.f63667I.mapRect(this.f63661C);
        w(this.f63661C, this.f63660B);
        if (this.f63692o) {
            this.f63666H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c16861c.h(this.f63666H, null, false);
        }
        this.f63667I.mapRect(this.f63666H);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        n0(this.f63666H, fWidth, fHeight);
        if (!c0()) {
            RectF rectF = this.f63666H;
            Rect rect = this.f63660B;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f63666H.width());
        int iCeil2 = (int) Math.ceil(this.f63666H.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        C(iCeil, iCeil2);
        if (this.f63670L) {
            this.f63667I.getValues(this.f63668J);
            float[] fArr = this.f63668J;
            float f10 = fArr[0];
            float f11 = fArr[4];
            this.f63702y.set(this.f63667I);
            this.f63702y.preScale(fWidth, fHeight);
            Matrix matrix = this.f63702y;
            RectF rectF2 = this.f63666H;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f63702y.postScale(1.0f / f10, 1.0f / f11);
            this.f63703z.eraseColor(0);
            this.f63659A.setMatrix(v6.q.f165686a);
            this.f63659A.scale(f10, f11);
            c16861c.e(this.f63659A, this.f63702y, this.f63694q, null);
            this.f63667I.invert(this.f63669K);
            this.f63669K.mapRect(this.f63665G, this.f63666H);
            w(this.f63665G, this.f63664F);
        }
        this.f63663E.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f63703z, this.f63663E, this.f63664F, this.f63662D);
    }

    private void n0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private void s() {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            return;
        }
        C16861c c16861c = new C16861c(this, v.a(c14478i), c14478i.k(), c14478i);
        this.f63693p = c16861c;
        if (this.f63696s) {
            c16861c.K(true);
        }
        this.f63693p.Q(this.f63692o);
    }

    private void u() {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            return;
        }
        this.f63701x = this.f63700w.b(Build.VERSION.SDK_INT, c14478i.q(), c14478i.m());
    }

    private void v(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void w(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void y(Canvas canvas, Matrix matrix, C16861c c16861c, int i10) {
        if (!this.f63701x) {
            c16861c.e(canvas, matrix, i10, null);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        k0(canvas, c16861c);
        canvas.restore();
    }

    private void z(Canvas canvas) {
        C16861c c16861c = this.f63693p;
        C14478i c14478i = this.f63678a;
        if (c16861c == null || c14478i == null) {
            return;
        }
        this.f63702y.reset();
        if (!getBounds().isEmpty()) {
            this.f63702y.preTranslate(r2.left, r2.top);
            this.f63702y.preScale(r2.width() / c14478i.b().width(), r2.height() / c14478i.b().height());
        }
        c16861c.e(canvas, this.f63702y, this.f63694q, null);
    }

    public void A(y yVar, boolean z10) {
        boolean zA = this.f63690m.a(yVar, z10);
        if (this.f63678a == null || !zA) {
            return;
        }
        s();
    }

    public void A0(String str) {
        this.f63686i = str;
    }

    public void B() {
        this.f63684g.clear();
        this.f63679b.k();
        if (isVisible()) {
            return;
        }
        this.f63683f = b.NONE;
    }

    public void B0(boolean z10) {
        this.f63691n = z10;
    }

    public void C0(final int i10) {
        if (this.f63678a == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i) {
                    this.f63629a.C0(i10);
                }
            });
        } else {
            this.f63679b.C(i10 + 0.99f);
        }
    }

    public void D0(final String str) {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i2) {
                    this.f63645a.D0(str);
                }
            });
            return;
        }
        o6.h hVarL = c14478i.l(str);
        if (hVarL != null) {
            C0((int) (hVarL.f153654b + hVarL.f153655c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public EnumC14470a E() {
        EnumC14470a enumC14470a = this.f63671M;
        return enumC14470a != null ? enumC14470a : C14474e.d();
    }

    public void E0(final float f10) {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i2) {
                    this.f63639a.E0(f10);
                }
            });
        } else {
            this.f63679b.C(v6.l.i(c14478i.p(), this.f63678a.f(), f10));
        }
    }

    public void F0(final int i10, final int i11) {
        if (this.f63678a == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i) {
                    this.f63641a.F0(i10, i11);
                }
            });
        } else {
            this.f63679b.D(i10, i11 + 0.99f);
        }
    }

    public void G0(final String str) {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i2) {
                    this.f63627a.G0(str);
                }
            });
            return;
        }
        o6.h hVarL = c14478i.l(str);
        if (hVarL != null) {
            int i10 = (int) hVarL.f153654b;
            F0(i10, ((int) hVarL.f153655c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public boolean H() {
        return this.f63699v;
    }

    public void H0(final int i10) {
        if (this.f63678a == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i) {
                    this.f63633a.H0(i10);
                }
            });
        } else {
            this.f63679b.E(i10);
        }
    }

    public boolean I() {
        return this.f63692o;
    }

    public void I0(final String str) {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i2) {
                    this.f63647a.I0(str);
                }
            });
            return;
        }
        o6.h hVarL = c14478i.l(str);
        if (hVarL != null) {
            H0((int) hVarL.f153654b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public C14478i J() {
        return this.f63678a;
    }

    public void J0(final float f10) {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i2) {
                    this.f63650a.J0(f10);
                }
            });
        } else {
            H0((int) v6.l.i(c14478i.p(), this.f63678a.f(), f10));
        }
    }

    public void K0(boolean z10) {
        if (this.f63696s == z10) {
            return;
        }
        this.f63696s = z10;
        C16861c c16861c = this.f63693p;
        if (c16861c != null) {
            c16861c.K(z10);
        }
    }

    public void L0(boolean z10) {
        this.f63695r = z10;
        C14478i c14478i = this.f63678a;
        if (c14478i != null) {
            c14478i.w(z10);
        }
    }

    public int M() {
        return (int) this.f63679b.m();
    }

    public void M0(final float f10) {
        if (this.f63678a == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i) {
                    this.f63652a.M0(f10);
                }
            });
            return;
        }
        if (C14474e.h()) {
            C14474e.b("Drawable#setProgress");
        }
        this.f63679b.A(this.f63678a.h(f10));
        if (C14474e.h()) {
            C14474e.c("Drawable#setProgress");
        }
    }

    public void N0(K k10) {
        this.f63700w = k10;
        u();
    }

    public String O() {
        return this.f63686i;
    }

    public void O0(int i10) {
        this.f63679b.setRepeatCount(i10);
    }

    public z P(String str) {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            return null;
        }
        return c14478i.j().get(str);
    }

    public void P0(int i10) {
        this.f63679b.setRepeatMode(i10);
    }

    public boolean Q() {
        return this.f63691n;
    }

    public void Q0(boolean z10) {
        this.f63682e = z10;
    }

    public o6.h R() {
        Iterator<String> it = f63657U.iterator();
        o6.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f63678a.l(it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public void R0(float f10) {
        this.f63679b.F(f10);
    }

    public float S() {
        return this.f63679b.o();
    }

    public float T() {
        return this.f63679b.p();
    }

    public void T0(boolean z10) {
        this.f63679b.G(z10);
    }

    public H U() {
        C14478i c14478i = this.f63678a;
        if (c14478i != null) {
            return c14478i.n();
        }
        return null;
    }

    public float V() {
        return this.f63679b.l();
    }

    public boolean V0() {
        return this.f63688k == null && this.f63678a.c().m() > 0;
    }

    public K W() {
        return this.f63701x ? K.SOFTWARE : K.HARDWARE;
    }

    public int X() {
        return this.f63679b.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int Y() {
        return this.f63679b.getRepeatMode();
    }

    public float Z() {
        return this.f63679b.q();
    }

    public Typeface b0(o6.c cVar) {
        Map<String, Typeface> map = this.f63688k;
        if (map != null) {
            String strA = cVar.a();
            if (map.containsKey(strA)) {
                return map.get(strA);
            }
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return map.get(strB);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C15917a c15917aL = L();
        if (c15917aL != null) {
            return c15917aL.b(cVar);
        }
        return null;
    }

    public boolean d0() {
        v6.j jVar = this.f63679b;
        if (jVar == null) {
            return false;
        }
        return jVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C16861c c16861c = this.f63693p;
        if (c16861c == null) {
            return;
        }
        boolean zF = F();
        if (zF) {
            try {
                this.f63673O.acquire();
            } catch (InterruptedException unused) {
                if (C14474e.h()) {
                    C14474e.c("Drawable#draw");
                }
                if (!zF) {
                    return;
                }
                this.f63673O.release();
                if (c16861c.P() == this.f63679b.l()) {
                    return;
                }
            } catch (Throwable th2) {
                if (C14474e.h()) {
                    C14474e.c("Drawable#draw");
                }
                if (zF) {
                    this.f63673O.release();
                    if (c16861c.P() != this.f63679b.l()) {
                        f63658V.execute(this.f63676R);
                    }
                }
                throw th2;
            }
        }
        if (C14474e.h()) {
            C14474e.b("Drawable#draw");
        }
        if (zF && U0()) {
            M0(this.f63679b.l());
        }
        if (this.f63682e) {
            try {
                if (this.f63701x) {
                    k0(canvas, c16861c);
                } else {
                    z(canvas);
                }
            } catch (Throwable th3) {
                v6.g.b("Lottie crashed in draw!", th3);
            }
        } else if (this.f63701x) {
            k0(canvas, c16861c);
        } else {
            z(canvas);
        }
        this.f63670L = false;
        if (C14474e.h()) {
            C14474e.c("Drawable#draw");
        }
        if (zF) {
            this.f63673O.release();
            if (c16861c.P() == this.f63679b.l()) {
                return;
            }
            f63658V.execute(this.f63676R);
        }
    }

    public boolean f0() {
        return this.f63697t;
    }

    public boolean g0() {
        return this.f63698u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f63694q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            return -1;
        }
        return c14478i.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C14478i c14478i = this.f63678a;
        if (c14478i == null) {
            return -1;
        }
        return c14478i.b().width();
    }

    public boolean h0(y yVar) {
        return this.f63690m.b(yVar);
    }

    public void i0() {
        this.f63684g.clear();
        this.f63679b.s();
        if (isVisible()) {
            return;
        }
        this.f63683f = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f63670L) {
            return;
        }
        this.f63670L = true;
        if ((!f63656T || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void j0() {
        if (this.f63693p == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i) {
                    this.f63649a.j0();
                }
            });
            return;
        }
        u();
        if (r(K()) || X() == 0) {
            if (isVisible()) {
                this.f63679b.t();
                this.f63683f = b.NONE;
            } else {
                this.f63683f = b.PLAY;
            }
        }
        if (r(K())) {
            return;
        }
        o6.h hVarR = R();
        if (hVarR != null) {
            x0((int) hVarR.f153654b);
        } else {
            x0((int) (Z() < 0.0f ? T() : S()));
        }
        this.f63679b.k();
        if (isVisible()) {
            return;
        }
        this.f63683f = b.NONE;
    }

    public List<o6.e> l0(o6.e eVar) {
        if (this.f63693p == null) {
            v6.g.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f63693p.g(eVar, 0, arrayList, new o6.e(new String[0]));
        return arrayList;
    }

    public void m0() {
        if (this.f63693p == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i) {
                    this.f63644a.m0();
                }
            });
            return;
        }
        u();
        if (r(K()) || X() == 0) {
            if (isVisible()) {
                this.f63679b.x();
                this.f63683f = b.NONE;
            } else {
                this.f63683f = b.RESUME;
            }
        }
        if (r(K())) {
            return;
        }
        x0((int) (Z() < 0.0f ? T() : S()));
        this.f63679b.k();
        if (isVisible()) {
            return;
        }
        this.f63683f = b.NONE;
    }

    public void o0(boolean z10) {
        this.f63697t = z10;
    }

    public void p0(boolean z10) {
        this.f63698u = z10;
    }

    public <T> void q(final o6.e eVar, final T t10, final C17847c<T> c17847c) {
        C16861c c16861c = this.f63693p;
        if (c16861c == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i) {
                    this.f63635a.q(eVar, t10, c17847c);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == o6.e.f153648c) {
            c16861c.f(t10, c17847c);
        } else if (eVar.d() != null) {
            eVar.d().f(t10, c17847c);
        } else {
            List<o6.e> listL0 = l0(eVar);
            for (int i10 = 0; i10 < listL0.size(); i10++) {
                listL0.get(i10).d().f(t10, c17847c);
            }
            zIsEmpty = true ^ listL0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t10 == D.f135011E) {
                M0(V());
            }
        }
    }

    public void q0(EnumC14470a enumC14470a) {
        this.f63671M = enumC14470a;
    }

    public boolean r(Context context) {
        if (this.f63681d) {
            return true;
        }
        return this.f63680c && C14474e.f().a(context) == EnumC15680a.STANDARD_MOTION;
    }

    public void r0(boolean z10) {
        if (z10 != this.f63699v) {
            this.f63699v = z10;
            invalidateSelf();
        }
    }

    public void s0(boolean z10) {
        if (z10 != this.f63692o) {
            this.f63692o = z10;
            C16861c c16861c = this.f63693p;
            if (c16861c != null) {
                c16861c.Q(z10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f63694q = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        v6.g.c("Use addColorFilter instead.");
    }

    public void t() {
        if (this.f63679b.isRunning()) {
            this.f63679b.cancel();
            if (!isVisible()) {
                this.f63683f = b.NONE;
            }
        }
        this.f63678a = null;
        this.f63693p = null;
        this.f63685h = null;
        this.f63677S = -3.4028235E38f;
        this.f63679b.j();
        invalidateSelf();
    }

    public boolean t0(C14478i c14478i) {
        if (this.f63678a == c14478i) {
            return false;
        }
        this.f63670L = true;
        t();
        this.f63678a = c14478i;
        s();
        this.f63679b.z(c14478i);
        M0(this.f63679b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f63684g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(c14478i);
            }
            it.remove();
        }
        this.f63684g.clear();
        c14478i.w(this.f63695r);
        u();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void u0(String str) {
        this.f63689l = str;
        C15917a c15917aL = L();
        if (c15917aL != null) {
            c15917aL.c(str);
        }
    }

    public void v0(C14471b c14471b) {
        C15917a c15917a = this.f63687j;
        if (c15917a != null) {
            c15917a.d(c14471b);
        }
    }

    public void w0(Map<String, Typeface> map) {
        if (map == this.f63688k) {
            return;
        }
        this.f63688k = map;
        invalidateSelf();
    }

    public void x(Canvas canvas, Matrix matrix) {
        C16861c c16861c = this.f63693p;
        C14478i c14478i = this.f63678a;
        if (c16861c == null || c14478i == null) {
            return;
        }
        boolean zF = F();
        if (zF) {
            try {
                this.f63673O.acquire();
                if (U0()) {
                    M0(this.f63679b.l());
                }
            } catch (InterruptedException unused) {
                if (!zF) {
                    return;
                }
                this.f63673O.release();
                if (c16861c.P() == this.f63679b.l()) {
                    return;
                }
            } catch (Throwable th2) {
                if (zF) {
                    this.f63673O.release();
                    if (c16861c.P() != this.f63679b.l()) {
                        f63658V.execute(this.f63676R);
                    }
                }
                throw th2;
            }
        }
        if (this.f63682e) {
            try {
                y(canvas, matrix, c16861c, this.f63694q);
            } catch (Throwable th3) {
                v6.g.b("Lottie crashed in draw!", th3);
            }
        } else {
            y(canvas, matrix, c16861c, this.f63694q);
        }
        this.f63670L = false;
        if (zF) {
            this.f63673O.release();
            if (c16861c.P() == this.f63679b.l()) {
                return;
            }
            f63658V.execute(this.f63676R);
        }
    }

    public void x0(final int i10) {
        if (this.f63678a == null) {
            this.f63684g.add(new a() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.o.a
                public final void a(C14478i c14478i) {
                    this.f63654a.x0(i10);
                }
            });
        } else {
            this.f63679b.A(i10);
        }
    }

    @Deprecated
    public void y0(boolean z10) {
        this.f63681d = z10;
    }

    public void z0(InterfaceC14472c interfaceC14472c) {
        C15918b c15918b = this.f63685h;
        if (c15918b != null) {
            c15918b.d(interfaceC14472c);
        }
    }

    public o() {
        v6.j jVar = new v6.j();
        this.f63679b = jVar;
        this.f63680c = true;
        this.f63681d = false;
        this.f63682e = false;
        this.f63683f = b.NONE;
        this.f63684g = new ArrayList<>();
        this.f63690m = new p();
        this.f63691n = false;
        this.f63692o = true;
        this.f63694q = l3.f93323c;
        this.f63699v = false;
        this.f63700w = K.AUTOMATIC;
        this.f63701x = false;
        this.f63702y = new Matrix();
        this.f63668J = new float[9];
        this.f63670L = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: h6.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.airbnb.lottie.o.g(this.f135155a, valueAnimator);
            }
        };
        this.f63672N = animatorUpdateListener;
        this.f63673O = new Semaphore(1);
        this.f63676R = new Runnable() { // from class: h6.x
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.o.k(this.f135156a);
            }
        };
        this.f63677S = -3.4028235E38f;
        jVar.addUpdateListener(animatorUpdateListener);
    }

    private Context K() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private C15917a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f63687j == null) {
            C15917a c15917a = new C15917a(getCallback(), null);
            this.f63687j = c15917a;
            String str = this.f63689l;
            if (str != null) {
                c15917a.c(str);
            }
        }
        return this.f63687j;
    }

    private boolean c0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (!(((View) callback).getParent() instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) r0).getClipChildren();
    }

    public static /* synthetic */ void g(o oVar, ValueAnimator valueAnimator) {
        if (oVar.F()) {
            oVar.invalidateSelf();
            return;
        }
        C16861c c16861c = oVar.f63693p;
        if (c16861c != null) {
            c16861c.M(oVar.f63679b.l());
        }
    }

    public static /* synthetic */ void n(o oVar) {
        Drawable.Callback callback = oVar.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(oVar);
        }
    }

    public boolean F() {
        if (E() == EnumC14470a.ENABLED) {
            return true;
        }
        return false;
    }

    public Bitmap G(String str) {
        C15918b c15918bN = N();
        if (c15918bN != null) {
            return c15918bN.a(str);
        }
        return null;
    }

    boolean e0() {
        if (isVisible()) {
            return this.f63679b.isRunning();
        }
        b bVar = this.f63683f;
        if (bVar != b.PLAY && bVar != b.RESUME) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return d0();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f63683f;
            if (bVar == b.PLAY) {
                j0();
                return visible;
            }
            if (bVar == b.RESUME) {
                m0();
                return visible;
            }
        } else {
            if (this.f63679b.isRunning()) {
                i0();
                this.f63683f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f63683f = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        j0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
