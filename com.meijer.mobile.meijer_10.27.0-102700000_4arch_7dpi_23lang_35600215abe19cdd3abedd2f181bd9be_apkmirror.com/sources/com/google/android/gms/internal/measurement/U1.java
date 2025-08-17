package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class U1 {

    /* renamed from: a, reason: collision with root package name */
    public final U1 f81998a;

    /* renamed from: b, reason: collision with root package name */
    final C10569y f81999b;

    /* renamed from: c, reason: collision with root package name */
    final Map f82000c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map f82001d = new HashMap();

    public final InterfaceC10498q a(InterfaceC10498q interfaceC10498q) {
        return this.f81999b.b(this, interfaceC10498q);
    }

    public final InterfaceC10498q b(C10399f c10399f) {
        InterfaceC10498q interfaceC10498qB = InterfaceC10498q.f82342i3;
        Iterator itL = c10399f.l();
        while (itL.hasNext()) {
            interfaceC10498qB = this.f81999b.b(this, c10399f.o(((Integer) itL.next()).intValue()));
            if (interfaceC10498qB instanceof C10417h) {
                break;
            }
        }
        return interfaceC10498qB;
    }

    public final U1 c() {
        return new U1(this, this.f81999b);
    }

    public final boolean d(String str) {
        if (this.f82000c.containsKey(str)) {
            return true;
        }
        U1 u12 = this.f81998a;
        if (u12 != null) {
            return u12.d(str);
        }
        return false;
    }

    public final void e(String str, InterfaceC10498q interfaceC10498q) {
        U1 u12;
        Map map = this.f82000c;
        if (!map.containsKey(str) && (u12 = this.f81998a) != null && u12.d(str)) {
            u12.e(str, interfaceC10498q);
        } else {
            if (this.f82001d.containsKey(str)) {
                return;
            }
            if (interfaceC10498q == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC10498q);
            }
        }
    }

    public final void f(String str, InterfaceC10498q interfaceC10498q) {
        if (this.f82001d.containsKey(str)) {
            return;
        }
        if (interfaceC10498q == null) {
            this.f82000c.remove(str);
        } else {
            this.f82000c.put(str, interfaceC10498q);
        }
    }

    public final InterfaceC10498q h(String str) {
        Map map = this.f82000c;
        if (map.containsKey(str)) {
            return (InterfaceC10498q) map.get(str);
        }
        U1 u12 = this.f81998a;
        if (u12 != null) {
            return u12.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public U1(U1 u12, C10569y c10569y) {
        this.f81998a = u12;
        this.f81999b = c10569y;
    }

    public final void g(String str, InterfaceC10498q interfaceC10498q) {
        f(str, interfaceC10498q);
        this.f82001d.put(str, Boolean.TRUE);
    }
}
