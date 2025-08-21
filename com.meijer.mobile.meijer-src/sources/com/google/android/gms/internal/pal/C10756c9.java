package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.c9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10756c9 implements InterfaceC10949o7 {

    /* renamed from: a, reason: collision with root package name */
    private final V7 f83919a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10741bb f83920b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10741bb f83921c;

    @Override // com.google.android.gms.internal.pal.InterfaceC10949o7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrC = C11035te.c(this.f83919a.a().d(), ((InterfaceC10949o7) this.f83919a.a().c()).zza(bArr, bArr2));
        this.f83919a.a().a();
        int length = bArr.length;
        return bArrC;
    }

    public C10756c9(V7 v72) {
        InterfaceC10741bb interfaceC10741bbA;
        this.f83919a = v72;
        if (v72.e()) {
            InterfaceC10758cb interfaceC10758cbB = C10824ga.a().b();
            C10841hb c10841hbA = C10774da.a(v72);
            this.f83920b = interfaceC10758cbB.a(c10841hbA, "daead", "encrypt");
            interfaceC10741bbA = interfaceC10758cbB.a(c10841hbA, "daead", "decrypt");
        } else {
            interfaceC10741bbA = C10774da.f83926a;
            this.f83920b = interfaceC10741bbA;
        }
        this.f83921c = interfaceC10741bbA;
    }
}
