package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8680lp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f76663a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f76664b;

    /* synthetic */ C8680lp0(C9001op0 c9001op0) {
        this.f76663a = new HashMap();
        this.f76664b = new HashMap();
    }

    public final C8680lp0 a(AbstractC8573kp0 abstractC8573kp0) throws GeneralSecurityException {
        if (abstractC8573kp0 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C8787mp0 c8787mp0 = new C8787mp0(abstractC8573kp0.c(), abstractC8573kp0.d(), null);
        if (!this.f76663a.containsKey(c8787mp0)) {
            this.f76663a.put(c8787mp0, abstractC8573kp0);
            return this;
        }
        AbstractC8573kp0 abstractC8573kp02 = (AbstractC8573kp0) this.f76663a.get(c8787mp0);
        if (abstractC8573kp02.equals(abstractC8573kp0) && abstractC8573kp0.equals(abstractC8573kp02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c8787mp0.toString()));
    }

    public final C8680lp0 b(InterfaceC9642up0 interfaceC9642up0) throws GeneralSecurityException {
        Map map = this.f76664b;
        Class clsZzb = interfaceC9642up0.zzb();
        if (!map.containsKey(clsZzb)) {
            this.f76664b.put(clsZzb, interfaceC9642up0);
            return this;
        }
        InterfaceC9642up0 interfaceC9642up02 = (InterfaceC9642up0) this.f76664b.get(clsZzb);
        if (interfaceC9642up02.equals(interfaceC9642up0) && interfaceC9642up0.equals(interfaceC9642up02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    /* synthetic */ C8680lp0(C9108pp0 c9108pp0, C9001op0 c9001op0) {
        this.f76663a = new HashMap(c9108pp0.f77642a);
        this.f76664b = new HashMap(c9108pp0.f77643b);
    }
}
