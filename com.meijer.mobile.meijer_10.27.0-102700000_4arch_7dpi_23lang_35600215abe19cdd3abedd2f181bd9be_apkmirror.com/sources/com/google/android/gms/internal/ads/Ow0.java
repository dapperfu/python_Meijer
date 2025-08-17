package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes6.dex */
final class Ow0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f69204a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f69205b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* bridge */ /* synthetic */ void a(Ow0 ow0, int i10, int i11) {
        ow0.f69205b.set(i10, i11);
        ow0.f69204a.setPattern(ow0.f69205b);
    }
}
