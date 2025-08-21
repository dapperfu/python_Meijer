package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class De implements InterfaceC10901l7 {

    /* renamed from: a, reason: collision with root package name */
    private final Qe f83411a;

    /* renamed from: b, reason: collision with root package name */
    private final J7 f83412b;

    public De(Qe qe2, J7 j72, int i10) {
        this.f83411a = qe2;
        this.f83412b = j72;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10901l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = this.f83411a.a(bArr);
        return C11035te.c(bArrA, this.f83412b.a(C11035te.c(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
