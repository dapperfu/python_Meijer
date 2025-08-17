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
    private static final int f54049r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    final View f54052c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f54053d;

    /* renamed from: g, reason: collision with root package name */
    private int f54056g;

    /* renamed from: h, reason: collision with root package name */
    private int f54057h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f54061l;

    /* renamed from: m, reason: collision with root package name */
    boolean f54062m;

    /* renamed from: n, reason: collision with root package name */
    boolean f54063n;

    /* renamed from: o, reason: collision with root package name */
    boolean f54064o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f54065p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f54066q;

    /* renamed from: a, reason: collision with root package name */
    final C1101a f54050a = new C1101a();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f54051b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    private float[] f54054e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    private float[] f54055f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    private float[] f54058i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    private float[] f54059j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f54060k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C1101a {

        /* renamed from: a, reason: collision with root package name */
        private int f54067a;

        /* renamed from: b, reason: collision with root package name */
        private int f54068b;

        /* renamed from: c, reason: collision with root package name */
        private float f54069c;

        /* renamed from: d, reason: collision with root package name */
        private float f54070d;

        /* renamed from: j, reason: collision with root package name */
        private float f54076j;

        /* renamed from: k, reason: collision with root package name */
        private int f54077k;

        /* renamed from: e, reason: collision with root package name */
        private long f54071e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f54075i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f54072f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f54073g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f54074h = 0;

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        private float e(long j10) {
            if (j10 < this.f54071e) {
                return 0.0f;
            }
            long j11 = this.f54075i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f54067a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f54076j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f54077k, 0.0f, 1.0f));
        }

        public void a() {
            if (this.f54072f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f54072f;
            this.f54072f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f54073g = (int) (this.f54069c * f10);
            this.f54074h = (int) (f10 * this.f54070d);
        }

        public int b() {
            return this.f54073g;
        }

        public int c() {
            return this.f54074h;
        }

        public int d() {
            float f10 = this.f54069c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f54070d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f54075i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f54075i + ((long) this.f54077k);
        }

        public void j(int i10) {
            this.f54068b = i10;
        }

        public void k(int i10) {
            this.f54067a = i10;
        }

        public void l(float f10, float f11) {
            this.f54069c = f10;
            this.f54070d = f11;
        }

        C1101a() {
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f54077k = a.f((int) (jCurrentAnimationTimeMillis - this.f54071e), 0, this.f54068b);
            this.f54076j = e(jCurrentAnimationTimeMillis);
            this.f54075i = jCurrentAnimationTimeMillis;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f54071e = jCurrentAnimationTimeMillis;
            this.f54075i = -1L;
            this.f54072f = jCurrentAnimationTimeMillis;
            this.f54076j = 0.5f;
            this.f54073g = 0;
            this.f54074h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f54064o) {
                if (aVar.f54062m) {
                    aVar.f54062m = false;
                    aVar.f54050a.m();
                }
                C1101a c1101a = a.this.f54050a;
                if (c1101a.h() || !a.this.v()) {
                    a.this.f54064o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f54063n) {
                    aVar2.f54063n = false;
                    aVar2.c();
                }
                c1101a.a();
                a.this.j(c1101a.b(), c1101a.c());
                ViewCompat.e0(a.this.f54052c, this);
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
        int i10 = this.f54056g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f54064o && i10 == 1) {
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
            interpolation = -this.f54051b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f54051b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public abstract void j(int i10, int i11);

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f54054e[i10], f11, this.f54055f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f54058i[i10];
        float f14 = this.f54059j[i10];
        float f15 = this.f54060k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    private void i() {
        if (this.f54062m) {
            this.f54064o = false;
        } else {
            this.f54050a.i();
        }
    }

    private void w() {
        int i10;
        if (this.f54053d == null) {
            this.f54053d = new b();
        }
        this.f54064o = true;
        this.f54062m = true;
        if (this.f54061l || (i10 = this.f54057h) <= 0) {
            this.f54053d.run();
        } else {
            ViewCompat.f0(this.f54052c, this.f54053d, i10);
        }
        this.f54061l = true;
    }

    public a k(int i10) {
        this.f54057h = i10;
        return this;
    }

    public a l(int i10) {
        this.f54056g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f54065p && !z10) {
            i();
        }
        this.f54065p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f54055f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f54060k;
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
            boolean r0 = r5.f54065p
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
            r5.f54063n = r2
            r5.f54061l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f54052c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f54052c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f54050a
            r7.l(r0, r6)
            boolean r6 = r5.f54064o
            if (r6 != 0) goto L58
            boolean r6 = r5.v()
            if (r6 == 0) goto L58
            r5.w()
        L58:
            boolean r6 = r5.f54066q
            if (r6 == 0) goto L61
            boolean r6 = r5.f54064o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f54059j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f54050a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f54050a.k(i10);
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f54054e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a u(float f10, float f11) {
        float[] fArr = this.f54058i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean v() {
        C1101a c1101a = this.f54050a;
        int iF = c1101a.f();
        int iD = c1101a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public a(View view) {
        this.f54052c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        t(0.2f, 0.2f);
        u(1.0f, 1.0f);
        k(f54049r);
        r(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
        q(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
    }

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f54052c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }
}
