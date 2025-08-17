package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class De implements InterfaceC10776l7 {

    /* renamed from: a, reason: collision with root package name */
    private final Qe f82571a;

    /* renamed from: b, reason: collision with root package name */
    private final J7 f82572b;

    public De(Qe qe2, J7 j72, int i10) {
        this.f82571a = qe2;
        this.f82572b = j72;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10776l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = this.f82571a.a(bArr);
        return C10910te.c(bArrA, this.f82572b.a(C10910te.c(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
