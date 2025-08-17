package com.adobe.marketing.mobile.lifecycle;

import com.adobe.marketing.mobile.InterfaceC6418a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes4.dex */
class q {

    /* renamed from: c, reason: collision with root package name */
    private a f62608c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6418a<Boolean> f62609d;

    /* renamed from: b, reason: collision with root package name */
    private final Object f62607b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final g f62606a = new g("ADBLifecycleStateManager");

    enum a {
        START("start"),
        PAUSE("pause");


        /* renamed from: a, reason: collision with root package name */
        private final String f62613a;

        a(String str) {
            this.f62613a = str;
        }
    }

    public static /* synthetic */ void a(q qVar, a aVar, InterfaceC6418a interfaceC6418a, Boolean bool) {
        synchronized (qVar.f62607b) {
            qVar.f62608c = aVar;
            qVar.f62606a.c();
            interfaceC6418a.a(Boolean.TRUE);
            qVar.f62609d = null;
        }
    }

    private void b() {
        InterfaceC6418a<Boolean> interfaceC6418a = this.f62609d;
        if (interfaceC6418a != null) {
            interfaceC6418a.a(Boolean.FALSE);
            this.f62609d = null;
        }
        this.f62606a.c();
    }

    private void d(final a aVar, final InterfaceC6418a<Boolean> interfaceC6418a) {
        this.f62609d = interfaceC6418a;
        this.f62606a.e(500L, new InterfaceC6418a() { // from class: com.adobe.marketing.mobile.lifecycle.p
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                q.a(this.f62603a, aVar, interfaceC6418a, (Boolean) obj);
            }
        });
    }

    void e(a aVar, InterfaceC6418a<Boolean> interfaceC6418a) {
        if (interfaceC6418a == null || aVar == null) {
            return;
        }
        synchronized (this.f62607b) {
            try {
                if (this.f62606a.d()) {
                    if (a.START.equals(aVar)) {
                        Q5.t.e("Lifecycle", "LifecycleV2StateManager", "Consecutive pause-start state update detected, ignoring.", new Object[0]);
                        b();
                        interfaceC6418a.a(Boolean.FALSE);
                    } else if (a.PAUSE.equals(aVar)) {
                        Q5.t.e("Lifecycle", "LifecycleV2StateManager", "New pause state update received while waiting, restarting the count.", new Object[0]);
                        c(aVar, interfaceC6418a);
                    }
                    return;
                }
                a aVar2 = this.f62608c;
                if (aVar2 == aVar) {
                    Q5.t.e("Lifecycle", "LifecycleV2StateManager", "Consecutive %s state update received, ignoring.", aVar2);
                    interfaceC6418a.a(Boolean.FALSE);
                    return;
                }
                if (a.PAUSE.equals(aVar)) {
                    Q5.t.e("Lifecycle", "LifecycleV2StateManager", "New pause state update received, waiting for %s (ms) before updating.", Integer.valueOf(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR));
                    d(aVar, interfaceC6418a);
                } else {
                    Q5.t.e("Lifecycle", "LifecycleV2StateManager", "New start state update received.", new Object[0]);
                    this.f62608c = aVar;
                    interfaceC6418a.a(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    q() {
    }

    private void c(a aVar, InterfaceC6418a<Boolean> interfaceC6418a) {
        b();
        d(aVar, interfaceC6418a);
    }
}
