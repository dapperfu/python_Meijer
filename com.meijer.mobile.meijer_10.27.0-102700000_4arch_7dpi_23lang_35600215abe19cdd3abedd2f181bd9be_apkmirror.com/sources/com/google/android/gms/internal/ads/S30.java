package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class S30 implements InterfaceC7659cC, InterfaceC7448aD, K40, Oc.p, InterfaceC8835nD, InterfaceC9154qC, InterfaceC8201hG {

    /* renamed from: a, reason: collision with root package name */
    private final C7757d70 f70003a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f70004b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f70005c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f70006d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f70007e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f70008f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f70009g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    private S30 f70010h = null;

    @Override // Oc.p
    public final void W5() {
    }

    @Override // Oc.p
    public final void d7() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void zzu() {
    }

    public static S30 p(S30 s30) {
        S30 s302 = new S30(s30.f70003a);
        s302.f70010h = s30;
        return s302;
    }

    @Override // Oc.p
    public final void A1() {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.A1();
        } else {
            A40.a(this.f70008f, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.Q30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) {
                    ((Oc.p) obj).A1();
                }
            });
        }
    }

    public final void C(Mc.N0 n02) {
        this.f70009g.set(n02);
    }

    @Override // Oc.p
    public final void F2() {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.F2();
            return;
        }
        A40.a(this.f70008f, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.R30
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) {
                ((Oc.p) obj).F2();
            }
        });
        A40.a(this.f70006d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.D30
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC10150zc) obj).zzf();
            }
        });
        A40.a(this.f70006d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.E30
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC10150zc) obj).zze();
            }
        });
    }

    public final void J(InterfaceC9722vc interfaceC9722vc) {
        this.f70004b.set(interfaceC9722vc);
    }

    public final void L(InterfaceC10150zc interfaceC10150zc) {
        this.f70006d.set(interfaceC10150zc);
    }

    @Override // Oc.p
    public final void N3(final int i10) {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.N3(i10);
        } else {
            A40.a(this.f70008f, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.M30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) {
                    ((Oc.p) obj).N3(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void Z() {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.Z();
        } else {
            A40.a(this.f70006d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.J30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC10150zc) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.K40
    public final void a(K40 k40) {
        this.f70010h = (S30) k40;
    }

    @Override // Oc.p
    public final void b2() {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.b2();
        } else {
            A40.a(this.f70008f, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.G30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) {
                    ((Oc.p) obj).b2();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final void g0(final Mc.W0 w02) {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.g0(w02);
        } else {
            A40.a(this.f70004b, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.N30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC9722vc) obj).P8(w02);
                }
            });
            A40.a(this.f70004b, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.O30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC9722vc) obj).zzb(w02.f19159a);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8835nD
    public final void i(final Mc.f2 f2Var) {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.i(f2Var);
        } else {
            A40.a(this.f70009g, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.C30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((Mc.N0) obj).p8(f2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9154qC
    public final void j(final Mc.W0 w02) {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.j(w02);
        } else {
            A40.a(this.f70006d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.H30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC10150zc) obj).H0(w02);
                }
            });
        }
    }

    public final void q() {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.q();
            return;
        }
        this.f70003a.a();
        A40.a(this.f70005c, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.K30
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC9829wc) obj).zza();
            }
        });
        A40.a(this.f70006d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.L30
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC10150zc) obj).zzc();
            }
        });
    }

    public final void s(final InterfaceC9401sc interfaceC9401sc) {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.s(interfaceC9401sc);
        } else {
            A40.a(this.f70004b, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.I30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC9722vc) obj).T0(interfaceC9401sc);
                }
            });
        }
    }

    public final void v(Oc.p pVar) {
        this.f70008f.set(pVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7448aD
    public final void zzg() {
        S30 s30 = this.f70010h;
        if (s30 != null) {
            s30.zzg();
        } else {
            A40.a(this.f70007e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.P30
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) {
                    ((InterfaceC7448aD) obj).zzg();
                }
            });
        }
    }

    public S30(C7757d70 c7757d70) {
        this.f70003a = c7757d70;
    }
}
