package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;

/* renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7227Uc implements AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7145Rq f70640a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7260Vc f70641b;

    C7227Uc(C7260Vc c7260Vc, C7145Rq c7145Rq) {
        this.f70640a = c7145Rq;
        this.f70641b = c7260Vc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) {
        synchronized (this.f70641b.f70894d) {
            this.f70640a.c(new RuntimeException("Connection failed."));
        }
    }
}
