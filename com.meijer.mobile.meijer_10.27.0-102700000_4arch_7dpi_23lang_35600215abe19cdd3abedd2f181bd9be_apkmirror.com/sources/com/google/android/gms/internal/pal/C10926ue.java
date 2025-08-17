package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.ue, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10926ue implements InterfaceC10776l7 {

    /* renamed from: a, reason: collision with root package name */
    private final O8 f84080a;

    @Override // com.google.android.gms.internal.pal.InterfaceC10776l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrA = We.a(12);
        byteBufferAllocate.put(bArrA);
        this.f84080a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    public C10926ue(byte[] bArr) throws GeneralSecurityException {
        this.f84080a = new O8(bArr);
    }
}
