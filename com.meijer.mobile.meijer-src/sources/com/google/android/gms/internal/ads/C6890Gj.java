package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;

/* renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6890Gj implements AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7270Rq f68109a;

    C6890Gj(C6924Hj c6924Hj, C7270Rq c7270Rq) {
        this.f68109a = c7270Rq;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) {
        this.f68109a.c(new RuntimeException("Connection failed."));
    }
}
