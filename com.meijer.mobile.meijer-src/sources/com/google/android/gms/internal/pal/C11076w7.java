package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.w7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C11076w7 implements InterfaceC11044u7 {

    /* renamed from: a, reason: collision with root package name */
    private final Y9 f85027a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f85028b;

    @Override // com.google.android.gms.internal.pal.InterfaceC11044u7
    public final Class zzc() {
        return this.f85028b;
    }

    private final C11060v7 e() {
        return new C11060v7(this.f85027a.a());
    }

    private final Object f(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        if (Void.class.equals(this.f85028b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f85027a.e(interfaceC10815g1);
        return this.f85027a.i(interfaceC10815g1, this.f85028b);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11044u7
    public final Object a(AbstractC10730b0 abstractC10730b0) throws GeneralSecurityException {
        try {
            return f(this.f85027a.c(abstractC10730b0));
        } catch (zzadi e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f85027a.h().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11044u7
    public final Object b(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        String strConcat = "Expected proto of type ".concat(this.f85027a.h().getName());
        if (this.f85027a.h().isInstance(interfaceC10815g1)) {
            return f(interfaceC10815g1);
        }
        throw new GeneralSecurityException(strConcat);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11044u7
    public final String zzf() {
        return this.f85027a.d();
    }

    public C11076w7(Y9 y92, Class cls) {
        if (!y92.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", y92.toString(), cls.getName()));
        }
        this.f85027a = y92;
        this.f85028b = cls;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11044u7
    public final C11002rd c(AbstractC10730b0 abstractC10730b0) throws GeneralSecurityException {
        try {
            InterfaceC10815g1 interfaceC10815g1A = e().a(abstractC10730b0);
            C10955od c10955odT = C11002rd.t();
            c10955odT.n(this.f85027a.d());
            c10955odT.o(interfaceC10815g1A.a());
            c10955odT.m(this.f85027a.b());
            return (C11002rd) c10955odT.j();
        } catch (zzadi e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11044u7
    public final InterfaceC10815g1 d(AbstractC10730b0 abstractC10730b0) throws GeneralSecurityException {
        try {
            return e().a(abstractC10730b0);
        } catch (zzadi e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f85027a.a().e().getName()), e10);
        }
    }
}
