package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface ZD0 {
    void H0(int i10);

    void a(int i10, int i11, int i12, long j10, int i13);

    void b(Surface surface);

    boolean c(YD0 yd0);

    void d(int i10, long j10);

    void e(int i10, boolean z10);

    void f(int i10, int i11, Qx0 qx0, long j10, int i12);

    int g(MediaCodec.BufferInfo bufferInfo);

    void u(Bundle bundle);

    int zza();

    MediaFormat zzc();

    ByteBuffer zzf(int i10);

    ByteBuffer zzg(int i10);

    void zzi();

    void zzj();

    void zzm();
}
