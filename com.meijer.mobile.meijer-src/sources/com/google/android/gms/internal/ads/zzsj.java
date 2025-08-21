package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes6.dex */
public final class zzsj extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f81563a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81564b;

    /* renamed from: c, reason: collision with root package name */
    public final C7683bE0 f81565c;

    /* renamed from: d, reason: collision with root package name */
    public final String f81566d;

    public zzsj(C c10, Throwable th2, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + c10.toString(), th2, c10.f66504o, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i10), null);
    }

    static /* bridge */ /* synthetic */ zzsj a(zzsj zzsjVar, zzsj zzsjVar2) {
        return new zzsj(zzsjVar.getMessage(), zzsjVar.getCause(), zzsjVar.f81563a, false, zzsjVar.f81565c, zzsjVar.f81566d, zzsjVar2);
    }

    public zzsj(C c10, Throwable th2, boolean z10, C7683bE0 c7683bE0) {
        this("Decoder init failed: " + c7683bE0.f73607a + ", " + c10.toString(), th2, c10.f66504o, false, c7683bE0, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
    }

    private zzsj(String str, Throwable th2, String str2, boolean z10, C7683bE0 c7683bE0, String str3, zzsj zzsjVar) {
        super(str, th2);
        this.f81563a = str2;
        this.f81564b = false;
        this.f81565c = c7683bE0;
        this.f81566d = str3;
    }
}
