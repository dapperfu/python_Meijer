package com.google.crypto.tink.internal;

import Ke.j;
import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC11423g<KeyT extends Ke.j, SerializationT extends K> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f89041a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f89042b;

    /* renamed from: com.google.crypto.tink.internal.g$a */
    class a extends AbstractC11423g<KeyT, SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f89043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f89043c = bVar;
        }

        @Override // com.google.crypto.tink.internal.AbstractC11423g
        public SerializationT d(KeyT keyt, Ke.C c10) throws GeneralSecurityException {
            return (SerializationT) this.f89043c.a(keyt, c10);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.g$b */
    public interface b<KeyT extends Ke.j, SerializationT extends K> {
        SerializationT a(KeyT keyt, Ke.C c10) throws GeneralSecurityException;
    }

    /* synthetic */ AbstractC11423g(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public abstract SerializationT d(KeyT keyt, Ke.C c10) throws GeneralSecurityException;

    private AbstractC11423g(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f89041a = cls;
        this.f89042b = cls2;
    }

    public static <KeyT extends Ke.j, SerializationT extends K> AbstractC11423g<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.f89041a;
    }

    public Class<SerializationT> c() {
        return this.f89042b;
    }
}
