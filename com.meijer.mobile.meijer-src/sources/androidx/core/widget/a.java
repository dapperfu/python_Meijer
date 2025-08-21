package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    private static final int f54273r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    final View f54276c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f54277d;

    /* renamed from: g, reason: collision with root package name */
    private int f54280g;

    /* renamed from: h, reason: collision with root package name */
    private int f54281h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f54285l;

    /* renamed from: m, reason: collision with root package name */
    boolean f54286m;

    /* renamed from: n, reason: collision with root package name */
    boolean f54287n;

    /* renamed from: o, reason: collision with root package name */
    boolean f54288o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f54289p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f54290q;

    /* renamed from: a, reason: collision with root package name */
    final C1114a f54274a = new C1114a();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f54275b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    private float[] f54278e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    private float[] f54279f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    private float[] f54282i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    private float[] f54283j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f54284k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C1114a {

        /* renamed from: a, reason: collision with root package name */
        private int f54291a;

        /* renamed from: b, reason: collision with root package name */
        private int f54292b;

        /* renamed from: c, reason: collision with root package name */
        private float f54293c;

        /* renamed from: d, reason: collision with root package name */
        private float f54294d;

        /* renamed from: j, reason: collision with root package name */
        private float f54300j;

        /* renamed from: k, reason: collision with root package name */
        private int f54301k;

        /* renamed from: e, reason: collision with root package name */
        private long f54295e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f54299i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f54296f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f54297g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f54298h = 0;

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        private float e(long j10) {
            if (j10 < this.f54295e) {
                return 0.0f;
            }
            long j11 = this.f54299i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f54291a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f54300j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f54301k, 0.0f, 1.0f));
        }

        public void a() {
            if (this.f54296f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f54296f;
            this.f54296f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f54297g = (int) (this.f54293c * f10);
            this.f54298h = (int) (f10 * this.f54294d);
        }

        public int b() {
            return this.f54297g;
        }

        public int c() {
            return this.f54298h;
        }

        public int d() {
            float f10 = this.f54293c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f54294d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f54299i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f54299i + ((long) this.f54301k);
        }

        public void j(int i10) {
            this.f54292b = i10;
        }

        public void k(int i10) {
            this.f54291a = i10;
        }

        public void l(float f10, float f11) {
            this.f54293c = f10;
            this.f54294d = f11;
        }

        C1114a() {
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f54301k = a.f((int) (jCurrentAnimationTimeMillis - this.f54295e), 0, this.f54292b);
            this.f54300j = e(jCurrentAnimationTimeMillis);
            this.f54299i = jCurrentAnimationTimeMillis;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f54295e = jCurrentAnimationTimeMillis;
            this.f54299i = -1L;
            this.f54296f = jCurrentAnimationTimeMillis;
            this.f54300j = 0.5f;
            this.f54297g = 0;
            this.f54298h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f54288o) {
                if (aVar.f54286m) {
                    aVar.f54286m = false;
                    aVar.f54274a.m();
                }
                C1114a c1114a = a.this.f54274a;
                if (c1114a.h() || !a.this.v()) {
                    a.this.f54288o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f54287n) {
                    aVar2.f54287n = false;
                    aVar2.c();
                }
                c1114a.a();
                a.this.j(c1114a.b(), c1114a.c());
                ViewCompat.e0(a.this.f54276c, this);
            }
        }
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f54280g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f54288o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f54275b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f54275b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public abstract void j(int i10, int i11);

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f54278e[i10], f11, this.f54279f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f54282i[i10];
        float f14 = this.f54283j[i10];
        float f15 = this.f54284k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    private void i() {
        if (this.f54286m) {
            this.f54288o = false;
        } else {
            this.f54274a.i();
        }
    }

    private void w() {
        int i10;
        if (this.f54277d == null) {
            this.f54277d = new b();
        }
        this.f54288o = true;
        this.f54286m = true;
        if (this.f54285l || (i10 = this.f54281h) <= 0) {
            this.f54277d.run();
        } else {
            ViewCompat.f0(this.f54276c, this.f54277d, i10);
        }
        this.f54285l = true;
    }

    public a k(int i10) {
        this.f54281h = i10;
        return this;
    }

    public a l(int i10) {
        this.f54280g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f54289p && !z10) {
            i();
        }
        this.f54289p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f54279f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f54284k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f54289p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f54287n = r2
            r5.f54285l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f54276c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f54276c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f54274a
            r7.l(r0, r6)
            boolean r6 = r5.f54288o
            if (r6 != 0) goto L58
            boolean r6 = r5.v()
            if (r6 == 0) goto L58
            r5.w()
        L58:
            boolean r6 = r5.f54290q
            if (r6 == 0) goto L61
            boolean r6 = r5.f54288o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f54283j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f54274a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f54274a.k(i10);
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f54278e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a u(float f10, float f11) {
        float[] fArr = this.f54282i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean v() {
        C1114a c1114a = this.f54274a;
        int iF = c1114a.f();
        int iD = c1114a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public a(View view) {
        this.f54276c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        t(0.2f, 0.2f);
        u(1.0f, 1.0f);
        k(f54273r);
        r(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
        q(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
    }

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f54276c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }
}
