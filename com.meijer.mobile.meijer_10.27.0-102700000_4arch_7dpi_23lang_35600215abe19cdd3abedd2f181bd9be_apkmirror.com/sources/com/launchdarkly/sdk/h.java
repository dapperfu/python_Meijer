package com.launchdarkly.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import mg.InterfaceC15616b;

@InterfaceC15616b(LDUserTypeAdapter.class)
@Deprecated
/* loaded from: classes7.dex */
public class h implements com.launchdarkly.sdk.json.c {

    /* renamed from: a, reason: collision with root package name */
    final LDValue f91309a;

    /* renamed from: b, reason: collision with root package name */
    final LDValue f91310b;

    /* renamed from: c, reason: collision with root package name */
    final LDValue f91311c;

    /* renamed from: d, reason: collision with root package name */
    final LDValue f91312d;

    /* renamed from: e, reason: collision with root package name */
    final LDValue f91313e;

    /* renamed from: f, reason: collision with root package name */
    final LDValue f91314f;

    /* renamed from: g, reason: collision with root package name */
    final LDValue f91315g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f91316h;

    /* renamed from: i, reason: collision with root package name */
    final LDValue f91317i;

    /* renamed from: j, reason: collision with root package name */
    final Map<UserAttribute, LDValue> f91318j;

    /* renamed from: k, reason: collision with root package name */
    Set<UserAttribute> f91319k;

    @Deprecated
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f91320a;

        /* renamed from: b, reason: collision with root package name */
        private String f91321b;

        /* renamed from: c, reason: collision with root package name */
        private String f91322c;

        /* renamed from: d, reason: collision with root package name */
        private String f91323d;

        /* renamed from: e, reason: collision with root package name */
        private String f91324e;

        /* renamed from: f, reason: collision with root package name */
        private String f91325f;

        /* renamed from: g, reason: collision with root package name */
        private String f91326g;

        /* renamed from: h, reason: collision with root package name */
        private String f91327h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f91328i = false;

        /* renamed from: j, reason: collision with root package name */
        private Map<UserAttribute, LDValue> f91329j;

        /* renamed from: k, reason: collision with root package name */
        private Set<UserAttribute> f91330k;

        private a r(UserAttribute userAttribute, LDValue lDValue) {
            if (this.f91329j == null) {
                this.f91329j = new HashMap();
            }
            this.f91329j.put(userAttribute, LDValue.o(lDValue));
            return this;
        }

        void l(UserAttribute userAttribute) {
            if (this.f91330k == null) {
                this.f91330k = new LinkedHashSet();
            }
            this.f91330k.add(userAttribute);
        }

        public a m(boolean z10) {
            this.f91328i = z10;
            return this;
        }

        public a n(String str) {
            this.f91326g = str;
            return this;
        }

        public h o() {
            return new h(this);
        }

        public a p(String str) {
            this.f91327h = str;
            return this;
        }

        public a q(String str, LDValue lDValue) {
            return str != null ? r(UserAttribute.a(str), lDValue) : this;
        }

        public a s(String str) {
            this.f91324e = str;
            return this;
        }

        public a t(String str) {
            this.f91322c = str;
            return this;
        }

        public a u(String str) {
            this.f91321b = str;
            return this;
        }

        public a v(String str) {
            this.f91320a = str;
            return this;
        }

        public a w(String str) {
            this.f91323d = str;
            return this;
        }

        public a x(String str) {
            this.f91325f = str;
            return this;
        }

        public a(String str) {
            this.f91320a = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Objects.equals(this.f91309a, hVar.f91309a) && Objects.equals(this.f91310b, hVar.f91310b) && Objects.equals(this.f91311c, hVar.f91311c) && Objects.equals(this.f91312d, hVar.f91312d) && Objects.equals(this.f91313e, hVar.f91313e) && Objects.equals(this.f91314f, hVar.f91314f) && Objects.equals(this.f91315g, hVar.f91315g) && Objects.equals(this.f91317i, hVar.f91317i) && this.f91316h == hVar.f91316h && Objects.equals(this.f91318j, hVar.f91318j) && Objects.equals(this.f91319k, hVar.f91319k)) {
                return true;
            }
        }
        return false;
    }

    public Iterable<UserAttribute> b() {
        Map<UserAttribute, LDValue> map = this.f91318j;
        return map == null ? Collections.EMPTY_LIST : map.keySet();
    }

    public Iterable<UserAttribute> c() {
        Set<UserAttribute> set = this.f91319k;
        return set == null ? Collections.EMPTY_LIST : set;
    }

    public boolean d() {
        return this.f91316h;
    }

    public int hashCode() {
        return Objects.hash(this.f91309a, this.f91310b, this.f91311c, this.f91312d, this.f91313e, this.f91314f, this.f91315g, Boolean.valueOf(this.f91316h), this.f91317i, this.f91318j, this.f91319k);
    }

    public String toString() {
        return "LDUser(" + com.launchdarkly.sdk.json.d.d(this) + ")";
    }

    protected h(a aVar) {
        Map<UserAttribute, LDValue> mapUnmodifiableMap;
        this.f91309a = LDValue.s(aVar.f91320a);
        this.f91310b = LDValue.s(aVar.f91321b);
        this.f91317i = LDValue.s(aVar.f91327h);
        this.f91314f = LDValue.s(aVar.f91322c);
        this.f91315g = LDValue.s(aVar.f91323d);
        this.f91311c = LDValue.s(aVar.f91324e);
        this.f91312d = LDValue.s(aVar.f91325f);
        this.f91313e = LDValue.s(aVar.f91326g);
        this.f91316h = aVar.f91328i;
        if (aVar.f91329j == null) {
            mapUnmodifiableMap = null;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(aVar.f91329j);
        }
        this.f91318j = mapUnmodifiableMap;
        this.f91319k = aVar.f91330k != null ? Collections.unmodifiableSet(aVar.f91330k) : null;
    }

    public LDValue a(UserAttribute userAttribute) {
        if (userAttribute.c()) {
            return userAttribute.f91023b.apply(this);
        }
        Map<UserAttribute, LDValue> map = this.f91318j;
        if (map == null) {
            return LDValue.u();
        }
        return LDValue.o(map.get(userAttribute));
    }
}
