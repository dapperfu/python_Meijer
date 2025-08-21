package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
final class zza implements zzb {
    private final ByteBuffer zza;

    @Override // com.google.ads.interactivemedia.v3.internal.zzb
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzb
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.zza) {
            int i11 = (int) j10;
            this.zza.position(i11);
            this.zza.limit(i11 + i10);
            byteBufferSlice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    public zza(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }
}
