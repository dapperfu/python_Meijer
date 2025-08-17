package com.google.android.gms.internal.ads;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.ads.jS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8427jS extends HS {

    /* renamed from: a, reason: collision with root package name */
    private Activity f75442a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.h f75443b;

    /* renamed from: c, reason: collision with root package name */
    private String f75444c;

    /* renamed from: d, reason: collision with root package name */
    private String f75445d;

    C8427jS() {
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final HS b(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f75443b = hVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final HS c(String str) {
        this.f75444c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final HS d(String str) {
        this.f75445d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final HS a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.f75442a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final IS e() {
        Activity activity = this.f75442a;
        if (activity != null) {
            return new C8748mS(activity, this.f75443b, this.f75444c, this.f75445d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
