package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface Ux0 extends Closeable {
    ByteBuffer F1(long j10, long j11) throws IOException;

    int K3(ByteBuffer byteBuffer) throws IOException;

    void f(long j10) throws IOException;

    long zzb() throws IOException;

    long zzc() throws IOException;
}
