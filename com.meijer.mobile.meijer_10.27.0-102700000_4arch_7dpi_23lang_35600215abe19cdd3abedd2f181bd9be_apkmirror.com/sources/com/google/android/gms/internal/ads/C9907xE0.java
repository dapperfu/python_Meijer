package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.xE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9907xE0 implements InterfaceC7451aE0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f79713a;

    public C9907xE0(MediaCodec mediaCodec) {
        this.f79713a = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void b(Bundle bundle) {
        this.f79713a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void c(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f79713a.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7451aE0
    public final void a(int i10, int i11, Qx0 qx0, long j10, int i12) throws MediaCodec.CryptoException {
        this.f79713a.queueSecureInputBuffer(i10, 0, qx0.a(), j10, 0);
    }
}
