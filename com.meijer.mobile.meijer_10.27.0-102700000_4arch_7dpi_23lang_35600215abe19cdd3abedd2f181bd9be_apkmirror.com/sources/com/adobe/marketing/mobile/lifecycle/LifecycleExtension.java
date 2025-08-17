package com.adobe.marketing.mobile.lifecycle;

import Q5.InterfaceC5078j;
import Q5.K;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.F;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6456o;
import f6.C13845a;
import java.util.Map;

/* loaded from: classes4.dex */
public class LifecycleExtension extends AbstractC6453l {

    /* renamed from: b, reason: collision with root package name */
    private final Q5.v f62552b;

    /* renamed from: c, reason: collision with root package name */
    private final i f62553c;

    /* renamed from: d, reason: collision with root package name */
    private final n f62554d;

    protected LifecycleExtension(AbstractC6454m abstractC6454m) {
        this(abstractC6454m, K.f().d().a("AdobeMobile_Lifecycle"), K.f().e());
    }

    private boolean k() {
        Q5.v vVar = this.f62552b;
        return (vVar == null || vVar.contains("InstallDate")) ? false : true;
    }

    private void l(C6449h c6449h) {
        this.f62553c.e(c6449h);
        this.f62554d.g(c6449h);
    }

    private void m(C6449h c6449h) {
        if (this.f62552b == null) {
            return;
        }
        this.f62552b.b("InstallDate", c6449h.v());
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String b() {
        return "Lifecycle";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String e() {
        return "com.adobe.module.lifecycle";
    }

    void o(C6449h c6449h) {
        this.f62554d.j(c6449h);
    }

    private void n(C6449h c6449h, Map<String, Object> map) {
        boolean zK = k();
        this.f62553c.f(c6449h, map, zK);
        this.f62554d.i(c6449h, zK);
        if (zK) {
            m(c6449h);
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String f() {
        return com.adobe.marketing.mobile.t.a();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void g() {
        a().h("com.adobe.eventType.generic.lifecycle", "com.adobe.eventSource.requestContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.lifecycle.b
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62557a.j(c6449h);
            }
        });
        a().h("com.adobe.eventType._wildcard_", "com.adobe.eventSource._wildcard_", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.lifecycle.c
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62558a.o(c6449h);
            }
        });
        this.f62553c.d();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    public boolean i(C6449h c6449h) {
        if (!c6449h.w().equalsIgnoreCase("com.adobe.eventType.generic.lifecycle") || !c6449h.t().equalsIgnoreCase("com.adobe.eventSource.requestContent")) {
            return true;
        }
        H hE = a().e("com.adobe.module.configuration", c6449h, false, F.ANY);
        if (hE != null && hE.a() == I.SET) {
            return true;
        }
        return false;
    }

    void j(C6449h c6449h) {
        H hE = a().e("com.adobe.module.configuration", c6449h, false, F.ANY);
        if (hE != null && hE.a() != I.PENDING) {
            Map<String, Object> mapO = c6449h.o();
            if (mapO == null) {
                Q5.t.e("Lifecycle", "LifecycleExtension", "Failed to process lifecycle event '%s for event data'", "Unexpected Null Value");
                return;
            }
            String strO = C13845a.o(mapO, "action", "");
            if ("start".equals(strO)) {
                Q5.t.a("Lifecycle", "LifecycleExtension", "Starting lifecycle", new Object[0]);
                n(c6449h, hE.b());
                return;
            } else if ("pause".equals(strO)) {
                Q5.t.a("Lifecycle", "LifecycleExtension", "Pausing lifecycle", new Object[0]);
                l(c6449h);
                return;
            } else {
                Q5.t.f("Lifecycle", "LifecycleExtension", "Invalid action for lifecycle request event", new Object[0]);
                return;
            }
        }
        Q5.t.e("Lifecycle", "LifecycleExtension", "Waiting for configuration to process lifecycle request event", new Object[0]);
    }

    protected LifecycleExtension(AbstractC6454m abstractC6454m, Q5.v vVar, InterfaceC5078j interfaceC5078j) {
        this(abstractC6454m, vVar, new i(vVar, interfaceC5078j, abstractC6454m), new n(vVar, interfaceC5078j, abstractC6454m));
    }

    protected LifecycleExtension(AbstractC6454m abstractC6454m, Q5.v vVar, i iVar, n nVar) {
        super(abstractC6454m);
        this.f62552b = vVar;
        this.f62553c = iVar;
        this.f62554d = nVar;
    }
}
