package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    private static final q f88223b = new q();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends Ie.x>, a<? extends Ie.x>> f88224a = new HashMap();

    public interface a<ParametersT extends Ie.x> {
    }

    public synchronized <ParametersT extends Ie.x> void a(a<ParametersT> aVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            a<? extends Ie.x> aVar2 = this.f88224a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f88224a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static q b() {
        return f88223b;
    }
}
