package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9233pp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f78482a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f78483b;

    public final Class a(Class cls) throws GeneralSecurityException {
        if (this.f78483b.containsKey(cls)) {
            return ((InterfaceC9767up0) this.f78483b.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object b(Ck0 ck0, Class cls) throws GeneralSecurityException {
        C8912mp0 c8912mp0 = new C8912mp0(ck0.getClass(), cls, null);
        if (this.f78482a.containsKey(c8912mp0)) {
            return ((AbstractC8698kp0) this.f78482a.get(c8912mp0)).a(ck0);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + c8912mp0.toString() + " available");
    }

    public final Object c(C9660tp0 c9660tp0, Class cls) throws GeneralSecurityException {
        if (!this.f78483b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        InterfaceC9767up0 interfaceC9767up0 = (InterfaceC9767up0) this.f78483b.get(cls);
        if (c9660tp0.d().equals(interfaceC9767up0.zza()) && interfaceC9767up0.zza().equals(c9660tp0.d())) {
            return interfaceC9767up0.a(c9660tp0);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    /* synthetic */ C9233pp0(C8805lp0 c8805lp0, C9126op0 c9126op0) {
        this.f78482a = new HashMap(c8805lp0.f77503a);
        this.f78483b = new HashMap(c8805lp0.f77504b);
    }
}
