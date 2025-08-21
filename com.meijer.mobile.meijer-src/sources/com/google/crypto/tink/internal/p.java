package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    private static final a<C11427k> f89060b = new a() { // from class: com.google.crypto.tink.internal.o
        @Override // com.google.crypto.tink.internal.p.a
        public final Ke.j a(Ke.x xVar, Integer num) {
            return p.e((C11427k) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final p f89061c = g();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends Ke.x>, a<? extends Ke.x>> f89062a = new HashMap();

    public interface a<ParametersT extends Ke.x> {
        Ke.j a(ParametersT parameterst, Integer num) throws GeneralSecurityException;
    }

    private synchronized <ParametersT extends Ke.x> Ke.j d(ParametersT parameterst, Integer num) throws GeneralSecurityException {
        a<? extends Ke.x> aVar;
        aVar = this.f89062a.get(parameterst.getClass());
        if (aVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + parameterst + ": no key creator for this class was registered.");
        }
        return aVar.a(parameterst, num);
    }

    public synchronized <ParametersT extends Ke.x> void b(a<ParametersT> aVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            a<? extends Ke.x> aVar2 = this.f89062a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f89062a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static p f() {
        return f89061c;
    }

    private static p g() {
        p pVar = new p();
        try {
            pVar.b(f89060b, C11427k.class);
            return pVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C11426j e(C11427k c11427k, Integer num) throws GeneralSecurityException {
        We.A aD = c11427k.b().d();
        Ke.k<?> kVarC = C11421e.d().c(aD.d0());
        if (C11421e.d().f(aD.d0())) {
            We.y yVarB = kVarC.b(aD.e0());
            return new C11426j(G.b(yVarB.d0(), yVarB.e0(), yVarB.c0(), aD.c0(), num), Ke.i.a());
        }
        throw new GeneralSecurityException("Creating new keys is not allowed.");
    }

    public Ke.j c(Ke.x xVar, Integer num) throws GeneralSecurityException {
        return d(xVar, num);
    }
}
