package com.google.android.gms.internal.ads;

import Z.C5603a;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class AJ implements InterfaceC9706uC {

    /* renamed from: a, reason: collision with root package name */
    private final C10039xI f65955a;

    /* renamed from: b, reason: collision with root package name */
    private final CI f65956b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f65957c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f65958d;

    public AJ(C10039xI c10039xI, CI ci2, Executor executor, Executor executor2) {
        this.f65955a = c10039xI;
        this.f65956b = ci2;
        this.f65957c = executor;
        this.f65958d = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final InterfaceC9133ot interfaceC9133ot) {
        this.f65957c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yJ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9133ot.L("onSdkImpression", new C5603a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final void zzr() {
        if (this.f65956b.d()) {
            C10039xI c10039xI = this.f65955a;
            C7914dT c7914dTH0 = c10039xI.h0();
            if (c7914dTH0 == null && c10039xI.j0() != null && ((Boolean) Oc.A.c().a(C8784lf.f77249l5)).booleanValue()) {
                C10039xI c10039xI2 = this.f65955a;
                com.google.common.util.concurrent.q qVarJ0 = c10039xI2.j0();
                C7270Rq c7270RqC0 = c10039xI2.c0();
                if (qVarJ0 == null || c7270RqC0 == null) {
                    return;
                }
                Mj0.r(Mj0.l(qVarJ0, c7270RqC0), new C10254zJ(this), this.f65958d);
                return;
            }
            if (c7914dTH0 != null) {
                C10039xI c10039xI3 = this.f65955a;
                InterfaceC9133ot interfaceC9133otE0 = c10039xI3.e0();
                InterfaceC9133ot interfaceC9133otF0 = c10039xI3.f0();
                if (interfaceC9133otE0 == null) {
                    interfaceC9133otE0 = interfaceC9133otF0 != null ? interfaceC9133otF0 : null;
                }
                if (interfaceC9133otE0 != null) {
                    b(interfaceC9133otE0);
                }
            }
        }
    }
}
