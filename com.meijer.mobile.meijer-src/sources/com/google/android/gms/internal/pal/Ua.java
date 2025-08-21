package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class Ua implements J7 {

    /* renamed from: a, reason: collision with root package name */
    private final V7 f83754a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10741bb f83755b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10741bb f83756c;

    @Override // com.google.android.gms.internal.pal.J7
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (this.f83754a.a().f() == 4) {
            bArr = C11035te.c(bArr, Va.f83770b);
        }
        byte[] bArrC = C11035te.c(this.f83754a.a().d(), ((J7) this.f83754a.a().c()).a(bArr));
        this.f83754a.a().a();
        return bArrC;
    }

    /* synthetic */ Ua(V7 v72, Ta ta2) {
        InterfaceC10741bb interfaceC10741bbA;
        this.f83754a = v72;
        if (v72.e()) {
            InterfaceC10758cb interfaceC10758cbB = C10824ga.a().b();
            C10841hb c10841hbA = C10774da.a(v72);
            this.f83755b = interfaceC10758cbB.a(c10841hbA, "mac", "compute");
            interfaceC10741bbA = interfaceC10758cbB.a(c10841hbA, "mac", "verify");
        } else {
            interfaceC10741bbA = C10774da.f83926a;
            this.f83755b = interfaceC10741bbA;
        }
        this.f83756c = interfaceC10741bbA;
    }
}
