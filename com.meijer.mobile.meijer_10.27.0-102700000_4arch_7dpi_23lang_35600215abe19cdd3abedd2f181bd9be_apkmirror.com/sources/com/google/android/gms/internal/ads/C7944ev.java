package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ev, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7944ev implements InterfaceC9457t30 {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f73949a;

    /* renamed from: b, reason: collision with root package name */
    private Context f73950b;

    /* renamed from: c, reason: collision with root package name */
    private String f73951c;

    /* synthetic */ C7944ev(C7518av c7518av, C6777Gv c6777Gv) {
        this.f73949a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9457t30
    public final InterfaceC9564u30 zzc() {
        C9233qy0.c(this.f73950b, Context.class);
        C9233qy0.c(this.f73951c, String.class);
        return new C8051fv(this.f73949a, this.f73950b, this.f73951c, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9457t30
    public final /* bridge */ /* synthetic */ InterfaceC9457t30 a(Context context) {
        context.getClass();
        this.f73950b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9457t30
    public final /* bridge */ /* synthetic */ InterfaceC9457t30 zza(String str) {
        str.getClass();
        this.f73951c = str;
        return this;
    }
}
