package v6;

import android.view.Choreographer;
import h6.C14474e;
import h6.C14478i;

/* loaded from: classes4.dex */
public class j extends AbstractC17642c implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    private C14478i f165643l;

    /* renamed from: d, reason: collision with root package name */
    private float f165635d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private boolean f165636e = false;

    /* renamed from: f, reason: collision with root package name */
    private long f165637f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f165638g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f165639h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private int f165640i = 0;

    /* renamed from: j, reason: collision with root package name */
    private float f165641j = -2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    private float f165642k = 2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f165644m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f165645n = false;

    public void E(int i10) {
        D(i10, (int) this.f165642k);
    }

    public void j() {
        this.f165643l = null;
        this.f165641j = -2.1474836E9f;
        this.f165642k = 2.1474836E9f;
    }

    public void t() {
        this.f165644m = true;
        f(r());
        A((int) (r() ? o() : p()));
        this.f165637f = 0L;
        this.f165640i = 0;
        u();
    }

    protected void v() {
        w(true);
    }

    public void x() {
        this.f165644m = true;
        u();
        this.f165637f = 0L;
        if (r() && m() == p()) {
            A(o());
        } else if (!r() && m() == o()) {
            A(p());
        }
        e();
    }

    private void H() {
        if (this.f165643l == null) {
            return;
        }
        float f10 = this.f165639h;
        if (f10 < this.f165641j || f10 > this.f165642k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f165641j), Float.valueOf(this.f165642k), Float.valueOf(this.f165639h)));
        }
    }

    private void i(float f10) {
        if (this.f165645n && this.f165638g == f10) {
            return;
        }
        g();
    }

    private float n() {
        C14478i c14478i = this.f165643l;
        if (c14478i == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c14478i.i()) / Math.abs(this.f165635d);
    }

    public void A(float f10) {
        if (this.f165638g == f10) {
            return;
        }
        float fB = l.b(f10, p(), o());
        this.f165638g = fB;
        if (this.f165645n) {
            fB = (float) Math.floor(fB);
        }
        this.f165639h = fB;
        this.f165637f = 0L;
        g();
    }

    public void C(float f10) {
        D(this.f165641j, f10);
    }

    public void D(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        C14478i c14478i = this.f165643l;
        float fP = c14478i == null ? -3.4028235E38f : c14478i.p();
        C14478i c14478i2 = this.f165643l;
        float f12 = c14478i2 == null ? Float.MAX_VALUE : c14478i2.f();
        float fB = l.b(f10, fP, f12);
        float fB2 = l.b(f11, fP, f12);
        if (fB == this.f165641j && fB2 == this.f165642k) {
            return;
        }
        this.f165641j = fB;
        this.f165642k = fB2;
        A((int) l.b(this.f165639h, fB, fB2));
    }

    public void F(float f10) {
        this.f165635d = f10;
    }

    public void G(boolean z10) {
        this.f165645n = z10;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fP;
        float fO;
        float fP2;
        if (this.f165643l == null) {
            return 0.0f;
        }
        if (r()) {
            fP = o() - this.f165639h;
            fO = o();
            fP2 = p();
        } else {
            fP = this.f165639h - p();
            fO = o();
            fP2 = p();
        }
        return fP / (fO - fP2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C14478i c14478i = this.f165643l;
        if (c14478i == null) {
            return 0L;
        }
        return (long) c14478i.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f165644m;
    }

    public float l() {
        C14478i c14478i = this.f165643l;
        if (c14478i == null) {
            return 0.0f;
        }
        return (this.f165639h - c14478i.p()) / (this.f165643l.f() - this.f165643l.p());
    }

    public float m() {
        return this.f165639h;
    }

    public float o() {
        C14478i c14478i = this.f165643l;
        if (c14478i == null) {
            return 0.0f;
        }
        float f10 = this.f165642k;
        return f10 == 2.1474836E9f ? c14478i.f() : f10;
    }

    public float p() {
        C14478i c14478i = this.f165643l;
        if (c14478i == null) {
            return 0.0f;
        }
        float f10 = this.f165641j;
        return f10 == -2.1474836E9f ? c14478i.p() : f10;
    }

    public float q() {
        return this.f165635d;
    }

    public void z(C14478i c14478i) {
        boolean z10 = this.f165643l == null;
        this.f165643l = c14478i;
        if (z10) {
            D(Math.max(this.f165641j, c14478i.p()), Math.min(this.f165642k, c14478i.f()));
        } else {
            D((int) c14478i.p(), (int) c14478i.f());
        }
        float f10 = this.f165639h;
        this.f165639h = 0.0f;
        this.f165638g = 0.0f;
        A((int) f10);
        g();
    }

    private boolean r() {
        if (q() < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // v6.AbstractC17642c
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
        if (this.f165643l != null && isRunning()) {
            if (C14474e.h()) {
                C14474e.b("LottieValueAnimator#doFrame");
            }
            long j11 = this.f165637f;
            long j12 = 0;
            if (j11 != 0) {
                j12 = j10 - j11;
            }
            float fN = j12 / n();
            float f10 = this.f165638g;
            if (r()) {
                fN = -fN;
            }
            float f11 = f10 + fN;
            boolean zD = l.d(f11, p(), o());
            float f12 = this.f165638g;
            float fB = l.b(f11, p(), o());
            this.f165638g = fB;
            if (this.f165645n) {
                fB = (float) Math.floor(fB);
            }
            this.f165639h = fB;
            this.f165637f = j10;
            if (!zD) {
                if (getRepeatCount() != -1 && this.f165640i >= getRepeatCount()) {
                    if (this.f165635d < 0.0f) {
                        fO = p();
                    } else {
                        fO = o();
                    }
                    this.f165638g = fO;
                    this.f165639h = fO;
                    v();
                    i(f12);
                    b(r());
                } else {
                    if (getRepeatMode() == 2) {
                        this.f165636e = !this.f165636e;
                        y();
                    } else {
                        if (r()) {
                            fP = o();
                        } else {
                            fP = p();
                        }
                        this.f165638g = fP;
                        this.f165639h = fP;
                    }
                    this.f165637f = j10;
                    i(f12);
                    d();
                    this.f165640i++;
                }
            } else {
                i(f12);
            }
            H();
            if (C14474e.h()) {
                C14474e.c("LottieValueAnimator#doFrame");
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
        if (i10 != 2 && this.f165636e) {
            this.f165636e = false;
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
            this.f165644m = false;
        }
    }

    public void y() {
        F(-q());
    }
}
