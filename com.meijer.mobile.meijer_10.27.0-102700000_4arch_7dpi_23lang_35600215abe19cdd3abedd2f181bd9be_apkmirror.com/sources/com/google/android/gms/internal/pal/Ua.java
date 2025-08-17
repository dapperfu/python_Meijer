package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class Ua implements J7 {

    /* renamed from: a, reason: collision with root package name */
    private final V7 f82914a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10616bb f82915b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10616bb f82916c;

    @Override // com.google.android.gms.internal.pal.J7
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (this.f82914a.a().f() == 4) {
            bArr = C10910te.c(bArr, Va.f82930b);
        }
        byte[] bArrC = C10910te.c(this.f82914a.a().d(), ((J7) this.f82914a.a().c()).a(bArr));
        this.f82914a.a().a();
        return bArrC;
    }

    /* synthetic */ Ua(V7 v72, Ta ta2) {
        InterfaceC10616bb interfaceC10616bbA;
        this.f82914a = v72;
        if (v72.e()) {
            InterfaceC10633cb interfaceC10633cbB = C10699ga.a().b();
            C10716hb c10716hbA = C10649da.a(v72);
            this.f82915b = interfaceC10633cbB.a(c10716hbA, "mac", "compute");
            interfaceC10616bbA = interfaceC10633cbB.a(c10716hbA, "mac", "verify");
        } else {
            interfaceC10616bbA = C10649da.f83086a;
            this.f82915b = interfaceC10616bbA;
        }
        this.f82916c = interfaceC10616bbA;
    }
}
