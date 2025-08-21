package com.google.android.libraries.places.internal;

import De.p;

/* loaded from: classes6.dex */
final class zzbin extends zzbil {
    private final zzbio zzb;

    /* synthetic */ zzbin(String str, boolean z10, zzbio zzbioVar, byte[] bArr) {
        super(str, z10, zzbioVar, null);
        p.m(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.zzb = (zzbio) p.r(zzbioVar, "marshaller");
    }

    @Override // com.google.android.libraries.places.internal.zzbil
    final byte[] zza(Object obj) {
        return (byte[]) p.r(this.zzb.zza(obj), "null marshaller.toAsciiString()");
    }

    @Override // com.google.android.libraries.places.internal.zzbil
    final Object zzb(byte[] bArr) {
        return this.zzb.zzb(bArr);
    }
}
