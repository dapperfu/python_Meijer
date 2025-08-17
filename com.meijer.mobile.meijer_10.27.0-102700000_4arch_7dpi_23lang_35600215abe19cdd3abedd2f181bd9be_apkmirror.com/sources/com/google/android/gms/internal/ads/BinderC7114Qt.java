package com.google.android.gms.internal.ads;

import Mc.InterfaceC4103b1;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7114Qt extends Mc.X0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6807Hr f69671a;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f69673c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f69674d;

    /* renamed from: e, reason: collision with root package name */
    private int f69675e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4103b1 f69676f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f69677g;

    /* renamed from: i, reason: collision with root package name */
    private float f69679i;

    /* renamed from: j, reason: collision with root package name */
    private float f69680j;

    /* renamed from: k, reason: collision with root package name */
    private float f69681k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f69682l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f69683m;

    /* renamed from: n, reason: collision with root package name */
    private C6728Fh f69684n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f69672b = new Object();

    /* renamed from: h, reason: collision with root package name */
    private boolean f69678h = true;

    @Override // Mc.Y0
    public final void J(boolean z10) {
        J9(true != z10 ? "unmute" : "mute", null);
    }

    private final void I9(final int i10, final int i11, final boolean z10, final boolean z11) {
        C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Pt
            @Override // java.lang.Runnable
            public final void run() {
                this.f69433a.D9(i10, i11, z10, z11);
            }
        });
    }

    private final void J9(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ot
            @Override // java.lang.Runnable
            public final void run() {
                this.f69191a.E9(map2);
            }
        });
    }

    public final void C9(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.f69672b) {
            try {
                z11 = true;
                if (f11 == this.f69679i && f12 == this.f69681k) {
                    z11 = false;
                }
                this.f69679i = f11;
                if (!((Boolean) Mc.A.c().a(C8659lf.f75983Gc)).booleanValue()) {
                    this.f69680j = f10;
                }
                z12 = this.f69678h;
                this.f69678h = z10;
                i11 = this.f69675e;
                this.f69675e = i10;
                float f13 = this.f69681k;
                this.f69681k = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.f69671a.zzF().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            try {
                C6728Fh c6728Fh = this.f69684n;
                if (c6728Fh != null) {
                    c6728Fh.zze();
                }
            } catch (RemoteException e10) {
                Qc.p.i("#007 Could not call remote method.", e10);
            }
        }
        I9(i11, i10, z12, z10);
    }

    final /* synthetic */ void D9(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        InterfaceC4103b1 interfaceC4103b1;
        InterfaceC4103b1 interfaceC4103b12;
        InterfaceC4103b1 interfaceC4103b13;
        synchronized (this.f69672b) {
            try {
                boolean z14 = this.f69677g;
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
                this.f69677g = z14 || z12;
                if (z12) {
                    try {
                        InterfaceC4103b1 interfaceC4103b14 = this.f69676f;
                        if (interfaceC4103b14 != null) {
                            interfaceC4103b14.zzi();
                        }
                    } catch (RemoteException e10) {
                        Qc.p.i("#007 Could not call remote method.", e10);
                    }
                }
                if (z13 && (interfaceC4103b13 = this.f69676f) != null) {
                    interfaceC4103b13.zzh();
                }
                if (z16 && (interfaceC4103b12 = this.f69676f) != null) {
                    interfaceC4103b12.zzg();
                }
                if (z17) {
                    InterfaceC4103b1 interfaceC4103b15 = this.f69676f;
                    if (interfaceC4103b15 != null) {
                        interfaceC4103b15.zze();
                    }
                    this.f69671a.zzw();
                }
                if (z10 != z11 && (interfaceC4103b1 = this.f69676f) != null) {
                    interfaceC4103b1.k0(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void E9(Map map) {
        this.f69671a.L("pubVideoCmd", map);
    }

    public final void F9(Mc.R1 r12) {
        Object obj = this.f69672b;
        boolean z10 = r12.f19154a;
        boolean z11 = r12.f19155b;
        boolean z12 = r12.f19156c;
        synchronized (obj) {
            this.f69682l = z11;
            this.f69683m = z12;
        }
        J9("initialState", com.google.android.gms.common.util.g.c("muteStart", true != z10 ? "0" : "1", "customControlsRequested", true != z11 ? "0" : "1", "clickToExpandRequested", true != z12 ? "0" : "1"));
    }

    public final void G9(float f10) {
        synchronized (this.f69672b) {
            this.f69680j = f10;
        }
    }

    public final void H9(C6728Fh c6728Fh) {
        synchronized (this.f69672b) {
            this.f69684n = c6728Fh;
        }
    }

    @Override // Mc.Y0
    public final void I6(InterfaceC4103b1 interfaceC4103b1) {
        synchronized (this.f69672b) {
            this.f69676f = interfaceC4103b1;
        }
    }

    @Override // Mc.Y0
    public final float zze() {
        float f10;
        synchronized (this.f69672b) {
            f10 = this.f69681k;
        }
        return f10;
    }

    @Override // Mc.Y0
    public final float zzf() {
        float f10;
        synchronized (this.f69672b) {
            f10 = this.f69680j;
        }
        return f10;
    }

    @Override // Mc.Y0
    public final float zzg() {
        float f10;
        synchronized (this.f69672b) {
            f10 = this.f69679i;
        }
        return f10;
    }

    @Override // Mc.Y0
    public final int zzh() {
        int i10;
        synchronized (this.f69672b) {
            i10 = this.f69675e;
        }
        return i10;
    }

    @Override // Mc.Y0
    public final InterfaceC4103b1 zzi() throws RemoteException {
        InterfaceC4103b1 interfaceC4103b1;
        synchronized (this.f69672b) {
            interfaceC4103b1 = this.f69676f;
        }
        return interfaceC4103b1;
    }

    @Override // Mc.Y0
    public final void zzk() {
        J9("pause", null);
    }

    @Override // Mc.Y0
    public final void zzl() {
        J9("play", null);
    }

    @Override // Mc.Y0
    public final void zzn() {
        J9("stop", null);
    }

    @Override // Mc.Y0
    public final boolean zzo() {
        boolean z10;
        Object obj = this.f69672b;
        boolean zZzp = zzp();
        synchronized (obj) {
            z10 = false;
            if (!zZzp) {
                try {
                    if (this.f69683m && this.f69674d) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // Mc.Y0
    public final boolean zzp() {
        boolean z10;
        synchronized (this.f69672b) {
            try {
                z10 = false;
                if (this.f69673c && this.f69682l) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // Mc.Y0
    public final boolean zzq() {
        boolean z10;
        synchronized (this.f69672b) {
            z10 = this.f69678h;
        }
        return z10;
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.f69672b) {
            z10 = this.f69678h;
            i10 = this.f69675e;
            this.f69675e = 3;
        }
        I9(i10, 3, z10, z10);
    }

    public BinderC7114Qt(InterfaceC6807Hr interfaceC6807Hr, float f10, boolean z10, boolean z11) {
        this.f69671a = interfaceC6807Hr;
        this.f69679i = f10;
        this.f69673c = z10;
        this.f69674d = z11;
    }
}
