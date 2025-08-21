package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8805lp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f77503a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f77504b;

    /* synthetic */ C8805lp0(C9126op0 c9126op0) {
        this.f77503a = new HashMap();
        this.f77504b = new HashMap();
    }

    public final C8805lp0 a(AbstractC8698kp0 abstractC8698kp0) throws GeneralSecurityException {
        if (abstractC8698kp0 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C8912mp0 c8912mp0 = new C8912mp0(abstractC8698kp0.c(), abstractC8698kp0.d(), null);
        if (!this.f77503a.containsKey(c8912mp0)) {
            this.f77503a.put(c8912mp0, abstractC8698kp0);
            return this;
        }
        AbstractC8698kp0 abstractC8698kp02 = (AbstractC8698kp0) this.f77503a.get(c8912mp0);
        if (abstractC8698kp02.equals(abstractC8698kp0) && abstractC8698kp0.equals(abstractC8698kp02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c8912mp0.toString()));
    }

    public final C8805lp0 b(InterfaceC9767up0 interfaceC9767up0) throws GeneralSecurityException {
        Map map = this.f77504b;
        Class clsZzb = interfaceC9767up0.zzb();
        if (!map.containsKey(clsZzb)) {
            this.f77504b.put(clsZzb, interfaceC9767up0);
            return this;
        }
        InterfaceC9767up0 interfaceC9767up02 = (InterfaceC9767up0) this.f77504b.get(clsZzb);
        if (interfaceC9767up02.equals(interfaceC9767up0) && interfaceC9767up0.equals(interfaceC9767up02)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    /* synthetic */ C8805lp0(C9233pp0 c9233pp0, C9126op0 c9126op0) {
        this.f77503a = new HashMap(c9233pp0.f78482a);
        this.f77504b = new HashMap(c9233pp0.f78483b);
    }
}
