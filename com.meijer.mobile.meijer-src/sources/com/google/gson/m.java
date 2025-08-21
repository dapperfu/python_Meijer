package com.google.gson;

import com.google.gson.internal.B;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class m extends k {

    /* renamed from: a, reason: collision with root package name */
    private final B<String, k> f90537a = new B<>(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof m) && ((m) obj).f90537a.equals(this.f90537a);
        }
        return true;
    }

    public int hashCode() {
        return this.f90537a.hashCode();
    }

    public void o(String str, k kVar) {
        B<String, k> b10 = this.f90537a;
        if (kVar == null) {
            kVar = l.f90536a;
        }
        b10.put(str, kVar);
    }

    public void p(String str, Boolean bool) {
        o(str, bool == null ? l.f90536a : new n(bool));
    }

    public void q(String str, Number number) {
        o(str, number == null ? l.f90536a : new n(number));
    }

    public void r(String str, String str2) {
        o(str, str2 == null ? l.f90536a : new n(str2));
    }

    public Set<Map.Entry<String, k>> s() {
        return this.f90537a.entrySet();
    }

    public k t(String str) {
        return this.f90537a.get(str);
    }

    public n u(String str) {
        return (n) this.f90537a.get(str);
    }

    public boolean v(String str) {
        return this.f90537a.containsKey(str);
    }
}
