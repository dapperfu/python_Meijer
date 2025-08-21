package com.google.android.gms.internal.ads;

import Gc.r;
import Oc.InterfaceC4381b1;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9507sL extends r.a {

    /* renamed from: a, reason: collision with root package name */
    private final C10039xI f79063a;

    public C9507sL(C10039xI c10039xI) {
        this.f79063a = c10039xI;
    }

    @Override // Gc.r.a
    public final void a() {
        InterfaceC4381b1 interfaceC4381b1F = f(this.f79063a);
        if (interfaceC4381b1F == null) {
            return;
        }
        try {
            interfaceC4381b1F.zze();
        } catch (RemoteException e10) {
            Sc.p.h("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // Gc.r.a
    public final void c() {
        InterfaceC4381b1 interfaceC4381b1F = f(this.f79063a);
        if (interfaceC4381b1F == null) {
            return;
        }
        try {
            interfaceC4381b1F.zzg();
        } catch (RemoteException e10) {
            Sc.p.h("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // Gc.r.a
    public final void e() {
        InterfaceC4381b1 interfaceC4381b1F = f(this.f79063a);
        if (interfaceC4381b1F == null) {
            return;
        }
        try {
            interfaceC4381b1F.zzi();
        } catch (RemoteException e10) {
            Sc.p.h("Unable to call onVideoEnd()", e10);
        }
    }

    private static InterfaceC4381b1 f(C10039xI c10039xI) {
        Oc.Y0 y0W = c10039xI.W();
        if (y0W == null) {
            return null;
        }
        try {
            return y0W.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
