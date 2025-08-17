package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Iz0 implements InterfaceC8509kA0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f67738a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7307Wl f67739b;

    public Iz0(Object obj, VE0 ve0) {
        this.f67738a = obj;
        this.f67739b = ve0.I();
    }

    public final void a(AbstractC7307Wl abstractC7307Wl) {
        this.f67739b = abstractC7307Wl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8509kA0
    public final AbstractC7307Wl zza() {
        return this.f67739b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8509kA0
    public final Object zzb() {
        return this.f67738a;
    }
}
