package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.pE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9052pE0 implements InterfaceC8945oE0 {
    /* synthetic */ C9052pE0(C9372sE0 c9372sE0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8945oE0
    public final MediaCodecInfo zzb(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }
}
