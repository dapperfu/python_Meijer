package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.w7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C10951w7 implements InterfaceC10919u7 {

    /* renamed from: a, reason: collision with root package name */
    private final Y9 f84187a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f84188b;

    @Override // com.google.android.gms.internal.pal.InterfaceC10919u7
    public final Class zzc() {
        return this.f84188b;
    }

    private final C10935v7 e() {
        return new C10935v7(this.f84187a.a());
    }

    private final Object f(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        if (Void.class.equals(this.f84188b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f84187a.e(interfaceC10690g1);
        return this.f84187a.i(interfaceC10690g1, this.f84188b);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10919u7
    public final Object a(AbstractC10605b0 abstractC10605b0) throws GeneralSecurityException {
        try {
            return f(this.f84187a.c(abstractC10605b0));
        } catch (zzadi e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f84187a.h().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10919u7
    public final Object b(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        String strConcat = "Expected proto of type ".concat(this.f84187a.h().getName());
        if (this.f84187a.h().isInstance(interfaceC10690g1)) {
            return f(interfaceC10690g1);
        }
        throw new GeneralSecurityException(strConcat);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10919u7
    public final String zzf() {
        return this.f84187a.d();
    }

    public C10951w7(Y9 y92, Class cls) {
        if (!y92.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", y92.toString(), cls.getName()));
        }
        this.f84187a = y92;
        this.f84188b = cls;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10919u7
    public final C10877rd c(AbstractC10605b0 abstractC10605b0) throws GeneralSecurityException {
        try {
            InterfaceC10690g1 interfaceC10690g1A = e().a(abstractC10605b0);
            C10830od c10830odT = C10877rd.t();
            c10830odT.n(this.f84187a.d());
            c10830odT.o(interfaceC10690g1A.a());
            c10830odT.m(this.f84187a.b());
            return (C10877rd) c10830odT.j();
        } catch (zzadi e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10919u7
    public final InterfaceC10690g1 d(AbstractC10605b0 abstractC10605b0) throws GeneralSecurityException {
        try {
            return e().a(abstractC10605b0);
        } catch (zzadi e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f84187a.a().e().getName()), e10);
        }
    }
}
