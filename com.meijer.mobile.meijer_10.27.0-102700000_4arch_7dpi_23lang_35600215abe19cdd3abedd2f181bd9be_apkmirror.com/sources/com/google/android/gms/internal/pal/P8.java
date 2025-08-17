package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes6.dex */
abstract class P8 {

    /* renamed from: a, reason: collision with root package name */
    private final N8 f82836a;

    /* renamed from: b, reason: collision with root package name */
    private final N8 f82837b;

    abstract N8 a(byte[] bArr, int i10) throws InvalidKeyException;

    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 16);
        b(byteBufferAllocate, bArr, bArr2, bArr3);
        return byteBufferAllocate.array();
    }

    public P8(byte[] bArr) throws GeneralSecurityException {
        if (W8.a(1)) {
            this.f82836a = a(bArr, 1);
            this.f82837b = a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i10;
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int iPosition = byteBuffer.position();
            this.f82836a.d(byteBuffer, bArr, bArr2);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] bArr4 = new byte[32];
            this.f82837b.c(bArr, 0).get(bArr4);
            int iRemaining = byteBuffer.remaining();
            int i11 = iRemaining % 16;
            if (i11 == 0) {
                i10 = iRemaining;
            } else {
                i10 = (iRemaining + 16) - i11;
            }
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr3);
            byteBufferOrder.position(0);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i10);
            byteBufferOrder.putLong(0L);
            byteBufferOrder.putLong(iRemaining);
            byte[] bArrA = S8.a(bArr4, byteBufferOrder.array());
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(bArrA);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
