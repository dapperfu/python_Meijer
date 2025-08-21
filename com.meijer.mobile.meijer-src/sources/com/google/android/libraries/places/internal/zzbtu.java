package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface zzbtu extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean zza();

    void zzb();

    void zzc();

    int zzf();

    int zzg();

    void zzh(int i10);

    void zzi(byte[] bArr, int i10, int i11);

    void zzj(ByteBuffer byteBuffer);

    void zzk(OutputStream outputStream, int i10) throws IOException;

    zzbtu zzl(int i10);
}
