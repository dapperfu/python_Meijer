package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11261f2 extends E1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f86383b;

    final boolean g() {
        return this.f86383b;
    }

    protected abstract boolean k();

    protected void l() {
    }

    public final void i() {
        if (this.f86383b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (k()) {
            return;
        }
        this.f85708a.j();
        this.f86383b = true;
    }

    public final void j() {
        if (this.f86383b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f85708a.j();
        this.f86383b = true;
    }

    AbstractC11261f2(X2 x22) {
        super(x22);
        this.f85708a.i();
    }

    protected final void h() {
        if (g()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }
}
