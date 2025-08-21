package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class S30 implements InterfaceC7784cC, InterfaceC7573aD, K40, Qc.p, InterfaceC8960nD, InterfaceC9279qC, InterfaceC8326hG {

    /* renamed from: a, reason: collision with root package name */
    private final C7882d70 f70843a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f70844b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f70845c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f70846d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f70847e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f70848f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f70849g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    private S30 f70850h = null;

    @Override // Qc.p
    public final void m6() {
    }

    @Override // Qc.p
    public final void o7() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void zzu() {
    }

    public static S30 p(S30 s30) {
        S30 s302 = new S30(s30.f70843a);
        s302.f70850h = s30;
        return s302;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final void C(final Oc.W0 w02) {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.C(w02);
        } else {
            A40.a(this.f70844b, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.N30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC9847vc) obj).z2(w02);
                }
            });
            A40.a(this.f70844b, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.O30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC9847vc) obj).zzb(w02.f23346a);
                }
            });
        }
    }

    @Override // Qc.p
    public final void I2() {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.I2();
            return;
        }
        A40.a(this.f70848f, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.R30
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) {
                ((Qc.p) obj).I2();
            }
        });
        A40.a(this.f70846d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.D30
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC10275zc) obj).zzf();
            }
        });
        A40.a(this.f70846d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.E30
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC10275zc) obj).zze();
            }
        });
    }

    public final void J(Oc.N0 n02) {
        this.f70849g.set(n02);
    }

    @Override // Qc.p
    public final void K1() {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.K1();
        } else {
            A40.a(this.f70848f, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.Q30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) {
                    ((Qc.p) obj).K1();
                }
            });
        }
    }

    public final void L(InterfaceC9847vc interfaceC9847vc) {
        this.f70844b.set(interfaceC9847vc);
    }

    public final void N(InterfaceC10275zc interfaceC10275zc) {
        this.f70846d.set(interfaceC10275zc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void Z() {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.Z();
        } else {
            A40.a(this.f70846d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.J30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC10275zc) obj).zzb();
                }
            });
        }
    }

    @Override // Qc.p
    public final void Z3(final int i10) {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.Z3(i10);
        } else {
            A40.a(this.f70848f, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.M30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) {
                    ((Qc.p) obj).Z3(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.K40
    public final void a(K40 k40) {
        this.f70850h = (S30) k40;
    }

    @Override // Qc.p
    public final void c2() {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.c2();
        } else {
            A40.a(this.f70848f, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.G30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) {
                    ((Qc.p) obj).c2();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8960nD
    public final void i(final Oc.f2 f2Var) {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.i(f2Var);
        } else {
            A40.a(this.f70849g, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.C30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((Oc.N0) obj).m3(f2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9279qC
    public final void j(final Oc.W0 w02) {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.j(w02);
        } else {
            A40.a(this.f70846d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.H30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC10275zc) obj).a0(w02);
                }
            });
        }
    }

    public final void q() {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.q();
            return;
        }
        this.f70843a.a();
        A40.a(this.f70845c, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.K30
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC9954wc) obj).zza();
            }
        });
        A40.a(this.f70846d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.L30
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC10275zc) obj).zzc();
            }
        });
    }

    public final void s(final InterfaceC9526sc interfaceC9526sc) {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.s(interfaceC9526sc);
        } else {
            A40.a(this.f70844b, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.I30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC9847vc) obj).U0(interfaceC9526sc);
                }
            });
        }
    }

    public final void v(Qc.p pVar) {
        this.f70848f.set(pVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7573aD
    public final void zzg() {
        S30 s30 = this.f70850h;
        if (s30 != null) {
            s30.zzg();
        } else {
            A40.a(this.f70847e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.P30
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) {
                    ((InterfaceC7573aD) obj).zzg();
                }
            });
        }
    }

    public S30(C7882d70 c7882d70) {
        this.f70843a = c7882d70;
    }
}
