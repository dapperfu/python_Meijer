package com.google.crypto.tink.internal;

import Ke.j;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public abstract class B<KeyT extends Ke.j, PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f88976a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f88977b;

    class a extends B<KeyT, PrimitiveT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f88978c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f88978c = bVar;
        }

        @Override // com.google.crypto.tink.internal.B
        public PrimitiveT a(KeyT keyt) throws GeneralSecurityException {
            return (PrimitiveT) this.f88978c.a(keyt);
        }
    }

    public interface b<KeyT extends Ke.j, PrimitiveT> {
        PrimitiveT a(KeyT keyt) throws GeneralSecurityException;
    }

    /* synthetic */ B(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;

    private B(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f88976a = cls;
        this.f88977b = cls2;
    }

    public static <KeyT extends Ke.j, PrimitiveT> B<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> c() {
        return this.f88976a;
    }

    public Class<PrimitiveT> d() {
        return this.f88977b;
    }
}
