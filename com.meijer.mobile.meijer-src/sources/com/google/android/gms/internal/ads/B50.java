package com.google.android.gms.internal.ads;

import ad.InterfaceC5681a;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class B50 implements InterfaceC5681a, PC, InterfaceC7784cC, ZB, InterfaceC9279qC, InterfaceC8960nD, K40, InterfaceC8326hG {

    /* renamed from: a, reason: collision with root package name */
    private final C7882d70 f66284a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f66285b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f66286c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f66287d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f66288e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f66289f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f66290g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f66291h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    private B50 f66292i = null;

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final void C(final Oc.W0 w02) {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.C(w02);
            return;
        }
        final int i10 = w02.f23346a;
        A40.a(this.f66286c, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.u50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8590jp) obj).b(w02);
            }
        });
        A40.a(this.f66286c, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.v50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8590jp) obj).zze(i10);
            }
        });
        A40.a(this.f66288e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.w50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC7200Po) obj).zzg(i10);
            }
        });
    }

    public final void J(InterfaceC8164fp interfaceC8164fp) {
        this.f66287d.set(interfaceC8164fp);
    }

    public final void L(InterfaceC8590jp interfaceC8590jp) {
        this.f66286c.set(interfaceC8590jp);
    }

    @Deprecated
    public final void N(InterfaceC7200Po interfaceC7200Po) {
        this.f66288e.set(interfaceC7200Po);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void Z() {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.Z();
        } else {
            A40.a(this.f66287d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.q50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC8164fp) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.K40
    public final void a(K40 k40) {
        this.f66292i = (B50) k40;
    }

    @Deprecated
    public final void d0(C6997Jo c6997Jo) {
        this.f66290g.set(c6997Jo);
    }

    public final void g0(C8697kp c8697kp) {
        this.f66289f.set(c8697kp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8960nD
    public final void i(final Oc.f2 f2Var) {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.i(f2Var);
        } else {
            A40.a(this.f66291h, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.m50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((Oc.N0) obj).m3(f2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9279qC
    public final void j(final Oc.W0 w02) {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.j(w02);
        } else {
            A40.a(this.f66287d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.r50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC8164fp) obj).g9(w02);
                }
            });
            A40.a(this.f66287d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.s50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC8164fp) obj).zzh(w02.f23346a);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(final InterfaceC6963Io interfaceC6963Io, final String str, final String str2) {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.p(interfaceC6963Io, str, str2);
            return;
        }
        A40.a(this.f66287d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.A50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                InterfaceC6963Io interfaceC6963Io2 = interfaceC6963Io;
                ((InterfaceC8164fp) obj).W1(new BinderC9659tp(interfaceC6963Io2.zzc(), interfaceC6963Io2.zzb()));
            }
        });
        A40.a(this.f66289f, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.e50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                InterfaceC6963Io interfaceC6963Io2 = interfaceC6963Io;
                ((C8697kp) obj).Z3(new BinderC9659tp(interfaceC6963Io2.zzc(), interfaceC6963Io2.zzb()), str, str2);
            }
        });
        A40.a(this.f66288e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.f50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC7200Po) obj).I6(interfaceC6963Io);
            }
        });
        A40.a(this.f66290g, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.g50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((C6997Jo) obj).Z3(interfaceC6963Io, str, str2);
            }
        });
    }

    @Override // ad.InterfaceC5681a
    public final void q() {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.q();
        } else {
            A40.a(this.f66285b, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.p50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) {
                    ((InterfaceC5681a) obj).q();
                }
            });
        }
    }

    public final void s(InterfaceC5681a interfaceC5681a) {
        this.f66285b.set(interfaceC5681a);
    }

    public final void v(Oc.N0 n02) {
        this.f66291h.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.zza();
            return;
        }
        this.f66284a.a();
        A40.a(this.f66287d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.x50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8164fp) obj).zzg();
            }
        });
        A40.a(this.f66288e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.y50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC7200Po) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzb() {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.zzb();
        } else {
            A40.a(this.f66288e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.z50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC7200Po) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.zzc();
            return;
        }
        A40.a(this.f66287d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.h50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8164fp) obj).zzj();
            }
        });
        A40.a(this.f66288e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.k50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC7200Po) obj).zzj();
            }
        });
        A40.a(this.f66287d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.l50
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8164fp) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zze() {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.zze();
        } else {
            A40.a(this.f66288e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.t50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC7200Po) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzf() {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.zzf();
        } else {
            A40.a(this.f66288e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.d50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC7200Po) obj).zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        B50 b50 = this.f66292i;
        if (b50 != null) {
            b50.zzs();
        } else {
            A40.a(this.f66286c, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.n50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC8590jp) obj).zzg();
                }
            });
            A40.a(this.f66288e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.o50
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC7200Po) obj).zzi();
                }
            });
        }
    }

    public B50(C7882d70 c7882d70) {
        this.f66284a = c7882d70;
    }
}
