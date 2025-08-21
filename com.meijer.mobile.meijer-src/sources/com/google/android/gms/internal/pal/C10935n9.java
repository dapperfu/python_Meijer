package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.n9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10935n9 implements InterfaceC10981q7 {

    /* renamed from: a, reason: collision with root package name */
    final V7 f84081a;

    public C10935n9(V7 v72) {
        this.f84081a = v72;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10981q7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        V7 v72 = this.f84081a;
        if (v72.a() != null) {
            return C11035te.c(v72.a().d(), ((InterfaceC10981q7) this.f84081a.a().c()).zza(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
