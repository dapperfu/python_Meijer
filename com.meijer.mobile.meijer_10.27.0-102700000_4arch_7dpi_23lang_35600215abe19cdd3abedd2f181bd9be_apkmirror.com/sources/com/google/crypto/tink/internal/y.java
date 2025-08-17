package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public abstract class y<SerializationT extends K> {

    /* renamed from: a, reason: collision with root package name */
    private final We.a f88235a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f88236b;

    class a extends y<SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f88237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(We.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f88237c = bVar;
        }

        @Override // com.google.crypto.tink.internal.y
        public Ie.x d(SerializationT serializationt) throws GeneralSecurityException {
            return this.f88237c.a(serializationt);
        }
    }

    public interface b<SerializationT extends K> {
        Ie.x a(SerializationT serializationt) throws GeneralSecurityException;
    }

    /* synthetic */ y(We.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public abstract Ie.x d(SerializationT serializationt) throws GeneralSecurityException;

    private y(We.a aVar, Class<SerializationT> cls) {
        this.f88235a = aVar;
        this.f88236b = cls;
    }

    public static <SerializationT extends K> y<SerializationT> a(b<SerializationT> bVar, We.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final We.a b() {
        return this.f88235a;
    }

    public final Class<SerializationT> c() {
        return this.f88236b;
    }
}
