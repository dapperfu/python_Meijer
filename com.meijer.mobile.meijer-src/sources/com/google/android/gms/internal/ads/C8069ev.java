package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ev, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8069ev implements InterfaceC9582t30 {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f74789a;

    /* renamed from: b, reason: collision with root package name */
    private Context f74790b;

    /* renamed from: c, reason: collision with root package name */
    private String f74791c;

    /* synthetic */ C8069ev(C7643av c7643av, C6902Gv c6902Gv) {
        this.f74789a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9582t30
    public final InterfaceC9689u30 zzc() {
        C9358qy0.c(this.f74790b, Context.class);
        C9358qy0.c(this.f74791c, String.class);
        return new C8176fv(this.f74789a, this.f74790b, this.f74791c, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9582t30
    public final /* bridge */ /* synthetic */ InterfaceC9582t30 a(Context context) {
        context.getClass();
        this.f74790b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9582t30
    public final /* bridge */ /* synthetic */ InterfaceC9582t30 zza(String str) {
        str.getClass();
        this.f74791c = str;
        return this;
    }
}
