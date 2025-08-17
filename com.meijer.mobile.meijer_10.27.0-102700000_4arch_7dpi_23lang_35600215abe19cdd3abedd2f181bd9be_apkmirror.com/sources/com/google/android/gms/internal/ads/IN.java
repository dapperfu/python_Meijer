package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class IN {

    /* renamed from: e, reason: collision with root package name */
    private final String f67613e;

    /* renamed from: f, reason: collision with root package name */
    private final CN f67614f;

    /* renamed from: b, reason: collision with root package name */
    private final List f67610b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f67611c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f67612d = false;

    /* renamed from: a, reason: collision with root package name */
    private final Pc.r0 f67609a = Lc.v.s().j();

    public final synchronized void a(String str) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76350h2)).booleanValue()) {
            Map mapG = g();
            mapG.put("action", "aaia");
            mapG.put("aair", "MalformedJson");
            this.f67610b.add(mapG);
        }
    }

    public final synchronized void b(String str, String str2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76350h2)).booleanValue()) {
            Map mapG = g();
            mapG.put("action", "adapter_init_finished");
            mapG.put("ancn", str);
            mapG.put("rqe", str2);
            this.f67610b.add(mapG);
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76350h2)).booleanValue()) {
            Map mapG = g();
            mapG.put("action", "adapter_init_started");
            mapG.put("ancn", str);
            this.f67610b.add(mapG);
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76350h2)).booleanValue()) {
            Map mapG = g();
            mapG.put("action", "adapter_init_finished");
            mapG.put("ancn", str);
            this.f67610b.add(mapG);
        }
    }

    public final synchronized void e() {
        try {
            if (((Boolean) Mc.A.c().a(C8659lf.f76350h2)).booleanValue() && !this.f67612d) {
                Map mapG = g();
                mapG.put("action", "init_finished");
                this.f67610b.add(mapG);
                Iterator it = this.f67610b.iterator();
                while (it.hasNext()) {
                    this.f67614f.g((Map) it.next());
                }
                this.f67612d = true;
            }
        } finally {
        }
    }

    public final synchronized void f() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76350h2)).booleanValue() && !this.f67611c) {
            Map mapG = g();
            mapG.put("action", "init_started");
            this.f67610b.add(mapG);
            this.f67611c = true;
        }
    }

    private final Map g() {
        Map mapI = this.f67614f.i();
        mapI.put("tms", Long.toString(Lc.v.c().c(), 10));
        mapI.put("tid", this.f67609a.zzN() ? "" : this.f67613e);
        return mapI;
    }

    public IN(String str, CN cn2) {
        this.f67613e = str;
        this.f67614f = cn2;
    }
}
