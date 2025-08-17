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
import g6.C14202b;
import g6.C14205e;
import g6.C14209i;
import g6.D;
import g6.EnumC14201a;
import g6.H;
import g6.InterfaceC14203c;
import g6.K;
import g6.M;
import g6.y;
import g6.z;
import h6.C14380a;
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
import l6.EnumC15383a;
import m6.C15564a;
import m6.C15565b;
import q6.C16473c;
import s6.v;
import v6.C17514c;

/* loaded from: classes4.dex */
public class o extends Drawable implements Drawable.Callback, Animatable, FSDraw {

    /* renamed from: T, reason: collision with root package name */
    private static final boolean f62817T;

    /* renamed from: U, reason: collision with root package name */
    private static final List<String> f62818U;

    /* renamed from: V, reason: collision with root package name */
    private static final Executor f62819V;

    /* renamed from: A, reason: collision with root package name */
    private Canvas f62820A;

    /* renamed from: B, reason: collision with root package name */
    private Rect f62821B;

    /* renamed from: C, reason: collision with root package name */
    private RectF f62822C;

    /* renamed from: D, reason: collision with root package name */
    private Paint f62823D;

    /* renamed from: E, reason: collision with root package name */
    private Rect f62824E;

    /* renamed from: F, reason: collision with root package name */
    private Rect f62825F;

    /* renamed from: G, reason: collision with root package name */
    private RectF f62826G;

    /* renamed from: H, reason: collision with root package name */
    private RectF f62827H;

    /* renamed from: I, reason: collision with root package name */
    private Matrix f62828I;

    /* renamed from: J, reason: collision with root package name */
    private float[] f62829J;

    /* renamed from: K, reason: collision with root package name */
    private Matrix f62830K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f62831L;

    /* renamed from: M, reason: collision with root package name */
    private EnumC14201a f62832M;

    /* renamed from: N, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f62833N;

    /* renamed from: O, reason: collision with root package name */
    private final Semaphore f62834O;

    /* renamed from: P, reason: collision with root package name */
    private Handler f62835P;

    /* renamed from: Q, reason: collision with root package name */
    private Runnable f62836Q;

    /* renamed from: R, reason: collision with root package name */
    private final Runnable f62837R;

    /* renamed from: S, reason: collision with root package name */
    private float f62838S;

    /* renamed from: a, reason: collision with root package name */
    private C14209i f62839a;

    /* renamed from: b, reason: collision with root package name */
    private final u6.j f62840b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f62841c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f62842d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f62843e;

    /* renamed from: f, reason: collision with root package name */
    private b f62844f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f62845g;

    /* renamed from: h, reason: collision with root package name */
    private C15565b f62846h;

    /* renamed from: i, reason: collision with root package name */
    private String f62847i;

    /* renamed from: j, reason: collision with root package name */
    private C15564a f62848j;

    /* renamed from: k, reason: collision with root package name */
    private Map<String, Typeface> f62849k;

    /* renamed from: l, reason: collision with root package name */
    String f62850l;

    /* renamed from: m, reason: collision with root package name */
    private final p f62851m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f62852n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f62853o;

    /* renamed from: p, reason: collision with root package name */
    private C16473c f62854p;

    /* renamed from: q, reason: collision with root package name */
    private int f62855q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f62856r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f62857s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f62858t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f62859u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f62860v;

    /* renamed from: w, reason: collision with root package name */
    private K f62861w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f62862x;

    /* renamed from: y, reason: collision with root package name */
    private final Matrix f62863y;

    /* renamed from: z, reason: collision with root package name */
    private Bitmap f62864z;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(C14209i c14209i);
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
        f62817T = Build.VERSION.SDK_INT <= 25;
        f62818U = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f62819V = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new u6.h());
    }

    private void C(int i10, int i11) {
        Bitmap bitmap = this.f62864z;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f62864z.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f62864z = bitmapCreateBitmap;
            this.f62820A.setBitmap(bitmapCreateBitmap);
            this.f62831L = true;
            return;
        }
        if (this.f62864z.getWidth() > i10 || this.f62864z.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f62864z, 0, 0, i10, i11);
            this.f62864z = bitmapCreateBitmap2;
            this.f62820A.setBitmap(bitmapCreateBitmap2);
            this.f62831L = true;
        }
    }

    private void D() {
        if (this.f62820A != null) {
            return;
        }
        this.f62820A = new Canvas();
        this.f62827H = new RectF();
        this.f62828I = new Matrix();
        this.f62830K = new Matrix();
        this.f62821B = new Rect();
        this.f62822C = new RectF();
        this.f62823D = new C14380a();
        this.f62824E = new Rect();
        this.f62825F = new Rect();
        this.f62826G = new RectF();
    }

    private C15565b N() {
        C15565b c15565b = this.f62846h;
        if (c15565b != null && !c15565b.b(K())) {
            this.f62846h = null;
        }
        if (this.f62846h == null) {
            this.f62846h = new C15565b(getCallback(), this.f62847i, null, this.f62839a.j());
        }
        return this.f62846h;
    }

    private boolean U0() {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            return false;
        }
        float f10 = this.f62838S;
        float fL = this.f62840b.l();
        this.f62838S = fL;
        return Math.abs(fL - f10) * c14209i.d() >= 50.0f;
    }

    public static /* synthetic */ void k(final o oVar) {
        C16473c c16473c = oVar.f62854p;
        if (c16473c == null) {
            return;
        }
        try {
            oVar.f62834O.acquire();
            c16473c.M(oVar.f62840b.l());
            if (f62817T && oVar.f62831L) {
                if (oVar.f62835P == null) {
                    oVar.f62835P = new Handler(Looper.getMainLooper());
                    oVar.f62836Q = new Runnable() { // from class: g6.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.airbnb.lottie.o.n(this.f132978a);
                        }
                    };
                }
                oVar.f62835P.post(oVar.f62836Q);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th2) {
            oVar.f62834O.release();
            throw th2;
        }
        oVar.f62834O.release();
    }

    private void k0(Canvas canvas, C16473c c16473c) {
        if (this.f62839a == null || c16473c == null) {
            return;
        }
        D();
        canvas.getMatrix(this.f62828I);
        canvas.getClipBounds(this.f62821B);
        v(this.f62821B, this.f62822C);
        this.f62828I.mapRect(this.f62822C);
        w(this.f62822C, this.f62821B);
        if (this.f62853o) {
            this.f62827H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c16473c.g(this.f62827H, null, false);
        }
        this.f62828I.mapRect(this.f62827H);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        n0(this.f62827H, fWidth, fHeight);
        if (!c0()) {
            RectF rectF = this.f62827H;
            Rect rect = this.f62821B;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f62827H.width());
        int iCeil2 = (int) Math.ceil(this.f62827H.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        C(iCeil, iCeil2);
        if (this.f62831L) {
            this.f62828I.getValues(this.f62829J);
            float[] fArr = this.f62829J;
            float f10 = fArr[0];
            float f11 = fArr[4];
            this.f62863y.set(this.f62828I);
            this.f62863y.preScale(fWidth, fHeight);
            Matrix matrix = this.f62863y;
            RectF rectF2 = this.f62827H;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f62863y.postScale(1.0f / f10, 1.0f / f11);
            this.f62864z.eraseColor(0);
            this.f62820A.setMatrix(u6.q.f162757a);
            this.f62820A.scale(f10, f11);
            c16473c.e(this.f62820A, this.f62863y, this.f62855q, null);
            this.f62828I.invert(this.f62830K);
            this.f62830K.mapRect(this.f62826G, this.f62827H);
            w(this.f62826G, this.f62825F);
        }
        this.f62824E.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f62864z, this.f62824E, this.f62825F, this.f62823D);
    }

    private void n0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private void s() {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            return;
        }
        C16473c c16473c = new C16473c(this, v.a(c14209i), c14209i.k(), c14209i);
        this.f62854p = c16473c;
        if (this.f62857s) {
            c16473c.K(true);
        }
        this.f62854p.Q(this.f62853o);
    }

    private void u() {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            return;
        }
        this.f62862x = this.f62861w.b(Build.VERSION.SDK_INT, c14209i.q(), c14209i.m());
    }

    private void v(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void w(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void y(Canvas canvas, Matrix matrix, C16473c c16473c, int i10) {
        if (!this.f62862x) {
            c16473c.e(canvas, matrix, i10, null);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        k0(canvas, c16473c);
        canvas.restore();
    }

    private void z(Canvas canvas) {
        C16473c c16473c = this.f62854p;
        C14209i c14209i = this.f62839a;
        if (c16473c == null || c14209i == null) {
            return;
        }
        this.f62863y.reset();
        if (!getBounds().isEmpty()) {
            this.f62863y.preTranslate(r2.left, r2.top);
            this.f62863y.preScale(r2.width() / c14209i.b().width(), r2.height() / c14209i.b().height());
        }
        c16473c.e(canvas, this.f62863y, this.f62855q, null);
    }

    public void A(y yVar, boolean z10) {
        boolean zA = this.f62851m.a(yVar, z10);
        if (this.f62839a == null || !zA) {
            return;
        }
        s();
    }

    public void A0(String str) {
        this.f62847i = str;
    }

    public void B() {
        this.f62845g.clear();
        this.f62840b.k();
        if (isVisible()) {
            return;
        }
        this.f62844f = b.NONE;
    }

    public void B0(boolean z10) {
        this.f62852n = z10;
    }

    public void C0(final int i10) {
        if (this.f62839a == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i) {
                    this.f62790a.C0(i10);
                }
            });
        } else {
            this.f62840b.C(i10 + 0.99f);
        }
    }

    public void D0(final String str) {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i2) {
                    this.f62806a.D0(str);
                }
            });
            return;
        }
        n6.h hVarL = c14209i.l(str);
        if (hVarL != null) {
            C0((int) (hVarL.f151052b + hVarL.f151053c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public EnumC14201a E() {
        EnumC14201a enumC14201a = this.f62832M;
        return enumC14201a != null ? enumC14201a : C14205e.d();
    }

    public void E0(final float f10) {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i2) {
                    this.f62800a.E0(f10);
                }
            });
        } else {
            this.f62840b.C(u6.l.i(c14209i.p(), this.f62839a.f(), f10));
        }
    }

    public void F0(final int i10, final int i11) {
        if (this.f62839a == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i) {
                    this.f62802a.F0(i10, i11);
                }
            });
        } else {
            this.f62840b.D(i10, i11 + 0.99f);
        }
    }

    public void G0(final String str) {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i2) {
                    this.f62788a.G0(str);
                }
            });
            return;
        }
        n6.h hVarL = c14209i.l(str);
        if (hVarL != null) {
            int i10 = (int) hVarL.f151052b;
            F0(i10, ((int) hVarL.f151053c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public boolean H() {
        return this.f62860v;
    }

    public void H0(final int i10) {
        if (this.f62839a == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i) {
                    this.f62794a.H0(i10);
                }
            });
        } else {
            this.f62840b.E(i10);
        }
    }

    public boolean I() {
        return this.f62853o;
    }

    public void I0(final String str) {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i2) {
                    this.f62808a.I0(str);
                }
            });
            return;
        }
        n6.h hVarL = c14209i.l(str);
        if (hVarL != null) {
            H0((int) hVarL.f151052b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public C14209i J() {
        return this.f62839a;
    }

    public void J0(final float f10) {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i2) {
                    this.f62811a.J0(f10);
                }
            });
        } else {
            H0((int) u6.l.i(c14209i.p(), this.f62839a.f(), f10));
        }
    }

    public void K0(boolean z10) {
        if (this.f62857s == z10) {
            return;
        }
        this.f62857s = z10;
        C16473c c16473c = this.f62854p;
        if (c16473c != null) {
            c16473c.K(z10);
        }
    }

    public void L0(boolean z10) {
        this.f62856r = z10;
        C14209i c14209i = this.f62839a;
        if (c14209i != null) {
            c14209i.w(z10);
        }
    }

    public int M() {
        return (int) this.f62840b.m();
    }

    public void M0(final float f10) {
        if (this.f62839a == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i) {
                    this.f62813a.M0(f10);
                }
            });
            return;
        }
        if (C14205e.h()) {
            C14205e.b("Drawable#setProgress");
        }
        this.f62840b.A(this.f62839a.h(f10));
        if (C14205e.h()) {
            C14205e.c("Drawable#setProgress");
        }
    }

    public void N0(K k10) {
        this.f62861w = k10;
        u();
    }

    public String O() {
        return this.f62847i;
    }

    public void O0(int i10) {
        this.f62840b.setRepeatCount(i10);
    }

    public z P(String str) {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            return null;
        }
        return c14209i.j().get(str);
    }

    public void P0(int i10) {
        this.f62840b.setRepeatMode(i10);
    }

    public boolean Q() {
        return this.f62852n;
    }

    public void Q0(boolean z10) {
        this.f62843e = z10;
    }

    public n6.h R() {
        Iterator<String> it = f62818U.iterator();
        n6.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f62839a.l(it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public void R0(float f10) {
        this.f62840b.F(f10);
    }

    public float S() {
        return this.f62840b.o();
    }

    public float T() {
        return this.f62840b.p();
    }

    public void T0(boolean z10) {
        this.f62840b.G(z10);
    }

    public H U() {
        C14209i c14209i = this.f62839a;
        if (c14209i != null) {
            return c14209i.n();
        }
        return null;
    }

    public float V() {
        return this.f62840b.l();
    }

    public boolean V0() {
        return this.f62849k == null && this.f62839a.c().m() > 0;
    }

    public K W() {
        return this.f62862x ? K.SOFTWARE : K.HARDWARE;
    }

    public int X() {
        return this.f62840b.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int Y() {
        return this.f62840b.getRepeatMode();
    }

    public float Z() {
        return this.f62840b.q();
    }

    public Typeface b0(n6.c cVar) {
        Map<String, Typeface> map = this.f62849k;
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
        C15564a c15564aL = L();
        if (c15564aL != null) {
            return c15564aL.b(cVar);
        }
        return null;
    }

    public boolean d0() {
        u6.j jVar = this.f62840b;
        if (jVar == null) {
            return false;
        }
        return jVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C16473c c16473c = this.f62854p;
        if (c16473c == null) {
            return;
        }
        boolean zF = F();
        if (zF) {
            try {
                this.f62834O.acquire();
            } catch (InterruptedException unused) {
                if (C14205e.h()) {
                    C14205e.c("Drawable#draw");
                }
                if (!zF) {
                    return;
                }
                this.f62834O.release();
                if (c16473c.P() == this.f62840b.l()) {
                    return;
                }
            } catch (Throwable th2) {
                if (C14205e.h()) {
                    C14205e.c("Drawable#draw");
                }
                if (zF) {
                    this.f62834O.release();
                    if (c16473c.P() != this.f62840b.l()) {
                        f62819V.execute(this.f62837R);
                    }
                }
                throw th2;
            }
        }
        if (C14205e.h()) {
            C14205e.b("Drawable#draw");
        }
        if (zF && U0()) {
            M0(this.f62840b.l());
        }
        if (this.f62843e) {
            try {
                if (this.f62862x) {
                    k0(canvas, c16473c);
                } else {
                    z(canvas);
                }
            } catch (Throwable th3) {
                u6.g.b("Lottie crashed in draw!", th3);
            }
        } else if (this.f62862x) {
            k0(canvas, c16473c);
        } else {
            z(canvas);
        }
        this.f62831L = false;
        if (C14205e.h()) {
            C14205e.c("Drawable#draw");
        }
        if (zF) {
            this.f62834O.release();
            if (c16473c.P() == this.f62840b.l()) {
                return;
            }
            f62819V.execute(this.f62837R);
        }
    }

    public boolean f0() {
        return this.f62858t;
    }

    public boolean g0() {
        return this.f62859u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f62855q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            return -1;
        }
        return c14209i.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C14209i c14209i = this.f62839a;
        if (c14209i == null) {
            return -1;
        }
        return c14209i.b().width();
    }

    public boolean h0(y yVar) {
        return this.f62851m.b(yVar);
    }

    public void i0() {
        this.f62845g.clear();
        this.f62840b.s();
        if (isVisible()) {
            return;
        }
        this.f62844f = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f62831L) {
            return;
        }
        this.f62831L = true;
        if ((!f62817T || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void j0() {
        if (this.f62854p == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i) {
                    this.f62810a.j0();
                }
            });
            return;
        }
        u();
        if (r(K()) || X() == 0) {
            if (isVisible()) {
                this.f62840b.t();
                this.f62844f = b.NONE;
            } else {
                this.f62844f = b.PLAY;
            }
        }
        if (r(K())) {
            return;
        }
        n6.h hVarR = R();
        if (hVarR != null) {
            x0((int) hVarR.f151052b);
        } else {
            x0((int) (Z() < 0.0f ? T() : S()));
        }
        this.f62840b.k();
        if (isVisible()) {
            return;
        }
        this.f62844f = b.NONE;
    }

    public List<n6.e> l0(n6.e eVar) {
        if (this.f62854p == null) {
            u6.g.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f62854p.i(eVar, 0, arrayList, new n6.e(new String[0]));
        return arrayList;
    }

    public void m0() {
        if (this.f62854p == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i) {
                    this.f62805a.m0();
                }
            });
            return;
        }
        u();
        if (r(K()) || X() == 0) {
            if (isVisible()) {
                this.f62840b.x();
                this.f62844f = b.NONE;
            } else {
                this.f62844f = b.RESUME;
            }
        }
        if (r(K())) {
            return;
        }
        x0((int) (Z() < 0.0f ? T() : S()));
        this.f62840b.k();
        if (isVisible()) {
            return;
        }
        this.f62844f = b.NONE;
    }

    public void o0(boolean z10) {
        this.f62858t = z10;
    }

    public void p0(boolean z10) {
        this.f62859u = z10;
    }

    public <T> void q(final n6.e eVar, final T t10, final C17514c<T> c17514c) {
        C16473c c16473c = this.f62854p;
        if (c16473c == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i) {
                    this.f62796a.q(eVar, t10, c17514c);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == n6.e.f151046c) {
            c16473c.d(t10, c17514c);
        } else if (eVar.d() != null) {
            eVar.d().d(t10, c17514c);
        } else {
            List<n6.e> listL0 = l0(eVar);
            for (int i10 = 0; i10 < listL0.size(); i10++) {
                listL0.get(i10).d().d(t10, c17514c);
            }
            zIsEmpty = true ^ listL0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t10 == D.f132835E) {
                M0(V());
            }
        }
    }

    public void q0(EnumC14201a enumC14201a) {
        this.f62832M = enumC14201a;
    }

    public boolean r(Context context) {
        if (this.f62842d) {
            return true;
        }
        return this.f62841c && C14205e.f().a(context) == EnumC15383a.STANDARD_MOTION;
    }

    public void r0(boolean z10) {
        if (z10 != this.f62860v) {
            this.f62860v = z10;
            invalidateSelf();
        }
    }

    public void s0(boolean z10) {
        if (z10 != this.f62853o) {
            this.f62853o = z10;
            C16473c c16473c = this.f62854p;
            if (c16473c != null) {
                c16473c.Q(z10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f62855q = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        u6.g.c("Use addColorFilter instead.");
    }

    public void t() {
        if (this.f62840b.isRunning()) {
            this.f62840b.cancel();
            if (!isVisible()) {
                this.f62844f = b.NONE;
            }
        }
        this.f62839a = null;
        this.f62854p = null;
        this.f62846h = null;
        this.f62838S = -3.4028235E38f;
        this.f62840b.j();
        invalidateSelf();
    }

    public boolean t0(C14209i c14209i) {
        if (this.f62839a == c14209i) {
            return false;
        }
        this.f62831L = true;
        t();
        this.f62839a = c14209i;
        s();
        this.f62840b.z(c14209i);
        M0(this.f62840b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f62845g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(c14209i);
            }
            it.remove();
        }
        this.f62845g.clear();
        c14209i.w(this.f62856r);
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
        this.f62850l = str;
        C15564a c15564aL = L();
        if (c15564aL != null) {
            c15564aL.c(str);
        }
    }

    public void v0(C14202b c14202b) {
        C15564a c15564a = this.f62848j;
        if (c15564a != null) {
            c15564a.d(c14202b);
        }
    }

    public void w0(Map<String, Typeface> map) {
        if (map == this.f62849k) {
            return;
        }
        this.f62849k = map;
        invalidateSelf();
    }

    public void x(Canvas canvas, Matrix matrix) {
        C16473c c16473c = this.f62854p;
        C14209i c14209i = this.f62839a;
        if (c16473c == null || c14209i == null) {
            return;
        }
        boolean zF = F();
        if (zF) {
            try {
                this.f62834O.acquire();
                if (U0()) {
                    M0(this.f62840b.l());
                }
            } catch (InterruptedException unused) {
                if (!zF) {
                    return;
                }
                this.f62834O.release();
                if (c16473c.P() == this.f62840b.l()) {
                    return;
                }
            } catch (Throwable th2) {
                if (zF) {
                    this.f62834O.release();
                    if (c16473c.P() != this.f62840b.l()) {
                        f62819V.execute(this.f62837R);
                    }
                }
                throw th2;
            }
        }
        if (this.f62843e) {
            try {
                y(canvas, matrix, c16473c, this.f62855q);
            } catch (Throwable th3) {
                u6.g.b("Lottie crashed in draw!", th3);
            }
        } else {
            y(canvas, matrix, c16473c, this.f62855q);
        }
        this.f62831L = false;
        if (zF) {
            this.f62834O.release();
            if (c16473c.P() == this.f62840b.l()) {
                return;
            }
            f62819V.execute(this.f62837R);
        }
    }

    public void x0(final int i10) {
        if (this.f62839a == null) {
            this.f62845g.add(new a() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.o.a
                public final void a(C14209i c14209i) {
                    this.f62815a.x0(i10);
                }
            });
        } else {
            this.f62840b.A(i10);
        }
    }

    @Deprecated
    public void y0(boolean z10) {
        this.f62842d = z10;
    }

    public void z0(InterfaceC14203c interfaceC14203c) {
        C15565b c15565b = this.f62846h;
        if (c15565b != null) {
            c15565b.d(interfaceC14203c);
        }
    }

    public o() {
        u6.j jVar = new u6.j();
        this.f62840b = jVar;
        this.f62841c = true;
        this.f62842d = false;
        this.f62843e = false;
        this.f62844f = b.NONE;
        this.f62845g = new ArrayList<>();
        this.f62851m = new p();
        this.f62852n = false;
        this.f62853o = true;
        this.f62855q = l3.f92484c;
        this.f62860v = false;
        this.f62861w = K.AUTOMATIC;
        this.f62862x = false;
        this.f62863y = new Matrix();
        this.f62829J = new float[9];
        this.f62831L = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: g6.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.airbnb.lottie.o.g(this.f132979a, valueAnimator);
            }
        };
        this.f62833N = animatorUpdateListener;
        this.f62834O = new Semaphore(1);
        this.f62837R = new Runnable() { // from class: g6.x
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.o.k(this.f132980a);
            }
        };
        this.f62838S = -3.4028235E38f;
        jVar.addUpdateListener(animatorUpdateListener);
    }

    private Context K() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private C15564a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f62848j == null) {
            C15564a c15564a = new C15564a(getCallback(), null);
            this.f62848j = c15564a;
            String str = this.f62850l;
            if (str != null) {
                c15564a.c(str);
            }
        }
        return this.f62848j;
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
        C16473c c16473c = oVar.f62854p;
        if (c16473c != null) {
            c16473c.M(oVar.f62840b.l());
        }
    }

    public static /* synthetic */ void n(o oVar) {
        Drawable.Callback callback = oVar.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(oVar);
        }
    }

    public boolean F() {
        if (E() == EnumC14201a.ENABLED) {
            return true;
        }
        return false;
    }

    public Bitmap G(String str) {
        C15565b c15565bN = N();
        if (c15565bN != null) {
            return c15565bN.a(str);
        }
        return null;
    }

    boolean e0() {
        if (isVisible()) {
            return this.f62840b.isRunning();
        }
        b bVar = this.f62844f;
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
            b bVar = this.f62844f;
            if (bVar == b.PLAY) {
                j0();
                return visible;
            }
            if (bVar == b.RESUME) {
                m0();
                return visible;
            }
        } else {
            if (this.f62840b.isRunning()) {
                i0();
                this.f62844f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f62844f = b.NONE;
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
