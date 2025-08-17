package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.af, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10603af implements InterfaceC10776l7 {

    /* renamed from: a, reason: collision with root package name */
    private final R8 f83054a;

    @Override // com.google.android.gms.internal.pal.InterfaceC10776l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrA = We.a(24);
        byteBufferAllocate.put(bArrA);
        this.f83054a.b(byteBufferAllocate, bArrA, bArr, bArr2);
        return byteBufferAllocate.array();
    }

    public C10603af(byte[] bArr) throws GeneralSecurityException {
        this.f83054a = new R8(bArr);
    }
}
