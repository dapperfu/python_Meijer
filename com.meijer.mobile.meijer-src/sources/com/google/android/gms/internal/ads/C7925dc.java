package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.dc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7925dc extends AbstractC7482Yb {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f74274c;

    @Override // com.google.android.gms.internal.ads.AbstractC7482Yb
    public final byte[] b(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i10 = 4;
        if (length == 1) {
            int iA = C7818cc.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int iA2 = C7818cc.a(strArrSplit[i11]);
                    int i12 = (iA2 >> 16) ^ ((char) iA2);
                    byte b10 = (byte) i12;
                    byte b11 = (byte) (i12 >> 8);
                    int i13 = i11 + i11;
                    bArr[i13] = new byte[]{b10, b11}[0];
                    bArr[i13 + 1] = b11;
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                    int iA3 = C7818cc.a(strArrSplit[i14]);
                    bArr[i14] = (byte) ((iA3 >> 24) ^ (((iA3 & com.medallia.digital.mobilesdk.l3.f93323c) ^ ((iA3 >> 8) & com.medallia.digital.mobilesdk.l3.f93323c)) ^ ((iA3 >> 16) & com.medallia.digital.mobilesdk.l3.f93323c)));
                }
            }
            bArrArray = bArr;
        }
        this.f74274c = a();
        synchronized (this.f72418a) {
            try {
                MessageDigest messageDigest = this.f74274c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f74274c.update(bArrArray);
                byte[] bArrDigest = this.f74274c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i10 = length2;
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i10);
                return bArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
