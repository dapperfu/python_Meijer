package com.google.crypto.tink.internal;

import Ie.j;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public abstract class B<KeyT extends Ie.j, PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f88136a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f88137b;

    class a extends B<KeyT, PrimitiveT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f88138c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f88138c = bVar;
        }

        @Override // com.google.crypto.tink.internal.B
        public PrimitiveT a(KeyT keyt) throws GeneralSecurityException {
            return (PrimitiveT) this.f88138c.a(keyt);
        }
    }

    public interface b<KeyT extends Ie.j, PrimitiveT> {
        PrimitiveT a(KeyT keyt) throws GeneralSecurityException;
    }

    /* synthetic */ B(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;

    private B(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f88136a = cls;
        this.f88137b = cls2;
    }

    public static <KeyT extends Ie.j, PrimitiveT> B<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> c() {
        return this.f88136a;
    }

    public Class<PrimitiveT> d() {
        return this.f88137b;
    }
}
