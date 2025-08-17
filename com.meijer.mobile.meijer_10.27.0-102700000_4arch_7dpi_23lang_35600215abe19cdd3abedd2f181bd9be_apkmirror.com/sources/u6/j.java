package u6;

import android.view.Choreographer;
import g6.C14205e;
import g6.C14209i;

/* loaded from: classes4.dex */
public class j extends AbstractC17229c implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    private C14209i f162714l;

    /* renamed from: d, reason: collision with root package name */
    private float f162706d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f162707e = false;

    /* renamed from: f, reason: collision with root package name */
    private long f162708f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f162709g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f162710h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private int f162711i = 0;

    /* renamed from: j, reason: collision with root package name */
    private float f162712j = -2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    private float f162713k = 2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f162715m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f162716n = false;

    public void E(int i10) {
        D(i10, (int) this.f162713k);
    }

    public void j() {
        this.f162714l = null;
        this.f162712j = -2.1474836E9f;
        this.f162713k = 2.1474836E9f;
    }

    public void t() {
        this.f162715m = true;
        f(r());
        A((int) (r() ? o() : p()));
        this.f162708f = 0L;
        this.f162711i = 0;
        u();
    }

    protected void v() {
        w(true);
    }

    public void x() {
        this.f162715m = true;
        u();
        this.f162708f = 0L;
        if (r() && m() == p()) {
            A(o());
        } else if (!r() && m() == o()) {
            A(p());
        }
        e();
    }

    private void H() {
        if (this.f162714l == null) {
            return;
        }
        float f10 = this.f162710h;
        if (f10 < this.f162712j || f10 > this.f162713k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f162712j), Float.valueOf(this.f162713k), Float.valueOf(this.f162710h)));
        }
    }

    private void i(float f10) {
        if (this.f162716n && this.f162709g == f10) {
            return;
        }
        g();
    }

    private float n() {
        C14209i c14209i = this.f162714l;
        if (c14209i == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c14209i.i()) / Math.abs(this.f162706d);
    }

    public void A(float f10) {
        if (this.f162709g == f10) {
            return;
        }
        float fB = l.b(f10, p(), o());
        this.f162709g = fB;
        if (this.f162716n) {
            fB = (float) Math.floor(fB);
        }
        this.f162710h = fB;
        this.f162708f = 0L;
        g();
    }

    public void C(float f10) {
        D(this.f162712j, f10);
    }

    public void D(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        C14209i c14209i = this.f162714l;
        float fP = c14209i == null ? -3.4028235E38f : c14209i.p();
        C14209i c14209i2 = this.f162714l;
        float f12 = c14209i2 == null ? Float.MAX_VALUE : c14209i2.f();
        float fB = l.b(f10, fP, f12);
        float fB2 = l.b(f11, fP, f12);
        if (fB == this.f162712j && fB2 == this.f162713k) {
            return;
        }
        this.f162712j = fB;
        this.f162713k = fB2;
        A((int) l.b(this.f162710h, fB, fB2));
    }

    public void F(float f10) {
        this.f162706d = f10;
    }

    public void G(boolean z10) {
        this.f162716n = z10;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fP;
        float fO;
        float fP2;
        if (this.f162714l == null) {
            return 0.0f;
        }
        if (r()) {
            fP = o() - this.f162710h;
            fO = o();
            fP2 = p();
        } else {
            fP = this.f162710h - p();
            fO = o();
            fP2 = p();
        }
        return fP / (fO - fP2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C14209i c14209i = this.f162714l;
        if (c14209i == null) {
            return 0L;
        }
        return (long) c14209i.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f162715m;
    }

    public float l() {
        C14209i c14209i = this.f162714l;
        if (c14209i == null) {
            return 0.0f;
        }
        return (this.f162710h - c14209i.p()) / (this.f162714l.f() - this.f162714l.p());
    }

    public float m() {
        return this.f162710h;
    }

    public float o() {
        C14209i c14209i = this.f162714l;
        if (c14209i == null) {
            return 0.0f;
        }
        float f10 = this.f162713k;
        return f10 == 2.1474836E9f ? c14209i.f() : f10;
    }

    public float p() {
        C14209i c14209i = this.f162714l;
        if (c14209i == null) {
            return 0.0f;
        }
        float f10 = this.f162712j;
        return f10 == -2.1474836E9f ? c14209i.p() : f10;
    }

    public float q() {
        return this.f162706d;
    }

    public void z(C14209i c14209i) {
        boolean z10 = this.f162714l == null;
        this.f162714l = c14209i;
        if (z10) {
            D(Math.max(this.f162712j, c14209i.p()), Math.min(this.f162713k, c14209i.f()));
        } else {
            D((int) c14209i.p(), (int) c14209i.f());
        }
        float f10 = this.f162710h;
        this.f162710h = 0.0f;
        this.f162709g = 0.0f;
        A((int) f10);
        g();
    }

    private boolean r() {
        if (q() < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // u6.AbstractC17229c
    void a() {
        super.a();
        b(r());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        v();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        float fP;
        float fO;
        u();
        if (this.f162714l != null && isRunning()) {
            if (C14205e.h()) {
                C14205e.b("LottieValueAnimator#doFrame");
            }
            long j11 = this.f162708f;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float fN = j12 / n();
            float f10 = this.f162709g;
            if (r()) {
                fN = -fN;
            }
            float f11 = f10 + fN;
            boolean zD = l.d(f11, p(), o());
            float f12 = this.f162709g;
            float fB = l.b(f11, p(), o());
            this.f162709g = fB;
            if (this.f162716n) {
                fB = (float) Math.floor(fB);
            }
            this.f162710h = fB;
            this.f162708f = j10;
            if (!zD) {
                if (getRepeatCount() != -1 && this.f162711i >= getRepeatCount()) {
                    if (this.f162706d < 0.0f) {
                        fO = p();
                    } else {
                        fO = o();
                    }
                    this.f162709g = fO;
                    this.f162710h = fO;
                    v();
                    i(f12);
                    b(r());
                } else {
                    if (getRepeatMode() == 2) {
                        this.f162707e = !this.f162707e;
                        y();
                    } else {
                        if (r()) {
                            fP = o();
                        } else {
                            fP = p();
                        }
                        this.f162709g = fP;
                        this.f162710h = fP;
                    }
                    this.f162708f = j10;
                    i(f12);
                    d();
                    this.f162711i++;
                }
            } else {
                i(f12);
            }
            H();
            if (C14205e.h()) {
                C14205e.c("LottieValueAnimator#doFrame");
            }
        }
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(l());
    }

    public void k() {
        v();
        b(r());
    }

    public void s() {
        v();
        c();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f162707e) {
            this.f162707e = false;
            y();
        }
    }

    protected void u() {
        if (isRunning()) {
            w(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void w(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f162715m = false;
        }
    }

    public void y() {
        F(-q());
    }
}
