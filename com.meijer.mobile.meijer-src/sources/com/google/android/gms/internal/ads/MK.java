package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes6.dex */
public final class MK extends AbstractBinderC8895mh {

    /* renamed from: a, reason: collision with root package name */
    private final String f69466a;

    /* renamed from: b, reason: collision with root package name */
    private final C9504sI f69467b;

    /* renamed from: c, reason: collision with root package name */
    private final C10039xI f69468c;

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final String zzl() throws RemoteException {
        return this.f69466a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final void T(Bundle bundle) throws RemoteException {
        this.f69467b.u(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final void W(Bundle bundle) throws RemoteException {
        this.f69467b.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final boolean u(Bundle bundle) throws RemoteException {
        return this.f69467b.H(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final Bundle zzb() throws RemoteException {
        return this.f69468c.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final Oc.Y0 zzc() throws RemoteException {
        return this.f69468c.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final InterfaceC7224Qg zzd() throws RemoteException {
        return this.f69468c.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final InterfaceC7459Xg zze() throws RemoteException {
        return this.f69468c.b0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final com.google.android.gms.dynamic.b zzf() throws RemoteException {
        return this.f69468c.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final com.google.android.gms.dynamic.b zzg() throws RemoteException {
        return com.google.android.gms.dynamic.d.I2(this.f69467b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final String zzh() throws RemoteException {
        return this.f69468c.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final String zzi() throws RemoteException {
        return this.f69468c.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final String zzj() throws RemoteException {
        return this.f69468c.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final String zzk() throws RemoteException {
        return this.f69468c.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final List zzm() throws RemoteException {
        return this.f69468c.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9002nh
    public final void zzn() throws RemoteException {
        this.f69467b.a();
    }

    public MK(String str, C9504sI c9504sI, C10039xI c10039xI) {
        this.f69466a = str;
        this.f69467b = c9504sI;
        this.f69468c = c10039xI;
    }
}
