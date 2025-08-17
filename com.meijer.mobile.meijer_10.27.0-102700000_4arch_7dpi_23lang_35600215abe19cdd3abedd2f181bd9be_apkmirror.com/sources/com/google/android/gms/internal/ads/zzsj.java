package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes6.dex */
public final class zzsj extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f80723a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80724b;

    /* renamed from: c, reason: collision with root package name */
    public final C7558bE0 f80725c;

    /* renamed from: d, reason: collision with root package name */
    public final String f80726d;

    public zzsj(C c10, Throwable th2, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + c10.toString(), th2, c10.f65664o, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i10), null);
    }

    static /* bridge */ /* synthetic */ zzsj a(zzsj zzsjVar, zzsj zzsjVar2) {
        return new zzsj(zzsjVar.getMessage(), zzsjVar.getCause(), zzsjVar.f80723a, false, zzsjVar.f80725c, zzsjVar.f80726d, zzsjVar2);
    }

    public zzsj(C c10, Throwable th2, boolean z10, C7558bE0 c7558bE0) {
        this("Decoder init failed: " + c7558bE0.f72767a + ", " + c10.toString(), th2, c10.f65664o, false, c7558bE0, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
    }

    private zzsj(String str, Throwable th2, String str2, boolean z10, C7558bE0 c7558bE0, String str3, zzsj zzsjVar) {
        super(str, th2);
        this.f80723a = str2;
        this.f80724b = false;
        this.f80725c = c7558bE0;
        this.f80726d = str3;
    }
}
