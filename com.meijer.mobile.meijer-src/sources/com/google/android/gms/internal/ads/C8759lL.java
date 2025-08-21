package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;

/* renamed from: com.google.android.gms.internal.ads.lL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8759lL extends UK implements InterfaceC8326hG {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC8326hG f76642f;

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final synchronized void Z() {
        InterfaceC8326hG interfaceC8326hG = this.f76642f;
        if (interfaceC8326hG != null) {
            interfaceC8326hG.Z();
        }
    }

    protected final synchronized void j(InterfaceC4376a interfaceC4376a, InterfaceC8043ei interfaceC8043ei, Qc.p pVar, InterfaceC8257gi interfaceC8257gi, Qc.d dVar, InterfaceC8326hG interfaceC8326hG) throws Throwable {
        try {
            try {
                super.i(interfaceC4376a, interfaceC8043ei, pVar, interfaceC8257gi, dVar);
                this.f76642f = interfaceC8326hG;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final synchronized void zzu() {
        InterfaceC8326hG interfaceC8326hG = this.f76642f;
        if (interfaceC8326hG != null) {
            interfaceC8326hG.zzu();
        }
    }
}
