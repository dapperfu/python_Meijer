package com.adobe.marketing.mobile.lifecycle;

import R5.InterfaceC5123j;
import R5.K;
import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.F;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6581o;
import g6.C14328a;
import java.util.Map;

/* loaded from: classes4.dex */
public class LifecycleExtension extends AbstractC6578l {

    /* renamed from: b, reason: collision with root package name */
    private final R5.v f63391b;

    /* renamed from: c, reason: collision with root package name */
    private final i f63392c;

    /* renamed from: d, reason: collision with root package name */
    private final n f63393d;

    protected LifecycleExtension(AbstractC6579m abstractC6579m) {
        this(abstractC6579m, K.f().d().a("AdobeMobile_Lifecycle"), K.f().e());
    }

    private boolean k() {
        R5.v vVar = this.f63391b;
        return (vVar == null || vVar.contains("InstallDate")) ? false : true;
    }

    private void l(C6574h c6574h) {
        this.f63392c.e(c6574h);
        this.f63393d.g(c6574h);
    }

    private void m(C6574h c6574h) {
        if (this.f63391b == null) {
            return;
        }
        this.f63391b.b("InstallDate", c6574h.v());
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String b() {
        return "Lifecycle";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String e() {
        return "com.adobe.module.lifecycle";
    }

    void o(C6574h c6574h) {
        this.f63393d.j(c6574h);
    }

    private void n(C6574h c6574h, Map<String, Object> map) {
        boolean zK = k();
        this.f63392c.f(c6574h, map, zK);
        this.f63393d.i(c6574h, zK);
        if (zK) {
            m(c6574h);
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String f() {
        return com.adobe.marketing.mobile.t.a();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected void g() {
        a().h("com.adobe.eventType.generic.lifecycle", "com.adobe.eventSource.requestContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.lifecycle.b
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63396a.j(c6574h);
            }
        });
        a().h("com.adobe.eventType._wildcard_", "com.adobe.eventSource._wildcard_", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.lifecycle.c
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63397a.o(c6574h);
            }
        });
        this.f63392c.d();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    public boolean i(C6574h c6574h) {
        if (!c6574h.w().equalsIgnoreCase("com.adobe.eventType.generic.lifecycle") || !c6574h.t().equalsIgnoreCase("com.adobe.eventSource.requestContent")) {
            return true;
        }
        H hE = a().e("com.adobe.module.configuration", c6574h, false, F.ANY);
        if (hE != null && hE.a() == I.SET) {
            return true;
        }
        return false;
    }

    void j(C6574h c6574h) {
        H hE = a().e("com.adobe.module.configuration", c6574h, false, F.ANY);
        if (hE != null && hE.a() != I.PENDING) {
            Map<String, Object> mapO = c6574h.o();
            if (mapO == null) {
                R5.t.e("Lifecycle", "LifecycleExtension", "Failed to process lifecycle event '%s for event data'", "Unexpected Null Value");
                return;
            }
            String strO = C14328a.o(mapO, "action", "");
            if ("start".equals(strO)) {
                R5.t.a("Lifecycle", "LifecycleExtension", "Starting lifecycle", new Object[0]);
                n(c6574h, hE.b());
                return;
            } else if ("pause".equals(strO)) {
                R5.t.a("Lifecycle", "LifecycleExtension", "Pausing lifecycle", new Object[0]);
                l(c6574h);
                return;
            } else {
                R5.t.f("Lifecycle", "LifecycleExtension", "Invalid action for lifecycle request event", new Object[0]);
                return;
            }
        }
        R5.t.e("Lifecycle", "LifecycleExtension", "Waiting for configuration to process lifecycle request event", new Object[0]);
    }

    protected LifecycleExtension(AbstractC6579m abstractC6579m, R5.v vVar, InterfaceC5123j interfaceC5123j) {
        this(abstractC6579m, vVar, new i(vVar, interfaceC5123j, abstractC6579m), new n(vVar, interfaceC5123j, abstractC6579m));
    }

    protected LifecycleExtension(AbstractC6579m abstractC6579m, R5.v vVar, i iVar, n nVar) {
        super(abstractC6579m);
        this.f63391b = vVar;
        this.f63392c = iVar;
        this.f63393d = nVar;
    }
}
