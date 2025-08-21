package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8602jv implements InterfaceC8515j40 {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f76370a;

    /* renamed from: b, reason: collision with root package name */
    private Context f76371b;

    /* renamed from: c, reason: collision with root package name */
    private String f76372c;

    /* renamed from: d, reason: collision with root package name */
    private Oc.d2 f76373d;

    /* synthetic */ C8602jv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f76370a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8515j40
    public final InterfaceC8622k40 zzd() {
        C9358qy0.c(this.f76371b, Context.class);
        C9358qy0.c(this.f76372c, String.class);
        C9358qy0.c(this.f76373d, Oc.d2.class);
        return new C8709kv(this.f76370a, this.f76371b, this.f76372c, this.f76373d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8515j40
    public final /* bridge */ /* synthetic */ InterfaceC8515j40 a(Oc.d2 d2Var) {
        d2Var.getClass();
        this.f76373d = d2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8515j40
    public final /* bridge */ /* synthetic */ InterfaceC8515j40 d(String str) {
        str.getClass();
        this.f76372c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8515j40
    public final /* bridge */ /* synthetic */ InterfaceC8515j40 zzc(Context context) {
        context.getClass();
        this.f76371b = context;
        return this;
    }
}
