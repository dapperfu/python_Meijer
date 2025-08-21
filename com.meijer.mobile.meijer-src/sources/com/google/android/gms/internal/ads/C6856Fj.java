package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC6646c;

/* renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6856Fj implements AbstractC6646c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7270Rq f67678a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6924Hj f67679b;

    C6856Fj(C6924Hj c6924Hj, C7270Rq c7270Rq) {
        this.f67678a = c7270Rq;
        this.f67679b = c6924Hj;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        try {
            this.f67678a.b(this.f67679b.f68331a.c());
        } catch (DeadObjectException e10) {
            this.f67678a.c(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) {
        this.f67678a.c(new RuntimeException("onConnectionSuspended: " + i10));
    }
}
