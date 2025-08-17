package com.google.android.gms.internal.ads;

import Z.C5503a;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class AJ implements InterfaceC9581uC {

    /* renamed from: a, reason: collision with root package name */
    private final C9914xI f65115a;

    /* renamed from: b, reason: collision with root package name */
    private final CI f65116b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f65117c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f65118d;

    public AJ(C9914xI c9914xI, CI ci2, Executor executor, Executor executor2) {
        this.f65115a = c9914xI;
        this.f65116b = ci2;
        this.f65117c = executor;
        this.f65118d = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final InterfaceC9008ot interfaceC9008ot) {
        this.f65117c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yJ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9008ot.L("onSdkImpression", new C5503a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final void zzr() {
        if (this.f65116b.d()) {
            C9914xI c9914xI = this.f65115a;
            C7789dT c7789dTH0 = c9914xI.h0();
            if (c7789dTH0 == null && c9914xI.j0() != null && ((Boolean) Mc.A.c().a(C8659lf.f76409l5)).booleanValue()) {
                C9914xI c9914xI2 = this.f65115a;
                com.google.common.util.concurrent.q qVarJ0 = c9914xI2.j0();
                C7145Rq c7145RqC0 = c9914xI2.c0();
                if (qVarJ0 == null || c7145RqC0 == null) {
                    return;
                }
                Mj0.r(Mj0.l(qVarJ0, c7145RqC0), new C10129zJ(this), this.f65118d);
                return;
            }
            if (c7789dTH0 != null) {
                C9914xI c9914xI3 = this.f65115a;
                InterfaceC9008ot interfaceC9008otE0 = c9914xI3.e0();
                InterfaceC9008ot interfaceC9008otF0 = c9914xI3.f0();
                if (interfaceC9008otE0 == null) {
                    interfaceC9008otE0 = interfaceC9008otF0 != null ? interfaceC9008otF0 : null;
                }
                if (interfaceC9008otE0 != null) {
                    b(interfaceC9008otE0);
                }
            }
        }
    }
}
