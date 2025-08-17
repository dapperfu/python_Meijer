package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class IK extends AbstractBinderC7338Xj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC6862Jg {

    /* renamed from: a, reason: collision with root package name */
    private View f67599a;

    /* renamed from: b, reason: collision with root package name */
    private Mc.Y0 f67600b;

    /* renamed from: c, reason: collision with root package name */
    private C9379sI f67601c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f67602d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f67603e = false;

    private final void zzg() {
        View view;
        C9379sI c9379sI = this.f67601c;
        if (c9379sI == null || (view = this.f67599a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c9379sI.j(view, map, map, C9379sI.G(view));
    }

    private final void zzh() {
        View view = this.f67599a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f67599a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7371Yj
    public final void q8(com.google.android.gms.dynamic.b bVar, InterfaceC7603bk interfaceC7603bk) throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        if (this.f67602d) {
            Qc.p.d("Instream ad can not be shown after destroy().");
            B9(interfaceC7603bk, 2);
            return;
        }
        View view = this.f67599a;
        if (view == null || this.f67600b == null) {
            Qc.p.d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            B9(interfaceC7603bk, 0);
            return;
        }
        if (this.f67603e) {
            Qc.p.d("Instream ad should not be used again.");
            B9(interfaceC7603bk, 1);
            return;
        }
        this.f67603e = true;
        zzh();
        ((ViewGroup) com.google.android.gms.dynamic.d.b2(bVar)).addView(this.f67599a, new ViewGroup.LayoutParams(-1, -1));
        Lc.v.B();
        C7411Zq.a(this.f67599a, this);
        Lc.v.B();
        C7411Zq.b(this.f67599a, this);
        zzg();
        try {
            interfaceC7603bk.zzf();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7371Yj
    public final Mc.Y0 zzb() throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        if (!this.f67602d) {
            return this.f67600b;
        }
        Qc.p.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7371Yj
    public final InterfaceC7235Ug zzc() {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        if (this.f67602d) {
            Qc.p.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        C9379sI c9379sI = this.f67601c;
        if (c9379sI == null || c9379sI.P() == null) {
            return null;
        }
        return c9379sI.P().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7371Yj
    public final void zzd() throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        zzh();
        C9379sI c9379sI = this.f67601c;
        if (c9379sI != null) {
            c9379sI.a();
        }
        this.f67601c = null;
        this.f67599a = null;
        this.f67600b = null;
        this.f67602d = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7371Yj
    public final void zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        com.google.android.gms.common.internal.r.e("#008 Must be called on the main UI thread.");
        q8(bVar, new HK(this));
    }

    public IK(C9379sI c9379sI, C9914xI c9914xI) {
        this.f67599a = c9914xI.S();
        this.f67600b = c9914xI.W();
        this.f67601c = c9379sI;
        if (c9914xI.f0() != null) {
            c9914xI.f0().T(this);
        }
    }

    private static final void B9(InterfaceC7603bk interfaceC7603bk, int i10) {
        try {
            interfaceC7603bk.zze(i10);
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
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
