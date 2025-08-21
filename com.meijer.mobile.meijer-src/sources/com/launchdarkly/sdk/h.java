package com.launchdarkly.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import og.InterfaceC16126b;

@InterfaceC16126b(LDUserTypeAdapter.class)
@Deprecated
/* loaded from: classes8.dex */
public class h implements com.launchdarkly.sdk.json.c {

    /* renamed from: a, reason: collision with root package name */
    final LDValue f92148a;

    /* renamed from: b, reason: collision with root package name */
    final LDValue f92149b;

    /* renamed from: c, reason: collision with root package name */
    final LDValue f92150c;

    /* renamed from: d, reason: collision with root package name */
    final LDValue f92151d;

    /* renamed from: e, reason: collision with root package name */
    final LDValue f92152e;

    /* renamed from: f, reason: collision with root package name */
    final LDValue f92153f;

    /* renamed from: g, reason: collision with root package name */
    final LDValue f92154g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f92155h;

    /* renamed from: i, reason: collision with root package name */
    final LDValue f92156i;

    /* renamed from: j, reason: collision with root package name */
    final Map<UserAttribute, LDValue> f92157j;

    /* renamed from: k, reason: collision with root package name */
    Set<UserAttribute> f92158k;

    @Deprecated
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f92159a;

        /* renamed from: b, reason: collision with root package name */
        private String f92160b;

        /* renamed from: c, reason: collision with root package name */
        private String f92161c;

        /* renamed from: d, reason: collision with root package name */
        private String f92162d;

        /* renamed from: e, reason: collision with root package name */
        private String f92163e;

        /* renamed from: f, reason: collision with root package name */
        private String f92164f;

        /* renamed from: g, reason: collision with root package name */
        private String f92165g;

        /* renamed from: h, reason: collision with root package name */
        private String f92166h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f92167i = false;

        /* renamed from: j, reason: collision with root package name */
        private Map<UserAttribute, LDValue> f92168j;

        /* renamed from: k, reason: collision with root package name */
        private Set<UserAttribute> f92169k;

        private a r(UserAttribute userAttribute, LDValue lDValue) {
            if (this.f92168j == null) {
                this.f92168j = new HashMap();
            }
            this.f92168j.put(userAttribute, LDValue.o(lDValue));
            return this;
        }

        void l(UserAttribute userAttribute) {
            if (this.f92169k == null) {
                this.f92169k = new LinkedHashSet();
            }
            this.f92169k.add(userAttribute);
        }

        public a m(boolean z10) {
            this.f92167i = z10;
            return this;
        }

        public a n(String str) {
            this.f92165g = str;
            return this;
        }

        public h o() {
            return new h(this);
        }

        public a p(String str) {
            this.f92166h = str;
            return this;
        }

        public a q(String str, LDValue lDValue) {
            return str != null ? r(UserAttribute.a(str), lDValue) : this;
        }

        public a s(String str) {
            this.f92163e = str;
            return this;
        }

        public a t(String str) {
            this.f92161c = str;
            return this;
        }

        public a u(String str) {
            this.f92160b = str;
            return this;
        }

        public a v(String str) {
            this.f92159a = str;
            return this;
        }

        public a w(String str) {
            this.f92162d = str;
            return this;
        }

        public a x(String str) {
            this.f92164f = str;
            return this;
        }

        public a(String str) {
            this.f92159a = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Objects.equals(this.f92148a, hVar.f92148a) && Objects.equals(this.f92149b, hVar.f92149b) && Objects.equals(this.f92150c, hVar.f92150c) && Objects.equals(this.f92151d, hVar.f92151d) && Objects.equals(this.f92152e, hVar.f92152e) && Objects.equals(this.f92153f, hVar.f92153f) && Objects.equals(this.f92154g, hVar.f92154g) && Objects.equals(this.f92156i, hVar.f92156i) && this.f92155h == hVar.f92155h && Objects.equals(this.f92157j, hVar.f92157j) && Objects.equals(this.f92158k, hVar.f92158k)) {
                return true;
            }
        }
        return false;
    }

    public Iterable<UserAttribute> b() {
        Map<UserAttribute, LDValue> map = this.f92157j;
        return map == null ? Collections.EMPTY_LIST : map.keySet();
    }

    public Iterable<UserAttribute> c() {
        Set<UserAttribute> set = this.f92158k;
        return set == null ? Collections.EMPTY_LIST : set;
    }

    public boolean d() {
        return this.f92155h;
    }

    public int hashCode() {
        return Objects.hash(this.f92148a, this.f92149b, this.f92150c, this.f92151d, this.f92152e, this.f92153f, this.f92154g, Boolean.valueOf(this.f92155h), this.f92156i, this.f92157j, this.f92158k);
    }

    public String toString() {
        return "LDUser(" + com.launchdarkly.sdk.json.d.d(this) + ")";
    }

    protected h(a aVar) {
        Map<UserAttribute, LDValue> mapUnmodifiableMap;
        this.f92148a = LDValue.s(aVar.f92159a);
        this.f92149b = LDValue.s(aVar.f92160b);
        this.f92156i = LDValue.s(aVar.f92166h);
        this.f92153f = LDValue.s(aVar.f92161c);
        this.f92154g = LDValue.s(aVar.f92162d);
        this.f92150c = LDValue.s(aVar.f92163e);
        this.f92151d = LDValue.s(aVar.f92164f);
        this.f92152e = LDValue.s(aVar.f92165g);
        this.f92155h = aVar.f92167i;
        if (aVar.f92168j == null) {
            mapUnmodifiableMap = null;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(aVar.f92168j);
        }
        this.f92157j = mapUnmodifiableMap;
        this.f92158k = aVar.f92169k != null ? Collections.unmodifiableSet(aVar.f92169k) : null;
    }

    public LDValue a(UserAttribute userAttribute) {
        if (userAttribute.c()) {
            return userAttribute.f91862b.apply(this);
        }
        Map<UserAttribute, LDValue> map = this.f92157j;
        if (map == null) {
            return LDValue.u();
        }
        return LDValue.o(map.get(userAttribute));
    }
}
