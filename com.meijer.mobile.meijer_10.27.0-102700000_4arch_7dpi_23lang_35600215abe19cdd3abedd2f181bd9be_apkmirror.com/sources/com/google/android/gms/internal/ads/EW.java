package com.google.android.gms.internal.ads;

import Mc.C4106c1;
import Mc.C4135m0;
import Mc.InterfaceC4099a0;
import Mc.InterfaceC4123i0;
import Mc.InterfaceC4144p0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class EW extends Mc.U {

    /* renamed from: a, reason: collision with root package name */
    private final Context f66473a;

    /* renamed from: b, reason: collision with root package name */
    private final Mc.H f66474b;

    /* renamed from: c, reason: collision with root package name */
    private final C9570u60 f66475c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC8804my f66476d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f66477e;

    /* renamed from: f, reason: collision with root package name */
    private final C9812wN f66478f;

    @Override // Mc.V
    public final void E8(boolean z10) throws RemoteException {
    }

    @Override // Mc.V
    public final void I2(InterfaceC6633Cn interfaceC6633Cn) throws RemoteException {
    }

    @Override // Mc.V
    public final void K4(InterfaceC9722vc interfaceC9722vc) throws RemoteException {
    }

    @Override // Mc.V
    public final boolean R() throws RemoteException {
        return false;
    }

    @Override // Mc.V
    public final void R4(InterfaceC4144p0 interfaceC4144p0) {
    }

    @Override // Mc.V
    public final void R6(Mc.j2 j2Var) throws RemoteException {
    }

    @Override // Mc.V
    public final void V1(InterfaceC6735Fn interfaceC6735Fn, String str) throws RemoteException {
    }

    @Override // Mc.V
    public final void X1(InterfaceC7075Po interfaceC7075Po) throws RemoteException {
    }

    @Override // Mc.V
    public final void Y8(Mc.Y1 y12, Mc.K k10) {
    }

    @Override // Mc.V
    public final void a4(C4106c1 c4106c1) throws RemoteException {
    }

    @Override // Mc.V
    public final void o() throws RemoteException {
    }

    @Override // Mc.V
    public final boolean q0() throws RemoteException {
        return false;
    }

    @Override // Mc.V
    public final void u5(String str) throws RemoteException {
    }

    @Override // Mc.V
    public final void u6(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // Mc.V
    public final void w6(String str) throws RemoteException {
    }

    @Override // Mc.V
    public final void B4(Mc.N0 n02) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76541ub)).booleanValue()) {
            Qc.p.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        C7899eX c7899eX = this.f66475c.f78737c;
        if (c7899eX != null) {
            try {
                if (!n02.zzf()) {
                    this.f66478f.e();
                }
            } catch (RemoteException e10) {
                Qc.p.c("Error in making CSI ping for reporting paid event callback", e10);
            }
            c7899eX.L(n02);
        }
    }

    @Override // Mc.V
    public final boolean G() throws RemoteException {
        AbstractC8804my abstractC8804my = this.f66476d;
        return abstractC8804my != null && abstractC8804my.h();
    }

    @Override // Mc.V
    public final void G6(InterfaceC6758Gf interfaceC6758Gf) throws RemoteException {
        Qc.p.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Mc.V
    public final void G7(InterfaceC4123i0 interfaceC4123i0) throws RemoteException {
        C7899eX c7899eX = this.f66475c.f78737c;
        if (c7899eX != null) {
            c7899eX.b0(interfaceC4123i0);
        }
    }

    @Override // Mc.V
    public final boolean H4(Mc.Y1 y12) throws RemoteException {
        Qc.p.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // Mc.V
    public final void L6(Mc.R1 r12) throws RemoteException {
        Qc.p.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Mc.V
    public final void N1(Mc.E e10) throws RemoteException {
        Qc.p.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Mc.V
    public final void O7(Mc.d2 d2Var) throws RemoteException {
        com.google.android.gms.common.internal.r.e("setAdSize must be called on the main UI thread.");
        AbstractC8804my abstractC8804my = this.f66476d;
        if (abstractC8804my != null) {
            abstractC8804my.p(this.f66477e, d2Var);
        }
    }

    @Override // Mc.V
    public final void R1(C4135m0 c4135m0) throws RemoteException {
        Qc.p.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Mc.V
    public final void c7(InterfaceC4099a0 interfaceC4099a0) throws RemoteException {
        Qc.p.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Mc.V
    public final void j() throws RemoteException {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        this.f66476d.d().S0(null);
    }

    @Override // Mc.V
    public final void r() throws RemoteException {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        this.f66476d.d().T0(null);
    }

    @Override // Mc.V
    public final void s8(Mc.H h10) throws RemoteException {
        Qc.p.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Mc.V
    public final void v() throws RemoteException {
        this.f66476d.o();
    }

    @Override // Mc.V
    public final void w9(boolean z10) throws RemoteException {
        Qc.p.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Mc.V
    public final Bundle zzd() throws RemoteException {
        Qc.p.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // Mc.V
    public final Mc.d2 zzg() {
        com.google.android.gms.common.internal.r.e("getAdSize must be called on the main UI thread.");
        return A60.a(this.f66473a, Collections.singletonList(this.f66476d.m()));
    }

    @Override // Mc.V
    public final Mc.H zzi() throws RemoteException {
        return this.f66474b;
    }

    @Override // Mc.V
    public final InterfaceC4123i0 zzj() throws RemoteException {
        return this.f66475c.f78748n;
    }

    @Override // Mc.V
    public final Mc.U0 zzk() {
        return this.f66476d.c();
    }

    @Override // Mc.V
    public final Mc.Y0 zzl() throws RemoteException {
        return this.f66476d.l();
    }

    @Override // Mc.V
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        return com.google.android.gms.dynamic.d.F2(this.f66477e);
    }

    @Override // Mc.V
    public final String zzr() throws RemoteException {
        return this.f66475c.f78740f;
    }

    @Override // Mc.V
    public final String zzs() throws RemoteException {
        if (this.f66476d.c() != null) {
            return this.f66476d.c().zzg();
        }
        return null;
    }

    @Override // Mc.V
    public final String zzt() throws RemoteException {
        if (this.f66476d.c() != null) {
            return this.f66476d.c().zzg();
        }
        return null;
    }

    @Override // Mc.V
    public final void zzx() throws RemoteException {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        this.f66476d.a();
    }

    public EW(Context context, Mc.H h10, C9570u60 c9570u60, AbstractC8804my abstractC8804my, C9812wN c9812wN) {
        this.f66473a = context;
        this.f66474b = h10;
        this.f66475c = c9570u60;
        this.f66476d = abstractC8804my;
        this.f66478f = c9812wN;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewK = abstractC8804my.k();
        Lc.v.t();
        frameLayout.addView(viewK, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().f19215c);
        frameLayout.setMinimumWidth(zzg().f19218f);
        this.f66477e = frameLayout;
    }
}
