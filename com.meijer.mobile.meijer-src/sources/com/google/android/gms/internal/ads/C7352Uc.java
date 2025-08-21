package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;

/* renamed from: com.google.android.gms.internal.ads.Uc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7352Uc implements AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7270Rq f71480a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7385Vc f71481b;

    C7352Uc(C7385Vc c7385Vc, C7270Rq c7270Rq) {
        this.f71480a = c7270Rq;
        this.f71481b = c7385Vc;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) {
        synchronized (this.f71481b.f71734d) {
            this.f71480a.c(new RuntimeException("Connection failed."));
        }
    }
}
