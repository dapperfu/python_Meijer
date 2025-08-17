package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class Z8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10597a9 f83028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z8(C10597a9 c10597a9, Class cls) {
        super(cls);
        this.f83028b = c10597a9;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10690g1 a(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10685fc c10685fcU = C10701gc.u();
        c10685fcU.m(AbstractC10605b0.s(We.a(((C10749jc) interfaceC10690g1).t())));
        c10685fcU.n(0);
        return (C10701gc) c10685fcU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        C10733ic c10733icU = C10749jc.u();
        c10733icU.m(64);
        map.put("AES256_SIV", new V9((C10749jc) c10733icU.j(), 1));
        C10733ic c10733icU2 = C10749jc.u();
        c10733icU2.m(64);
        map.put("AES256_SIV_RAW", new V9((C10749jc) c10733icU2.j(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        C10749jc c10749jc = (C10749jc) interfaceC10690g1;
        if (c10749jc.t() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + c10749jc.t() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10690g1 b(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return C10749jc.w(abstractC10605b0, C10833p0.a());
    }
}
