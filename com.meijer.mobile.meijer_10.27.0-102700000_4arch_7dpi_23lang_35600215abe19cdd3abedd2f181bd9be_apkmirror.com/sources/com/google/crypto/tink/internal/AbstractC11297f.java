package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11297f<SerializationT extends K> {

    /* renamed from: a, reason: collision with root package name */
    private final We.a f88198a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f88199b;

    /* renamed from: com.google.crypto.tink.internal.f$a */
    class a extends AbstractC11297f<SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f88200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(We.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f88200c = bVar;
        }

        @Override // com.google.crypto.tink.internal.AbstractC11297f
        public Ie.j d(SerializationT serializationt, Ie.C c10) throws GeneralSecurityException {
            return this.f88200c.a(serializationt, c10);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.f$b */
    public interface b<SerializationT extends K> {
        Ie.j a(SerializationT serializationt, Ie.C c10) throws GeneralSecurityException;
    }

    /* synthetic */ AbstractC11297f(We.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public abstract Ie.j d(SerializationT serializationt, Ie.C c10) throws GeneralSecurityException;

    private AbstractC11297f(We.a aVar, Class<SerializationT> cls) {
        this.f88198a = aVar;
        this.f88199b = cls;
    }

    public static <SerializationT extends K> AbstractC11297f<SerializationT> a(b<SerializationT> bVar, We.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final We.a b() {
        return this.f88198a;
    }

    public final Class<SerializationT> c() {
        return this.f88199b;
    }
}
