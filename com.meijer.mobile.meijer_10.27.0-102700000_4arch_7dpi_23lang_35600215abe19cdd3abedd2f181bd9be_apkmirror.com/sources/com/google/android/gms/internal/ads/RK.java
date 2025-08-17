package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class RK extends AbstractBinderC7169Sh {

    /* renamed from: a, reason: collision with root package name */
    private final String f69858a;

    /* renamed from: b, reason: collision with root package name */
    private final C9379sI f69859b;

    /* renamed from: c, reason: collision with root package name */
    private final C9914xI f69860c;

    /* renamed from: d, reason: collision with root package name */
    private final C9812wN f69861d;

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzr() throws RemoteException {
        return this.f69858a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void E2(InterfaceC7101Qh interfaceC7101Qh) throws RemoteException {
        this.f69859b.z(interfaceC7101Qh);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void Q5(Mc.A0 a02) throws RemoteException {
        this.f69859b.x(a02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void T4(Bundle bundle) throws RemoteException {
        this.f69859b.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void T6(Bundle bundle) throws JSONException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76109Pc)).booleanValue()) {
            this.f69859b.q(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void c6(Bundle bundle) throws RemoteException {
        this.f69859b.u(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void e() {
        this.f69859b.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final boolean f() {
        return this.f69859b.E();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final boolean g() throws RemoteException {
        return (this.f69860c.h().isEmpty() || this.f69860c.X() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void i4(Mc.D0 d02) throws RemoteException {
        this.f69859b.k(d02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void v() {
        this.f69859b.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final boolean y3(Bundle bundle) throws RemoteException {
        return this.f69859b.H(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final double zze() throws RemoteException {
        return this.f69860c.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final Bundle zzf() throws RemoteException {
        return this.f69860c.Q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final Mc.U0 zzg() throws RemoteException {
        if (((Boolean) Mc.A.c().a(C8659lf.f75921C6)).booleanValue()) {
            return this.f69859b.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final Mc.Y0 zzh() throws RemoteException {
        return this.f69860c.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final InterfaceC7099Qg zzi() throws RemoteException {
        return this.f69860c.Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final InterfaceC7235Ug zzj() throws RemoteException {
        return this.f69859b.P().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final InterfaceC7334Xg zzk() throws RemoteException {
        return this.f69860c.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final com.google.android.gms.dynamic.b zzl() throws RemoteException {
        return this.f69860c.i0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final com.google.android.gms.dynamic.b zzm() throws RemoteException {
        return com.google.android.gms.dynamic.d.F2(this.f69859b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzn() throws RemoteException {
        return this.f69860c.k0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzo() throws RemoteException {
        return this.f69860c.l0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzp() throws RemoteException {
        return this.f69860c.m0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzq() throws RemoteException {
        return this.f69860c.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzs() throws RemoteException {
        return this.f69860c.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final String zzt() throws RemoteException {
        return this.f69860c.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final List zzu() throws RemoteException {
        return this.f69860c.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void zzw() throws RemoteException {
        this.f69859b.a0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void zzx() throws RemoteException {
        this.f69859b.a();
    }

    public RK(String str, C9379sI c9379sI, C9914xI c9914xI, C9812wN c9812wN) {
        this.f69858a = str;
        this.f69859b = c9379sI;
        this.f69860c = c9914xI;
        this.f69861d = c9812wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final void m9(Mc.N0 n02) throws RemoteException {
        try {
            if (!n02.zzf()) {
                this.f69861d.e();
            }
        } catch (RemoteException e10) {
            Qc.p.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.f69859b.y(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7203Th
    public final List zzv() throws RemoteException {
        if (g()) {
            return this.f69860c.h();
        }
        return Collections.EMPTY_LIST;
    }
}
