package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8961nD0 implements HC0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9175pD0 f77855a;

    /* synthetic */ C8961nD0(C9175pD0 c9175pD0, C9068oD0 c9068oD0) {
        this.f77855a = c9175pD0;
    }

    @Override // com.google.android.gms.internal.ads.HC0
    public final void a(Exception exc) {
        C10042xL.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f77855a.f78369A0.b(exc);
    }
}
