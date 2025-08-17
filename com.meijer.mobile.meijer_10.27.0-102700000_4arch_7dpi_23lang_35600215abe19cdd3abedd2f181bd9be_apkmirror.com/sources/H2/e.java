package H2;

import H2.b;

/* loaded from: classes.dex */
public final class e extends b<e> {

    /* renamed from: A, reason: collision with root package name */
    private f f12067A;

    /* renamed from: B, reason: collision with root package name */
    private float f12068B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f12069C;

    @Override // H2.b
    void n(float f10) {
    }

    private void t() {
        f fVar = this.f12067A;
        if (fVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = fVar.a();
        if (dA > this.f12055g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f12056h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // H2.b
    boolean q(long j10) {
        if (this.f12069C) {
            float f10 = this.f12068B;
            if (f10 != Float.MAX_VALUE) {
                this.f12067A.e(f10);
                this.f12068B = Float.MAX_VALUE;
            }
            this.f12050b = this.f12067A.a();
            this.f12049a = 0.0f;
            this.f12069C = false;
            return true;
        }
        if (this.f12068B != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            b.p pVarH = this.f12067A.h(this.f12050b, this.f12049a, j11);
            this.f12067A.e(this.f12068B);
            this.f12068B = Float.MAX_VALUE;
            b.p pVarH2 = this.f12067A.h(pVarH.f12063a, pVarH.f12064b, j11);
            this.f12050b = pVarH2.f12063a;
            this.f12049a = pVarH2.f12064b;
        } else {
            b.p pVarH3 = this.f12067A.h(this.f12050b, this.f12049a, j10);
            this.f12050b = pVarH3.f12063a;
            this.f12049a = pVarH3.f12064b;
        }
        float fMax = Math.max(this.f12050b, this.f12056h);
        this.f12050b = fMax;
        float fMin = Math.min(fMax, this.f12055g);
        this.f12050b = fMin;
        if (!s(fMin, this.f12049a)) {
            return false;
        }
        this.f12050b = this.f12067A.a();
        this.f12049a = 0.0f;
        return true;
    }

    boolean s(float f10, float f11) {
        return this.f12067A.c(f10, f11);
    }

    public e u(f fVar) {
        this.f12067A = fVar;
        return this;
    }

    public e(d dVar) {
        super(dVar);
        this.f12067A = null;
        this.f12068B = Float.MAX_VALUE;
        this.f12069C = false;
    }

    @Override // H2.b
    public void o() {
        t();
        this.f12067A.g(e());
        super.o();
    }

    public void r(float f10) {
        if (f()) {
            this.f12068B = f10;
            return;
        }
        if (this.f12067A == null) {
            this.f12067A = new f(f10);
        }
        this.f12067A.e(f10);
        o();
    }
}
