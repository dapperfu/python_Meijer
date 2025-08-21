package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    private static final q f89063b = new q();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends Ke.x>, a<? extends Ke.x>> f89064a = new HashMap();

    public interface a<ParametersT extends Ke.x> {
    }

    public synchronized <ParametersT extends Ke.x> void a(a<ParametersT> aVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            a<? extends Ke.x> aVar2 = this.f89064a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f89064a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static q b() {
        return f89063b;
    }
}
