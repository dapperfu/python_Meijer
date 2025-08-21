package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11233b6 extends W5 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f86207c;

    final boolean g() {
        return this.f86207c;
    }

    protected abstract boolean j();

    public final void i() {
        if (this.f86207c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f86107b.d0();
        this.f86207c = true;
    }

    AbstractC11233b6(q6 q6Var) {
        super(q6Var);
        this.f86107b.c0();
    }

    protected final void h() {
        if (g()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }
}
