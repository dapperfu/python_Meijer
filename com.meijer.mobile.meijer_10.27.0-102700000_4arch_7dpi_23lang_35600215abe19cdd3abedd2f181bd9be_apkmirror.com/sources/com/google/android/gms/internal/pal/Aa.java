package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Aa {

    /* renamed from: a, reason: collision with root package name */
    private final Map f82480a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f82481b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f82482c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f82483d;

    public final AbstractC10903t7 a(InterfaceC10890sa interfaceC10890sa, C10596a8 c10596a8) throws GeneralSecurityException {
        C10938va c10938va = new C10938va(interfaceC10890sa.getClass(), interfaceC10890sa.zzb(), null);
        if (this.f82481b.containsKey(c10938va)) {
            return ((R9) this.f82481b.get(c10938va)).a(interfaceC10890sa, c10596a8);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c10938va.toString() + " available");
    }

    /* synthetic */ Aa(C10906ta c10906ta, C11002za c11002za) {
        this.f82480a = new HashMap(c10906ta.f84051a);
        this.f82481b = new HashMap(c10906ta.f84052b);
        this.f82482c = new HashMap(c10906ta.f84053c);
        this.f82483d = new HashMap(c10906ta.f84054d);
    }
}
