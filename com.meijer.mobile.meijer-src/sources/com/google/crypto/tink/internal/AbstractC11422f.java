package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11422f<SerializationT extends K> {

    /* renamed from: a, reason: collision with root package name */
    private final Ye.a f89038a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f89039b;

    /* renamed from: com.google.crypto.tink.internal.f$a */
    class a extends AbstractC11422f<SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f89040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ye.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f89040c = bVar;
        }

        @Override // com.google.crypto.tink.internal.AbstractC11422f
        public Ke.j d(SerializationT serializationt, Ke.C c10) throws GeneralSecurityException {
            return this.f89040c.a(serializationt, c10);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.f$b */
    public interface b<SerializationT extends K> {
        Ke.j a(SerializationT serializationt, Ke.C c10) throws GeneralSecurityException;
    }

    /* synthetic */ AbstractC11422f(Ye.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public abstract Ke.j d(SerializationT serializationt, Ke.C c10) throws GeneralSecurityException;

    private AbstractC11422f(Ye.a aVar, Class<SerializationT> cls) {
        this.f89038a = aVar;
        this.f89039b = cls;
    }

    public static <SerializationT extends K> AbstractC11422f<SerializationT> a(b<SerializationT> bVar, Ye.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final Ye.a b() {
        return this.f89038a;
    }

    public final Class<SerializationT> c() {
        return this.f89039b;
    }
}
