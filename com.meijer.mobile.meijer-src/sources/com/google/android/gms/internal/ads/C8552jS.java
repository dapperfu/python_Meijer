package com.google.android.gms.internal.ads;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.ads.jS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8552jS extends HS {

    /* renamed from: a, reason: collision with root package name */
    private Activity f76282a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.h f76283b;

    /* renamed from: c, reason: collision with root package name */
    private String f76284c;

    /* renamed from: d, reason: collision with root package name */
    private String f76285d;

    C8552jS() {
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final HS b(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f76283b = hVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final HS c(String str) {
        this.f76284c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final HS d(String str) {
        this.f76285d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final HS a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.f76282a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HS
    public final IS e() {
        Activity activity = this.f76282a;
        if (activity != null) {
            return new C8873mS(activity, this.f76283b, this.f76284c, this.f76285d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
