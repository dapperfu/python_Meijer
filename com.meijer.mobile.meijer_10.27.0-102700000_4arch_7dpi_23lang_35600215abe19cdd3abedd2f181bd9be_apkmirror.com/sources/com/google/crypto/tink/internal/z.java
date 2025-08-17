package com.google.crypto.tink.internal;

import Ie.x;
import com.google.crypto.tink.internal.K;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public abstract class z<ParametersT extends Ie.x, SerializationT extends K> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<ParametersT> f88238a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<SerializationT> f88239b;

    class a extends z<ParametersT, SerializationT> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f88240c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f88240c = bVar;
        }

        @Override // com.google.crypto.tink.internal.z
        public SerializationT d(ParametersT parameterst) throws GeneralSecurityException {
            return (SerializationT) this.f88240c.a(parameterst);
        }
    }

    public interface b<ParametersT extends Ie.x, SerializationT extends K> {
        SerializationT a(ParametersT parameterst) throws GeneralSecurityException;
    }

    /* synthetic */ z(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public abstract SerializationT d(ParametersT parameterst) throws GeneralSecurityException;

    private z(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f88238a = cls;
        this.f88239b = cls2;
    }

    public static <ParametersT extends Ie.x, SerializationT extends K> z<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.f88238a;
    }

    public Class<SerializationT> c() {
        return this.f88239b;
    }
}
