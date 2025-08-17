package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10058yj0 extends AbstractC8668lj0 {

    /* renamed from: p, reason: collision with root package name */
    private AbstractC9951xj0 f80266p;

    C10058yj0(AbstractC7401Zg0 abstractC7401Zg0, boolean z10, Executor executor, Callable callable) {
        super(abstractC7401Zg0, z10, false);
        this.f80266p = new C9844wj0(this, callable, executor);
        T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8668lj0
    final void R(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8668lj0
    final void S() {
        AbstractC9951xj0 abstractC9951xj0 = this.f80266p;
        if (abstractC9951xj0 != null) {
            abstractC9951xj0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final void t() {
        AbstractC9951xj0 abstractC9951xj0 = this.f80266p;
        if (abstractC9951xj0 != null) {
            abstractC9951xj0.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8668lj0
    final void W(int i10) {
        super.W(i10);
        if (i10 == 1) {
            this.f80266p = null;
        }
    }
}
