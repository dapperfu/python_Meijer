package com.google.android.gms.internal.ads;

import Oc.C4384c1;
import Oc.C4413m0;
import Oc.InterfaceC4377a0;
import Oc.InterfaceC4401i0;
import Oc.InterfaceC4422p0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class EW extends Oc.U {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67313a;

    /* renamed from: b, reason: collision with root package name */
    private final Oc.H f67314b;

    /* renamed from: c, reason: collision with root package name */
    private final C9695u60 f67315c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC8929my f67316d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f67317e;

    /* renamed from: f, reason: collision with root package name */
    private final C9937wN f67318f;

    @Override // Oc.V
    public final void A5(String str) throws RemoteException {
    }

    @Override // Oc.V
    public final void A6(Oc.Y1 y12, Oc.K k10) {
    }

    @Override // Oc.V
    public final void G5(Oc.j2 j2Var) throws RemoteException {
    }

    @Override // Oc.V
    public final void J6(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // Oc.V
    public final void K6(String str) throws RemoteException {
    }

    @Override // Oc.V
    public final void O2(InterfaceC6758Cn interfaceC6758Cn) throws RemoteException {
    }

    @Override // Oc.V
    public final boolean R() throws RemoteException {
        return false;
    }

    @Override // Oc.V
    public final void V4(InterfaceC9847vc interfaceC9847vc) throws RemoteException {
    }

    @Override // Oc.V
    public final void W4(C4384c1 c4384c1) throws RemoteException {
    }

    @Override // Oc.V
    public final void X1(InterfaceC6860Fn interfaceC6860Fn, String str) throws RemoteException {
    }

    @Override // Oc.V
    public final void Y1(InterfaceC7200Po interfaceC7200Po) throws RemoteException {
    }

    @Override // Oc.V
    public final void d4(InterfaceC4422p0 interfaceC4422p0) {
    }

    @Override // Oc.V
    public final void o() throws RemoteException {
    }

    @Override // Oc.V
    public final boolean r0() throws RemoteException {
        return false;
    }

    @Override // Oc.V
    public final void y8(boolean z10) throws RemoteException {
    }

    @Override // Oc.V
    public final void B5(Oc.R1 r12) throws RemoteException {
        Sc.p.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Oc.V
    public final void D3(Oc.N0 n02) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77381ub)).booleanValue()) {
            Sc.p.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        C8024eX c8024eX = this.f67315c.f79577c;
        if (c8024eX != null) {
            try {
                if (!n02.zzf()) {
                    this.f67318f.e();
                }
            } catch (RemoteException e10) {
                Sc.p.c("Error in making CSI ping for reporting paid event callback", e10);
            }
            c8024eX.N(n02);
        }
    }

    @Override // Oc.V
    public final boolean G() throws RemoteException {
        AbstractC8929my abstractC8929my = this.f67316d;
        return abstractC8929my != null && abstractC8929my.h();
    }

    @Override // Oc.V
    public final void J2(Oc.E e10) throws RemoteException {
        Sc.p.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Oc.V
    public final void S6(InterfaceC4377a0 interfaceC4377a0) throws RemoteException {
        Sc.p.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Oc.V
    public final void T6(InterfaceC6883Gf interfaceC6883Gf) throws RemoteException {
        Sc.p.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Oc.V
    public final boolean W7(Oc.Y1 y12) throws RemoteException {
        Sc.p.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // Oc.V
    public final void a9(C4413m0 c4413m0) throws RemoteException {
        Sc.p.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Oc.V
    public final void j() throws RemoteException {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        this.f67316d.d().S0(null);
    }

    @Override // Oc.V
    public final void n9(Oc.H h10) throws RemoteException {
        Sc.p.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Oc.V
    public final void o9(InterfaceC4401i0 interfaceC4401i0) throws RemoteException {
        C8024eX c8024eX = this.f67315c.f79577c;
        if (c8024eX != null) {
            c8024eX.g0(interfaceC4401i0);
        }
    }

    @Override // Oc.V
    public final void r() throws RemoteException {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        this.f67316d.d().T0(null);
    }

    @Override // Oc.V
    public final void u1(Oc.d2 d2Var) throws RemoteException {
        com.google.android.gms.common.internal.r.e("setAdSize must be called on the main UI thread.");
        AbstractC8929my abstractC8929my = this.f67316d;
        if (abstractC8929my != null) {
            abstractC8929my.p(this.f67317e, d2Var);
        }
    }

    @Override // Oc.V
    public final void v() throws RemoteException {
        this.f67316d.o();
    }

    @Override // Oc.V
    public final void v9(boolean z10) throws RemoteException {
        Sc.p.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // Oc.V
    public final Bundle zzd() throws RemoteException {
        Sc.p.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // Oc.V
    public final Oc.d2 zzg() {
        com.google.android.gms.common.internal.r.e("getAdSize must be called on the main UI thread.");
        return A60.a(this.f67313a, Collections.singletonList(this.f67316d.m()));
    }

    @Override // Oc.V
    public final Oc.H zzi() throws RemoteException {
        return this.f67314b;
    }

    @Override // Oc.V
    public final InterfaceC4401i0 zzj() throws RemoteException {
        return this.f67315c.f79588n;
    }

    @Override // Oc.V
    public final Oc.U0 zzk() {
        return this.f67316d.c();
    }

    @Override // Oc.V
    public final Oc.Y0 zzl() throws RemoteException {
        return this.f67316d.l();
    }

    @Override // Oc.V
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        return com.google.android.gms.dynamic.d.I2(this.f67317e);
    }

    @Override // Oc.V
    public final String zzr() throws RemoteException {
        return this.f67315c.f79580f;
    }

    @Override // Oc.V
    public final String zzs() throws RemoteException {
        if (this.f67316d.c() != null) {
            return this.f67316d.c().zzg();
        }
        return null;
    }

    @Override // Oc.V
    public final String zzt() throws RemoteException {
        if (this.f67316d.c() != null) {
            return this.f67316d.c().zzg();
        }
        return null;
    }

    @Override // Oc.V
    public final void zzx() throws RemoteException {
        com.google.android.gms.common.internal.r.e("destroy must be called on the main UI thread.");
        this.f67316d.a();
    }

    public EW(Context context, Oc.H h10, C9695u60 c9695u60, AbstractC8929my abstractC8929my, C9937wN c9937wN) {
        this.f67313a = context;
        this.f67314b = h10;
        this.f67315c = c9695u60;
        this.f67316d = abstractC8929my;
        this.f67318f = c9937wN;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewK = abstractC8929my.k();
        Nc.v.t();
        frameLayout.addView(viewK, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().f23402c);
        frameLayout.setMinimumWidth(zzg().f23405f);
        this.f67317e = frameLayout;
    }
}
