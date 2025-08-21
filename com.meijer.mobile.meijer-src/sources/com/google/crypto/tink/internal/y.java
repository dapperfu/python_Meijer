package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public abstract class y<SerializationT extends K> {

    /* renamed from: a, reason: collision with root package name */
    private final Ye.a f89075a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f89076b;

    class a extends y<SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f89077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ye.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f89077c = bVar;
        }

        @Override // com.google.crypto.tink.internal.y
        public Ke.x d(SerializationT serializationt) throws GeneralSecurityException {
            return this.f89077c.a(serializationt);
        }
    }

    public interface b<SerializationT extends K> {
        Ke.x a(SerializationT serializationt) throws GeneralSecurityException;
    }

    /* synthetic */ y(Ye.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public abstract Ke.x d(SerializationT serializationt) throws GeneralSecurityException;

    private y(Ye.a aVar, Class<SerializationT> cls) {
        this.f89075a = aVar;
        this.f89076b = cls;
    }

    public static <SerializationT extends K> y<SerializationT> a(b<SerializationT> bVar, Ye.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final Ye.a b() {
        return this.f89075a;
    }

    public final Class<SerializationT> c() {
        return this.f89076b;
    }
}
