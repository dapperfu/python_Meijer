package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.yv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10206yv implements S50 {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f81145a;

    /* renamed from: b, reason: collision with root package name */
    private Context f81146b;

    /* renamed from: c, reason: collision with root package name */
    private String f81147c;

    /* synthetic */ C10206yv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f81145a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.S50
    public final /* synthetic */ S50 zza(String str) {
        this.f81147c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.S50
    public final T50 zzc() {
        C9358qy0.c(this.f81146b, Context.class);
        return new C10313zv(this.f81145a, this.f81146b, this.f81147c, null);
    }

    @Override // com.google.android.gms.internal.ads.S50
    public final /* bridge */ /* synthetic */ S50 a(Context context) {
        context.getClass();
        this.f81146b = context;
        return this;
    }
}
