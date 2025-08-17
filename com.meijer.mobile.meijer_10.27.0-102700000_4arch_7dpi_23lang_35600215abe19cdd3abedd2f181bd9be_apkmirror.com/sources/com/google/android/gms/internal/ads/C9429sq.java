package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.sq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9429sq {

    /* renamed from: a, reason: collision with root package name */
    private long f78303a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f78304b = -1;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9536tq f78305c;

    public C9429sq(C9536tq c9536tq) {
        this.f78305c = c9536tq;
    }

    public final long a() {
        return this.f78304b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f78303a);
        bundle.putLong("tclose", this.f78304b);
        return bundle;
    }

    public final void c() {
        this.f78304b = this.f78305c.f78635a.c();
    }

    public final void d() {
        this.f78303a = this.f78305c.f78635a.c();
    }
}
