package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8836nD0 implements HC0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9050pD0 f77015a;

    /* synthetic */ C8836nD0(C9050pD0 c9050pD0, C8943oD0 c8943oD0) {
        this.f77015a = c9050pD0;
    }

    @Override // com.google.android.gms.internal.ads.HC0
    public final void a(Exception exc) {
        C9917xL.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f77015a.f77529A0.b(exc);
    }
}
