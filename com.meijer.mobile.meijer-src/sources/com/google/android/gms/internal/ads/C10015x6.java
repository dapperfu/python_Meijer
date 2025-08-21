package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.x6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10015x6 implements InterfaceC10122y6 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f80519a;

    @Override // com.google.android.gms.internal.ads.InterfaceC10122y6
    public final long zza() {
        return this.f80519a.capacity();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10122y6
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f80519a) {
            int i11 = (int) j10;
            this.f80519a.position(i11);
            this.f80519a.limit(i11 + i10);
            byteBufferSlice = this.f80519a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    public C10015x6(ByteBuffer byteBuffer) {
        this.f80519a = byteBuffer.slice();
    }
}
