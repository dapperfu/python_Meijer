package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Ui0<V> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7495aj0<V> f70683a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.common.util.concurrent.q<? extends V> f70684b;

    Ui0(AbstractC7495aj0 abstractC7495aj0, com.google.common.util.concurrent.q qVar) {
        this.f70683a = abstractC7495aj0;
        this.f70684b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((AbstractC7495aj0) this.f70683a).f72481a != this) {
            return;
        }
        com.google.common.util.concurrent.q<? extends V> qVar = this.f70684b;
        if (AbstractC7495aj0.f72479f.f(this.f70683a, this, AbstractC7495aj0.i(qVar))) {
            AbstractC7495aj0.A(this.f70683a, false);
        }
    }
}
