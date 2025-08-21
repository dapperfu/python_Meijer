package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class IN {

    /* renamed from: e, reason: collision with root package name */
    private final String f68453e;

    /* renamed from: f, reason: collision with root package name */
    private final CN f68454f;

    /* renamed from: b, reason: collision with root package name */
    private final List f68450b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f68451c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f68452d = false;

    /* renamed from: a, reason: collision with root package name */
    private final Rc.r0 f68449a = Nc.v.s().j();

    public final synchronized void a(String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77190h2)).booleanValue()) {
            Map mapG = g();
            mapG.put("action", "aaia");
            mapG.put("aair", "MalformedJson");
            this.f68450b.add(mapG);
        }
    }

    public final synchronized void b(String str, String str2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77190h2)).booleanValue()) {
            Map mapG = g();
            mapG.put("action", "adapter_init_finished");
            mapG.put("ancn", str);
            mapG.put("rqe", str2);
            this.f68450b.add(mapG);
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77190h2)).booleanValue()) {
            Map mapG = g();
            mapG.put("action", "adapter_init_started");
            mapG.put("ancn", str);
            this.f68450b.add(mapG);
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77190h2)).booleanValue()) {
            Map mapG = g();
            mapG.put("action", "adapter_init_finished");
            mapG.put("ancn", str);
            this.f68450b.add(mapG);
        }
    }

    public final synchronized void e() {
        try {
            if (((Boolean) Oc.A.c().a(C8784lf.f77190h2)).booleanValue() && !this.f68452d) {
                Map mapG = g();
                mapG.put("action", "init_finished");
                this.f68450b.add(mapG);
                Iterator it = this.f68450b.iterator();
                while (it.hasNext()) {
                    this.f68454f.g((Map) it.next());
                }
                this.f68452d = true;
            }
        } finally {
        }
    }

    public final synchronized void f() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77190h2)).booleanValue() && !this.f68451c) {
            Map mapG = g();
            mapG.put("action", "init_started");
            this.f68450b.add(mapG);
            this.f68451c = true;
        }
    }

    private final Map g() {
        Map mapI = this.f68454f.i();
        mapI.put("tms", Long.toString(Nc.v.c().c(), 10));
        mapI.put("tid", this.f68449a.zzN() ? "" : this.f68453e);
        return mapI;
    }

    public IN(String str, CN cn2) {
        this.f68453e = str;
        this.f68454f = cn2;
    }
}
