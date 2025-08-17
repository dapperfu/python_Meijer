package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.wv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9867wv implements InterfaceC7540b50 {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f79615a;

    /* renamed from: b, reason: collision with root package name */
    private Context f79616b;

    /* renamed from: c, reason: collision with root package name */
    private String f79617c;

    /* renamed from: d, reason: collision with root package name */
    private Mc.d2 f79618d;

    /* synthetic */ C9867wv(C7518av c7518av, C6777Gv c6777Gv) {
        this.f79615a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7540b50
    public final InterfaceC7646c50 zzd() {
        C9233qy0.c(this.f79616b, Context.class);
        C9233qy0.c(this.f79617c, String.class);
        C9233qy0.c(this.f79618d, Mc.d2.class);
        return new C9974xv(this.f79615a, this.f79616b, this.f79617c, this.f79618d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7540b50
    public final /* bridge */ /* synthetic */ InterfaceC7540b50 a(Mc.d2 d2Var) {
        d2Var.getClass();
        this.f79618d = d2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7540b50
    public final /* bridge */ /* synthetic */ InterfaceC7540b50 d(String str) {
        str.getClass();
        this.f79617c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7540b50
    public final /* bridge */ /* synthetic */ InterfaceC7540b50 zzc(Context context) {
        context.getClass();
        this.f79616b = context;
        return this;
    }
}
