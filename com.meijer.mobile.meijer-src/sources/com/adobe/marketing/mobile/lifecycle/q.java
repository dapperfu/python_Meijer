package com.adobe.marketing.mobile.lifecycle;

import com.adobe.marketing.mobile.InterfaceC6543a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes4.dex */
class q {

    /* renamed from: c, reason: collision with root package name */
    private a f63447c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6543a<Boolean> f63448d;

    /* renamed from: b, reason: collision with root package name */
    private final Object f63446b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final g f63445a = new g("ADBLifecycleStateManager");

    enum a {
        START("start"),
        PAUSE("pause");


        /* renamed from: a, reason: collision with root package name */
        private final String f63452a;

        a(String str) {
            this.f63452a = str;
        }
    }

    public static /* synthetic */ void a(q qVar, a aVar, InterfaceC6543a interfaceC6543a, Boolean bool) {
        synchronized (qVar.f63446b) {
            qVar.f63447c = aVar;
            qVar.f63445a.c();
            interfaceC6543a.a(Boolean.TRUE);
            qVar.f63448d = null;
        }
    }

    private void b() {
        InterfaceC6543a<Boolean> interfaceC6543a = this.f63448d;
        if (interfaceC6543a != null) {
            interfaceC6543a.a(Boolean.FALSE);
            this.f63448d = null;
        }
        this.f63445a.c();
    }

    private void d(final a aVar, final InterfaceC6543a<Boolean> interfaceC6543a) {
        this.f63448d = interfaceC6543a;
        this.f63445a.e(500L, new InterfaceC6543a() { // from class: com.adobe.marketing.mobile.lifecycle.p
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                q.a(this.f63442a, aVar, interfaceC6543a, (Boolean) obj);
            }
        });
    }

    void e(a aVar, InterfaceC6543a<Boolean> interfaceC6543a) {
        if (interfaceC6543a == null || aVar == null) {
            return;
        }
        synchronized (this.f63446b) {
            try {
                if (this.f63445a.d()) {
                    if (a.START.equals(aVar)) {
                        R5.t.e("Lifecycle", "LifecycleV2StateManager", "Consecutive pause-start state update detected, ignoring.", new Object[0]);
                        b();
                        interfaceC6543a.a(Boolean.FALSE);
                    } else if (a.PAUSE.equals(aVar)) {
                        R5.t.e("Lifecycle", "LifecycleV2StateManager", "New pause state update received while waiting, restarting the count.", new Object[0]);
                        c(aVar, interfaceC6543a);
                    }
                    return;
                }
                a aVar2 = this.f63447c;
                if (aVar2 == aVar) {
                    R5.t.e("Lifecycle", "LifecycleV2StateManager", "Consecutive %s state update received, ignoring.", aVar2);
                    interfaceC6543a.a(Boolean.FALSE);
                    return;
                }
                if (a.PAUSE.equals(aVar)) {
                    R5.t.e("Lifecycle", "LifecycleV2StateManager", "New pause state update received, waiting for %s (ms) before updating.", Integer.valueOf(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR));
                    d(aVar, interfaceC6543a);
                } else {
                    R5.t.e("Lifecycle", "LifecycleV2StateManager", "New start state update received.", new Object[0]);
                    this.f63447c = aVar;
                    interfaceC6543a.a(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    q() {
    }

    private void c(a aVar, InterfaceC6543a<Boolean> interfaceC6543a) {
        b();
        d(aVar, interfaceC6543a);
    }
}
