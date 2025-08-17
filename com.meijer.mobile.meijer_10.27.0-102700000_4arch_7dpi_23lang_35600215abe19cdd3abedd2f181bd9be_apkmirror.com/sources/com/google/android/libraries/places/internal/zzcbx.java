package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* loaded from: classes6.dex */
public interface zzcbx extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    void zzc(zzcbj zzcbjVar, long j10) throws IOException;
}
