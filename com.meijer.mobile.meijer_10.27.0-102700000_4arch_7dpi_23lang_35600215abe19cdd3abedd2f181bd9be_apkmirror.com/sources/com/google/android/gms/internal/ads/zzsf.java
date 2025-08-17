package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes6.dex */
public class zzsf extends zzhf {

    /* renamed from: a, reason: collision with root package name */
    public final String f80721a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80722b;

    public zzsf(Throwable th2, C7558bE0 c7558bE0) {
        super("Decoder failed: ".concat(String.valueOf(c7558bE0 == null ? null : c7558bE0.f72767a)), th2);
        boolean z10 = th2 instanceof MediaCodec.CodecException;
        String diagnosticInfo = z10 ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f80721a = diagnosticInfo;
        this.f80722b = OV.f69091a >= 23 ? z10 ? ((MediaCodec.CodecException) th2).getErrorCode() : 0 : OV.E(diagnosticInfo);
    }
}
