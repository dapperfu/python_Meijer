package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final Map<d, AbstractC11423g<?, ?>> f89016a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<c, AbstractC11422f<?>> f89017b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<d, z<?, ?>> f89018c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<c, y<?>> f89019d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<d, AbstractC11423g<?, ?>> f89020a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<c, AbstractC11422f<?>> f89021b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<d, z<?, ?>> f89022c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<c, y<?>> f89023d;

        public b() {
            this.f89020a = new HashMap();
            this.f89021b = new HashMap();
            this.f89022c = new HashMap();
            this.f89023d = new HashMap();
        }

        public L e() {
            return new L(this);
        }

        public <SerializationT extends K> b f(AbstractC11422f<SerializationT> abstractC11422f) throws GeneralSecurityException {
            c cVar = new c(abstractC11422f.c(), abstractC11422f.b());
            if (!this.f89021b.containsKey(cVar)) {
                this.f89021b.put(cVar, abstractC11422f);
                return this;
            }
            AbstractC11422f<?> abstractC11422f2 = this.f89021b.get(cVar);
            if (abstractC11422f2.equals(abstractC11422f) && abstractC11422f.equals(abstractC11422f2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <KeyT extends Ke.j, SerializationT extends K> b g(AbstractC11423g<KeyT, SerializationT> abstractC11423g) throws GeneralSecurityException {
            d dVar = new d(abstractC11423g.b(), abstractC11423g.c());
            if (!this.f89020a.containsKey(dVar)) {
                this.f89020a.put(dVar, abstractC11423g);
                return this;
            }
            AbstractC11423g<?, ?> abstractC11423g2 = this.f89020a.get(dVar);
            if (abstractC11423g2.equals(abstractC11423g) && abstractC11423g.equals(abstractC11423g2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public <SerializationT extends K> b h(y<SerializationT> yVar) throws GeneralSecurityException {
            c cVar = new c(yVar.c(), yVar.b());
            if (!this.f89023d.containsKey(cVar)) {
                this.f89023d.put(cVar, yVar);
                return this;
            }
            y<?> yVar2 = this.f89023d.get(cVar);
            if (yVar2.equals(yVar) && yVar.equals(yVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <ParametersT extends Ke.x, SerializationT extends K> b i(z<ParametersT, SerializationT> zVar) throws GeneralSecurityException {
            d dVar = new d(zVar.b(), zVar.c());
            if (!this.f89022c.containsKey(dVar)) {
                this.f89022c.put(dVar, zVar);
                return this;
            }
            z<?, ?> zVar2 = this.f89022c.get(dVar);
            if (zVar2.equals(zVar) && zVar.equals(zVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(L l10) {
            this.f89020a = new HashMap(l10.f89016a);
            this.f89021b = new HashMap(l10.f89017b);
            this.f89022c = new HashMap(l10.f89018c);
            this.f89023d = new HashMap(l10.f89019d);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends K> f89024a;

        /* renamed from: b, reason: collision with root package name */
        private final Ye.a f89025b;

        private c(Class<? extends K> cls, Ye.a aVar) {
            this.f89024a = cls;
            this.f89025b = aVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f89024a.equals(this.f89024a) && cVar.f89025b.equals(this.f89025b);
        }

        public int hashCode() {
            return Objects.hash(this.f89024a, this.f89025b);
        }

        public String toString() {
            return this.f89024a.getSimpleName() + ", object identifier: " + this.f89025b;
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f89026a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<? extends K> f89027b;

        private d(Class<?> cls, Class<? extends K> cls2) {
            this.f89026a = cls;
            this.f89027b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f89026a.equals(this.f89026a) && dVar.f89027b.equals(this.f89027b);
        }

        public int hashCode() {
            return Objects.hash(this.f89026a, this.f89027b);
        }

        public String toString() {
            return this.f89026a.getSimpleName() + " with serialization type: " + this.f89027b.getSimpleName();
        }
    }

    private L(b bVar) {
        this.f89016a = new HashMap(bVar.f89020a);
        this.f89017b = new HashMap(bVar.f89021b);
        this.f89018c = new HashMap(bVar.f89022c);
        this.f89019d = new HashMap(bVar.f89023d);
    }

    public <SerializationT extends K> boolean e(SerializationT serializationt) {
        return this.f89017b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends K> boolean f(SerializationT serializationt) {
        return this.f89019d.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends K> Ke.j g(SerializationT serializationt, Ke.C c10) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f89017b.containsKey(cVar)) {
            return this.f89017b.get(cVar).d(serializationt, c10);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public <SerializationT extends K> Ke.x h(SerializationT serializationt) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f89019d.containsKey(cVar)) {
            return this.f89019d.get(cVar).d(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cVar + " available");
    }

    public <KeyT extends Ke.j, SerializationT extends K> SerializationT i(KeyT keyt, Class<SerializationT> cls, Ke.C c10) throws GeneralSecurityException {
        d dVar = new d(keyt.getClass(), cls);
        if (this.f89016a.containsKey(dVar)) {
            return (SerializationT) this.f89016a.get(dVar).d(keyt, c10);
        }
        throw new GeneralSecurityException("No Key serializer for " + dVar + " available");
    }

    public <ParametersT extends Ke.x, SerializationT extends K> SerializationT j(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        d dVar = new d(parameterst.getClass(), cls);
        if (this.f89018c.containsKey(dVar)) {
            return (SerializationT) this.f89018c.get(dVar).d(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dVar + " available");
    }
}
