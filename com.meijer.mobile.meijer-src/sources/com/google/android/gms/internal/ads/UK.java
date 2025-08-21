package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import android.os.Bundle;

/* loaded from: classes6.dex */
public class UK implements InterfaceC4376a, InterfaceC8043ei, Qc.p, InterfaceC8257gi, Qc.d {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4376a f71428a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC8043ei f71429b;

    /* renamed from: c, reason: collision with root package name */
    private Qc.p f71430c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC8257gi f71431d;

    /* renamed from: e, reason: collision with root package name */
    private Qc.d f71432e;

    @Override // Qc.p
    public final synchronized void I2() {
        Qc.p pVar = this.f71430c;
        if (pVar != null) {
            pVar.I2();
        }
    }

    @Override // Qc.p
    public final synchronized void K1() {
        Qc.p pVar = this.f71430c;
        if (pVar != null) {
            pVar.K1();
        }
    }

    @Override // Qc.p
    public final synchronized void Z3(int i10) {
        Qc.p pVar = this.f71430c;
        if (pVar != null) {
            pVar.Z3(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8257gi
    public final synchronized void a(String str, String str2) {
        InterfaceC8257gi interfaceC8257gi = this.f71431d;
        if (interfaceC8257gi != null) {
            interfaceC8257gi.a(str, str2);
        }
    }

    @Override // Qc.p
    public final synchronized void c2() {
        Qc.p pVar = this.f71430c;
        if (pVar != null) {
            pVar.c2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8043ei
    public final synchronized void g0(String str, Bundle bundle) {
        InterfaceC8043ei interfaceC8043ei = this.f71429b;
        if (interfaceC8043ei != null) {
            interfaceC8043ei.g0(str, bundle);
        }
    }

    protected final synchronized void i(InterfaceC4376a interfaceC4376a, InterfaceC8043ei interfaceC8043ei, Qc.p pVar, InterfaceC8257gi interfaceC8257gi, Qc.d dVar) {
        this.f71428a = interfaceC4376a;
        this.f71429b = interfaceC8043ei;
        this.f71430c = pVar;
        this.f71431d = interfaceC8257gi;
        this.f71432e = dVar;
    }

    @Override // Qc.p
    public final synchronized void m6() {
        Qc.p pVar = this.f71430c;
        if (pVar != null) {
            pVar.m6();
        }
    }

    @Override // Qc.p
    public final synchronized void o7() {
        Qc.p pVar = this.f71430c;
        if (pVar != null) {
            pVar.o7();
        }
    }

    @Override // Oc.InterfaceC4376a
    public final synchronized void v() {
        InterfaceC4376a interfaceC4376a = this.f71428a;
        if (interfaceC4376a != null) {
            interfaceC4376a.v();
        }
    }

    @Override // Qc.d
    public final synchronized void zzg() {
        Qc.d dVar = this.f71432e;
        if (dVar != null) {
            dVar.zzg();
        }
    }
}
