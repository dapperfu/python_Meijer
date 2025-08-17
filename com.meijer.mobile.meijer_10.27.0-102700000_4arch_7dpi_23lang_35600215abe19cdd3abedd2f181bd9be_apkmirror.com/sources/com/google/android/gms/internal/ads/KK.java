package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
public final class KK extends AbstractBinderC8556kh {

    /* renamed from: a, reason: collision with root package name */
    private final String f68077a;

    /* renamed from: b, reason: collision with root package name */
    private final C9379sI f68078b;

    /* renamed from: c, reason: collision with root package name */
    private final C9914xI f68079c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final String zzl() throws RemoteException {
        return this.f68077a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final boolean F0(Bundle bundle) throws RemoteException {
        return this.f68078b.H(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final void J0(Bundle bundle) throws RemoteException {
        this.f68078b.u(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final void u(Bundle bundle) throws RemoteException {
        this.f68078b.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final double zzb() throws RemoteException {
        return this.f68079c.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final Bundle zzc() throws RemoteException {
        return this.f68079c.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final Mc.Y0 zzd() throws RemoteException {
        return this.f68079c.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final InterfaceC7099Qg zze() throws RemoteException {
        return this.f68079c.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final InterfaceC7334Xg zzf() throws RemoteException {
        return this.f68079c.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final com.google.android.gms.dynamic.b zzg() throws RemoteException {
        return this.f68079c.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final com.google.android.gms.dynamic.b zzh() throws RemoteException {
        return com.google.android.gms.dynamic.d.F2(this.f68078b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final String zzi() throws RemoteException {
        return this.f68079c.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final String zzj() throws RemoteException {
        return this.f68079c.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final String zzk() throws RemoteException {
        return this.f68079c.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final String zzm() throws RemoteException {
        return this.f68079c.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final String zzn() throws RemoteException {
        return this.f68079c.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final List zzo() throws RemoteException {
        return this.f68079c.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8663lh
    public final void zzp() throws RemoteException {
        this.f68078b.a();
    }

    public KK(String str, C9379sI c9379sI, C9914xI c9914xI) {
        this.f68077a = str;
        this.f68078b = c9379sI;
        this.f68079c = c9914xI;
    }
}
