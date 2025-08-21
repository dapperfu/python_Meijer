package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9519sX {

    /* renamed from: a, reason: collision with root package name */
    private final II f79106a;

    /* renamed from: b, reason: collision with root package name */
    private final C8024eX f79107b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7784cC f79108c;

    public final InterfaceC7784cC a() {
        return this.f79108c;
    }

    public final PC b() {
        return this.f79107b;
    }

    public final C8024eX d() {
        return this.f79107b;
    }

    public final BH c() {
        return new BH(this.f79106a, this.f79107b.a());
    }

    public final void e(Oc.H h10) {
        this.f79107b.J(h10);
    }

    public C9519sX(II ii2, C9937wN c9937wN) {
        this.f79106a = ii2;
        final C8024eX c8024eX = new C8024eX(c9937wN);
        this.f79107b = c8024eX;
        final InterfaceC8047ek interfaceC8047ekG = ii2.g();
        this.f79108c = new InterfaceC7784cC() { // from class: com.google.android.gms.internal.ads.qX
            @Override // com.google.android.gms.internal.ads.InterfaceC7784cC
            public final void C(Oc.W0 w02) {
                c8024eX.C(w02);
                InterfaceC8047ek interfaceC8047ek = interfaceC8047ekG;
                if (interfaceC8047ek != null) {
                    try {
                        interfaceC8047ek.b(w02);
                    } catch (RemoteException e10) {
                        Sc.p.i("#007 Could not call remote method.", e10);
                    }
                }
                if (interfaceC8047ek != null) {
                    try {
                        interfaceC8047ek.zze(w02.f23346a);
                    } catch (RemoteException e11) {
                        Sc.p.i("#007 Could not call remote method.", e11);
                    }
                }
            }
        };
    }
}
