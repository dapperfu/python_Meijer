package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.hc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8352hc extends AbstractC7482Yb {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f75590c;

    /* renamed from: d, reason: collision with root package name */
    private final int f75591d;

    /* renamed from: e, reason: collision with root package name */
    private final int f75592e;

    @Override // com.google.android.gms.internal.ads.AbstractC7482Yb
    public final byte[] b(String str) {
        synchronized (this.f72418a) {
            try {
                MessageDigest messageDigestA = a();
                this.f75590c = messageDigestA;
                if (messageDigestA == null) {
                    return new byte[0];
                }
                messageDigestA.reset();
                this.f75590c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f75590c.digest();
                int length = bArrDigest.length;
                int i10 = this.f75591d;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f75592e & 7) > 0) {
                    long j10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            j10 <<= 8;
                        }
                        j10 += bArr[i11] & 255;
                    }
                    long j11 = j10 >>> (8 - (this.f75592e & 7));
                    int i12 = this.f75591d;
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

    public C8352hc(int i10) {
        int i11 = i10 >> 3;
        this.f75591d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f75592e = i10;
    }
}
