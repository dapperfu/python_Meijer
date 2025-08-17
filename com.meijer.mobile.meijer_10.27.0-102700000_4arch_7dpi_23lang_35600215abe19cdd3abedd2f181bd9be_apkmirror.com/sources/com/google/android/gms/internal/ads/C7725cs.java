package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7725cs implements Ux0 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f73267a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final ByteBuffer F1(long j10, long j11) throws IOException {
        ByteBuffer byteBuffer = this.f73267a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j10);
        ByteBuffer byteBufferSlice = this.f73267a.slice();
        byteBufferSlice.limit((int) j11);
        this.f73267a.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final int K3(ByteBuffer byteBuffer) throws IOException {
        if (this.f73267a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f73267a.remaining());
        byte[] bArr = new byte[iMin];
        this.f73267a.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final void f(long j10) throws IOException {
        this.f73267a.position((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final long zzb() throws IOException {
        return this.f73267a.position();
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final long zzc() throws IOException {
        return this.f73267a.limit();
    }

    C7725cs(ByteBuffer byteBuffer) {
        this.f73267a = byteBuffer.duplicate();
    }
}
