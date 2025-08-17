package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;

/* renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6765Gj implements AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7145Rq f67269a;

    C6765Gj(C6799Hj c6799Hj, C7145Rq c7145Rq) {
        this.f67269a = c7145Rq;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) {
        this.f67269a.c(new RuntimeException("Connection failed."));
    }
}
