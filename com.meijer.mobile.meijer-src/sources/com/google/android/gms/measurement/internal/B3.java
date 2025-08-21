package com.google.android.gms.measurement.internal;

/* loaded from: classes6.dex */
abstract class B3 extends A3 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f85735b;

    protected abstract boolean g();

    protected void h() {
    }

    final boolean i() {
        return this.f85735b;
    }

    public final void k() {
        if (this.f85735b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (g()) {
            return;
        }
        this.f85708a.j();
        this.f85735b = true;
    }

    public final void l() {
        if (this.f85735b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h();
        this.f85708a.j();
        this.f85735b = true;
    }

    B3(X2 x22) {
        super(x22);
        this.f85708a.i();
    }

    protected final void j() {
        if (i()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }
}
