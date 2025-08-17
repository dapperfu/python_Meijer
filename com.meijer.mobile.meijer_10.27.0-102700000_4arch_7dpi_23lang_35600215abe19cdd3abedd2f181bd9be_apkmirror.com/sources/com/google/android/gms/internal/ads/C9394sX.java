package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9394sX {

    /* renamed from: a, reason: collision with root package name */
    private final II f78266a;

    /* renamed from: b, reason: collision with root package name */
    private final C7899eX f78267b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7659cC f78268c;

    public final InterfaceC7659cC a() {
        return this.f78268c;
    }

    public final PC b() {
        return this.f78267b;
    }

    public final C7899eX d() {
        return this.f78267b;
    }

    public final BH c() {
        return new BH(this.f78266a, this.f78267b.a());
    }

    public final void e(Mc.H h10) {
        this.f78267b.C(h10);
    }

    public C9394sX(II ii2, C9812wN c9812wN) {
        this.f78266a = ii2;
        final C7899eX c7899eX = new C7899eX(c9812wN);
        this.f78267b = c7899eX;
        final InterfaceC7922ek interfaceC7922ekG = ii2.g();
        this.f78268c = new InterfaceC7659cC() { // from class: com.google.android.gms.internal.ads.qX
            @Override // com.google.android.gms.internal.ads.InterfaceC7659cC
            public final void g0(Mc.W0 w02) {
                c7899eX.g0(w02);
                InterfaceC7922ek interfaceC7922ek = interfaceC7922ekG;
                if (interfaceC7922ek != null) {
                    try {
                        interfaceC7922ek.b(w02);
                    } catch (RemoteException e10) {
                        Qc.p.i("#007 Could not call remote method.", e10);
                    }
                }
                if (interfaceC7922ek != null) {
                    try {
                        interfaceC7922ek.zze(w02.f19159a);
                    } catch (RemoteException e11) {
                        Qc.p.i("#007 Could not call remote method.", e11);
                    }
                }
            }
        };
    }
}
