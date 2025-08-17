package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.e8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10664e8 implements InterfaceC10776l7 {

    /* renamed from: a, reason: collision with root package name */
    private final V7 f83106a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10616bb f83107b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10616bb f83108c;

    @Override // com.google.android.gms.internal.pal.InterfaceC10776l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrC = C10910te.c(this.f83106a.a().d(), ((InterfaceC10776l7) this.f83106a.a().c()).zza(bArr, bArr2));
        this.f83106a.a().a();
        int length = bArr.length;
        return bArrC;
    }

    /* synthetic */ C10664e8(V7 v72, C10647d8 c10647d8) {
        InterfaceC10616bb interfaceC10616bbA;
        this.f83106a = v72;
        if (v72.e()) {
            InterfaceC10633cb interfaceC10633cbB = C10699ga.a().b();
            C10716hb c10716hbA = C10649da.a(v72);
            this.f83107b = interfaceC10633cbB.a(c10716hbA, "aead", "encrypt");
            interfaceC10616bbA = interfaceC10633cbB.a(c10716hbA, "aead", "decrypt");
        } else {
            interfaceC10616bbA = C10649da.f83086a;
            this.f83107b = interfaceC10616bbA;
        }
        this.f83108c = interfaceC10616bbA;
    }
}
