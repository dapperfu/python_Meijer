package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import Oc.InterfaceC4401i0;
import Oc.InterfaceC4422p0;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.eX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8024eX implements Hc.c, InterfaceC10243zD, PC, InterfaceC7784cC, InterfaceC9706uC, InterfaceC4376a, ZB, InterfaceC8960nD, InterfaceC9279qC, InterfaceC8326hG {

    /* renamed from: i, reason: collision with root package name */
    final C9937wN f74738i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f74730a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f74731b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f74732c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f74733d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f74734e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f74735f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f74736g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f74737h = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final BlockingQueue f74739j = new ArrayBlockingQueue(((Integer) Oc.A.c().a(C8784lf.f76889L8)).intValue());

    public final synchronized Oc.H a() {
        return (Oc.H) this.f74730a.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6963Io interfaceC6963Io, String str, String str2) {
    }

    public final synchronized InterfaceC4401i0 q() {
        return (InterfaceC4401i0) this.f74731b.get();
    }

    @Override // Hc.c
    public final synchronized void s(final String str, final String str2) {
        if (!this.f74735f.get()) {
            A40.a(this.f74731b, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.WW
                @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                public final void zza(Object obj) throws RemoteException {
                    ((InterfaceC4401i0) obj).M0(str, str2);
                }
            });
            return;
        }
        if (!this.f74739j.offer(new Pair(str, str2))) {
            Sc.p.b("The queue for app events is full, dropping the new event.");
            C9937wN c9937wN = this.f74738i;
            if (c9937wN != null) {
                C9830vN c9830vNA = c9937wN.a();
                c9830vNA.b("action", "dae_action");
                c9830vNA.b("dae_name", str);
                c9830vNA.b("dae_data", str2);
                c9830vNA.g();
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
        A40.a(this.f74730a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.TW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.H) obj).zzi();
            }
        });
        A40.a(this.f74733d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.UW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.K) obj).zzc();
            }
        });
        this.f74737h.set(true);
        p0();
    }

    private final void p0() {
        if (this.f74736g.get() && this.f74737h.get()) {
            for (final Pair pair : this.f74739j) {
                A40.a(this.f74731b, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.OW
                    @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
                    public final void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((InterfaceC4401i0) obj).M0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f74739j.clear();
            this.f74735f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
    public final void C(final Oc.W0 w02) {
        A40.a(this.f74730a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.PW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.H) obj).b(w02);
            }
        });
        A40.a(this.f74730a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.RW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.H) obj).zze(w02.f23346a);
            }
        });
        A40.a(this.f74733d, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.SW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.K) obj).k0(w02);
            }
        });
        this.f74735f.set(false);
        this.f74739j.clear();
    }

    public final void J(Oc.H h10) {
        this.f74730a.set(h10);
    }

    public final void L(Oc.K k10) {
        this.f74733d.set(k10);
    }

    public final void N(Oc.N0 n02) {
        this.f74732c.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void Z() {
        if (((Boolean) Oc.A.c().a(C8784lf.f76807Fa)).booleanValue()) {
            A40.a(this.f74730a, new C7811cX());
        }
        A40.a(this.f74734e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.NW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4422p0) obj).zzb();
            }
        });
    }

    public final void g0(InterfaceC4401i0 interfaceC4401i0) {
        this.f74731b.set(interfaceC4401i0);
        this.f74736g.set(true);
        p0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8960nD
    public final void i(final Oc.f2 f2Var) {
        A40.a(this.f74732c, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.dX
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.N0) obj).m3(f2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9279qC
    public final void j(final Oc.W0 w02) {
        A40.a(this.f74734e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.VW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4422p0) obj).a0(w02);
            }
        });
    }

    public final void k0(InterfaceC4422p0 interfaceC4422p0) {
        this.f74734e.set(interfaceC4422p0);
    }

    @Override // Oc.InterfaceC4376a
    public final void v() {
        if (((Boolean) Oc.A.c().a(C8784lf.f76807Fa)).booleanValue()) {
            return;
        }
        A40.a(this.f74730a, new C7811cX());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void z0(C8733l60 c8733l60) {
        this.f74735f.set(true);
        this.f74737h.set(false);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() {
        A40.a(this.f74730a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.LW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.H) obj).zzd();
            }
        });
        A40.a(this.f74734e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.MW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4422p0) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzb() {
        A40.a(this.f74730a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.XW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.H) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() {
        A40.a(this.f74730a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.ZW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.H) obj).zzj();
            }
        });
        A40.a(this.f74734e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.aX
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4422p0) obj).zzf();
            }
        });
        A40.a(this.f74734e, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.bX
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((InterfaceC4422p0) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final void zzr() {
        A40.a(this.f74730a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.KW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.H) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void zzu() {
        A40.a(this.f74730a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.YW
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.H) obj).zzk();
            }
        });
    }

    public C8024eX(C9937wN c9937wN) {
        this.f74738i = c9937wN;
    }
}
