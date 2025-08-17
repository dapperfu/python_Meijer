package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class B50 implements Yc.a, PC, InterfaceC7659cC, ZB, InterfaceC9154qC, InterfaceC8835nD, K40, InterfaceC8201hG {

    /* renamed from: a, reason: collision with root package name */
    private final C7757d70 f65444a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f65445b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f65446c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f65447d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f65448e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f65449f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f65450g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f65451h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    private B50 f65452i = null;

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void zzu() {
    }

    public final void C(InterfaceC8039fp interfaceC8039fp) {
        this.f65447d.set(interfaceC8039fp);
    }

    public final void J(InterfaceC8465jp interfaceC8465jp) {
        this.f65446c.set(interfaceC8465jp);
    }

    @Deprecated
    public final void L(InterfaceC7075Po interfaceC7075Po) {
        this.f65448e.set(interfaceC7075Po);
    }

    @Deprecated
    public final void N(C6872Jo c6872Jo) {
        this.f65450g.set(c6872Jo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void Z() {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.Z();
        } else {
            A40.a(this.f65447d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.q50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC8039fp) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.K40
    public final void a(K40 k40) {
        this.f65452i = (B50) k40;
    }

    public final void b0(C8572kp c8572kp) {
        this.f65449f.set(c8572kp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final void g0(final Mc.W0 w02) {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.g0(w02);
            return;
        }
        final int i10 = w02.f19159a;
        A40.a(this.f65446c, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.u50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8465jp) obj).b(w02);
            }
        });
        A40.a(this.f65446c, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.v50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8465jp) obj).zze(i10);
            }
        });
        A40.a(this.f65448e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.w50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC7075Po) obj).zzg(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8835nD
    public final void i(final Mc.f2 f2Var) {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.i(f2Var);
        } else {
            A40.a(this.f65451h, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.m50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((Mc.N0) obj).p8(f2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9154qC
    public final void j(final Mc.W0 w02) {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.j(w02);
        } else {
            A40.a(this.f65447d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.r50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC8039fp) obj).W0(w02);
                }
            });
            A40.a(this.f65447d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.s50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC8039fp) obj).zzh(w02.f19159a);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(final InterfaceC6838Io interfaceC6838Io, final String str, final String str2) {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.p(interfaceC6838Io, str, str2);
            return;
        }
        A40.a(this.f65447d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.A50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                InterfaceC6838Io interfaceC6838Io2 = interfaceC6838Io;
                ((InterfaceC8039fp) obj).T1(new BinderC9534tp(interfaceC6838Io2.zzc(), interfaceC6838Io2.zzb()));
            }
        });
        A40.a(this.f65449f, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.e50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                InterfaceC6838Io interfaceC6838Io2 = interfaceC6838Io;
                ((C8572kp) obj).N3(new BinderC9534tp(interfaceC6838Io2.zzc(), interfaceC6838Io2.zzb()), str, str2);
            }
        });
        A40.a(this.f65448e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.f50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC7075Po) obj).t6(interfaceC6838Io);
            }
        });
        A40.a(this.f65450g, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.g50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((C6872Jo) obj).N3(interfaceC6838Io, str, str2);
            }
        });
    }

    @Override // Yc.a
    public final void q() {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.q();
        } else {
            A40.a(this.f65445b, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.p50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) {
                    ((Yc.a) obj).q();
                }
            });
        }
    }

    public final void s(Yc.a aVar) {
        this.f65445b.set(aVar);
    }

    public final void v(Mc.N0 n02) {
        this.f65451h.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.zza();
            return;
        }
        this.f65444a.a();
        A40.a(this.f65447d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.x50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8039fp) obj).zzg();
            }
        });
        A40.a(this.f65448e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.y50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC7075Po) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzb() {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.zzb();
        } else {
            A40.a(this.f65448e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.z50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC7075Po) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.zzc();
            return;
        }
        A40.a(this.f65447d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.h50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8039fp) obj).zzj();
            }
        });
        A40.a(this.f65448e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.k50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC7075Po) obj).zzj();
            }
        });
        A40.a(this.f65447d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.l50
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC8039fp) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zze() {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.zze();
        } else {
            A40.a(this.f65448e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.t50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC7075Po) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzf() {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.zzf();
        } else {
            A40.a(this.f65448e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.d50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC7075Po) obj).zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        B50 b50 = this.f65452i;
        if (b50 != null) {
            b50.zzs();
        } else {
            A40.a(this.f65446c, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.n50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC8465jp) obj).zzg();
                }
            });
            A40.a(this.f65448e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.o50
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC7075Po) obj).zzi();
                }
            });
        }
    }

    public B50(C7757d70 c7757d70) {
        this.f65444a = c7757d70;
    }
}
