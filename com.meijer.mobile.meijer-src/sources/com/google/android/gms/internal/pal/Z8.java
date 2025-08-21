package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class Z8 extends W9 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10722a9 f83868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z8(C10722a9 c10722a9, Class cls) {
        super(cls);
        this.f83868b = c10722a9;
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ InterfaceC10815g1 a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10810fc c10810fcU = C10826gc.u();
        c10810fcU.m(AbstractC10730b0.s(We.a(((C10874jc) interfaceC10815g1).t())));
        c10810fcU.n(0);
        return (C10826gc) c10810fcU.j();
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final Map c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        C10858ic c10858icU = C10874jc.u();
        c10858icU.m(64);
        map.put("AES256_SIV", new V9((C10874jc) c10858icU.j(), 1));
        C10858ic c10858icU2 = C10874jc.u();
        c10858icU2.m(64);
        map.put("AES256_SIV_RAW", new V9((C10874jc) c10858icU2.j(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* bridge */ /* synthetic */ void d(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        C10874jc c10874jc = (C10874jc) interfaceC10815g1;
        if (c10874jc.t() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + c10874jc.t() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.pal.W9
    public final /* synthetic */ InterfaceC10815g1 b(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return C10874jc.w(abstractC10730b0, C10958p0.a());
    }
}
