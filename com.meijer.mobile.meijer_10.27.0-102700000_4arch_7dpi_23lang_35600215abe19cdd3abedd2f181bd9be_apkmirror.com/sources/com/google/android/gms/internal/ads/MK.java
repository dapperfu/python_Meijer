package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
public final class MK extends AbstractBinderC8770mh {

    /* renamed from: a, reason: collision with root package name */
    private final String f68626a;

    /* renamed from: b, reason: collision with root package name */
    private final C9379sI f68627b;

    /* renamed from: c, reason: collision with root package name */
    private final C9914xI f68628c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final String zzl() throws RemoteException {
        return this.f68626a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final void T(Bundle bundle) throws RemoteException {
        this.f68627b.u(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final void V(Bundle bundle) throws RemoteException {
        this.f68627b.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final boolean u(Bundle bundle) throws RemoteException {
        return this.f68627b.H(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final Bundle zzb() throws RemoteException {
        return this.f68628c.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final Mc.Y0 zzc() throws RemoteException {
        return this.f68628c.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final InterfaceC7099Qg zzd() throws RemoteException {
        return this.f68628c.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final InterfaceC7334Xg zze() throws RemoteException {
        return this.f68628c.b0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final com.google.android.gms.dynamic.b zzf() throws RemoteException {
        return this.f68628c.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final com.google.android.gms.dynamic.b zzg() throws RemoteException {
        return com.google.android.gms.dynamic.d.F2(this.f68627b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final String zzh() throws RemoteException {
        return this.f68628c.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final String zzi() throws RemoteException {
        return this.f68628c.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final String zzj() throws RemoteException {
        return this.f68628c.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final String zzk() throws RemoteException {
        return this.f68628c.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final List zzm() throws RemoteException {
        return this.f68628c.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8877nh
    public final void zzn() throws RemoteException {
        this.f68627b.a();
    }

    public MK(String str, C9379sI c9379sI, C9914xI c9914xI) {
        this.f68626a = str;
        this.f68627b = c9379sI;
        this.f68628c = c9914xI;
    }
}
