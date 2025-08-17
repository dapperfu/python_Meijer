package cc;

import Vb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.C15395a;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Zb.f<C15395a> f61690a;

    private List<C15395a> g() {
        return this.f61690a.c(C15395a.class);
    }

    public final List<C15395a> a() {
        ArrayList arrayList = new ArrayList();
        for (C15395a c15395a : g()) {
            if (c15395a.d() != null && c15395a.d().name().equals(a.EnumC0807a.IBEACON.name())) {
                arrayList.add(c15395a);
            }
        }
        return arrayList;
    }

    public final C15395a b(String str) {
        return this.f61690a.b(str, C15395a.class);
    }

    public final void c(String str, C15395a c15395a) {
        this.f61690a.a(str, c15395a);
    }

    public final List<C15395a> e() {
        ArrayList arrayList = new ArrayList();
        for (C15395a c15395a : g()) {
            if (c15395a.d() == null || c15395a.d().name().equals(a.EnumC0807a.GIMBAL.name())) {
                arrayList.add(c15395a);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return this.f61690a.b() > 0;
    }

    public f(String str) {
        this.f61690a = null;
        this.f61690a = new Zb.c("VisitRepository." + str);
    }

    public final void d(List<C15395a> list) {
        Iterator<C15395a> it = list.iterator();
        while (it.hasNext()) {
            this.f61690a.a(it.next().c());
        }
    }
}
