package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class IK extends AbstractBinderC7463Xj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC6987Jg {

    /* renamed from: a, reason: collision with root package name */
    private View f68439a;

    /* renamed from: b, reason: collision with root package name */
    private Oc.Y0 f68440b;

    /* renamed from: c, reason: collision with root package name */
    private C9504sI f68441c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f68442d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f68443e = false;

    private final void zzg() {
        View view;
        C9504sI c9504sI = this.f68441c;
        if (c9504sI == null || (view = this.f68439a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c9504sI.j(view, map, map, C9504sI.G(view));
    }

    private final void zzh() {
        View view = this.f68439a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f68439a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7496Yj
    public final void p8(com.google.android.gms.dynamic.b bVar, InterfaceC7728bk interfaceC7728bk) throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        if (this.f68442d) {
            Sc.p.d("Instream ad can not be shown after destroy().");
            B9(interfaceC7728bk, 2);
            return;
        }
        View view = this.f68439a;
        if (view == null || this.f68440b == null) {
            Sc.p.d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            B9(interfaceC7728bk, 0);
            return;
        }
        if (this.f68443e) {
            Sc.p.d("Instream ad should not be used again.");
            B9(interfaceC7728bk, 1);
            return;
        }
        this.f68443e = true;
        zzh();
        ((ViewGroup) com.google.android.gms.dynamic.d.c2(bVar)).addView(this.f68439a, new ViewGroup.LayoutParams(-1, -1));
        Nc.v.B();
        C7536Zq.a(this.f68439a, this);
        Nc.v.B();
        C7536Zq.b(this.f68439a, this);
        zzg();
        try {
            interfaceC7728bk.zzf();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7496Yj
    public final Oc.Y0 zzb() throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        if (!this.f68442d) {
            return this.f68440b;
        }
        Sc.p.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7496Yj
    public final InterfaceC7360Ug zzc() {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        if (this.f68442d) {
            Sc.p.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        C9504sI c9504sI = this.f68441c;
        if (c9504sI == null || c9504sI.P() == null) {
            return null;
        }
        return c9504sI.P().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7496Yj
    public final void zzd() throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        zzh();
        C9504sI c9504sI = this.f68441c;
        if (c9504sI != null) {
            c9504sI.a();
        }
        this.f68441c = null;
        this.f68439a = null;
        this.f68440b = null;
        this.f68442d = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7496Yj
    public final void zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        p8(bVar, new HK(this));
    }

    public IK(C9504sI c9504sI, C10039xI c10039xI) {
        this.f68439a = c10039xI.S();
        this.f68440b = c10039xI.W();
        this.f68441c = c9504sI;
        if (c10039xI.f0() != null) {
            c10039xI.f0().T(this);
        }
    }

    private static final void B9(InterfaceC7728bk interfaceC7728bk, int i10) {
        try {
            interfaceC7728bk.zze(i10);
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }
}
