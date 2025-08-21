package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.cs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7850cs implements Ux0 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f74107a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final ByteBuffer H1(long j10, long j11) throws IOException {
        ByteBuffer byteBuffer = this.f74107a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j10);
        ByteBuffer byteBufferSlice = this.f74107a.slice();
        byteBufferSlice.limit((int) j11);
        this.f74107a.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final int J3(ByteBuffer byteBuffer) throws IOException {
        if (this.f74107a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f74107a.remaining());
        byte[] bArr = new byte[iMin];
        this.f74107a.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final void f(long j10) throws IOException {
        this.f74107a.position((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final long zzb() throws IOException {
        return this.f74107a.position();
    }

    @Override // com.google.android.gms.internal.ads.Ux0
    public final long zzc() throws IOException {
        return this.f74107a.limit();
    }

    C7850cs(ByteBuffer byteBuffer) {
        this.f74107a = byteBuffer.duplicate();
    }
}
