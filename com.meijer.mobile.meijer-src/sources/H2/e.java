package H2;

import H2.b;

/* loaded from: classes.dex */
public final class e extends b<e> {

    /* renamed from: A, reason: collision with root package name */
    private f f13399A;

    /* renamed from: B, reason: collision with root package name */
    private float f13400B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f13401C;

    @Override // H2.b
    void n(float f10) {
    }

    private void t() {
        f fVar = this.f13399A;
        if (fVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = fVar.a();
        if (dA > this.f13387g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f13388h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // H2.b
    boolean q(long j10) {
        if (this.f13401C) {
            float f10 = this.f13400B;
            if (f10 != Float.MAX_VALUE) {
                this.f13399A.e(f10);
                this.f13400B = Float.MAX_VALUE;
            }
            this.f13382b = this.f13399A.a();
            this.f13381a = 0.0f;
            this.f13401C = false;
            return true;
        }
        if (this.f13400B != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            b.p pVarH = this.f13399A.h(this.f13382b, this.f13381a, j11);
            this.f13399A.e(this.f13400B);
            this.f13400B = Float.MAX_VALUE;
            b.p pVarH2 = this.f13399A.h(pVarH.f13395a, pVarH.f13396b, j11);
            this.f13382b = pVarH2.f13395a;
            this.f13381a = pVarH2.f13396b;
        } else {
            b.p pVarH3 = this.f13399A.h(this.f13382b, this.f13381a, j10);
            this.f13382b = pVarH3.f13395a;
            this.f13381a = pVarH3.f13396b;
        }
        float fMax = Math.max(this.f13382b, this.f13388h);
        this.f13382b = fMax;
        float fMin = Math.min(fMax, this.f13387g);
        this.f13382b = fMin;
        if (!s(fMin, this.f13381a)) {
            return false;
        }
        this.f13382b = this.f13399A.a();
        this.f13381a = 0.0f;
        return true;
    }

    boolean s(float f10, float f11) {
        return this.f13399A.c(f10, f11);
    }

    public e u(f fVar) {
        this.f13399A = fVar;
        return this;
    }

    public e(d dVar) {
        super(dVar);
        this.f13399A = null;
        this.f13400B = Float.MAX_VALUE;
        this.f13401C = false;
    }

    @Override // H2.b
    public void o() {
        t();
        this.f13399A.g(e());
        super.o();
    }

    public void r(float f10) {
        if (f()) {
            this.f13400B = f10;
            return;
        }
        if (this.f13399A == null) {
            this.f13399A = new f(f10);
        }
        this.f13399A.e(f10);
        o();
    }
}
