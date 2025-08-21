package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Ui0<V> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7620aj0<V> f71523a;

    /* renamed from: b, reason: collision with root package name */
    final com.google.common.util.concurrent.q<? extends V> f71524b;

    Ui0(AbstractC7620aj0 abstractC7620aj0, com.google.common.util.concurrent.q qVar) {
        this.f71523a = abstractC7620aj0;
        this.f71524b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((AbstractC7620aj0) this.f71523a).f73321a != this) {
            return;
        }
        com.google.common.util.concurrent.q<? extends V> qVar = this.f71524b;
        if (AbstractC7620aj0.f73319f.f(this.f71523a, this, AbstractC7620aj0.i(qVar))) {
            AbstractC7620aj0.A(this.f71523a, false);
        }
    }
}
