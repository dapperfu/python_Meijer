package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9351qv implements InterfaceC8443iO {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f78707a;

    /* renamed from: b, reason: collision with root package name */
    private Context f78708b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9327qj f78709c;

    /* synthetic */ C9351qv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f78707a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8443iO
    public final InterfaceC8548jO zzc() {
        C9358qy0.c(this.f78708b, Context.class);
        C9358qy0.c(this.f78709c, InterfaceC9327qj.class);
        return new C9457rv(this.f78707a, this.f78708b, this.f78709c, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8443iO
    public final /* bridge */ /* synthetic */ InterfaceC8443iO a(Context context) {
        context.getClass();
        this.f78708b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8443iO
    public final /* bridge */ /* synthetic */ InterfaceC8443iO b(InterfaceC9327qj interfaceC9327qj) {
        interfaceC9327qj.getClass();
        this.f78709c = interfaceC9327qj;
        return this;
    }
}
