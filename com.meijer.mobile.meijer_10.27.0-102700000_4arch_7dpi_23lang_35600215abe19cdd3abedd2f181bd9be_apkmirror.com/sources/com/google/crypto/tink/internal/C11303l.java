package com.google.crypto.tink.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.internal.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11303l {

    /* renamed from: b, reason: collision with root package name */
    public static final C11303l f88216b = b().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f88217a;

    /* renamed from: com.google.crypto.tink.internal.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private HashMap<String, String> f88218a = new HashMap<>();

        public C11303l a() {
            if (this.f88218a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C11303l c11303l = new C11303l(Collections.unmodifiableMap(this.f88218a));
            this.f88218a = null;
            return c11303l;
        }
    }

    private C11303l(Map<String, String> map) {
        this.f88217a = map;
    }

    public static b b() {
        return new b();
    }

    public boolean a() {
        return this.f88217a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11303l) {
            return this.f88217a.equals(((C11303l) obj).f88217a);
        }
        return false;
    }

    public int hashCode() {
        return this.f88217a.hashCode();
    }

    public String toString() {
        return this.f88217a.toString();
    }
}
