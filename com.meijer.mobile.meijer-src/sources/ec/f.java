package ec;

import Xb.a;
import bc.C6349c;
import bc.InterfaceC6352f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.C15929a;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC6352f<C15929a> f130072a;

    private List<C15929a> g() {
        return this.f130072a.c(C15929a.class);
    }

    public final List<C15929a> a() {
        ArrayList arrayList = new ArrayList();
        for (C15929a c15929a : g()) {
            if (c15929a.d() != null && c15929a.d().name().equals(a.EnumC0897a.IBEACON.name())) {
                arrayList.add(c15929a);
            }
        }
        return arrayList;
    }

    public final C15929a b(String str) {
        return this.f130072a.b(str, C15929a.class);
    }

    public final void c(String str, C15929a c15929a) {
        this.f130072a.a(str, c15929a);
    }

    public final List<C15929a> e() {
        ArrayList arrayList = new ArrayList();
        for (C15929a c15929a : g()) {
            if (c15929a.d() == null || c15929a.d().name().equals(a.EnumC0897a.GIMBAL.name())) {
                arrayList.add(c15929a);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return this.f130072a.b() > 0;
    }

    public f(String str) {
        this.f130072a = null;
        this.f130072a = new C6349c("VisitRepository." + str);
    }

    public final void d(List<C15929a> list) {
        Iterator<C15929a> it = list.iterator();
        while (it.hasNext()) {
            this.f130072a.a(it.next().c());
        }
    }
}
