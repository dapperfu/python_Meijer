package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes7.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    private final Map<c, B<?, ?>> f88139a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, F<?, ?>> f88140b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<c, B<?, ?>> f88141a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, F<?, ?>> f88142b;

        public C c() {
            return new C(this);
        }

        public <KeyT extends Ie.j, PrimitiveT> b d(B<KeyT, PrimitiveT> b10) throws GeneralSecurityException {
            if (b10 == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(b10.c(), b10.d());
            if (!this.f88141a.containsKey(cVar)) {
                this.f88141a.put(cVar, b10);
                return this;
            }
            B<?, ?> b11 = this.f88141a.get(cVar);
            if (b11.equals(b10) && b10.equals(b11)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
        }

        public <InputPrimitiveT, WrapperPrimitiveT> b e(F<InputPrimitiveT, WrapperPrimitiveT> f10) throws GeneralSecurityException {
            if (f10 == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> clsA = f10.a();
            if (!this.f88142b.containsKey(clsA)) {
                this.f88142b.put(clsA, f10);
                return this;
            }
            F<?, ?> f11 = this.f88142b.get(clsA);
            if (f11.equals(f10) && f10.equals(f11)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsA);
        }

        private b() {
            this.f88141a = new HashMap();
            this.f88142b = new HashMap();
        }

        private b(C c10) {
            this.f88141a = new HashMap(c10.f88139a);
            this.f88142b = new HashMap(c10.f88140b);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f88143a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f88144b;

        private c(Class<?> cls, Class<?> cls2) {
            this.f88143a = cls;
            this.f88144b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f88143a.equals(this.f88143a) && cVar.f88144b.equals(this.f88144b);
        }

        public int hashCode() {
            return Objects.hash(this.f88143a, this.f88144b);
        }

        public String toString() {
            return this.f88143a.getSimpleName() + " with primitive type: " + this.f88144b.getSimpleName();
        }
    }

    private C(b bVar) {
        this.f88139a = new HashMap(bVar.f88141a);
        this.f88140b = new HashMap(bVar.f88142b);
    }

    public static b c() {
        return new b();
    }

    public static b d(C c10) {
        return new b();
    }

    public Class<?> e(Class<?> cls) throws GeneralSecurityException {
        if (this.f88140b.containsKey(cls)) {
            return this.f88140b.get(cls).c();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends Ie.j, PrimitiveT> PrimitiveT f(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f88139a.containsKey(cVar)) {
            return (PrimitiveT) this.f88139a.get(cVar).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT g(D<InputPrimitiveT> d10, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (!this.f88140b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        F<?, ?> f10 = this.f88140b.get(cls);
        if (d10.f().equals(f10.c()) && f10.c().equals(d10.f())) {
            return (WrapperPrimitiveT) f10.b(d10);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
