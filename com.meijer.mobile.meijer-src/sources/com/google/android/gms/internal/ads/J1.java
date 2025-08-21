package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class J1 extends C0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f68589b;

    @Override // com.google.android.gms.internal.ads.C0, com.google.android.gms.internal.ads.InterfaceC9361r0
    public final long zzd() {
        return super.zzd() - this.f68589b;
    }

    @Override // com.google.android.gms.internal.ads.C0, com.google.android.gms.internal.ads.InterfaceC9361r0
    public final long zze() {
        return super.zze() - this.f68589b;
    }

    @Override // com.google.android.gms.internal.ads.C0, com.google.android.gms.internal.ads.InterfaceC9361r0
    public final long zzf() {
        return super.zzf() - this.f68589b;
    }

    public J1(InterfaceC9361r0 interfaceC9361r0, long j10) {
        boolean z10;
        super(interfaceC9361r0);
        if (interfaceC9361r0.zzf() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        this.f68589b = j10;
    }
}
