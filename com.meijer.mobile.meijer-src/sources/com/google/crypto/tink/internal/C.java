package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes8.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    private final Map<c, B<?, ?>> f88979a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, F<?, ?>> f88980b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<c, B<?, ?>> f88981a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, F<?, ?>> f88982b;

        public C c() {
            return new C(this);
        }

        public <KeyT extends Ke.j, PrimitiveT> b d(B<KeyT, PrimitiveT> b10) throws GeneralSecurityException {
            if (b10 == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(b10.c(), b10.d());
            if (!this.f88981a.containsKey(cVar)) {
                this.f88981a.put(cVar, b10);
                return this;
            }
            B<?, ?> b11 = this.f88981a.get(cVar);
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
            if (!this.f88982b.containsKey(clsA)) {
                this.f88982b.put(clsA, f10);
                return this;
            }
            F<?, ?> f11 = this.f88982b.get(clsA);
            if (f11.equals(f10) && f10.equals(f11)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsA);
        }

        private b() {
            this.f88981a = new HashMap();
            this.f88982b = new HashMap();
        }

        private b(C c10) {
            this.f88981a = new HashMap(c10.f88979a);
            this.f88982b = new HashMap(c10.f88980b);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f88983a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f88984b;

        private c(Class<?> cls, Class<?> cls2) {
            this.f88983a = cls;
            this.f88984b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f88983a.equals(this.f88983a) && cVar.f88984b.equals(this.f88984b);
        }

        public int hashCode() {
            return Objects.hash(this.f88983a, this.f88984b);
        }

        public String toString() {
            return this.f88983a.getSimpleName() + " with primitive type: " + this.f88984b.getSimpleName();
        }
    }

    private C(b bVar) {
        this.f88979a = new HashMap(bVar.f88981a);
        this.f88980b = new HashMap(bVar.f88982b);
    }

    public static b c() {
        return new b();
    }

    public static b d(C c10) {
        return new b();
    }

    public Class<?> e(Class<?> cls) throws GeneralSecurityException {
        if (this.f88980b.containsKey(cls)) {
            return this.f88980b.get(cls).c();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends Ke.j, PrimitiveT> PrimitiveT f(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f88979a.containsKey(cVar)) {
            return (PrimitiveT) this.f88979a.get(cVar).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT g(D<InputPrimitiveT> d10, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (!this.f88980b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        F<?, ?> f10 = this.f88980b.get(cls);
        if (d10.f().equals(f10.c()) && f10.c().equals(d10.f())) {
            return (WrapperPrimitiveT) f10.b(d10);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
