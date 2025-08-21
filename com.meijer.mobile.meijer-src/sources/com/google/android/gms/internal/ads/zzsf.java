package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes6.dex */
public class zzsf extends zzhf {

    /* renamed from: a, reason: collision with root package name */
    public final String f81561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81562b;

    public zzsf(Throwable th2, C7683bE0 c7683bE0) {
        super("Decoder failed: ".concat(String.valueOf(c7683bE0 == null ? null : c7683bE0.f73607a)), th2);
        boolean z10 = th2 instanceof MediaCodec.CodecException;
        String diagnosticInfo = z10 ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f81561a = diagnosticInfo;
        this.f81562b = OV.f69931a >= 23 ? z10 ? ((MediaCodec.CodecException) th2).getErrorCode() : 0 : OV.E(diagnosticInfo);
    }
}
