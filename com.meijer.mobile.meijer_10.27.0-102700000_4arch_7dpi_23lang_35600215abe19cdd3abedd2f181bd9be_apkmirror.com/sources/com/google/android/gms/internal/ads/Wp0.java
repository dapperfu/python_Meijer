package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Wp0 implements InterfaceC9642up0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Wp0 f71172a = new Wp0();

    private Wp0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9642up0
    public final Class zza() {
        return Tp0.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9642up0
    public final Class zzb() {
        return Tp0.class;
    }

    static void b() throws GeneralSecurityException {
        Uo0.a().f(f71172a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9642up0
    public final /* bridge */ /* synthetic */ Object a(C9535tp0 c9535tp0) throws GeneralSecurityException {
        if (c9535tp0.c() != null) {
            Iterator it = c9535tp0.e().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                }
            }
            return new Up0(c9535tp0, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
