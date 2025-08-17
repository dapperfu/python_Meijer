package com.google.android.libraries.places.internal;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class zzbma implements zzbmc {
    zzbma() {
    }

    @Override // com.google.android.libraries.places.internal.zzbmd
    public final /* bridge */ /* synthetic */ int zza(zzbtu zzbtuVar, int i10, Object obj, int i11) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i10);
        zzbtuVar.zzj(byteBuffer);
        byteBuffer.limit(iLimit);
        return 0;
    }
}
