package com.google.gson;

import com.google.gson.internal.B;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class m extends k {

    /* renamed from: a, reason: collision with root package name */
    private final B<String, k> f89695a = new B<>(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof m) && ((m) obj).f89695a.equals(this.f89695a);
        }
        return true;
    }

    public int hashCode() {
        return this.f89695a.hashCode();
    }

    public void o(String str, k kVar) {
        B<String, k> b10 = this.f89695a;
        if (kVar == null) {
            kVar = l.f89694a;
        }
        b10.put(str, kVar);
    }

    public void p(String str, Boolean bool) {
        o(str, bool == null ? l.f89694a : new n(bool));
    }

    public void q(String str, Number number) {
        o(str, number == null ? l.f89694a : new n(number));
    }

    public void r(String str, String str2) {
        o(str, str2 == null ? l.f89694a : new n(str2));
    }

    public Set<Map.Entry<String, k>> s() {
        return this.f89695a.entrySet();
    }

    public k t(String str) {
        return this.f89695a.get(str);
    }

    public n u(String str) {
        return (n) this.f89695a.get(str);
    }

    public boolean v(String str) {
        return this.f89695a.containsKey(str);
    }
}
