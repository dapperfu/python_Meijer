package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.e8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10789e8 implements InterfaceC10901l7 {

    /* renamed from: a, reason: collision with root package name */
    private final V7 f83946a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10741bb f83947b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10741bb f83948c;

    @Override // com.google.android.gms.internal.pal.InterfaceC10901l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrC = C11035te.c(this.f83946a.a().d(), ((InterfaceC10901l7) this.f83946a.a().c()).zza(bArr, bArr2));
        this.f83946a.a().a();
        int length = bArr.length;
        return bArrC;
    }

    /* synthetic */ C10789e8(V7 v72, C10772d8 c10772d8) {
        InterfaceC10741bb interfaceC10741bbA;
        this.f83946a = v72;
        if (v72.e()) {
            InterfaceC10758cb interfaceC10758cbB = C10824ga.a().b();
            C10841hb c10841hbA = C10774da.a(v72);
            this.f83947b = interfaceC10758cbB.a(c10841hbA, "aead", "encrypt");
            interfaceC10741bbA = interfaceC10758cbB.a(c10841hbA, "aead", "decrypt");
        } else {
            interfaceC10741bbA = C10774da.f83926a;
            this.f83947b = interfaceC10741bbA;
        }
        this.f83948c = interfaceC10741bbA;
    }
}
