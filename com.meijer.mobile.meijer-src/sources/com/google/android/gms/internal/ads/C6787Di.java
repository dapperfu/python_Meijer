package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Di, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6787Di implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9133ot f67115a;

    C6787Di(InterfaceC9133ot interfaceC9133ot) {
        this.f67115a = interfaceC9133ot;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        Sc.v vVar = this.f67115a.e() != null ? this.f67115a.e().f72908x0 : null;
        InterfaceC9133ot interfaceC9133ot = this.f67115a;
        new Rc.Y(interfaceC9133ot.getContext(), interfaceC9133ot.zzn().f34479a, str, null, vVar).b();
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Nc.v.s().x(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }
}
