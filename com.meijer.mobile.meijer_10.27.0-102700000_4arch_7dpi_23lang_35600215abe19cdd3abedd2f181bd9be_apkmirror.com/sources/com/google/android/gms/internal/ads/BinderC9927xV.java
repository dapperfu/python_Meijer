package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class BinderC9927xV extends ZV {

    /* renamed from: k, reason: collision with root package name */
    private final C9162qG f79795k;

    public BinderC9927xV(XB xb2, C7987fG c7987fG, C9367sC c9367sC, IC ic2, NC nc2, C8833nC c8833nC, BE be2, CG cg2, C8195hD c8195hD, C9162qG c9162qG, C9906xE c9906xE) {
        super(xb2, c7987fG, c9367sC, ic2, nc2, be2, c8195hD, cg2, c9906xE, c8833nC);
        this.f79795k = c9162qG;
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void Y5(InterfaceC7409Zo interfaceC7409Zo) throws RemoteException {
        this.f79795k.z0(new C7277Vo(interfaceC7409Zo.zzf(), interfaceC7409Zo.zze()));
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void e8(C7277Vo c7277Vo) {
        this.f79795k.z0(c7277Vo);
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzu() throws RemoteException {
        this.f79795k.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzv() {
        this.f79795k.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6835Il
    public final void zzy() {
        this.f79795k.zzc();
    }
}
