package com.google.crypto.tink.internal;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.internal.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11419c<E extends Enum<E>, O> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<E, O> f89030a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<O, E> f89031b;

    /* renamed from: com.google.crypto.tink.internal.c$b */
    public static final class b<E extends Enum<E>, O> {

        /* renamed from: a, reason: collision with root package name */
        Map<E, O> f89032a;

        /* renamed from: b, reason: collision with root package name */
        Map<O, E> f89033b;

        private b() {
            this.f89032a = new HashMap();
            this.f89033b = new HashMap();
        }

        public b<E, O> a(E e10, O o10) {
            this.f89032a.put(e10, o10);
            this.f89033b.put(o10, e10);
            return this;
        }

        public C11419c<E, O> b() {
            return new C11419c<>(Collections.unmodifiableMap(this.f89032a), Collections.unmodifiableMap(this.f89033b));
        }
    }

    private C11419c(Map<E, O> map, Map<O, E> map2) {
        this.f89030a = map;
        this.f89031b = map2;
    }

    public static <E extends Enum<E>, O> b<E, O> a() {
        return new b<>();
    }

    public O b(E e10) throws GeneralSecurityException {
        O o10 = this.f89030a.get(e10);
        if (o10 != null) {
            return o10;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + e10);
    }

    public E c(O o10) throws GeneralSecurityException {
        E e10 = this.f89031b.get(o10);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + o10);
    }
}
