package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9108pp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f77642a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f77643b;

    public final Class a(Class cls) throws GeneralSecurityException {
        if (this.f77643b.containsKey(cls)) {
            return ((InterfaceC9642up0) this.f77643b.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object b(Ck0 ck0, Class cls) throws GeneralSecurityException {
        C8787mp0 c8787mp0 = new C8787mp0(ck0.getClass(), cls, null);
        if (this.f77642a.containsKey(c8787mp0)) {
            return ((AbstractC8573kp0) this.f77642a.get(c8787mp0)).a(ck0);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + c8787mp0.toString() + " available");
    }

    public final Object c(C9535tp0 c9535tp0, Class cls) throws GeneralSecurityException {
        if (!this.f77643b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        InterfaceC9642up0 interfaceC9642up0 = (InterfaceC9642up0) this.f77643b.get(cls);
        if (c9535tp0.d().equals(interfaceC9642up0.zza()) && interfaceC9642up0.zza().equals(c9535tp0.d())) {
            return interfaceC9642up0.a(c9535tp0);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    /* synthetic */ C9108pp0(C8680lp0 c8680lp0, C9001op0 c9001op0) {
        this.f77642a = new HashMap(c8680lp0.f76663a);
        this.f77643b = new HashMap(c8680lp0.f76664b);
    }
}
