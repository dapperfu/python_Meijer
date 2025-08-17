package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import gd.C14243b;

/* loaded from: classes4.dex */
abstract class Q extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f64822d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f64823e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC6521c f64824f;

    @Override // com.google.android.gms.common.internal.c0
    protected final void b() {
    }

    protected abstract void f(C14243b c14243b);

    protected abstract boolean g();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected Q(AbstractC6521c abstractC6521c, int i10, Bundle bundle) {
        super(abstractC6521c, Boolean.TRUE);
        this.f64824f = abstractC6521c;
        this.f64822d = i10;
        this.f64823e = bundle;
    }

    @Override // com.google.android.gms.common.internal.c0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f64822d != 0) {
            this.f64824f.zzp(1, null);
            Bundle bundle = this.f64823e;
            f(new C14243b(this.f64822d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC6521c.KEY_PENDING_INTENT) : null));
        } else {
            if (g()) {
                return;
            }
            this.f64824f.zzp(1, null);
            f(new C14243b(8, null));
        }
    }
}
