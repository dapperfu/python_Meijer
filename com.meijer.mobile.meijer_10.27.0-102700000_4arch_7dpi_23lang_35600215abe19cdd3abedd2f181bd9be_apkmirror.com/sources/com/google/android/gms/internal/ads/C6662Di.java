package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Di, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6662Di implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9008ot f66275a;

    C6662Di(InterfaceC9008ot interfaceC9008ot) {
        this.f66275a = interfaceC9008ot;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        Qc.v vVar = this.f66275a.e() != null ? this.f66275a.e().f72068x0 : null;
        InterfaceC9008ot interfaceC9008ot = this.f66275a;
        new Pc.Y(interfaceC9008ot.getContext(), interfaceC9008ot.zzn().f29929a, str, null, vVar).b();
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Lc.v.s().x(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }
}
