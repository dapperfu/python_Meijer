package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.c9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10631c9 implements InterfaceC10824o7 {

    /* renamed from: a, reason: collision with root package name */
    private final V7 f83079a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10616bb f83080b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10616bb f83081c;

    @Override // com.google.android.gms.internal.pal.InterfaceC10824o7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrC = C10910te.c(this.f83079a.a().d(), ((InterfaceC10824o7) this.f83079a.a().c()).zza(bArr, bArr2));
        this.f83079a.a().a();
        int length = bArr.length;
        return bArrC;
    }

    public C10631c9(V7 v72) {
        InterfaceC10616bb interfaceC10616bbA;
        this.f83079a = v72;
        if (v72.e()) {
            InterfaceC10633cb interfaceC10633cbB = C10699ga.a().b();
            C10716hb c10716hbA = C10649da.a(v72);
            this.f83080b = interfaceC10633cbB.a(c10716hbA, "daead", "encrypt");
            interfaceC10616bbA = interfaceC10633cbB.a(c10716hbA, "daead", "decrypt");
        } else {
            interfaceC10616bbA = C10649da.f83086a;
            this.f83080b = interfaceC10616bbA;
        }
        this.f83081c = interfaceC10616bbA;
    }
}
