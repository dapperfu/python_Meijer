package com.google.android.libraries.places.internal;

import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbsp extends OutputStream {
    final /* synthetic */ zzbsr zza;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.zza.zzg(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        this.zza.zzg(bArr, i10, i11);
    }

    /* synthetic */ zzbsp(zzbsr zzbsrVar, byte[] bArr) {
        Objects.requireNonNull(zzbsrVar);
        this.zza = zzbsrVar;
    }
}
