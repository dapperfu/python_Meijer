package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9226qv implements InterfaceC8318iO {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f77867a;

    /* renamed from: b, reason: collision with root package name */
    private Context f77868b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9202qj f77869c;

    /* synthetic */ C9226qv(C7518av c7518av, C6777Gv c6777Gv) {
        this.f77867a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8318iO
    public final InterfaceC8423jO zzc() {
        C9233qy0.c(this.f77868b, Context.class);
        C9233qy0.c(this.f77869c, InterfaceC9202qj.class);
        return new C9332rv(this.f77867a, this.f77868b, this.f77869c, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8318iO
    public final /* bridge */ /* synthetic */ InterfaceC8318iO a(Context context) {
        context.getClass();
        this.f77868b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8318iO
    public final /* bridge */ /* synthetic */ InterfaceC8318iO b(InterfaceC9202qj interfaceC9202qj) {
        interfaceC9202qj.getClass();
        this.f77869c = interfaceC9202qj;
        return this;
    }
}
