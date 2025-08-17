package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.z6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10104z6 implements InterfaceC9997y6 {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f80368a;

    /* renamed from: b, reason: collision with root package name */
    private final long f80369b;

    /* renamed from: c, reason: collision with root package name */
    private final long f80370c;

    public C10104z6(FileChannel fileChannel, long j10, long j11) {
        this.f80368a = fileChannel;
        this.f80369b = j10;
        this.f80370c = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9997y6
    public final long zza() {
        return this.f80370c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9997y6
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f80368a.map(FileChannel.MapMode.READ_ONLY, this.f80369b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
