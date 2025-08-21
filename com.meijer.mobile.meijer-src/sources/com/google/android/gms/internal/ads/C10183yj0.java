package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10183yj0 extends AbstractC8793lj0 {

    /* renamed from: p, reason: collision with root package name */
    private AbstractC10076xj0 f81106p;

    C10183yj0(AbstractC7526Zg0 abstractC7526Zg0, boolean z10, Executor executor, Callable callable) {
        super(abstractC7526Zg0, z10, false);
        this.f81106p = new C9969wj0(this, callable, executor);
        T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8793lj0
    final void R(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8793lj0
    final void S() {
        AbstractC10076xj0 abstractC10076xj0 = this.f81106p;
        if (abstractC10076xj0 != null) {
            abstractC10076xj0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7620aj0
    protected final void t() {
        AbstractC10076xj0 abstractC10076xj0 = this.f81106p;
        if (abstractC10076xj0 != null) {
            abstractC10076xj0.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8793lj0
    final void W(int i10) {
        super.W(i10);
        if (i10 == 1) {
            this.f81106p = null;
        }
    }
}
