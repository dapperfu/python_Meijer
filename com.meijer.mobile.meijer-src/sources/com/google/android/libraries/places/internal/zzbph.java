package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbph implements zzbhg {
    zzbph() {
    }

    @Override // com.google.android.libraries.places.internal.zzbio
    public final /* bridge */ /* synthetic */ Object zzb(byte[] bArr) {
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, zzbhh.zza)));
        }
        return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
    }

    @Override // com.google.android.libraries.places.internal.zzbio
    public final /* synthetic */ byte[] zza(Object obj) {
        throw new UnsupportedOperationException();
    }
}
