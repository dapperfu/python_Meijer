package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.x6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9890x6 implements InterfaceC9997y6 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f79679a;

    @Override // com.google.android.gms.internal.ads.InterfaceC9997y6
    public final long zza() {
        return this.f79679a.capacity();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9997y6
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f79679a) {
            int i11 = (int) j10;
            this.f79679a.position(i11);
            this.f79679a.limit(i11 + i10);
            byteBufferSlice = this.f79679a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    public C9890x6(ByteBuffer byteBuffer) {
        this.f79679a = byteBuffer.slice();
    }
}
