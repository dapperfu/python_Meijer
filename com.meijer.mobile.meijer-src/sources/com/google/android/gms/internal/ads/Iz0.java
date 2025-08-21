package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Iz0 implements InterfaceC8634kA0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f68578a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7432Wl f68579b;

    public Iz0(Object obj, VE0 ve0) {
        this.f68578a = obj;
        this.f68579b = ve0.I();
    }

    public final void a(AbstractC7432Wl abstractC7432Wl) {
        this.f68579b = abstractC7432Wl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8634kA0
    public final AbstractC7432Wl zza() {
        return this.f68579b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8634kA0
    public final Object zzb() {
        return this.f68578a;
    }
}
