package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9748vp extends AbstractBinderC8359ip {

    /* renamed from: a, reason: collision with root package name */
    private final Zc.b f79132a;

    /* renamed from: b, reason: collision with root package name */
    private final C9855wp f79133b;

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void b(Mc.W0 w02) {
        Zc.b bVar = this.f79132a;
        if (bVar != null) {
            bVar.a(w02.T());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8465jp
    public final void zzg() {
        C9855wp c9855wp;
        Zc.b bVar = this.f79132a;
        if (bVar == null || (c9855wp = this.f79133b) == null) {
            return;
        }
        bVar.b(c9855wp);
    }

    public BinderC9748vp(Zc.b bVar, C9855wp c9855wp) {
        this.f79132a = bVar;
        this.f79133b = c9855wp;
    }
}
