package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
abstract class w1<T> extends m0<T> {

    /* renamed from: f, reason: collision with root package name */
    protected o0 f93208f;

    protected w1(n0 n0Var) {
        super(n0Var);
        this.f93208f = new o0();
    }

    public void a(o0 o0Var) {
        this.f93208f = o0Var;
    }

    protected T j() {
        return null;
    }

    protected void k() {
        if (h()) {
            a((w1<T>) j());
        }
    }

    protected void l() {
        if (h()) {
            m();
        }
    }

    protected void m() {
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected void a(boolean z10) {
        super.a(z10);
        if (!z10) {
            m();
        } else {
            k();
            l();
        }
    }
}
