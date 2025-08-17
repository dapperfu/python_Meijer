package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC6521c;

/* renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6731Fj implements AbstractC6521c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7145Rq f66838a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6799Hj f66839b;

    C6731Fj(C6799Hj c6799Hj, C7145Rq c7145Rq) {
        this.f66838a = c7145Rq;
        this.f66839b = c6799Hj;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        try {
            this.f66838a.b(this.f66839b.f67491a.c());
        } catch (DeadObjectException e10) {
            this.f66838a.c(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) {
        this.f66838a.c(new RuntimeException("onConnectionSuspended: " + i10));
    }
}
