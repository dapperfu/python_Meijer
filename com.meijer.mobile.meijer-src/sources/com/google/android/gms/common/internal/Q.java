package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import id.C14719b;

/* loaded from: classes4.dex */
abstract class Q extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f65662d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f65663e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC6646c f65664f;

    @Override // com.google.android.gms.common.internal.c0
    protected final void b() {
    }

    protected abstract void f(C14719b c14719b);

    protected abstract boolean g();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected Q(AbstractC6646c abstractC6646c, int i10, Bundle bundle) {
        super(abstractC6646c, Boolean.TRUE);
        this.f65664f = abstractC6646c;
        this.f65662d = i10;
        this.f65663e = bundle;
    }

    @Override // com.google.android.gms.common.internal.c0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f65662d != 0) {
            this.f65664f.zzp(1, null);
            Bundle bundle = this.f65663e;
            f(new C14719b(this.f65662d, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC6646c.KEY_PENDING_INTENT) : null));
        } else {
            if (g()) {
                return;
            }
            this.f65664f.zzp(1, null);
            f(new C14719b(8, null));
        }
    }
}
