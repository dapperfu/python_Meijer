package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.z6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10229z6 implements InterfaceC10122y6 {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f81208a;

    /* renamed from: b, reason: collision with root package name */
    private final long f81209b;

    /* renamed from: c, reason: collision with root package name */
    private final long f81210c;

    public C10229z6(FileChannel fileChannel, long j10, long j11) {
        this.f81208a = fileChannel;
        this.f81209b = j10;
        this.f81210c = j11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10122y6
    public final long zza() {
        return this.f81210c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10122y6
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f81208a.map(FileChannel.MapMode.READ_ONLY, this.f81209b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
