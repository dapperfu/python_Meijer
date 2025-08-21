package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class BinderC10052xV extends ZV {

    /* renamed from: k, reason: collision with root package name */
    private final C9287qG f80635k;

    public BinderC10052xV(XB xb2, C8112fG c8112fG, C9492sC c9492sC, IC ic2, NC nc2, C8958nC c8958nC, BE be2, CG cg2, C8320hD c8320hD, C9287qG c9287qG, C10031xE c10031xE) {
        super(xb2, c8112fG, c9492sC, ic2, nc2, be2, c8320hD, cg2, c10031xE, c8958nC);
        this.f80635k = c9287qG;
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6960Il
    public final void d8(C7402Vo c7402Vo) {
        this.f80635k.y0(c7402Vo);
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6960Il
    public final void o6(InterfaceC7534Zo interfaceC7534Zo) throws RemoteException {
        this.f80635k.y0(new C7402Vo(interfaceC7534Zo.zzf(), interfaceC7534Zo.zze()));
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6960Il
    public final void zzu() throws RemoteException {
        this.f80635k.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6960Il
    public final void zzv() {
        this.f80635k.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ZV, com.google.android.gms.internal.ads.InterfaceC6960Il
    public final void zzy() {
        this.f80635k.zzc();
    }
}
