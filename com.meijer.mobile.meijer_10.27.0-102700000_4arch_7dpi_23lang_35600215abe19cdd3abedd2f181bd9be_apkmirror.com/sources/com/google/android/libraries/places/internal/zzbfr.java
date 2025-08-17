package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes6.dex */
public final class zzbfr implements zzbft {
    @Override // com.google.android.libraries.places.internal.zzbfu, com.google.android.libraries.places.internal.zzbgh
    public final String zza() {
        return "gzip";
    }

    @Override // com.google.android.libraries.places.internal.zzbfu
    public final OutputStream zzb(OutputStream outputStream) throws IOException {
        return new GZIPOutputStream(outputStream);
    }

    @Override // com.google.android.libraries.places.internal.zzbgh
    public final InputStream zzc(InputStream inputStream) throws IOException {
        return new GZIPInputStream(inputStream);
    }
}
