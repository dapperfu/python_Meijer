package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Aa {

    /* renamed from: a, reason: collision with root package name */
    private final Map f83320a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f83321b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f83322c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f83323d;

    public final AbstractC11028t7 a(InterfaceC11015sa interfaceC11015sa, C10721a8 c10721a8) throws GeneralSecurityException {
        C11063va c11063va = new C11063va(interfaceC11015sa.getClass(), interfaceC11015sa.zzb(), null);
        if (this.f83321b.containsKey(c11063va)) {
            return ((R9) this.f83321b.get(c11063va)).a(interfaceC11015sa, c10721a8);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c11063va.toString() + " available");
    }

    /* synthetic */ Aa(C11031ta c11031ta, C11127za c11127za) {
        this.f83320a = new HashMap(c11031ta.f84891a);
        this.f83321b = new HashMap(c11031ta.f84892b);
        this.f83322c = new HashMap(c11031ta.f84893c);
        this.f83323d = new HashMap(c11031ta.f84894d);
    }
}
