package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class U1 {

    /* renamed from: a, reason: collision with root package name */
    public final U1 f82838a;

    /* renamed from: b, reason: collision with root package name */
    final C10694y f82839b;

    /* renamed from: c, reason: collision with root package name */
    final Map f82840c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map f82841d = new HashMap();

    public final InterfaceC10623q a(InterfaceC10623q interfaceC10623q) {
        return this.f82839b.b(this, interfaceC10623q);
    }

    public final InterfaceC10623q b(C10524f c10524f) {
        InterfaceC10623q interfaceC10623qB = InterfaceC10623q.f83182i3;
        Iterator itL = c10524f.l();
        while (itL.hasNext()) {
            interfaceC10623qB = this.f82839b.b(this, c10524f.o(((Integer) itL.next()).intValue()));
            if (interfaceC10623qB instanceof C10542h) {
                break;
            }
        }
        return interfaceC10623qB;
    }

    public final U1 c() {
        return new U1(this, this.f82839b);
    }

    public final boolean d(String str) {
        if (this.f82840c.containsKey(str)) {
            return true;
        }
        U1 u12 = this.f82838a;
        if (u12 != null) {
            return u12.d(str);
        }
        return false;
    }

    public final void e(String str, InterfaceC10623q interfaceC10623q) {
        U1 u12;
        Map map = this.f82840c;
        if (!map.containsKey(str) && (u12 = this.f82838a) != null && u12.d(str)) {
            u12.e(str, interfaceC10623q);
        } else {
            if (this.f82841d.containsKey(str)) {
                return;
            }
            if (interfaceC10623q == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC10623q);
            }
        }
    }

    public final void f(String str, InterfaceC10623q interfaceC10623q) {
        if (this.f82841d.containsKey(str)) {
            return;
        }
        if (interfaceC10623q == null) {
            this.f82840c.remove(str);
        } else {
            this.f82840c.put(str, interfaceC10623q);
        }
    }

    public final InterfaceC10623q h(String str) {
        Map map = this.f82840c;
        if (map.containsKey(str)) {
            return (InterfaceC10623q) map.get(str);
        }
        U1 u12 = this.f82838a;
        if (u12 != null) {
            return u12.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public U1(U1 u12, C10694y c10694y) {
        this.f82838a = u12;
        this.f82839b = c10694y;
    }

    public final void g(String str, InterfaceC10623q interfaceC10623q) {
        f(str, interfaceC10623q);
        this.f82841d.put(str, Boolean.TRUE);
    }
}
