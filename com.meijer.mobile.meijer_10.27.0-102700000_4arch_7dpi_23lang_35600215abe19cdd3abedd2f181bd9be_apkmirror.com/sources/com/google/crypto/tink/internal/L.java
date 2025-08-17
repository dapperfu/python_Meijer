package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final Map<d, AbstractC11298g<?, ?>> f88176a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<c, AbstractC11297f<?>> f88177b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<d, z<?, ?>> f88178c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<c, y<?>> f88179d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<d, AbstractC11298g<?, ?>> f88180a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<c, AbstractC11297f<?>> f88181b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<d, z<?, ?>> f88182c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<c, y<?>> f88183d;

        public b() {
            this.f88180a = new HashMap();
            this.f88181b = new HashMap();
            this.f88182c = new HashMap();
            this.f88183d = new HashMap();
        }

        public L e() {
            return new L(this);
        }

        public <SerializationT extends K> b f(AbstractC11297f<SerializationT> abstractC11297f) throws GeneralSecurityException {
            c cVar = new c(abstractC11297f.c(), abstractC11297f.b());
            if (!this.f88181b.containsKey(cVar)) {
                this.f88181b.put(cVar, abstractC11297f);
                return this;
            }
            AbstractC11297f<?> abstractC11297f2 = this.f88181b.get(cVar);
            if (abstractC11297f2.equals(abstractC11297f) && abstractC11297f.equals(abstractC11297f2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <KeyT extends Ie.j, SerializationT extends K> b g(AbstractC11298g<KeyT, SerializationT> abstractC11298g) throws GeneralSecurityException {
            d dVar = new d(abstractC11298g.b(), abstractC11298g.c());
            if (!this.f88180a.containsKey(dVar)) {
                this.f88180a.put(dVar, abstractC11298g);
                return this;
            }
            AbstractC11298g<?, ?> abstractC11298g2 = this.f88180a.get(dVar);
            if (abstractC11298g2.equals(abstractC11298g) && abstractC11298g.equals(abstractC11298g2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public <SerializationT extends K> b h(y<SerializationT> yVar) throws GeneralSecurityException {
            c cVar = new c(yVar.c(), yVar.b());
            if (!this.f88183d.containsKey(cVar)) {
                this.f88183d.put(cVar, yVar);
                return this;
            }
            y<?> yVar2 = this.f88183d.get(cVar);
            if (yVar2.equals(yVar) && yVar.equals(yVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <ParametersT extends Ie.x, SerializationT extends K> b i(z<ParametersT, SerializationT> zVar) throws GeneralSecurityException {
            d dVar = new d(zVar.b(), zVar.c());
            if (!this.f88182c.containsKey(dVar)) {
                this.f88182c.put(dVar, zVar);
                return this;
            }
            z<?, ?> zVar2 = this.f88182c.get(dVar);
            if (zVar2.equals(zVar) && zVar.equals(zVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(L l10) {
            this.f88180a = new HashMap(l10.f88176a);
            this.f88181b = new HashMap(l10.f88177b);
            this.f88182c = new HashMap(l10.f88178c);
            this.f88183d = new HashMap(l10.f88179d);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends K> f88184a;

        /* renamed from: b, reason: collision with root package name */
        private final We.a f88185b;

        private c(Class<? extends K> cls, We.a aVar) {
            this.f88184a = cls;
            this.f88185b = aVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f88184a.equals(this.f88184a) && cVar.f88185b.equals(this.f88185b);
        }

        public int hashCode() {
            return Objects.hash(this.f88184a, this.f88185b);
        }

        public String toString() {
            return this.f88184a.getSimpleName() + ", object identifier: " + this.f88185b;
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f88186a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<? extends K> f88187b;

        private d(Class<?> cls, Class<? extends K> cls2) {
            this.f88186a = cls;
            this.f88187b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f88186a.equals(this.f88186a) && dVar.f88187b.equals(this.f88187b);
        }

        public int hashCode() {
            return Objects.hash(this.f88186a, this.f88187b);
        }

        public String toString() {
            return this.f88186a.getSimpleName() + " with serialization type: " + this.f88187b.getSimpleName();
        }
    }

    private L(b bVar) {
        this.f88176a = new HashMap(bVar.f88180a);
        this.f88177b = new HashMap(bVar.f88181b);
        this.f88178c = new HashMap(bVar.f88182c);
        this.f88179d = new HashMap(bVar.f88183d);
    }

    public <SerializationT extends K> boolean e(SerializationT serializationt) {
        return this.f88177b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends K> boolean f(SerializationT serializationt) {
        return this.f88179d.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends K> Ie.j g(SerializationT serializationt, Ie.C c10) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f88177b.containsKey(cVar)) {
            return this.f88177b.get(cVar).d(serializationt, c10);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public <SerializationT extends K> Ie.x h(SerializationT serializationt) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f88179d.containsKey(cVar)) {
            return this.f88179d.get(cVar).d(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cVar + " available");
    }

    public <KeyT extends Ie.j, SerializationT extends K> SerializationT i(KeyT keyt, Class<SerializationT> cls, Ie.C c10) throws GeneralSecurityException {
        d dVar = new d(keyt.getClass(), cls);
        if (this.f88176a.containsKey(dVar)) {
            return (SerializationT) this.f88176a.get(dVar).d(keyt, c10);
        }
        throw new GeneralSecurityException("No Key serializer for " + dVar + " available");
    }

    public <ParametersT extends Ie.x, SerializationT extends K> SerializationT j(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        d dVar = new d(parameterst.getClass(), cls);
        if (this.f88178c.containsKey(dVar)) {
            return (SerializationT) this.f88178c.get(dVar).d(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dVar + " available");
    }
}
