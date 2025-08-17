package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.qE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9159qE0 implements InterfaceC8945oE0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f77758a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f77759b;

    public C9159qE0(boolean z10, boolean z11) {
        int i10 = 1;
        if (!z10 && !z11) {
            i10 = 0;
        }
        this.f77758a = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final boolean zze() {
        return true;
    }

    private final void c() {
        if (this.f77759b == null) {
            this.f77759b = new MediaCodecList(this.f77758a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final int zza() {
        c();
        return this.f77759b.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final MediaCodecInfo zzb(int i10) {
        c();
        return this.f77759b[i10];
    }
}
