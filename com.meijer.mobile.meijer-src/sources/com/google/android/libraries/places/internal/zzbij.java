package com.google.android.libraries.places.internal;

import De.p;
import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
final class zzbij extends zzbil {
    private final zzbik zzb;

    /* synthetic */ zzbij(String str, boolean z10, zzbik zzbikVar, byte[] bArr) {
        super(str, false, zzbikVar, null);
        p.m(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.zzb = (zzbik) p.r(zzbikVar, "marshaller");
    }

    @Override // com.google.android.libraries.places.internal.zzbil
    final byte[] zza(Object obj) {
        return ((String) p.r(this.zzb.zzb(obj), "null marshaller.toAsciiString()")).getBytes(StandardCharsets.US_ASCII);
    }

    @Override // com.google.android.libraries.places.internal.zzbil
    final Object zzb(byte[] bArr) {
        return this.zzb.zza(new String(bArr, StandardCharsets.US_ASCII));
    }
}
