package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
public final class KK extends AbstractBinderC8681kh {

    /* renamed from: a, reason: collision with root package name */
    private final String f68917a;

    /* renamed from: b, reason: collision with root package name */
    private final C9504sI f68918b;

    /* renamed from: c, reason: collision with root package name */
    private final C10039xI f68919c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final String zzl() throws RemoteException {
        return this.f68917a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final boolean I0(Bundle bundle) throws RemoteException {
        return this.f68918b.H(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final void L0(Bundle bundle) throws RemoteException {
        this.f68918b.u(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final void u(Bundle bundle) throws RemoteException {
        this.f68918b.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final double zzb() throws RemoteException {
        return this.f68919c.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final Bundle zzc() throws RemoteException {
        return this.f68919c.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final Oc.Y0 zzd() throws RemoteException {
        return this.f68919c.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final InterfaceC7224Qg zze() throws RemoteException {
        return this.f68919c.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final InterfaceC7459Xg zzf() throws RemoteException {
        return this.f68919c.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final com.google.android.gms.dynamic.b zzg() throws RemoteException {
        return this.f68919c.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final com.google.android.gms.dynamic.b zzh() throws RemoteException {
        return com.google.android.gms.dynamic.d.I2(this.f68918b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final String zzi() throws RemoteException {
        return this.f68919c.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final String zzj() throws RemoteException {
        return this.f68919c.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final String zzk() throws RemoteException {
        return this.f68919c.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final String zzm() throws RemoteException {
        return this.f68919c.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final String zzn() throws RemoteException {
        return this.f68919c.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final List zzo() throws RemoteException {
        return this.f68919c.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8788lh
    public final void zzp() throws RemoteException {
        this.f68918b.a();
    }

    public KK(String str, C9504sI c9504sI, C10039xI c10039xI) {
        this.f68917a = str;
        this.f68918b = c9504sI;
        this.f68919c = c10039xI;
    }
}
