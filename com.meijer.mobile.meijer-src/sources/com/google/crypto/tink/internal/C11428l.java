package com.google.crypto.tink.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.internal.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11428l {

    /* renamed from: b, reason: collision with root package name */
    public static final C11428l f89056b = b().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f89057a;

    /* renamed from: com.google.crypto.tink.internal.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private HashMap<String, String> f89058a = new HashMap<>();

        public C11428l a() {
            if (this.f89058a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C11428l c11428l = new C11428l(Collections.unmodifiableMap(this.f89058a));
            this.f89058a = null;
            return c11428l;
        }
    }

    private C11428l(Map<String, String> map) {
        this.f89057a = map;
    }

    public static b b() {
        return new b();
    }

    public boolean a() {
        return this.f89057a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11428l) {
            return this.f89057a.equals(((C11428l) obj).f89057a);
        }
        return false;
    }

    public int hashCode() {
        return this.f89057a.hashCode();
    }

    public String toString() {
        return this.f89057a.toString();
    }
}
