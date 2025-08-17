package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11136f2 extends E1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f85543b;

    final boolean g() {
        return this.f85543b;
    }

    protected abstract boolean k();

    protected void l() {
    }

    public final void i() {
        if (this.f85543b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (k()) {
            return;
        }
        this.f84868a.j();
        this.f85543b = true;
    }

    public final void j() {
        if (this.f85543b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f84868a.j();
        this.f85543b = true;
    }

    AbstractC11136f2(X2 x22) {
        super(x22);
        this.f84868a.i();
    }

    protected final void h() {
        if (g()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }
}
