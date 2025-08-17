package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8227hc extends AbstractC7357Yb {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f74750c;

    /* renamed from: d, reason: collision with root package name */
    private final int f74751d;

    /* renamed from: e, reason: collision with root package name */
    private final int f74752e;

    @Override // com.google.android.gms.internal.ads.AbstractC7357Yb
    public final byte[] b(String str) {
        synchronized (this.f71578a) {
            try {
                MessageDigest messageDigestA = a();
                this.f74750c = messageDigestA;
                if (messageDigestA == null) {
                    return new byte[0];
                }
                messageDigestA.reset();
                this.f74750c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f74750c.digest();
                int length = bArrDigest.length;
                int i10 = this.f74751d;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f74752e & 7) > 0) {
                    long j10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            j10 <<= 8;
                        }
                        j10 += bArr[i11] & 255;
                    }
                    long j11 = j10 >>> (8 - (this.f74752e & 7));
                    int i12 = this.f74751d;
                    while (true) {
                        i12--;
                        if (i12 < 0) {
                            break;
                        }
                        bArr[i12] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C8227hc(int i10) {
        int i11 = i10 >> 3;
        this.f74751d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f74752e = i10;
    }
}
