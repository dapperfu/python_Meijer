package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;

/* renamed from: com.google.android.gms.internal.ads.lL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8634lL extends UK implements InterfaceC8201hG {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC8201hG f75802f;

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final synchronized void Z() {
        InterfaceC8201hG interfaceC8201hG = this.f75802f;
        if (interfaceC8201hG != null) {
            interfaceC8201hG.Z();
        }
    }

    protected final synchronized void j(InterfaceC4098a interfaceC4098a, InterfaceC7918ei interfaceC7918ei, Oc.p pVar, InterfaceC8132gi interfaceC8132gi, Oc.d dVar, InterfaceC8201hG interfaceC8201hG) throws Throwable {
        try {
            try {
                super.i(interfaceC4098a, interfaceC7918ei, pVar, interfaceC8132gi, dVar);
                this.f75802f = interfaceC8201hG;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final synchronized void zzu() {
        InterfaceC8201hG interfaceC8201hG = this.f75802f;
        if (interfaceC8201hG != null) {
            interfaceC8201hG.zzu();
        }
    }
}
