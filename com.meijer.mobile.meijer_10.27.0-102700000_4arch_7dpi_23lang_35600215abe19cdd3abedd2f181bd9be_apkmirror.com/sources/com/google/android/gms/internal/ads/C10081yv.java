package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.yv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10081yv implements S50 {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f80305a;

    /* renamed from: b, reason: collision with root package name */
    private Context f80306b;

    /* renamed from: c, reason: collision with root package name */
    private String f80307c;

    /* synthetic */ C10081yv(C7518av c7518av, C6777Gv c6777Gv) {
        this.f80305a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.S50
    public final /* synthetic */ S50 zza(String str) {
        this.f80307c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.S50
    public final T50 zzc() {
        C9233qy0.c(this.f80306b, Context.class);
        return new C10188zv(this.f80305a, this.f80306b, this.f80307c, null);
    }

    @Override // com.google.android.gms.internal.ads.S50
    public final /* bridge */ /* synthetic */ S50 a(Context context) {
        context.getClass();
        this.f80306b = context;
        return this;
    }
}
