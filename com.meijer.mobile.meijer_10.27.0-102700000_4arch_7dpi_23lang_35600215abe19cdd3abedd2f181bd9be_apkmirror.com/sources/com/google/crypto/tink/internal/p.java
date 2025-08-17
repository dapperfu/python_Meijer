package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    private static final a<C11302k> f88220b = new a() { // from class: com.google.crypto.tink.internal.o
        @Override // com.google.crypto.tink.internal.p.a
        public final Ie.j a(Ie.x xVar, Integer num) {
            return p.e((C11302k) xVar, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final p f88221c = g();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends Ie.x>, a<? extends Ie.x>> f88222a = new HashMap();

    public interface a<ParametersT extends Ie.x> {
        Ie.j a(ParametersT parameterst, Integer num) throws GeneralSecurityException;
    }

    private synchronized <ParametersT extends Ie.x> Ie.j d(ParametersT parameterst, Integer num) throws GeneralSecurityException {
        a<? extends Ie.x> aVar;
        aVar = this.f88222a.get(parameterst.getClass());
        if (aVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + parameterst + ": no key creator for this class was registered.");
        }
        return aVar.a(parameterst, num);
    }

    public synchronized <ParametersT extends Ie.x> void b(a<ParametersT> aVar, Class<ParametersT> cls) throws GeneralSecurityException {
        try {
            a<? extends Ie.x> aVar2 = this.f88222a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f88222a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static p f() {
        return f88221c;
    }

    private static p g() {
        p pVar = new p();
        try {
            pVar.b(f88220b, C11302k.class);
            return pVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C11301j e(C11302k c11302k, Integer num) throws GeneralSecurityException {
        Ue.A aD = c11302k.b().d();
        Ie.k<?> kVarC = C11296e.d().c(aD.d0());
        if (C11296e.d().f(aD.d0())) {
            Ue.y yVarB = kVarC.b(aD.e0());
            return new C11301j(G.b(yVarB.d0(), yVarB.e0(), yVarB.c0(), aD.c0(), num), Ie.i.a());
        }
        throw new GeneralSecurityException("Creating new keys is not allowed.");
    }

    public Ie.j c(Ie.x xVar, Integer num) throws GeneralSecurityException {
        return d(xVar, num);
    }
}
