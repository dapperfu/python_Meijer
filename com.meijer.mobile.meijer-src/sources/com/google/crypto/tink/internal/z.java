package com.google.crypto.tink.internal;

import Ke.x;
import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public abstract class z<ParametersT extends Ke.x, SerializationT extends K> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<ParametersT> f89078a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f89079b;

    class a extends z<ParametersT, SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f89080c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f89080c = bVar;
        }

        @Override // com.google.crypto.tink.internal.z
        public SerializationT d(ParametersT parameterst) throws GeneralSecurityException {
            return (SerializationT) this.f89080c.a(parameterst);
        }
    }

    public interface b<ParametersT extends Ke.x, SerializationT extends K> {
        SerializationT a(ParametersT parameterst) throws GeneralSecurityException;
    }

    /* synthetic */ z(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public abstract SerializationT d(ParametersT parameterst) throws GeneralSecurityException;

    private z(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f89078a = cls;
        this.f89079b = cls2;
    }

    public static <ParametersT extends Ke.x, SerializationT extends K> z<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.f89078a;
    }

    public Class<SerializationT> c() {
        return this.f89079b;
    }
}
