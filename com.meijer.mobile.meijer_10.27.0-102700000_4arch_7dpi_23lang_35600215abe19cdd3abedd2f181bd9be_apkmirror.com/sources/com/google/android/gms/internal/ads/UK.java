package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import android.os.Bundle;

/* loaded from: classes6.dex */
public class UK implements InterfaceC4098a, InterfaceC7918ei, Oc.p, InterfaceC8132gi, Oc.d {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4098a f70588a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC7918ei f70589b;

    /* renamed from: c, reason: collision with root package name */
    private Oc.p f70590c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC8132gi f70591d;

    /* renamed from: e, reason: collision with root package name */
    private Oc.d f70592e;

    @Override // Oc.p
    public final synchronized void A1() {
        Oc.p pVar = this.f70590c;
        if (pVar != null) {
            pVar.A1();
        }
    }

    @Override // Oc.p
    public final synchronized void F2() {
        Oc.p pVar = this.f70590c;
        if (pVar != null) {
            pVar.F2();
        }
    }

    @Override // Oc.p
    public final synchronized void N3(int i10) {
        Oc.p pVar = this.f70590c;
        if (pVar != null) {
            pVar.N3(i10);
        }
    }

    @Override // Oc.p
    public final synchronized void W5() {
        Oc.p pVar = this.f70590c;
        if (pVar != null) {
            pVar.W5();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8132gi
    public final synchronized void a(String str, String str2) {
        InterfaceC8132gi interfaceC8132gi = this.f70591d;
        if (interfaceC8132gi != null) {
            interfaceC8132gi.a(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7918ei
    public final synchronized void b0(String str, Bundle bundle) {
        InterfaceC7918ei interfaceC7918ei = this.f70589b;
        if (interfaceC7918ei != null) {
            interfaceC7918ei.b0(str, bundle);
        }
    }

    @Override // Oc.p
    public final synchronized void b2() {
        Oc.p pVar = this.f70590c;
        if (pVar != null) {
            pVar.b2();
        }
    }

    @Override // Oc.p
    public final synchronized void d7() {
        Oc.p pVar = this.f70590c;
        if (pVar != null) {
            pVar.d7();
        }
    }

    protected final synchronized void i(InterfaceC4098a interfaceC4098a, InterfaceC7918ei interfaceC7918ei, Oc.p pVar, InterfaceC8132gi interfaceC8132gi, Oc.d dVar) {
        this.f70588a = interfaceC4098a;
        this.f70589b = interfaceC7918ei;
        this.f70590c = pVar;
        this.f70591d = interfaceC8132gi;
        this.f70592e = dVar;
    }

    @Override // Mc.InterfaceC4098a
    public final synchronized void v() {
        InterfaceC4098a interfaceC4098a = this.f70588a;
        if (interfaceC4098a != null) {
            interfaceC4098a.v();
        }
    }

    @Override // Oc.d
    public final synchronized void zzg() {
        Oc.d dVar = this.f70592e;
        if (dVar != null) {
            dVar.zzg();
        }
    }
}
