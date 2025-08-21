package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes6.dex */
abstract class Kn0 {

    /* renamed from: a, reason: collision with root package name */
    private final In0 f69006a;

    /* renamed from: b, reason: collision with root package name */
    private final In0 f69007b;

    abstract In0 a(byte[] bArr, int i10) throws InvalidKeyException;

    public Kn0(byte[] bArr) throws GeneralSecurityException {
        if (C8056eo0.a(1)) {
            this.f69006a = a(bArr, 1);
            this.f69007b = a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10;
        int i11;
        if (byteBuffer.remaining() >= 16) {
            int iPosition = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.f69007b.c(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i12 = length & 15;
                if (i12 == 0) {
                    i10 = length;
                } else {
                    i10 = (length + 16) - i12;
                }
                int iRemaining = byteBuffer.remaining();
                int i13 = iRemaining % 16;
                if (i13 == 0) {
                    i11 = iRemaining;
                } else {
                    i11 = (iRemaining + 16) - i13;
                }
                int i14 = i11 + i10;
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(i14 + 16).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.put(bArr2);
                byteBufferOrder.position(i10);
                byteBufferOrder.put(byteBuffer);
                byteBufferOrder.position(i14);
                byteBufferOrder.putLong(length);
                byteBufferOrder.putLong(iRemaining);
                if (MessageDigest.isEqual(Pn0.a(bArr4, byteBufferOrder.array()), bArr3)) {
                    byteBuffer.position(iPosition);
                    return this.f69006a.d(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
