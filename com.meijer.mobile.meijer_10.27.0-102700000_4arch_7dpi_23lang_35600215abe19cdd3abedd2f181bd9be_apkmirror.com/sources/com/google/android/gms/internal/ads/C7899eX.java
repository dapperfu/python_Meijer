package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import Mc.InterfaceC4123i0;
import Mc.InterfaceC4144p0;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.eX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7899eX implements Fc.c, InterfaceC10118zD, PC, InterfaceC7659cC, InterfaceC9581uC, InterfaceC4098a, ZB, InterfaceC8835nD, InterfaceC9154qC, InterfaceC8201hG {

    /* renamed from: i, reason: collision with root package name */
    final C9812wN f73898i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f73890a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f73891b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f73892c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f73893d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f73894e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f73895f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f73896g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f73897h = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final BlockingQueue f73899j = new ArrayBlockingQueue(((Integer) Mc.A.c().a(C8659lf.f76049L8)).intValue());

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) {
    }

    public final synchronized Mc.H a() {
        return (Mc.H) this.f73890a.get();
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6838Io interfaceC6838Io, String str, String str2) {
    }

    public final synchronized InterfaceC4123i0 q() {
        return (InterfaceC4123i0) this.f73891b.get();
    }

    @Override // Fc.c
    public final synchronized void s(final String str, final String str2) {
        if (!this.f73895f.get()) {
            A40.a(this.f73891b, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.WW
                @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC4123i0) obj).K0(str, str2);
                }
            });
            return;
        }
        if (!this.f73899j.offer(new Pair(str, str2))) {
            Qc.p.b("The queue for app events is full, dropping the new event.");
            C9812wN c9812wN = this.f73898i;
            if (c9812wN != null) {
                C9705vN c9705vNA = c9812wN.a();
                c9705vNA.b("action", "dae_action");
                c9705vNA.b("dae_name", str);
                c9705vNA.b("dae_data", str2);
                c9705vNA.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final synchronized void zzs() {
        A40.a(this.f73890a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.TW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.H) obj).zzi();
            }
        });
        A40.a(this.f73893d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.UW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.K) obj).zzc();
            }
        });
        this.f73897h.set(true);
        p0();
    }

    private final void p0() {
        if (this.f73896g.get() && this.f73897h.get()) {
            for (final Pair pair : this.f73899j) {
                A40.a(this.f73891b, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.OW
                    @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
                    public final void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((InterfaceC4123i0) obj).K0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f73899j.clear();
            this.f73895f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(C8608l60 c8608l60) {
        this.f73895f.set(true);
        this.f73897h.set(false);
    }

    public final void C(Mc.H h10) {
        this.f73890a.set(h10);
    }

    public final void J(Mc.K k10) {
        this.f73893d.set(k10);
    }

    public final void L(Mc.N0 n02) {
        this.f73892c.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void Z() {
        if (((Boolean) Mc.A.c().a(C8659lf.f75967Fa)).booleanValue()) {
            A40.a(this.f73890a, new C7686cX());
        }
        A40.a(this.f73894e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.NW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4144p0) obj).zzb();
            }
        });
    }

    public final void b0(InterfaceC4123i0 interfaceC4123i0) {
        this.f73891b.set(interfaceC4123i0);
        this.f73896g.set(true);
        p0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
    public final void g0(final Mc.W0 w02) {
        A40.a(this.f73890a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.PW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.H) obj).b(w02);
            }
        });
        A40.a(this.f73890a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.RW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.H) obj).zze(w02.f19159a);
            }
        });
        A40.a(this.f73893d, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.SW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.K) obj).M0(w02);
            }
        });
        this.f73895f.set(false);
        this.f73899j.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8835nD
    public final void i(final Mc.f2 f2Var) {
        A40.a(this.f73892c, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.dX
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.N0) obj).p8(f2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9154qC
    public final void j(final Mc.W0 w02) {
        A40.a(this.f73894e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.VW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4144p0) obj).H0(w02);
            }
        });
    }

    public final void k0(InterfaceC4144p0 interfaceC4144p0) {
        this.f73894e.set(interfaceC4144p0);
    }

    @Override // Mc.InterfaceC4098a
    public final void v() {
        if (((Boolean) Mc.A.c().a(C8659lf.f75967Fa)).booleanValue()) {
            return;
        }
        A40.a(this.f73890a, new C7686cX());
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() {
        A40.a(this.f73890a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.LW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.H) obj).zzd();
            }
        });
        A40.a(this.f73894e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.MW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4144p0) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzb() {
        A40.a(this.f73890a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.XW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.H) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() {
        A40.a(this.f73890a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.ZW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.H) obj).zzj();
            }
        });
        A40.a(this.f73894e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.aX
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4144p0) obj).zzf();
            }
        });
        A40.a(this.f73894e, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.bX
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4144p0) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final void zzr() {
        A40.a(this.f73890a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.KW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.H) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void zzu() {
        A40.a(this.f73890a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.YW
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.H) obj).zzk();
            }
        });
    }

    public C7899eX(C9812wN c9812wN) {
        this.f73898i = c9812wN;
    }
}
