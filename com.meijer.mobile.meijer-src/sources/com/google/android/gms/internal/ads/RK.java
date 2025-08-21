package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class RK extends AbstractBinderC7294Sh {

    /* renamed from: a, reason: collision with root package name */
    private final String f70698a;

    /* renamed from: b, reason: collision with root package name */
    private final C9504sI f70699b;

    /* renamed from: c, reason: collision with root package name */
    private final C10039xI f70700c;

    /* renamed from: d, reason: collision with root package name */
    private final C9937wN f70701d;

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzr() throws RemoteException {
        return this.f70698a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void H2(InterfaceC7226Qh interfaceC7226Qh) throws RemoteException {
        this.f70699b.z(interfaceC7226Qh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final boolean K3(Bundle bundle) throws RemoteException {
        return this.f70699b.H(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void S7(Oc.A0 a02) throws RemoteException {
        this.f70699b.x(a02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void Y4(Oc.D0 d02) throws RemoteException {
        this.f70699b.k(d02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void e() {
        this.f70699b.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void e7(Bundle bundle) throws JSONException {
        if (((Boolean) Oc.A.c().a(C8784lf.f76949Pc)).booleanValue()) {
            this.f70699b.q(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final boolean g() {
        return this.f70699b.E();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void g5(Bundle bundle) throws RemoteException {
        this.f70699b.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final boolean h() throws RemoteException {
        return (this.f70700c.h().isEmpty() || this.f70700c.X() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void r6(Bundle bundle) throws RemoteException {
        this.f70699b.u(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void v() {
        this.f70699b.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final double zze() throws RemoteException {
        return this.f70700c.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final Bundle zzf() throws RemoteException {
        return this.f70700c.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final Oc.U0 zzg() throws RemoteException {
        if (((Boolean) Oc.A.c().a(C8784lf.f76761C6)).booleanValue()) {
            return this.f70699b.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final Oc.Y0 zzh() throws RemoteException {
        return this.f70700c.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final InterfaceC7224Qg zzi() throws RemoteException {
        return this.f70700c.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final InterfaceC7360Ug zzj() throws RemoteException {
        return this.f70699b.P().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final InterfaceC7459Xg zzk() throws RemoteException {
        return this.f70700c.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final com.google.android.gms.dynamic.b zzl() throws RemoteException {
        return this.f70700c.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final com.google.android.gms.dynamic.b zzm() throws RemoteException {
        return com.google.android.gms.dynamic.d.I2(this.f70699b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzn() throws RemoteException {
        return this.f70700c.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzo() throws RemoteException {
        return this.f70700c.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzp() throws RemoteException {
        return this.f70700c.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzq() throws RemoteException {
        return this.f70700c.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzs() throws RemoteException {
        return this.f70700c.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final String zzt() throws RemoteException {
        return this.f70700c.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final List zzu() throws RemoteException {
        return this.f70700c.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void zzw() throws RemoteException {
        this.f70699b.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void zzx() throws RemoteException {
        this.f70699b.a();
    }

    public RK(String str, C9504sI c9504sI, C10039xI c10039xI, C9937wN c9937wN) {
        this.f70698a = str;
        this.f70699b = c9504sI;
        this.f70700c = c10039xI;
        this.f70701d = c9937wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final void N8(Oc.N0 n02) throws RemoteException {
        try {
            if (!n02.zzf()) {
                this.f70701d.e();
            }
        } catch (RemoteException e10) {
            Sc.p.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f70699b.y(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7328Th
    public final List zzv() throws RemoteException {
        if (h()) {
            return this.f70700c.h();
        }
        return Collections.EMPTY_LIST;
    }
}
