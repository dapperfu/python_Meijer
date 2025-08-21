package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.wv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9992wv implements InterfaceC7665b50 {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f80455a;

    /* renamed from: b, reason: collision with root package name */
    private Context f80456b;

    /* renamed from: c, reason: collision with root package name */
    private String f80457c;

    /* renamed from: d, reason: collision with root package name */
    private Oc.d2 f80458d;

    /* synthetic */ C9992wv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f80455a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7665b50
    public final InterfaceC7771c50 zzd() {
        C9358qy0.c(this.f80456b, Context.class);
        C9358qy0.c(this.f80457c, String.class);
        C9358qy0.c(this.f80458d, Oc.d2.class);
        return new C10099xv(this.f80455a, this.f80456b, this.f80457c, this.f80458d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7665b50
    public final /* bridge */ /* synthetic */ InterfaceC7665b50 a(Oc.d2 d2Var) {
        d2Var.getClass();
        this.f80458d = d2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7665b50
    public final /* bridge */ /* synthetic */ InterfaceC7665b50 d(String str) {
        str.getClass();
        this.f80457c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7665b50
    public final /* bridge */ /* synthetic */ InterfaceC7665b50 zzc(Context context) {
        context.getClass();
        this.f80456b = context;
        return this;
    }
}
