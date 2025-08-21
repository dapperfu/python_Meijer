package com.google.android.gms.internal.ads;

import Oc.InterfaceC4381b1;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7239Qt extends Oc.X0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6932Hr f70511a;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f70513c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f70514d;

    /* renamed from: e, reason: collision with root package name */
    private int f70515e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4381b1 f70516f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f70517g;

    /* renamed from: i, reason: collision with root package name */
    private float f70519i;

    /* renamed from: j, reason: collision with root package name */
    private float f70520j;

    /* renamed from: k, reason: collision with root package name */
    private float f70521k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f70522l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f70523m;

    /* renamed from: n, reason: collision with root package name */
    private C6853Fh f70524n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f70512b = new Object();

    /* renamed from: h, reason: collision with root package name */
    private boolean f70518h = true;

    @Override // Oc.Y0
    public final void J(boolean z10) {
        J9(true != z10 ? "unmute" : "mute", null);
    }

    private final void I9(final int i10, final int i11, final boolean z10, final boolean z11) {
        C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Pt
            @Override // java.lang.Runnable
            public final void run() {
                this.f70273a.D9(i10, i11, z10, z11);
            }
        });
    }

    private final void J9(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ot
            @Override // java.lang.Runnable
            public final void run() {
                this.f70031a.E9(map2);
            }
        });
    }

    public final void C9(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.f70512b) {
            try {
                z11 = true;
                if (f11 == this.f70519i && f12 == this.f70521k) {
                    z11 = false;
                }
                this.f70519i = f11;
                if (!((Boolean) Oc.A.c().a(C8784lf.f76823Gc)).booleanValue()) {
                    this.f70520j = f10;
                }
                z12 = this.f70518h;
                this.f70518h = z10;
                i11 = this.f70515e;
                this.f70515e = i10;
                float f13 = this.f70521k;
                this.f70521k = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.f70511a.zzF().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            try {
                C6853Fh c6853Fh = this.f70524n;
                if (c6853Fh != null) {
                    c6853Fh.zze();
                }
            } catch (RemoteException e10) {
                Sc.p.i("#007 Could not call remote method.", e10);
            }
        }
        I9(i11, i10, z12, z10);
    }

    final /* synthetic */ void D9(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        InterfaceC4381b1 interfaceC4381b1;
        InterfaceC4381b1 interfaceC4381b12;
        InterfaceC4381b1 interfaceC4381b13;
        synchronized (this.f70512b) {
            try {
                boolean z14 = this.f70517g;
                if (z14 || i11 != 1) {
                    i12 = i11;
                    z12 = false;
                } else {
                    i11 = 1;
                    i12 = 1;
                    z12 = true;
                }
                boolean z15 = i10 != i11;
                if (z15 && i12 == 1) {
                    z13 = true;
                    i12 = 1;
                } else {
                    z13 = false;
                }
                boolean z16 = z15 && i12 == 2;
                boolean z17 = z15 && i12 == 3;
                this.f70517g = z14 || z12;
                if (z12) {
                    try {
                        InterfaceC4381b1 interfaceC4381b14 = this.f70516f;
                        if (interfaceC4381b14 != null) {
                            interfaceC4381b14.zzi();
                        }
                    } catch (RemoteException e10) {
                        Sc.p.i("#007 Could not call remote method.", e10);
                    }
                }
                if (z13 && (interfaceC4381b13 = this.f70516f) != null) {
                    interfaceC4381b13.zzh();
                }
                if (z16 && (interfaceC4381b12 = this.f70516f) != null) {
                    interfaceC4381b12.zzg();
                }
                if (z17) {
                    InterfaceC4381b1 interfaceC4381b15 = this.f70516f;
                    if (interfaceC4381b15 != null) {
                        interfaceC4381b15.zze();
                    }
                    this.f70511a.zzw();
                }
                if (z10 != z11 && (interfaceC4381b1 = this.f70516f) != null) {
                    interfaceC4381b1.n0(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void E9(Map map) {
        this.f70511a.L("pubVideoCmd", map);
    }

    public final void F9(Oc.R1 r12) {
        Object obj = this.f70512b;
        boolean z10 = r12.f23341a;
        boolean z11 = r12.f23342b;
        boolean z12 = r12.f23343c;
        synchronized (obj) {
            this.f70522l = z11;
            this.f70523m = z12;
        }
        J9("initialState", com.google.android.gms.common.util.g.c("muteStart", true != z10 ? "0" : "1", "customControlsRequested", true != z11 ? "0" : "1", "clickToExpandRequested", true != z12 ? "0" : "1"));
    }

    public final void G9(float f10) {
        synchronized (this.f70512b) {
            this.f70520j = f10;
        }
    }

    public final void H9(C6853Fh c6853Fh) {
        synchronized (this.f70512b) {
            this.f70524n = c6853Fh;
        }
    }

    @Override // Oc.Y0
    public final void v5(InterfaceC4381b1 interfaceC4381b1) {
        synchronized (this.f70512b) {
            this.f70516f = interfaceC4381b1;
        }
    }

    @Override // Oc.Y0
    public final float zze() {
        float f10;
        synchronized (this.f70512b) {
            f10 = this.f70521k;
        }
        return f10;
    }

    @Override // Oc.Y0
    public final float zzf() {
        float f10;
        synchronized (this.f70512b) {
            f10 = this.f70520j;
        }
        return f10;
    }

    @Override // Oc.Y0
    public final float zzg() {
        float f10;
        synchronized (this.f70512b) {
            f10 = this.f70519i;
        }
        return f10;
    }

    @Override // Oc.Y0
    public final int zzh() {
        int i10;
        synchronized (this.f70512b) {
            i10 = this.f70515e;
        }
        return i10;
    }

    @Override // Oc.Y0
    public final InterfaceC4381b1 zzi() throws RemoteException {
        InterfaceC4381b1 interfaceC4381b1;
        synchronized (this.f70512b) {
            interfaceC4381b1 = this.f70516f;
        }
        return interfaceC4381b1;
    }

    @Override // Oc.Y0
    public final void zzk() {
        J9("pause", null);
    }

    @Override // Oc.Y0
    public final void zzl() {
        J9("play", null);
    }

    @Override // Oc.Y0
    public final void zzn() {
        J9("stop", null);
    }

    @Override // Oc.Y0
    public final boolean zzo() {
        boolean z10;
        Object obj = this.f70512b;
        boolean zZzp = zzp();
        synchronized (obj) {
            z10 = false;
            if (!zZzp) {
                try {
                    if (this.f70523m && this.f70514d) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // Oc.Y0
    public final boolean zzp() {
        boolean z10;
        synchronized (this.f70512b) {
            try {
                z10 = false;
                if (this.f70513c && this.f70522l) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // Oc.Y0
    public final boolean zzq() {
        boolean z10;
        synchronized (this.f70512b) {
            z10 = this.f70518h;
        }
        return z10;
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.f70512b) {
            z10 = this.f70518h;
            i10 = this.f70515e;
            this.f70515e = 3;
        }
        I9(i10, 3, z10, z10);
    }

    public BinderC7239Qt(InterfaceC6932Hr interfaceC6932Hr, float f10, boolean z10, boolean z11) {
        this.f70511a = interfaceC6932Hr;
        this.f70519i = f10;
        this.f70513c = z10;
        this.f70514d = z11;
    }
}
