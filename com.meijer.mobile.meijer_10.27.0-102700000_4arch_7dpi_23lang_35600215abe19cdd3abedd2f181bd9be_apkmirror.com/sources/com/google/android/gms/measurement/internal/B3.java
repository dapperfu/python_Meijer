package com.google.android.gms.measurement.internal;

/* loaded from: classes6.dex */
abstract class B3 extends A3 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f84895b;

    protected abstract boolean g();

    protected void h() {
    }

    final boolean i() {
        return this.f84895b;
    }

    public final void k() {
        if (this.f84895b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (g()) {
            return;
        }
        this.f84868a.j();
        this.f84895b = true;
    }

    public final void l() {
        if (this.f84895b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        h();
        this.f84868a.j();
        this.f84895b = true;
    }

    B3(X2 x22) {
        super(x22);
        this.f84868a.i();
    }

    protected final void j() {
        if (i()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }
}
