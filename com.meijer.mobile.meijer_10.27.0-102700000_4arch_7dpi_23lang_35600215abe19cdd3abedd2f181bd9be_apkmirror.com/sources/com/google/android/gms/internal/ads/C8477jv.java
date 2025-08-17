package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8477jv implements InterfaceC8390j40 {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f75530a;

    /* renamed from: b, reason: collision with root package name */
    private Context f75531b;

    /* renamed from: c, reason: collision with root package name */
    private String f75532c;

    /* renamed from: d, reason: collision with root package name */
    private Mc.d2 f75533d;

    /* synthetic */ C8477jv(C7518av c7518av, C6777Gv c6777Gv) {
        this.f75530a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8390j40
    public final InterfaceC8497k40 zzd() {
        C9233qy0.c(this.f75531b, Context.class);
        C9233qy0.c(this.f75532c, String.class);
        C9233qy0.c(this.f75533d, Mc.d2.class);
        return new C8584kv(this.f75530a, this.f75531b, this.f75532c, this.f75533d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8390j40
    public final /* bridge */ /* synthetic */ InterfaceC8390j40 a(Mc.d2 d2Var) {
        d2Var.getClass();
        this.f75533d = d2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8390j40
    public final /* bridge */ /* synthetic */ InterfaceC8390j40 d(String str) {
        str.getClass();
        this.f75532c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8390j40
    public final /* bridge */ /* synthetic */ InterfaceC8390j40 zzc(Context context) {
        context.getClass();
        this.f75531b = context;
        return this;
    }
}
