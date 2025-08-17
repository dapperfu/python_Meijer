package com.google.crypto.tink.internal;

import Ie.j;
import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.internal.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC11298g<KeyT extends Ie.j, SerializationT extends K> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<KeyT> f88201a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f88202b;

    /* renamed from: com.google.crypto.tink.internal.g$a */
    class a extends AbstractC11298g<KeyT, SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f88203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f88203c = bVar;
        }

        @Override // com.google.crypto.tink.internal.AbstractC11298g
        public SerializationT d(KeyT keyt, Ie.C c10) throws GeneralSecurityException {
            return (SerializationT) this.f88203c.a(keyt, c10);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.g$b */
    public interface b<KeyT extends Ie.j, SerializationT extends K> {
        SerializationT a(KeyT keyt, Ie.C c10) throws GeneralSecurityException;
    }

    /* synthetic */ AbstractC11298g(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public abstract SerializationT d(KeyT keyt, Ie.C c10) throws GeneralSecurityException;

    private AbstractC11298g(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f88201a = cls;
        this.f88202b = cls2;
    }

    public static <KeyT extends Ie.j, SerializationT extends K> AbstractC11298g<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.f88201a;
    }

    public Class<SerializationT> c() {
        return this.f88202b;
    }
}
